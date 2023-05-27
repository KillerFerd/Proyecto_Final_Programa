package GENERAL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class PanelAdmin extends javax.swing.JPanel {


    public PanelAdmin() {
        initComponents();
        
        //BTN Regresar
        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FramePrincipal principalWindow = (FramePrincipal) SwingUtilities.getWindowAncestor(PanelAdmin.this);
                PanelPrincipal principalPanel = new PanelPrincipal();
                principalWindow.showOptionPanels(principalPanel);
            }
        });  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonBack = new javax.swing.JButton();
        buttonManageUsers = new javax.swing.JButton();
        buttonManageProfiles = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 600));

        buttonBack.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonBack.setText("Regresar");

        buttonManageUsers.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonManageUsers.setText("Gestionar Usuarios");
        buttonManageUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonManageProfiles.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonManageProfiles.setText("Gestionar Perfiles");
        buttonManageProfiles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonManageUsers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonManageProfiles, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonManageUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonManageProfiles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonManageProfiles;
    private javax.swing.JButton buttonManageUsers;
    // End of variables declaration//GEN-END:variables
}
