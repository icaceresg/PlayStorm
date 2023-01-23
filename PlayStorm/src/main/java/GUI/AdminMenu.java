package GUI;

import Class.User;
import Class.Command.LogoutCommand;
import Interfaces.IntLogOut;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     *
     */
    public AdminMenu() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);

        initComponents();

        this.setTitle("PlayStorm");

        ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
        this.setIconImage(imagen.getImage());

        Name.setText(User.activeUser.get(0).getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        ProductsButton = new javax.swing.JButton();
        ClientsButton = new javax.swing.JButton();
        CompanyButton = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        SessionCloseMenu = new javax.swing.JMenu();
        jMenuItemCloseSession = new javax.swing.JMenuItem();

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
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido, ");

        ProductsButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        ProductsButton.setText("Videojuegos");
        ProductsButton.setToolTipText("");
        ProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsButtonActionPerformed(evt);
            }
        });

        ClientsButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        ClientsButton.setText("Clientes");
        ClientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientsButtonActionPerformed(evt);
            }
        });

        CompanyButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        CompanyButton.setText("Empresas");
        CompanyButton.setActionCommand("");
        CompanyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyButtonActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        SessionCloseMenu.setText("Cerrar Sesión");

        jMenuItemCloseSession.setText("Cerrar Sesión");
        jMenuItemCloseSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCloseSessionActionPerformed(evt);
            }
        });
        SessionCloseMenu.add(jMenuItemCloseSession);

        MenuBar.add(SessionCloseMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProductsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CompanyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ClientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(CompanyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsButtonActionPerformed
        AllProducts allProducts = new AllProducts();
        allProducts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductsButtonActionPerformed

    private void ClientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientsButtonActionPerformed
        AllClients allUsers = new AllClients();
        allUsers.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClientsButtonActionPerformed

    private void jMenuItemCloseSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCloseSessionActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            IntLogOut logOutCommand = new LogoutCommand();
            logOutCommand.logOut(this);
        }


    }//GEN-LAST:event_jMenuItemCloseSessionActionPerformed

    private void CompanyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyButtonActionPerformed
        AllCompanies allCompanies = new AllCompanies();
        allCompanies.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CompanyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClientsButton;
    private javax.swing.JButton CompanyButton;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel Name;
    private javax.swing.JButton ProductsButton;
    private javax.swing.JMenu SessionCloseMenu;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItemCloseSession;
    // End of variables declaration//GEN-END:variables
}
