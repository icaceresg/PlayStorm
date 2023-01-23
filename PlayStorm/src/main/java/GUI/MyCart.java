package GUI;

import Class.AbstractFactory.TemplateMethod.SubscriberClient;
import Class.DataBase;
import Class.Iterator.ClientIterator;
import Class.Iterator.CompanyIterator;
import Class.Iterator.OrderIterator;
import Class.Iterator.ProductIterator;
import Class.Product;
import Class.State.Order;
import Class.State.ProcessingOrderState;
import Class.User;
import Interfaces.IntClient;
import Interfaces.IntCompany;
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
public class MyCart extends javax.swing.JFrame {

    /**
     *
     */
    public MyCart() {
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
            DefaultTableModel model = (DefaultTableModel) MyShoppingCartTable.getModel();

            OrderIterator orderIterator = new OrderIterator();
            Order order = null;
            while (orderIterator.hasNext()) {
                Order orderSearch = orderIterator.next();
                if (orderSearch.getClient().getEmail().equals(User.activeUser.get(0).getEmail()) & !orderSearch.getStatus().equals("Finalizado")) {
                    order = orderSearch;
                }
            }

            if (order == null) {
                return;
            }

            ArrayList<Product> products = order.getProduct();
            Object rowData[] = new Object[MyShoppingCartTable.getColumnCount()];

            int i = 0;
            if (products.isEmpty()) {
                return;
            }
            while (i < products.size()) {

                rowData[0] = products.get(i).getId();
                rowData[1] = products.get(i).getTitle();
                rowData[2] = products.get(i).getDescription();
                rowData[3] = products.get(i).getCategory();
                rowData[4] = products.get(i).getPrice();
                rowData[5] = products.get(i).getCompany().getName();

                model.addRow(rowData);
                i++;

            }
        } catch (Exception ex) {
            Logger.getLogger(MyCart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MyShoppingCartPane = new javax.swing.JScrollPane();
        MyShoppingCartTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BuyButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        SendBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MyShoppingCartTable.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        MyShoppingCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Descripción", "Categoría", "Precio", "Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        MyShoppingCartPane.setViewportView(MyShoppingCartTable);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Mi carrito");

        BuyButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BuyButton.setText("Comprar");
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BackButton.setText("Volver");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        SendBackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        SendBackButton.setText("Devolver");
        SendBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyShoppingCartPane)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BackButton)
                        .addGap(347, 347, 347)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(SendBackButton)
                        .addGap(125, 125, 125)
                        .addComponent(BuyButton)))
                .addContainerGap(328, Short.MAX_VALUE))
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
                .addComponent(MyShoppingCartPane, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuyButton)
                    .addComponent(SendBackButton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // Vuelve a la ventana de perfil
        GameSearch games = new GameSearch();
        games.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SendBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBackButtonActionPerformed
        int num = MyShoppingCartTable.getSelectedRow();
        if (num > -1) {
            try {
                DefaultTableModel modelo = (DefaultTableModel) MyShoppingCartTable.getModel();
                OrderIterator orderIterator = new OrderIterator();

                Order order = null;
                while (orderIterator.hasNext()) {
                    Order orderSearch = orderIterator.next();
                    if (orderSearch.getClient().getEmail().equals(User.activeUser.get(0).getEmail()) & !orderSearch.getStatus().equals("Finalizado")) {
                        order = orderSearch;
                    }
                }

                ArrayList<Product> products = order.getProduct();
                Product product = products.get(num);
                products.remove(product);
                modelo.removeRow(num);

                ProductIterator productIterator = new ProductIterator();
                productIterator.addProducts(product);

                DataBase dataBase = new DataBase();
                dataBase.saveIteratorProduct(productIterator);
                dataBase.saveIteratorOrder(orderIterator);
            } catch (Exception ex) {
                Logger.getLogger(GameSearch.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un producto a devolver.", "Devolver producto", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_SendBackButtonActionPerformed

    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyButtonActionPerformed
        int num = MyShoppingCartTable.getSelectedRow();
        if (num > -1) {
            try {

                OrderIterator orderIterator = new OrderIterator();
                Order order = null;
                while (orderIterator.hasNext()) {
                    Order orderSearch = orderIterator.next();
                    if (orderSearch.getClient().getEmail().equals(User.activeUser.get(0).getEmail()) & !orderSearch.getStatus().equals("Finalizado")) {
                        order = orderSearch;
                    }
                }

                if (order == null) {
                    JOptionPane.showMessageDialog(this, "La cesta está vacía", "Mi Carrito", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                float sum = 0;
                for (int i = 0; i < order.getProduct().size(); i++) {
                    sum += order.getProduct().get(i).getPrice();
                    IntCompany company = null;
                    CompanyIterator companyIterator = new CompanyIterator();
                    while (companyIterator.hasNext()) {
                        IntCompany companySelected = companyIterator.next();
                        if (companySelected.getEmail().equals(order.getProduct().get(i).getCompany().getEmail())) {
                            companySelected.setWallet(companySelected.getWallet() + order.getProduct().get(i).getPrice());
                        }
                    }
                }

                IntClient client = null;
                ClientIterator clientIterator = new ClientIterator();
                while (clientIterator.hasNext()) {
                    IntClient clientSelected = clientIterator.next();
                    if (clientSelected.getEmail().equals(User.activeUser.get(0).getEmail())) {
                        client = clientSelected;
                    }
                }

                if (client instanceof SubscriberClient) {
                    client.setWallet((float) (client.getWallet() - (sum * 0.92)));
                } else {
                    client.setWallet(client.getWallet() - sum);
                }

                order.setState(new ProcessingOrderState());
                order.finish(); // prints "Order processing cannot be canceled"

                DataBase dataBase = new DataBase();
                dataBase.saveIteratorOrder(orderIterator);
                dataBase.saveIteratorClient(clientIterator);
                DefaultTableModel model = new DefaultTableModel(0, 0);
                MyShoppingCartTable.setModel(model);
                addRowToJTable();

                GameSearch gameSearch = new GameSearch();
                gameSearch.setVisible(true);
                this.dispose();

            } catch (Exception ex) {
                Logger.getLogger(MyCart.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "La cesta está vacía.", "Finalizar pedido", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_BuyButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BuyButton;
    private javax.swing.JScrollPane MyShoppingCartPane;
    private javax.swing.JTable MyShoppingCartTable;
    private javax.swing.JButton SendBackButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
