package GUI;

import Class.AbstractFactory.TemplateMethod.SubscriberClient;
import Class.DataBase;
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
public class AllClients extends javax.swing.JFrame {

    public AllClients() {
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

            ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
            this.setIconImage(imagen.getImage());
        } catch (Exception ex) {
            Logger.getLogger(AllClients.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo para crear por defecto la tabla definida por los productos
     * introducidos
     */
    public void addRowToJTable() throws Exception {

        DefaultTableModel model = (DefaultTableModel) AllClientsTable.getModel();

        ClientIterator iterator = new ClientIterator();
        Object rowData[] = new Object[AllClientsTable.getColumnCount()];

        while (iterator.hasNext()) {
            IntClient client = iterator.next();

            rowData[0] = client.getName();
            rowData[1] = client.getLastName();
            rowData[2] = client.getEmail();
            rowData[3] = client.getPhone();
            rowData[4] = client.getSite();
            rowData[5] = false;

            if (client instanceof SubscriberClient) {
                rowData[5] = true;
            }
            model.addRow(rowData);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AllClientsPane = new javax.swing.JScrollPane();
        AllClientsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AllClientsTable.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        AllClientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Usuario", "Teléfono", "Localización", "Suscrito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllClientsPane.setViewportView(AllClientsTable);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes registrados");

        BackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BackButton.setText("Volver");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        DeleteButton.setText("Eliminar");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(354, 354, 354))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AllClientsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(AllClientsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // Vuelve a la ventana de perfil
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int num = AllClientsTable.getSelectedRow();
        //Eliminamos el producto seleccionado
        if (num != -1) {
            try {
                DefaultTableModel modelo = (DefaultTableModel) AllClientsTable.getModel();

                ClientIterator iteratorClient = new ClientIterator();
                while (iteratorClient.hasNext()) {
                    IntClient client = iteratorClient.next();

                    if (client.getEmail().equals((String) modelo.getValueAt(num, 2))) {
                        iteratorClient.deleteClient(client);

                    }
                }
                DataBase database = new DataBase();
                database.saveIteratorClient(iteratorClient);
                modelo.removeRow(num);
                //Si no seleccionamos ninguno se muestra una advertencia
            } catch (Exception ex) {
                Logger.getLogger(AllProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un producto a eliminar.", "Eliminar producto", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AllClientsPane;
    private javax.swing.JTable AllClientsTable;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
