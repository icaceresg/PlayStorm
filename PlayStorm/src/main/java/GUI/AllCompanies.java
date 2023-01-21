package GUI;

import Class.AbstractFactory.TemplateMethod.SubscriberCompany;
import Class.DataBase;
import Class.Iterator.CompanyIterator;
import Class.Proxy.AdminProxy;
import Class.Proxy.IntAdmin;
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
public class AllCompanies extends javax.swing.JFrame {

    public AllCompanies() {
        // Se centra la imagen, añade la tabla y se establece el logo y el nombre de la pantalla
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
    }

    /**
     * Metodo para crear por defecto la tabla definida por los productos
     * introducidos
     */
    public void addRowToJTable() throws Exception {

        DefaultTableModel model = (DefaultTableModel) AllCompaniesTable.getModel();

        CompanyIterator iterator = new CompanyIterator();
        Object rowData[] = new Object[AllCompaniesTable.getColumnCount()];

        while (iterator.hasNext()) {
            IntCompany company = iterator.next();

            rowData[0] = company.getCif();
            rowData[1] = company.getName();
            rowData[2] = company.getSite();
            rowData[3] = company.getEmail();
            rowData[4] = false;

            if (company instanceof SubscriberCompany) {
                rowData[4] = true;
            }

            model.addRow(rowData);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AllCompaniesPanel = new javax.swing.JScrollPane();
        AllCompaniesTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AllCompaniesTable.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        AllCompaniesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIF", "Nombre", "Localización", "Correo", "Suscrito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllCompaniesPanel.setViewportView(AllCompaniesTable);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empresas registradas");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AllCompaniesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))))
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
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(AllCompaniesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int num = AllCompaniesTable.getSelectedRow();
        //Eliminamos el producto seleccionado
        if (num != -1) {
            try {
                DefaultTableModel modelo = (DefaultTableModel) AllCompaniesTable.getModel();

                IntAdmin adminProxy = new AdminProxy();
                adminProxy.deleteCompany((String) modelo.getValueAt(num, 3));

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
    private javax.swing.JScrollPane AllCompaniesPanel;
    private javax.swing.JTable AllCompaniesTable;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
