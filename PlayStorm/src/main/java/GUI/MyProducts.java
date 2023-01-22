package GUI;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Ventana para ver la lista de productos añadidos al carrito para poder comprarlo
 */
public class MyProducts extends javax.swing.JFrame {

    public MyProducts() {
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
    }

    /**
     * Metodo para crear por defecto la tabla definida por los productos
     * introducidos
     */
    public void addRowToJTable() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MyProductsPane = new javax.swing.JScrollPane();
        MyProductsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ModifyButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MyProductsTable.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        MyProductsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        MyProductsPane.setViewportView(MyProductsTable);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Mis Productos");

        ModifyButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        ModifyButton.setText("Modificar");
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BackButton.setText("Volver");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        DeleteButton.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyProductsPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addGap(359, 359, 359)
                .addComponent(jLabel1)
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(ModifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
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
                .addComponent(MyProductsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // Vuelve a la ventana de perfil
        CompanyMenu companyMenu = new CompanyMenu();
        companyMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        // Cambia de ventana a la de comprar para avanzar en la operacion

    }//GEN-LAST:event_ModifyButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JScrollPane MyProductsPane;
    private javax.swing.JTable MyProductsTable;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
