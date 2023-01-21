/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.Client;
import Class.User;
import Class.Command.LogoutCommand;
import Class.Iterator.ClientIterator;
import Class.Iterator.CompanyIterator;
import Class.Iterator.ProductIterator;
import Class.Observer.SumObserver;
import Class.Observer.SumSubject;
import Class.Product;
import Interfaces.IntClient;
import Interfaces.IntCompany;
import Interfaces.IntLogOut;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AdriiM_
 */
public class GameSearch extends javax.swing.JFrame {

    /**
     * Creates new form GameSearch
     */
    public GameSearch() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);

        initComponents();
        try {
            addRowToJTable();
        } catch (Exception ex) {
            Logger.getLogger(AllCompanies.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.setTitle("JavaPop");

        ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
        this.setIconImage(imagen.getImage());

        float wallet = getWallet(User.usuarioActivo.get(0).getEmail());
        Money.setText(String.valueOf(wallet));
    }

    private float getWallet(String email) {
        try {
            ClientIterator iterator = new ClientIterator();
            while (iterator.hasNext()) {
                IntClient client = iterator.next();
                if (client.getEmail().equals(email)) {
                    return client.getWallet();
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void addRowToJTable() throws Exception {

        DefaultTableModel model = (DefaultTableModel) AllProductsTable.getModel();

        ProductIterator iterator = new ProductIterator();
        Object rowData[] = new Object[AllProductsTable.getColumnCount()];

        while (iterator.hasNext()) {
            Product product = iterator.next();

            rowData[0] = product.getTitle();
            rowData[1] = product.getDescription();
            rowData[2] = product.getCategory();
            rowData[3] = product.getPrice();
            rowData[4] = product.getCompany().getName();
            rowData[5] = product.getAmount();

            model.addRow(rowData);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameField = new javax.swing.JTextField();
        Categorycombobox = new javax.swing.JComboBox<>();
        MaxPriceSlider = new javax.swing.JSlider();
        SearchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllProductsTable = new javax.swing.JTable();
        AddCartButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Money = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ProfileMenu = new javax.swing.JMenu();
        Profile = new javax.swing.JMenuItem();
        AddMoneyItem = new javax.swing.JMenuItem();
        CartMenu = new javax.swing.JMenu();
        Cart = new javax.swing.JMenuItem();
        CloseSessionMenu = new javax.swing.JMenu();
        CloseSession = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameField.setText("Inserte título...");
        NameField.setToolTipText("");
        NameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NameFieldMouseEntered(evt);
            }
        });
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        Categorycombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una categoria", "Rol", "Acción", "Estrategia", "Aventura", "Simulación", "Deportes", "Carreras" }));
        Categorycombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategorycomboboxActionPerformed(evt);
            }
        });

        SearchButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        SearchButton.setText("Buscar");

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Precio máximo");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Todos los productos:");

        jLabel3.setText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        AllProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Descripción", "Categoría", "Precio", "Empresa", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AllProductsTable);

        AddCartButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        AddCartButton.setText("Añadir al carrito");
        AddCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCartButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Dinero:");

        ProfileMenu.setText("Perfil");

        Profile.setText("Ver Datos");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });
        ProfileMenu.add(Profile);

        AddMoneyItem.setText("Añadir Dinero");
        AddMoneyItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMoneyItemActionPerformed(evt);
            }
        });
        ProfileMenu.add(AddMoneyItem);

        jMenuBar1.add(ProfileMenu);

        CartMenu.setText("Carrito");

        Cart.setText("Ver Carrito");
        Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartActionPerformed(evt);
            }
        });
        CartMenu.add(Cart);

        jMenuBar1.add(CartMenu);

        CloseSessionMenu.setText("Cerrar Sesión");

        CloseSession.setText("Cerrar Sesion");
        CloseSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseSessionActionPerformed(evt);
            }
        });
        CloseSessionMenu.add(CloseSession);

        jMenuBar1.add(CloseSessionMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Categorycombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MaxPriceSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Money, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Categorycombobox))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(Money, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaxPriceSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddCartButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void CloseSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseSessionActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            IntLogOut logOutCommand = new LogoutCommand();
            logOutCommand.logOut(this);
        }
    }//GEN-LAST:event_CloseSessionActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:
        ClientProfile profile = new ClientProfile();
        profile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProfileActionPerformed

    private void CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartActionPerformed
        // TODO add your handling code here:
        MyCart cart = new MyCart();
        cart.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CartActionPerformed

    private void AddCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddCartButtonActionPerformed

    private void CategorycomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategorycomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategorycomboboxActionPerformed

    private void NameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldMouseEntered

    private void NameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameFieldMouseClicked
        if (NameField.getText().equals("Inserte título..."))
            NameField.setText("");
    }//GEN-LAST:event_NameFieldMouseClicked

    private void AddMoneyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMoneyItemActionPerformed
        float money = Float.parseFloat(JOptionPane.showInputDialog(null, "Escriba la cantidad de dinero que desea añadir"));

        SumSubject dataSource = new SumSubject();
        SumObserver observer = new SumObserver();

        dataSource.registerObserver(observer);

        dataSource.getClientData(getWallet(User.usuarioActivo.get(0).getEmail()));
        dataSource.getExternalData(money);

        dataSource.removeObserver(observer);

        float wallet = getWallet(User.usuarioActivo.get(0).getEmail());
        Money.setText(String.valueOf(wallet));
    }//GEN-LAST:event_AddMoneyItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCartButton;
    private javax.swing.JMenuItem AddMoneyItem;
    private javax.swing.JTable AllProductsTable;
    private javax.swing.JMenuItem Cart;
    private javax.swing.JMenu CartMenu;
    private javax.swing.JComboBox<String> Categorycombobox;
    private javax.swing.JMenuItem CloseSession;
    private javax.swing.JMenu CloseSessionMenu;
    private javax.swing.JSlider MaxPriceSlider;
    private javax.swing.JLabel Money;
    private javax.swing.JTextField NameField;
    private javax.swing.JMenuItem Profile;
    private javax.swing.JMenu ProfileMenu;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
