package GENERAL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class PanelProducts extends javax.swing.JPanel {


    public PanelProducts() {
        initComponents();
        
        //BTN Regresar
        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FramePrincipal principalWindow = (FramePrincipal) SwingUtilities.getWindowAncestor(PanelProducts.this);
                PanelPrincipal principalPanel = new PanelPrincipal();
                principalWindow.showOptionPanels(principalPanel);
            }
        });  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonBack = new javax.swing.JButton();
        buttonAddProduct = new javax.swing.JButton();
        buttonManageProducts = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 600));

        buttonBack.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonBack.setText("Regresar");

        buttonAddProduct.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonAddProduct.setText("Agregar Producto");
        buttonAddProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonManageProducts.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        buttonManageProducts.setText("Gestionar Productos");
        buttonManageProducts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonAddProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonManageProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonManageProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddProduct;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonManageProducts;
    // End of variables declaration//GEN-END:variables
}
