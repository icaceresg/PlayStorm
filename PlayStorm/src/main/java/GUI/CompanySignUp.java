package GUI;

import Class.AbstractFactory.NotSubscriberFactory;
import Class.Adapter.PasswordAdapter;
import Class.Adapter.PasswordEncode;
import Class.Adapter.Password;
import Class.*;
import Class.AbstractFactory.SubscriberFactory;
import Class.Iterator.ClientIterator;
import Class.Iterator.CompanyIterator;
import Interfaces.IntClient;
import Interfaces.IntCompany;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * JFrame para registrar una empresa
 */
public class CompanySignUp extends javax.swing.JFrame {

    /**
     * Método que inicializa esta vista, hace que la pantalla esté centrada,
     * escribe el título e inserta la foto
     */
    public CompanySignUp() {
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

        PassField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RepeatPassField = new javax.swing.JPasswordField();
        BackButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        LocationField = new javax.swing.JTextField();
        CIFField = new javax.swing.JTextField();
        AcceptButton = new javax.swing.JButton();
        EmailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        VIPComboBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel1.setText("Registro de empresa");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel8.setText("Repita la contraseña");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de la empresa");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel3.setText("Localización");

        BackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        BackButton.setText("Volver");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel6.setText("Contraseña");

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        LocationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationFieldActionPerformed(evt);
            }
        });

        CIFField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIFFieldActionPerformed(evt);
            }
        });

        AcceptButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        AcceptButton.setText("Aceptar");
        AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButtonActionPerformed(evt);
            }
        });

        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setText("C.I.F");

        VIPComboBox.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        VIPComboBox.setText("VIP");
        VIPComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIPComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 142, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(VIPComboBox)
                .addGap(96, 96, 96)
                .addComponent(BackButton)
                .addGap(53, 53, 53)
                .addComponent(AcceptButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PassField, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(RepeatPassField)
                    .addComponent(EmailField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CIFField)
                    .addComponent(LocationField)
                    .addComponent(NameField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CIFField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RepeatPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptButton)
                    .addComponent(BackButton)
                    .addComponent(VIPComboBox))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void LocationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationFieldActionPerformed

    private void CIFFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIFFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIFFieldActionPerformed

    private void AcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptButtonActionPerformed
        boolean emptyFields = CIFField.getText().equals("") //no esta
                | EmailField.getText().equals("") //esta
                | NameField.getText().equals("") //esta
                | PassField.getPassword().equals("") //esta
                | RepeatPassField.getPassword().equals("") //esta
                | LocationField.getText().equals("");

        if (emptyFields | !(Arrays.equals(PassField.getPassword(), RepeatPassField.getPassword()))) {
            if (emptyFields) {
                JOptionPane.showMessageDialog(this, "Existen campos vacíos", "Registro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Las contraseñas no son iguales", "Registro", JOptionPane.ERROR_MESSAGE);
            }

        } else if (sameEmail(EmailField.getText())) {
            JOptionPane.showMessageDialog(this, "Ese correo ya existe", "Registro", JOptionPane.ERROR_MESSAGE);
            EmailField.setText("");

        } else {
            String finalEncodePassword;

            Password password = new Password((String.valueOf(PassField.getPassword())));
            PasswordAdapter passwordAdapter = new PasswordAdapter(password);

            finalEncodePassword = new PasswordEncode().save(passwordAdapter);

            IntCompany company;
            if (VIPComboBox.isSelected()) {
                company = new SubscriberFactory().createCompany(NameField.getText(), EmailField.getText(), finalEncodePassword, LocationField.getText(), CIFField.getText());
            } else {
                company = new NotSubscriberFactory().createCompany(NameField.getText(), EmailField.getText(), finalEncodePassword, LocationField.getText(), CIFField.getText());
            }

            DataBase database = new DataBase();
            try {
                database.saveCompanies(company);
            } catch (Exception ex) {
                Logger.getLogger(CompanySignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Empresa registrado correctamente", "Registro", JOptionPane.INFORMATION_MESSAGE);
            Login login = new Login();
            login.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_AcceptButtonActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void VIPComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIPComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VIPComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField CIFField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField LocationField;
    private javax.swing.JTextField NameField;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JPasswordField RepeatPassField;
    private javax.swing.JCheckBox VIPComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    /**
     * Comprueba el correo escrito
     *
     * @param email, email nuevo
     * @return boolean
     */
    private boolean sameEmail(String email) {
        if (email.equals("admin@admin")) {
            return false;
        } else {

            try {
                ClientIterator clientIterator = new ClientIterator();
                while (clientIterator.hasNext()) {
                    IntClient client = clientIterator.next();
                    if (client.getEmail().equals(email)) {
                        return true;
                    }
                }

                CompanyIterator companyIterator = new CompanyIterator();
                while (companyIterator.hasNext()) {
                    IntCompany company = companyIterator.next();
                    if (company.getEmail().equals(email)) {
                        return true;
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(CompanySignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

    }
}
