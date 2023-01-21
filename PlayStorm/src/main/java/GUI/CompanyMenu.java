/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
 * @author AdriiM_
 */
public class CompanyMenu extends javax.swing.JFrame {

    /**
     * Creates new form ProviderMenu
     */
    public CompanyMenu() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);

        initComponents();

        this.setTitle("JavaPop");

        ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
        this.setIconImage(imagen.getImage());

        NameLabel.setText(User.usuarioActivo.get(0).getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButtonAnnadirProducto = new javax.swing.JButton();
        jButtonBorrarProducto = new javax.swing.JButton();
        jButtonVerVentas = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuProvideer = new javax.swing.JMenu();
        jMenuItemEditProvideer = new javax.swing.JMenuItem();
        jMenuStudioRegister = new javax.swing.JMenu();
        jMenuItemStudioRegister = new javax.swing.JMenuItem();
        jMenuCloseSession = new javax.swing.JMenu();
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
        jLabel1.setText("Bienvenido,");

        jButtonAnnadirProducto.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButtonAnnadirProducto.setText("Añadir Producto");
        jButtonAnnadirProducto.setToolTipText("");
        jButtonAnnadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnadirProductoActionPerformed(evt);
            }
        });

        jButtonBorrarProducto.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButtonBorrarProducto.setText("Ver Productos");
        jButtonBorrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarProductoActionPerformed(evt);
            }
        });

        jButtonVerVentas.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButtonVerVentas.setText("Ver Ventas");
        jButtonVerVentas.setActionCommand("");
        jButtonVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerVentasActionPerformed(evt);
            }
        });

        jMenuProvideer.setText("Proveedor");

        jMenuItemEditProvideer.setText("Editar Proveedor");
        jMenuItemEditProvideer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditProvideerActionPerformed(evt);
            }
        });
        jMenuProvideer.add(jMenuItemEditProvideer);

        jMenuBar1.add(jMenuProvideer);

        jMenuStudioRegister.setText("Registrar Estudio");

        jMenuItemStudioRegister.setText("Registrar Estudio");
        jMenuItemStudioRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemStudioRegisterActionPerformed(evt);
            }
        });
        jMenuStudioRegister.add(jMenuItemStudioRegister);

        jMenuBar1.add(jMenuStudioRegister);

        jMenuCloseSession.setText("Cerrar Sesión");

        jMenuItemCloseSession.setText("Cerrar Sesion");
        jMenuItemCloseSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCloseSessionActionPerformed(evt);
            }
        });
        jMenuCloseSession.add(jMenuItemCloseSession);

        jMenuBar1.add(jMenuCloseSession);

        setJMenuBar(jMenuBar1);

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
                            .addComponent(jButtonAnnadirProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jButtonBorrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVerVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(jButtonAnnadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonBorrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnadirProductoActionPerformed
        ProductCreation productCreationMenu = new ProductCreation();
        productCreationMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAnnadirProductoActionPerformed

    private void jButtonBorrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarProductoActionPerformed
        MyProducts myProducts = new MyProducts();
        myProducts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBorrarProductoActionPerformed

    private void jMenuItemStudioRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemStudioRegisterActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItemStudioRegisterActionPerformed

    private void jMenuItemCloseSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCloseSessionActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            IntLogOut logOutCommand = new LogoutCommand();
            logOutCommand.logOut(this);
        }
    }//GEN-LAST:event_jMenuItemCloseSessionActionPerformed

    private void jButtonVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerVentasActionPerformed
        MySales mySales = new MySales();
        mySales.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVerVentasActionPerformed

    private void jMenuItemEditProvideerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditProvideerActionPerformed
        CompanyDataEdit companyMenu = new CompanyDataEdit();
        companyMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemEditProvideerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton jButtonAnnadirProducto;
    private javax.swing.JButton jButtonBorrarProducto;
    private javax.swing.JButton jButtonVerVentas;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCloseSession;
    private javax.swing.JMenuItem jMenuItemCloseSession;
    private javax.swing.JMenuItem jMenuItemEditProvideer;
    private javax.swing.JMenuItem jMenuItemStudioRegister;
    private javax.swing.JMenu jMenuProvideer;
    private javax.swing.JMenu jMenuStudioRegister;
    // End of variables declaration//GEN-END:variables
}
