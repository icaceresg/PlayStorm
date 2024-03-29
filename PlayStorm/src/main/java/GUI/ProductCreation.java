package GUI;

import Class.DataBase;
import Class.Iterator.CompanyIterator;
import Class.Product;
import Class.User;
import Interfaces.IntCompany;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * JFrame para crear un producto
 */
public class ProductCreation extends javax.swing.JFrame {

    /**
     * Método que inicializa esta vista, hace que la pantalla esté centrada,
     * escribe el título e inserta la foto
     */
    public ProductCreation() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);

        initComponents();

        this.setTitle("PlayStorm");

        ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
        this.setIconImage(imagen.getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CategoryComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();
        TitleField = new javax.swing.JTextField();
        PriceField = new javax.swing.JTextField();
        DescriptionField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Juego");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Título:");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Categoría:");

        CategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una categoría", "Rol", "Acción", "Estrategia", "Aventura", "Simulación", "Deportes", "Carreras" }));
        CategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Descripción:");

        CancelButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        CancelButton.setText("Cancelar");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        CreateButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        CreateButton.setText("Crear");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        TitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleFieldActionPerformed(evt);
            }
        });

        PriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceFieldActionPerformed(evt);
            }
        });

        DescriptionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CategoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(DescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleFieldActionPerformed

    private void CategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryComboBoxActionPerformed

    private void DescriptionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionFieldActionPerformed

    private void PriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceFieldActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        boolean emptyFields = TitleField.getText().equals("")
                | DescriptionField.getText().equals("")
                | PriceField.getText().equals("")
                | CategoryComboBox.getSelectedIndex() == 0;

        if (emptyFields) {
            JOptionPane.showMessageDialog(this, "Existen campos vacíos o no has seleccionado una categoría", "Registro juego", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Product product;
        DataBase database = new DataBase();

        CompanyIterator iteratorCompany;
        IntCompany company = null;
        try {
            iteratorCompany = new CompanyIterator();
            while (iteratorCompany.hasNext()) {
                company = iteratorCompany.next();
                if (company.getEmail().equals(User.activeUser.get(0).getEmail())) {
                    break;
                }
            }

            product = new Product(TitleField.getText(),
                    DescriptionField.getText(),
                    Float.parseFloat(PriceField.getText()),
                    CategoryComboBox.getSelectedItem().toString(),
                    company);
            database.saveProducts(product);
            JOptionPane.showMessageDialog(this, "Juego registrado correctamente", "Registro juego", JOptionPane.INFORMATION_MESSAGE);
            CompanyMenu companyMenu = new CompanyMenu();
            companyMenu.setVisible(true);
            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debes poner una cantidad y precio adecuado", "Registro juego", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(ProductCreation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        CompanyMenu companyMenu = new CompanyMenu();
        companyMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> CategoryComboBox;
    private javax.swing.JButton CreateButton;
    private javax.swing.JTextField DescriptionField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JTextField TitleField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
