package GUI;

import Class.AbstractFactory.TemplateMethod.SubscriberCompany;
import Class.Adapter.PasswordAdapter;
import Class.Adapter.PasswordEncode;
import Class.Adapter.Password;
import Class.DataBase;
import Class.Iterator.CompanyIterator;
import Class.User;
import Interfaces.IntCompany;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * JFrame para editar los datos de la empresa
 */
public class CompanyDataEdit extends javax.swing.JFrame {

    /**
     * Método que inicializa esta vista, hace que la pantalla esté centrada,
     * escribe el título e inserta la foto
     */
    public CompanyDataEdit() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);

        initComponents();
        insertData();

        this.setTitle("PlayStorm");

        ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
        this.setIconImage(imagen.getImage());
    }

    /**
     * Inserta todos los datos del usuario
     */
    public void insertData() {
        NameField.setText(User.activeUser.get(0).getName());

        IntCompany company = getCompany();
        LocationField.setText(company.getLocation());
        EmailField.setText(company.getEmail());
        CIFField.setText(company.getCif());
        PassField.setText("");
        RepeatPassField.setText("");
        if (company instanceof SubscriberCompany) {
            VipCheckBox.setSelected(true);
        } else {
            VipCheckBox.setSelected(false);
        }
    }

    /**
     * Devuelve la empresa activa
     *
     * @return company, empresa activa
     */
    public IntCompany getCompany() {
        IntCompany companySelected = null;
        try {
            CompanyIterator iterator = new CompanyIterator();
            while (iterator.hasNext()) {
                IntCompany company = iterator.next();
                if (company.getEmail().equals(User.activeUser.get(0).getEmail())) {
                    companySelected = company;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ClientProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return companySelected;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        LocationField = new javax.swing.JTextField();
        CIFField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        PassField = new javax.swing.JPasswordField();
        RepeatPassField = new javax.swing.JPasswordField();
        AcceptButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        VipCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel1.setText("Modificar empresa");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de la empresa");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel3.setText("Localización");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setText("C.I.F");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel6.setText("Contraseña");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel8.setText("Repita la contraseña");

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

        EmailField.setEditable(false);
        EmailField.setEnabled(false);
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        AcceptButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        AcceptButton.setText("Aceptar");
        AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        BackButton.setText("Volver");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        VipCheckBox.setText("VIP");
        VipCheckBox.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VipCheckBox)
                        .addGap(134, 134, 134)
                        .addComponent(BackButton)
                        .addGap(29, 29, 29)
                        .addComponent(AcceptButton))
                    .addComponent(jLabel4))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 164, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(126, 126, 126))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EmailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                        .addComponent(PassField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LocationField)
                        .addComponent(CIFField)
                        .addComponent(RepeatPassField)
                        .addComponent(NameField))
                    .addGap(25, 25, 25)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptButton)
                    .addComponent(BackButton)
                    .addComponent(VipCheckBox))
                .addGap(47, 47, 47))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addComponent(CIFField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(RepeatPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(97, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        CompanyMenu companyMenu = new CompanyMenu();
        companyMenu.setVisible(true);
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

        } else {

            try {
                String finalEncodePassword;

                Password password = new Password((String.valueOf(PassField.getPassword())));
                PasswordAdapter passwordAdapter = new PasswordAdapter(password);

                finalEncodePassword = new PasswordEncode().save(passwordAdapter);

                CompanyIterator iterator = new CompanyIterator();
                while (iterator.hasNext()) {
                    IntCompany company = iterator.next();
                    if (company.getEmail().equals(User.activeUser.get(0).getEmail())) {
                        company.setName(NameField.getText());
                        company.setCif(CIFField.getText());
                        company.setLocation(LocationField.getText());
                        company.setPassword(finalEncodePassword);

                        User.activeUser.get(0).setEmail(company.getEmail());
                        User.activeUser.get(0).setName(company.getName());
                        User.activeUser.get(0).setPassword(company.getPassword());
                    }
                }

                DataBase database = new DataBase();
                database.saveIteratorCompany(iterator);

                JOptionPane.showMessageDialog(this, "Empresa registrada correctamente", "Editar Empresa", JOptionPane.INFORMATION_MESSAGE);
                CompanyMenu menu = new CompanyMenu();
                menu.setVisible(true);
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(CompanyDataEdit.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_AcceptButtonActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField CIFField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField LocationField;
    private javax.swing.JTextField NameField;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JPasswordField RepeatPassField;
    private javax.swing.JCheckBox VipCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
