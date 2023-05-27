package GENERAL;

//Librerias incorporadas
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameLoginOld extends javax.swing.JFrame {

    public FrameLoginOld() {
        initComponents();
        
        //Centrar Ventana
        setLocationRelativeTo(null);  
        
        // Evitar que la ventana sea redimensionable
        setResizable(false);        

        //BTN "X" = Confirmar Salida
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ClassMain.confirmExit(FrameLoginOld.this);
            }
        });        
        
        //BTN Salir = Confirmar Salida
        buttonExit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            ClassMain.confirmExit(FrameLoginOld.this);
            }
        }); 
        
        //CKB Ocultar = Ocultar Password
        checkBoxHide.setSelected(true);
        checkBoxHide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean hidePassword = checkBoxHide.isSelected();
                if (hidePassword) {
                    textFieldPassword.setEchoChar('\u2022'); 
                } else {
                    textFieldPassword.setEchoChar((char) 0);
                }
            }
        });
        
        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String requestData = "LOGIN001001";
                String userName    = textFieldUser.getText();
                String password    = new String(textFieldPassword.getPassword());
                userName = userName.replace(";", "");
                password = password.replace(";", "");
                
                requestData += ";" + userName + ";" + password;
                ClassMain.sendRequest(requestData);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonExit = new javax.swing.JButton();
        buttonLogin = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        textFieldUser = new javax.swing.JTextField();
        textFieldPassword = new javax.swing.JPasswordField();
        labelUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        checkBoxHide = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonExit.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        buttonExit.setText("Salir");

        buttonLogin.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        buttonLogin.setText("Iniciar Sesión");

        labelLogin.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        labelLogin.setText("Inicio de Sesión");

        textFieldUser.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        textFieldPassword.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        labelUser.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        labelUser.setText("Usuario");

        labelPassword.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        labelPassword.setText("Constraseña");

        checkBoxHide.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        checkBoxHide.setText("Ocultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxHide, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword)
                    .addComponent(labelUser)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelLogin)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonExit)
                            .addGap(18, 18, 18)
                            .addComponent(buttonLogin))
                        .addComponent(textFieldPassword)
                        .addComponent(textFieldUser)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelLogin)
                .addGap(46, 46, 46)
                .addComponent(labelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxHide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLogin)
                    .addComponent(buttonExit))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //IGNORAR-INICIO
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameLoginOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLoginOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLoginOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLoginOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //IGNORAR-FIN
        //</editor-fold>
        //IGNORAR-FIN
        //</editor-fold>
        //IGNORAR-FIN
        //</editor-fold>
        //IGNORAR-FIN
        //</editor-fold>
        //IGNORAR-FIN
        //</editor-fold>
        //IGNORAR-FIN
        //</editor-fold>
        //IGNORAR-FIN
        //</editor-fold>
        //IGNORAR-FIN

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLoginOld().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JCheckBox checkBoxHide;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPasswordField textFieldPassword;
    private javax.swing.JTextField textFieldUser;
    // End of variables declaration//GEN-END:variables
}
