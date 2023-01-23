package GUI;

import Class.Iterator.OrderIterator;
import Class.State.Order;
import Class.User;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana para ver la lista de productos añadidos al carrito para poder comprarlo
 */
public class MyLibrary extends javax.swing.JFrame {

    /**
     *
     */
    public MyLibrary() {
        // Se centra la imagen, añade la tabla y se establece el logo y el nombre de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);
        initComponents();
        addRowToJTable();

        this.setTitle("PlayStorm");

        ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
        this.setIconImage(imagen.getImage());
    }

    /**
     * Metodo para crear por defecto la tabla definida por los productos
     * introducidos
     */
        public void addRowToJTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) MyLibraryTable.getModel();
            Object rowData[] = new Object[MyLibraryTable.getColumnCount()];

            OrderIterator orderIterator = new OrderIterator();
            while (orderIterator.hasNext()) {
                Order orderSearch = orderIterator.next();
                if (orderSearch.getStatus().equals("Finalizado")) {
                    for (int i = 0; i < orderSearch.getProduct().size(); i++) {
                        if (User.activeUser.get(0).getEmail().equals(orderSearch.getClient().getEmail())) {
                            rowData[0] = orderSearch.getProduct().get(i).getTitle();
                            rowData[1] = orderSearch.getProduct().get(i).getCompany().getName();
                            rowData[2] = orderSearch.getProduct().get(i).getPrice();
                            rowData[3] = orderSearch.getProduct().get(i).getCategory();

                            model.addRow(rowData);
                        }
                    }
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(MyCart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MyLibraryPane = new javax.swing.JScrollPane();
        MyLibraryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MyLibraryTable.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        MyLibraryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Empresa", "Precio", "Categoría"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MyLibraryPane.setViewportView(MyLibraryTable);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Mis Juegos Comprados");

        BackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BackButton.setText("Volver");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyLibraryPane)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BackButton)
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addContainerGap(384, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton)))
                .addGap(18, 18, 18)
                .addComponent(MyLibraryPane, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // Vuelve a la ventana de perfil
        ClientProfile profile = new ClientProfile();
        profile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JScrollPane MyLibraryPane;
    private javax.swing.JTable MyLibraryTable;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
