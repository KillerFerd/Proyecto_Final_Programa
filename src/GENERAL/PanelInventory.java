package GENERAL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class PanelInventory extends javax.swing.JPanel {


    public PanelInventory() {
        initComponents();
        
        //BTN Regresar
        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FramePrincipal principalWindow = (FramePrincipal) SwingUtilities.getWindowAncestor(PanelInventory.this);
                PanelPrincipal principalPanel = new PanelPrincipal();
                principalWindow.showOptionPanels(principalPanel);
            }
        });  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonBack = new javax.swing.JButton();
        buttonConsultStocks = new javax.swing.JButton();
        buttonInputsOutputs = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 600));

        buttonBack.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonBack.setText("Regresar");

        buttonConsultStocks.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonConsultStocks.setText("Consultar Existencias");
        buttonConsultStocks.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonInputsOutputs.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonInputsOutputs.setText("Entradas/Salidas");
        buttonInputsOutputs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonConsultStocks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonInputsOutputs, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonConsultStocks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonInputsOutputs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonConsultStocks;
    private javax.swing.JButton buttonInputsOutputs;
    // End of variables declaration//GEN-END:variables
}
