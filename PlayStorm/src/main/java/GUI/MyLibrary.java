package GUI;


import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**Ventana para ver la lista de productos añadidos al carrito para poder comprarlo*/

public class MyLibrary extends javax.swing.JFrame {

    public MyLibrary() {
        // Se centra la imagen, añade la tabla y se establece el logo y el nombre de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height / 2;
        int width = pantalla.width / 2;
        setSize(width, height);
        setLocationRelativeTo(null);
        initComponents();
        addRowToJTable();
        
        this.setTitle("JavaPop");
        
        ImageIcon imagen = new ImageIcon("./imagenes/LogoApp 01.png" );
        this.setIconImage(imagen.getImage());
    }
    
    /**
     * Metodo para crear por defecto la tabla definida por los productos introducidos
     */
    public void addRowToJTable() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaProductos = new javax.swing.JScrollPane();
        MyLibraryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ButtonTciket = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MyLibraryTable.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        MyLibraryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Empresa", "Precio", "Categoría", "Fecha Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductos.setViewportView(MyLibraryTable);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Mis Juegos Comprados");

        ButtonTciket.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        ButtonTciket.setText("Ver Ticket");
        ButtonTciket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTciketActionPerformed(evt);
            }
        });

        ButtonBack.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        ButtonBack.setText("Volver");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaProductos)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBack)
                        .addGap(347, 347, 347)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(ButtonTciket, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(ButtonBack)))
                .addGap(18, 18, 18)
                .addComponent(TablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ButtonTciket, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        // Vuelve a la ventana de perfil
        UserProfile profile = new UserProfile();
        profile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonTciketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTciketActionPerformed
        // Cambia de ventana a la de comprar para avanzar en la operacion

    }//GEN-LAST:event_ButtonTciketActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonTciket;
    private javax.swing.JTable MyLibraryTable;
    private javax.swing.JScrollPane TablaProductos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}