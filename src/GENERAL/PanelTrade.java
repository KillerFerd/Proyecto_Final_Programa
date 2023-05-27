package GENERAL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class PanelTrade extends javax.swing.JPanel {


    public PanelTrade() {
        initComponents();
        
        //BTN Regresar
        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FramePrincipal principalWindow = (FramePrincipal) SwingUtilities.getWindowAncestor(PanelTrade.this);
                PanelPrincipal principalPanel = new PanelPrincipal();
                principalWindow.showOptionPanels(principalPanel);
            }
        });  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonBack = new javax.swing.JButton();
        buttonSales = new javax.swing.JButton();
        buttonShopping = new javax.swing.JButton();
        buttonConsultInvoices = new javax.swing.JButton();
        buttonDisbursement = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 600));

        buttonBack.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonBack.setText("Regresar");

        buttonSales.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonSales.setText("Ventas");
        buttonSales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonShopping.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonShopping.setText("Compras");
        buttonShopping.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonConsultInvoices.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonConsultInvoices.setText("Consultar Facturas");
        buttonConsultInvoices.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonDisbursement.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonDisbursement.setText("Desembolso");
        buttonDisbursement.setHideActionText(true);
        buttonDisbursement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonShopping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonConsultInvoices, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(buttonDisbursement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonShopping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonConsultInvoices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDisbursement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonConsultInvoices;
    private javax.swing.JButton buttonDisbursement;
    private javax.swing.JButton buttonSales;
    private javax.swing.JButton buttonShopping;
    // End of variables declaration//GEN-END:variables
}
