package GUI;

import Class.DataBase;
import Class.Iterator.OrderIterator;
import Class.Iterator.ProductIterator;
import Class.Product;
import Class.State.Order;
import Class.User;
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
        try {
            DefaultTableModel model = (DefaultTableModel) MyProductsTable.getModel();
            Object rowData[] = new Object[MyProductsTable.getColumnCount()];

            ProductIterator productIterator = new ProductIterator();
            while (productIterator.hasNext()) {
                Product product = productIterator.next();
                if (product.getCompany().getEmail().equals(User.activeUser.get(0).getEmail())) {
                    if (User.activeUser.get(0).getEmail().equals(product.getCompany().getEmail())) {
                        rowData[0] = product.getId();
                        rowData[1] = product.getTitle();
                        rowData[2] = product.getCompany().getName();
                        rowData[3] = product.getPrice();
                        rowData[4] = product.getCategory();

                        model.addRow(rowData);
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

        MyProductsPane = new javax.swing.JScrollPane();
        MyProductsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MyProductsTable.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        MyProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Título", "Empresa", "Precio", "Categoría"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MyProductsPane.setViewportView(MyProductsTable);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Mis Productos");

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
                .addGap(364, 364, 364))
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
                .addGap(18, 18, 18)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // Vuelve a la ventana de perfil
        CompanyMenu companyMenu = new CompanyMenu();
        companyMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int num = MyProductsTable.getSelectedRow();
        //Eliminamos el producto seleccionado
        if (num != -1) {
            try {
                DefaultTableModel modelo = (DefaultTableModel) MyProductsTable.getModel();

                ProductIterator productIterator = new ProductIterator();
                while (productIterator.hasNext()) {
                    Product product = productIterator.next();
                    if (product.getId() == (Integer) modelo.getValueAt(num, 0)) {
                        productIterator.deleteProduct(product);

                    }
                }
                DataBase dataBase = new DataBase();
                dataBase.saveIteratorProduct(productIterator);
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
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JScrollPane MyProductsPane;
    private javax.swing.JTable MyProductsTable;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
