package GUI;

import Class.DataBase;
import Class.Iterator.ProductIterator;
import Class.Product;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AllProducts extends javax.swing.JFrame {

    public AllProducts() {
        // Se centra la imagen, añade la tabla y se establece el logo y el nombre de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);
        initComponents();

        ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
        this.setIconImage(imagen.getImage());

        this.setTitle("JavaPop");

        try {
            addRowToJTable();
        } catch (Exception ex) {
            Logger.getLogger(AllProducts.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Metodo para crear por defecto la tabla definida por los productos
     * introducidos
     */
    public void addRowToJTable() throws Exception {

        DefaultTableModel model = (DefaultTableModel) AllProductsTable.getModel();

        ProductIterator iterator = new ProductIterator();
        Object rowData[] = new Object[AllProductsTable.getColumnCount()];

        while (iterator.hasNext()) {
            Product product = iterator.next();

            rowData[0] = product.getId();
            rowData[1] = product.getTitle();
            rowData[2] = product.getDescription();
            rowData[3] = product.getCategory();
            rowData[4] = product.getPrice();
            rowData[5] = product.getCompany().getName();
            rowData[6] = product.getAmount();

            model.addRow(rowData);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AllProductsPane = new javax.swing.JScrollPane();
        AllProductsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AllProductsTable.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        AllProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Título", "Descripción", "Categoría", "Precio", "Empresa", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllProductsPane.setViewportView(AllProductsTable);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Videojuegos registrados");

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
            .addComponent(AllProductsPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
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
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(AllProductsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int num = AllProductsTable.getSelectedRow();
        //Eliminamos el producto seleccionado
        if (num != -1) {
            try {
                DefaultTableModel modelo = (DefaultTableModel) AllProductsTable.getModel();

                ProductIterator iteratorProduct = new ProductIterator();
                while (iteratorProduct.hasNext()) {
                    Product product = iteratorProduct.next();

                    if (product.getId() == (Integer) modelo.getValueAt(num, 0)) {
                        iteratorProduct.deleteProduct(product);

                    }
                }
                DataBase database = new DataBase();
                database.saveIteratorProduct(iteratorProduct);
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
    private javax.swing.JScrollPane AllProductsPane;
    private javax.swing.JTable AllProductsTable;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
