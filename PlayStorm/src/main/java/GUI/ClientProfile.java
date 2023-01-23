/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.AbstractFactory.TemplateMethod.SubscriberClient;
import Class.Adapter.Password;
import Class.Adapter.PasswordAdapter;
import Class.Adapter.PasswordEncode;
import Class.Command.LogoutCommand;
import Class.DataBase;
import Class.Iterator.ClientIterator;
import Class.User;
import Interfaces.IntClient;
import Interfaces.IntLogOut;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class ClientProfile extends javax.swing.JFrame {

    /**
     * Creates new form UserProfile
     */
    public ClientProfile() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);

        initComponents();

        this.setTitle("PlayStorm");

        ImageIcon imagen = new ImageIcon("./images/LogoApp 01.png");
        this.setIconImage(imagen.getImage());

        insertData();
    }

    /**
     *
     */
    public void insertData() {
        NameField.setText(User.activeUser.get(0).getName());

        IntClient client = getClient();
        ProfileNameField.setText(client.getName());
        BirthdayField.setText(client.getBirthday());
        CreditCardField.setText(client.getCreditCard());
        TelephoneField.setText(client.getTelephone());
        LocationField.setText(client.getLocation());
        EmailField.setText(client.getEmail());
        LastNameField.setText(client.getLastName());
        PassField.setText("");
        RepeatPassField.setText("");
        if (client instanceof SubscriberClient) {
            VIPCheckBox.setSelected(true);
        }else{
            VIPCheckBox.setSelected(false);
        }
    }

    /**
     *
     * @return
     */
    public IntClient getClient() {
        IntClient clientSelected = null;
        try {
            ClientIterator iterator = new ClientIterator();
            while (iterator.hasNext()) {
                IntClient client = iterator.next();
                if (client.getEmail().equals(User.activeUser.get(0).getEmail())) {
                    clientSelected = client;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ClientProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientSelected;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        BirthdayField = new javax.swing.JTextField();
        CreditCardField = new javax.swing.JTextField();
        LocationField = new javax.swing.JTextField();
        TelephoneField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        ProfileNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        PassField = new javax.swing.JPasswordField();
        RepeatPassField = new javax.swing.JPasswordField();
        BackButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        VIPCheckBox = new javax.swing.JCheckBox();
        MenuBar = new javax.swing.JMenuBar();
        ProfileMenu = new javax.swing.JMenu();
        ProfileItem = new javax.swing.JMenuItem();
        LibraryMenu = new javax.swing.JMenu();
        LibraryItem = new javax.swing.JMenuItem();
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

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Perfil de:");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Correo:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Repite la contraseña:");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Fecha de nacimiento:");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Número de tarjeta bancaria: ");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Localización:");

        jLabel10.setText("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Teléfono:");

        NameField.setEditable(false);
        NameField.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        BirthdayField.setEditable(false);
        BirthdayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthdayFieldActionPerformed(evt);
            }
        });

        CreditCardField.setEditable(false);
        CreditCardField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardFieldActionPerformed(evt);
            }
        });

        LocationField.setEditable(false);
        LocationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationFieldActionPerformed(evt);
            }
        });

        TelephoneField.setEditable(false);
        TelephoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelephoneFieldActionPerformed(evt);
            }
        });

        EmailField.setEditable(false);
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        ProfileNameField.setEditable(false);
        ProfileNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileNameFieldActionPerformed(evt);
            }
        });

        LastNameField.setEditable(false);
        LastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameFieldActionPerformed(evt);
            }
        });

        PassField.setEditable(false);
        PassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassFieldActionPerformed(evt);
            }
        });

        RepeatPassField.setEditable(false);
        RepeatPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepeatPassFieldActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        BackButton.setText("Volver");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        SaveButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        SaveButton.setText("Guardar Cambios");
        SaveButton.setEnabled(false);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        VIPCheckBox.setText("VIP");
        VIPCheckBox.setEnabled(false);

        ProfileMenu.setText("Datos");

        ProfileItem.setText("Editar Datos");
        ProfileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileItemActionPerformed(evt);
            }
        });
        ProfileMenu.add(ProfileItem);

        MenuBar.add(ProfileMenu);

        LibraryMenu.setText("Biblioteca");

        LibraryItem.setText("Ver Mi Biblioteca");
        LibraryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibraryItemActionPerformed(evt);
            }
        });
        LibraryMenu.add(LibraryItem);

        MenuBar.add(LibraryMenu);

        SessionCloseMenu.setText("Cerrar Sesion");

        SessionCloseItem.setText("Cerrar Sesion");
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
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RepeatPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(CreditCardField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ProfileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(103, 103, 103)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(LocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(VIPCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TelephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(ProfileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TelephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(VIPCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RepeatPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BirthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CreditCardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param text
     * @return
     */
    public boolean isTextEditable(String text) {
        return false;
    }
    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed

    }//GEN-LAST:event_EmailFieldActionPerformed

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

    private void PassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassFieldActionPerformed

    private void RepeatPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepeatPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepeatPassFieldActionPerformed

    private void BirthdayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthdayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthdayFieldActionPerformed

    private void CreditCardFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditCardFieldActionPerformed

    private void LocationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationFieldActionPerformed

    private void TelephoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelephoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelephoneFieldActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        GameSearch search = new GameSearch();
        search.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        boolean emptyFields = BirthdayField.getText().equals("") //no esta
                | CreditCardField.getText().equals("") //esta
                | LocationField.getText().equals("") //esta
                | ProfileNameField.getText().equals("") //esta
                | (String.valueOf(PassField.getPassword())).equals("") //esta
                | (String.valueOf(RepeatPassField.getPassword())).equals("") //esta
                | LastNameField.getText().equals("") //esta
                | TelephoneField.getText().equals("") //esta
                | EmailField.getText().equals("");                      //esta 

        if (emptyFields | !((String.valueOf(PassField.getPassword())).equals((String.valueOf(RepeatPassField.getPassword()))))) {
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

                ClientIterator iterator = new ClientIterator();
                while (iterator.hasNext()) {
                    IntClient client = iterator.next();
                    if (client.getEmail().equals(User.activeUser.get(0).getEmail())) {
                        client.setBirthday(BirthdayField.getText());
                        client.setCreditCard(CreditCardField.getText());
                        client.setLastName(LastNameField.getText());
                        client.setName(ProfileNameField.getText());
                        client.setTelephone(TelephoneField.getText());
                        client.setLocation(LocationField.getText());
                        client.setPassword(finalEncodePassword);

                        User.activeUser.get(0).setEmail(client.getEmail());
                        User.activeUser.get(0).setName(client.getName());
                        User.activeUser.get(0).setPassword(client.getPassword());
                    }
                }

                DataBase database = new DataBase();
                database.saveIteratorClient(iterator);

            } catch (Exception ex) {
                Logger.getLogger(ClientProfile.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(this, "El cliente se ha actualizado", "Editar Cliente", JOptionPane.INFORMATION_MESSAGE);

        }

        ProfileNameField.setEditable(false);
        BirthdayField.setEditable(false);
        CreditCardField.setEditable(false);
        TelephoneField.setEditable(false);
        LocationField.setEditable(false);
        LastNameField.setEditable(false);
        PassField.setEditable(false);
        RepeatPassField.setEditable(false);

        SaveButton.setEnabled(false);

        insertData();
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void LibraryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibraryItemActionPerformed
        // TODO add your handling code here:
        MyLibrary library = new MyLibrary();
        library.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_LibraryItemActionPerformed

    private void SessionCloseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SessionCloseItemActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            IntLogOut logOutCommand = new LogoutCommand();
            logOutCommand.logOut(this);
        }

    }//GEN-LAST:event_SessionCloseItemActionPerformed

    private void ProfileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileItemActionPerformed
        ProfileNameField.setEditable(true);
        BirthdayField.setEditable(true);
        CreditCardField.setEditable(true);
        TelephoneField.setEditable(true);
        LocationField.setEditable(true);
        LastNameField.setEditable(true);
        PassField.setEditable(true);
        RepeatPassField.setEditable(true);

        SaveButton.setEnabled(true);
    }//GEN-LAST:event_ProfileItemActionPerformed

    private void ProfileNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileNameFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField BirthdayField;
    private javax.swing.JTextField CreditCardField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JMenuItem LibraryItem;
    private javax.swing.JMenu LibraryMenu;
    private javax.swing.JTextField LocationField;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField NameField;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JMenuItem ProfileItem;
    private javax.swing.JMenu ProfileMenu;
    private javax.swing.JTextField ProfileNameField;
    private javax.swing.JPasswordField RepeatPassField;
    private javax.swing.JButton SaveButton;
    private javax.swing.JMenuItem SessionCloseItem;
    private javax.swing.JMenu SessionCloseMenu;
    private javax.swing.JTextField TelephoneField;
    private javax.swing.JCheckBox VIPCheckBox;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
