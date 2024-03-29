package GUI;

import Class.User;
import Class.Command.LogoutCommand;
import Interfaces.IntLogOut;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * JFrame con el menú de la empresa
 */
public class CompanyMenu extends javax.swing.JFrame {

    /**
     * Método que inicializa esta vista, hace que la pantalla esté centrada,
     * escribe el título e inserta la foto
     */
    public CompanyMenu() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);

        initComponents();

        this.setTitle("PlayStorm");

        ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
        this.setIconImage(imagen.getImage());

        NameLabel.setText(User.activeUser.get(0).getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        AddProductField = new javax.swing.JButton();
        ProductsField = new javax.swing.JButton();
        SalesButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        CompanyMenu = new javax.swing.JMenu();
        CompanyItem = new javax.swing.JMenuItem();
        SessionCloseMenu = new javax.swing.JMenu();
        SessionCloseItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido,");

        AddProductField.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        AddProductField.setText("Añadir Producto");
        AddProductField.setToolTipText("");
        AddProductField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductFieldActionPerformed(evt);
            }
        });

        ProductsField.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        ProductsField.setText("Ver Productos");
        ProductsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsFieldActionPerformed(evt);
            }
        });

        SalesButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        SalesButton.setText("Ver Ventas");
        SalesButton.setActionCommand("");
        SalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesButtonActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CompanyMenu.setText("Empresa");

        CompanyItem.setText("Editar Empresa");
        CompanyItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyItemActionPerformed(evt);
            }
        });
        CompanyMenu.add(CompanyItem);

        MenuBar.add(CompanyMenu);

        SessionCloseMenu.setText("Cerrar Sesión");

        SessionCloseItem.setText("Cerrar Sesión");
        SessionCloseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SessionCloseItemActionPerformed(evt);
            }
        });
        SessionCloseMenu.add(SessionCloseItem);

        MenuBar.add(SessionCloseMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddProductField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(ProductsField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(AddProductField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ProductsField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(SalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddProductFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductFieldActionPerformed
        ProductCreation productCreationMenu = new ProductCreation();
        productCreationMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddProductFieldActionPerformed

    private void ProductsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsFieldActionPerformed
        MyProducts myProducts = new MyProducts();
        myProducts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductsFieldActionPerformed

    private void SessionCloseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SessionCloseItemActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            IntLogOut logOutCommand = new LogoutCommand();
            logOutCommand.logOut(this);
        }
    }//GEN-LAST:event_SessionCloseItemActionPerformed

    private void SalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesButtonActionPerformed
        MySales mySales = new MySales();
        mySales.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalesButtonActionPerformed

    private void CompanyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyItemActionPerformed
        CompanyDataEdit companyMenu = new CompanyDataEdit();
        companyMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CompanyItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductField;
    private javax.swing.JMenuItem CompanyItem;
    private javax.swing.JMenu CompanyMenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton ProductsField;
    private javax.swing.JButton SalesButton;
    private javax.swing.JMenuItem SessionCloseItem;
    private javax.swing.JMenu SessionCloseMenu;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
