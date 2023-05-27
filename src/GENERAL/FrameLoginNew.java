package GENERAL;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameLoginNew extends javax.swing.JFrame {

    public FrameLoginNew() {
        initComponents();

        //Centrar Ventana
        setLocationRelativeTo(null);

        //windowsButtonX: Confirmar Salida
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ClassMain.confirmExit(FrameLoginNew.this);
            }
        });

        //checkBoxHidePas: Ocultar Contraseña
        checkBoxHidePass.setSelected(true);
        checkBoxHidePass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean hidePassword = checkBoxHidePass.isSelected();
                if (hidePassword) {
                    passwordFieldPassword.setEchoChar('\u2022');
                } else {
                    passwordFieldPassword.setEchoChar((char) 0);
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackgourd = new javax.swing.JPanel();
        imageLogo = new javax.swing.JLabel();
        labelCompanyName = new javax.swing.JLabel();
        imageDesert = new javax.swing.JLabel();
        imageLogoMini = new javax.swing.JLabel();
        labelSlogan = new javax.swing.JLabel();
        labelCompanyNameMini = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        panelDataArea = new javax.swing.JPanel();
        labelUser = new javax.swing.JLabel();
        textFieldUserName = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        passwordFieldPassword = new javax.swing.JPasswordField();
        checkBoxHidePass = new javax.swing.JCheckBox();
        backButtonLogin = new javax.swing.JPanel();
        buttonLogin = new javax.swing.JLabel();
        backButtonExit = new javax.swing.JPanel();
        buttonExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelBackgourd.setBackground(new java.awt.Color(255, 255, 255));
        panelBackgourd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Logo1.png"))); // NOI18N
        panelBackgourd.add(imageLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 350, 150));

        labelCompanyName.setBackground(new java.awt.Color(0, 0, 0));
        labelCompanyName.setFont(new java.awt.Font("Modern Sans Serif 7", 0, 36)); // NOI18N
        labelCompanyName.setForeground(new java.awt.Color(255, 255, 255));
        labelCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCompanyName.setText("Corre Caminos, S.A.");
        panelBackgourd.add(labelCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 350, 50));

        imageDesert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Backgroud.jpg"))); // NOI18N
        imageDesert.setText("jLabel1");
        panelBackgourd.add(imageDesert, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 350, 500));

        imageLogoMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Logo2.png"))); // NOI18N
        imageLogoMini.setText("jLabel1");
        panelBackgourd.add(imageLogoMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 60));

        labelSlogan.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        labelSlogan.setForeground(new java.awt.Color(51, 51, 51));
        labelSlogan.setText("Caminos sin fronteras");
        panelBackgourd.add(labelSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        labelCompanyNameMini.setFont(new java.awt.Font("Modern Sans Serif 7", 0, 24)); // NOI18N
        labelCompanyNameMini.setForeground(new java.awt.Color(0, 0, 0));
        labelCompanyNameMini.setText("Corre Caminos, S.A.");
        panelBackgourd.add(labelCompanyNameMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, 40));

        labelLogin.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(0, 0, 0));
        labelLogin.setText("INICIAR SESIÓN");
        panelBackgourd.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        panelDataArea.setBackground(new java.awt.Color(103, 175, 163));
        panelDataArea.setForeground(new java.awt.Color(150, 158, 170));

        labelUser.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labelUser.setForeground(new java.awt.Color(0, 0, 0));
        labelUser.setText("USUARIO");

        textFieldUserName.setBorder(null);

        labelPassword.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(0, 0, 0));
        labelPassword.setText("CONTRASEÑA");

        passwordFieldPassword.setBorder(null);

        checkBoxHidePass.setBackground(new java.awt.Color(103, 175, 163));
        checkBoxHidePass.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        checkBoxHidePass.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxHidePass.setText("Ocultar Contraseña");
        checkBoxHidePass.setBorder(null);

        javax.swing.GroupLayout panelDataAreaLayout = new javax.swing.GroupLayout(panelDataArea);
        panelDataArea.setLayout(panelDataAreaLayout);
        panelDataAreaLayout.setHorizontalGroup(
            panelDataAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataAreaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelDataAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelPassword)
                        .addComponent(textFieldUserName)
                        .addComponent(labelUser)
                        .addComponent(passwordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                    .addComponent(checkBoxHidePass))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelDataAreaLayout.setVerticalGroup(
            panelDataAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataAreaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxHidePass)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panelBackgourd.add(panelDataArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 350, 190));

        backButtonLogin.setBackground(new java.awt.Color(136, 219, 255));

        buttonLogin.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(0, 0, 0));
        buttonLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonLogin.setText("Iniciar Sesión");
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backButtonLoginLayout = new javax.swing.GroupLayout(backButtonLogin);
        backButtonLogin.setLayout(backButtonLoginLayout);
        backButtonLoginLayout.setHorizontalGroup(
            backButtonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backButtonLoginLayout.createSequentialGroup()
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backButtonLoginLayout.setVerticalGroup(
            backButtonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBackgourd.add(backButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 40));

        backButtonExit.setBackground(new java.awt.Color(136, 219, 255));

        buttonExit.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(0, 0, 0));
        buttonExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonExit.setText("Salir");
        buttonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backButtonExitLayout = new javax.swing.GroupLayout(backButtonExit);
        backButtonExit.setLayout(backButtonExitLayout);
        backButtonExitLayout.setHorizontalGroup(
            backButtonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        backButtonExitLayout.setVerticalGroup(
            backButtonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelBackgourd.add(backButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgourd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackgourd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //backButtonLogin: Cambiar color al posicionar puntero
    private void buttonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseEntered
        backButtonLogin.setBackground(new Color(103, 175, 163));
    }//GEN-LAST:event_buttonLoginMouseEntered
    //backButtonLogin: Restablecer color al posicionar puntero
    private void buttonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseExited
        backButtonLogin.setBackground(new Color(136, 219, 255));
    }//GEN-LAST:event_buttonLoginMouseExited
    //backButtonExit: Cambiar color al posicionar puntero
    private void buttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseEntered
        backButtonExit.setBackground(new Color(103, 175, 163));
    }//GEN-LAST:event_buttonExitMouseEntered
    //backButtonExit: Restablecer color al posicionar puntero
    private void buttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseExited
        backButtonExit.setBackground(new Color(136, 219, 255));
    }//GEN-LAST:event_buttonExitMouseExited
    //buttonLogin: Iniciar Sesión
    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked
        String requestData = "LOGIN001001";
        String userName = textFieldUserName.getText();
        String password = new String(passwordFieldPassword.getPassword());
        userName = userName.replace(";", "");
        password = password.replace(";", "");

        requestData += ";" + userName + ";" + password;
        ClassMain.sendRequest(requestData);
    }//GEN-LAST:event_buttonLoginMouseClicked
    //buttonExit: Confirmar Salida
    private void buttonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseClicked
        ClassMain.confirmExit(FrameLoginNew.this);
    }//GEN-LAST:event_buttonExitMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FrameLoginNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLoginNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLoginNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLoginNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLoginNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backButtonExit;
    private javax.swing.JPanel backButtonLogin;
    private javax.swing.JLabel buttonExit;
    private javax.swing.JLabel buttonLogin;
    private javax.swing.JCheckBox checkBoxHidePass;
    private javax.swing.JLabel imageDesert;
    private javax.swing.JLabel imageLogo;
    private javax.swing.JLabel imageLogoMini;
    private javax.swing.JLabel labelCompanyName;
    private javax.swing.JLabel labelCompanyNameMini;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSlogan;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel panelBackgourd;
    private javax.swing.JPanel panelDataArea;
    private javax.swing.JPasswordField passwordFieldPassword;
    private javax.swing.JTextField textFieldUserName;
    // End of variables declaration//GEN-END:variables
}
