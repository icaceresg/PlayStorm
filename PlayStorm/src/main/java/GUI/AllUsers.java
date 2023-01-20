package GUI;

import Class.Iterator.ClientIterator;
import Interfaces.IntClient;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana para ver la lista de productos añadidos al carrito para poder
 * comprarlo
 */
public class AllUsers extends javax.swing.JFrame {

    public AllUsers() {
        try {
            // Se centra la imagen, añade la tabla y se establece el logo y el nombre de la pantalla
            Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
            int height = pantalla.height / 2;
            int width = pantalla.width / 2;
            setSize(width, height);
            setLocationRelativeTo(null);
            initComponents();
            addRowToJTable();

            this.setTitle("JavaPop");

            ImageIcon imagen = new ImageIcon("./imagenes/LogoApp 01.png");
            this.setIconImage(imagen.getImage());
        } catch (Exception ex) {
            Logger.getLogger(AllUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo para crear por defecto la tabla definida por los productos
     * introducidos
     */
    public void addRowToJTable() throws Exception {

        DefaultTableModel model = (DefaultTableModel) AllUsersTable.getModel();

        ClientIterator iterator = new ClientIterator();
        Object rowData[] = new Object[5];

        while (iterator.hasNext()) {
            IntClient client = iterator.next();

            rowData[0] = client.getEmail();
            rowData[1] = client.getName();
            rowData[2] = client.getLastName();
            rowData[3] = client.getPhone();
            rowData[4] = client.getSite();

            model.addRow(rowData);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaProductos = new javax.swing.JScrollPane();
        AllUsersTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ButtonBack = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AllUsersTable.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        AllUsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre", "Apellido", "Telefono", "Localizacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductos.setViewportView(AllUsersTable);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios Aplicacion");

        ButtonBack.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        ButtonBack.setText("Volver");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButtonEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonBack)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(191, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(354, 354, 354))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))))
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
                        .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        // Vuelve a la ventana de perfil
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_ButtonBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllUsersTable;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JScrollPane TablaProductos;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
