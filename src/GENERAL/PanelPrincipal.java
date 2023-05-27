package GENERAL;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class PanelPrincipal extends javax.swing.JPanel {

    public PanelPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backLogoArea = new javax.swing.JPanel();
        imageLogo = new javax.swing.JLabel();
        labelMainMenu = new javax.swing.JLabel();
        backButtonCloseSession = new javax.swing.JPanel();
        buttonCloseSession = new javax.swing.JLabel();
        backOptions = new javax.swing.JPanel();
        backButtonTrade = new javax.swing.JPanel();
        buttonTrade = new javax.swing.JLabel();
        backButtonProducts = new javax.swing.JPanel();
        buttonProducts = new javax.swing.JLabel();
        backButtonInventory = new javax.swing.JPanel();
        buttonInventory = new javax.swing.JLabel();
        backButtonAdmin = new javax.swing.JPanel();
        buttonAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(99, 201, 255));
        setForeground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(400, 600));

        backLogoArea.setBackground(new java.awt.Color(103, 175, 163));

        imageLogo.setFont(new java.awt.Font("Modern Sans Serif 7", 0, 24)); // NOI18N
        imageLogo.setForeground(new java.awt.Color(0, 0, 0));
        imageLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Logo2.png"))); // NOI18N
        imageLogo.setText(" Corre Caminos, S.A.");

        javax.swing.GroupLayout backLogoAreaLayout = new javax.swing.GroupLayout(backLogoArea);
        backLogoArea.setLayout(backLogoAreaLayout);
        backLogoAreaLayout.setHorizontalGroup(
            backLogoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backLogoAreaLayout.setVerticalGroup(
            backLogoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLogoAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelMainMenu.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        labelMainMenu.setForeground(new java.awt.Color(0, 0, 0));
        labelMainMenu.setText("MENU PRINCIPAL");

        backButtonCloseSession.setBackground(new java.awt.Color(136, 219, 255));

        buttonCloseSession.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        buttonCloseSession.setForeground(new java.awt.Color(0, 0, 0));
        buttonCloseSession.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonCloseSession.setText("Cerrar Sesión");
        buttonCloseSession.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCloseSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCloseSessionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCloseSessionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCloseSessionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backButtonCloseSessionLayout = new javax.swing.GroupLayout(backButtonCloseSession);
        backButtonCloseSession.setLayout(backButtonCloseSessionLayout);
        backButtonCloseSessionLayout.setHorizontalGroup(
            backButtonCloseSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonCloseSession, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backButtonCloseSessionLayout.setVerticalGroup(
            backButtonCloseSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonCloseSession, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        backOptions.setBackground(new java.awt.Color(136, 219, 255));
        backOptions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButtonTrade.setBackground(new java.awt.Color(136, 219, 255));

        buttonTrade.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        buttonTrade.setForeground(new java.awt.Color(0, 0, 0));
        buttonTrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Trade.png"))); // NOI18N
        buttonTrade.setText("Comercio");
        buttonTrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonTrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTradeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonTradeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonTradeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backButtonTradeLayout = new javax.swing.GroupLayout(backButtonTrade);
        backButtonTrade.setLayout(backButtonTradeLayout);
        backButtonTradeLayout.setHorizontalGroup(
            backButtonTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonTrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backButtonTradeLayout.setVerticalGroup(
            backButtonTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backButtonTradeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonTrade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backOptions.add(backButtonTrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        backButtonProducts.setBackground(new java.awt.Color(136, 219, 255));

        buttonProducts.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        buttonProducts.setForeground(new java.awt.Color(0, 0, 0));
        buttonProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Products.png"))); // NOI18N
        buttonProducts.setText("Productos");
        buttonProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonProductsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backButtonProductsLayout = new javax.swing.GroupLayout(backButtonProducts);
        backButtonProducts.setLayout(backButtonProductsLayout);
        backButtonProductsLayout.setHorizontalGroup(
            backButtonProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backButtonProductsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backButtonProductsLayout.setVerticalGroup(
            backButtonProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backButtonProductsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backOptions.add(backButtonProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, -1));

        backButtonInventory.setBackground(new java.awt.Color(136, 219, 255));

        buttonInventory.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        buttonInventory.setForeground(new java.awt.Color(0, 0, 0));
        buttonInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Inventory.png"))); // NOI18N
        buttonInventory.setText("Inventario");
        buttonInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonInventoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonInventoryMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backButtonInventoryLayout = new javax.swing.GroupLayout(backButtonInventory);
        backButtonInventory.setLayout(backButtonInventoryLayout);
        backButtonInventoryLayout.setHorizontalGroup(
            backButtonInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonInventory, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        backButtonInventoryLayout.setVerticalGroup(
            backButtonInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonInventory, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        backOptions.add(backButtonInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, -1));

        backButtonAdmin.setBackground(new java.awt.Color(136, 219, 255));

        buttonAdmin.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        buttonAdmin.setForeground(new java.awt.Color(0, 0, 0));
        buttonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Admin.png"))); // NOI18N
        buttonAdmin.setText("Administración");
        buttonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAdminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backButtonAdminLayout = new javax.swing.GroupLayout(backButtonAdmin);
        backButtonAdmin.setLayout(backButtonAdminLayout);
        backButtonAdminLayout.setHorizontalGroup(
            backButtonAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        backButtonAdminLayout.setVerticalGroup(
            backButtonAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        backOptions.add(backButtonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backButtonCloseSession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backLogoArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMainMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(backLogoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(labelMainMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(backButtonCloseSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    //buttonCloseSession: Cambiar color al posicionar puntero
    private void buttonCloseSessionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseSessionMouseEntered
        backButtonCloseSession.setBackground(new Color(103, 175, 163));
    }//GEN-LAST:event_buttonCloseSessionMouseEntered
    //buttonCloseSession: Restablecer color al posicionar puntero
    private void buttonCloseSessionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseSessionMouseExited
        backButtonCloseSession.setBackground(new Color(136, 219, 255));
    }//GEN-LAST:event_buttonCloseSessionMouseExited
    //buttonCloseSesion: Cerrar Sesión
    private void buttonCloseSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseSessionMouseClicked
        ClassMain.confirmCloseSesion(PanelPrincipal.this);
    }//GEN-LAST:event_buttonCloseSessionMouseClicked
    //buttonTrade: Cambiar color al posicionar puntero
    private void buttonTradeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTradeMouseEntered
        backButtonTrade.setBackground(new Color(103, 175, 163));
    }//GEN-LAST:event_buttonTradeMouseEntered
    //buttonTrade: Restablecer color al posicionar puntero
    private void buttonTradeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTradeMouseExited
        backButtonTrade.setBackground(new Color(136, 219, 255));
    }//GEN-LAST:event_buttonTradeMouseExited
    //buttonTrade: Comersio
    private void buttonTradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTradeMouseClicked
        FramePrincipal principalWindow = (FramePrincipal) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
        PanelTrade tradePanel = new PanelTrade();
        principalWindow.showOptionPanels(tradePanel);
    }//GEN-LAST:event_buttonTradeMouseClicked
    //buttonProducts: Cambiar color al posicionar puntero
    private void buttonProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProductsMouseEntered
        backButtonProducts.setBackground(new Color(103, 175, 163));
    }//GEN-LAST:event_buttonProductsMouseEntered
    //buttonProducts: Restablecer color al posicionar puntero
    private void buttonProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProductsMouseExited
        backButtonProducts.setBackground(new Color(136, 219, 255));
    }//GEN-LAST:event_buttonProductsMouseExited
    //buttonProducts: Productos
    private void buttonProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProductsMouseClicked
        FramePrincipal framePrincipal = (FramePrincipal) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
        PanelProducts panelProducts = new PanelProducts();
        framePrincipal.showOptionPanels(panelProducts);
    }//GEN-LAST:event_buttonProductsMouseClicked
    //buttonInventory: Cambiar color al posicionar puntero
    private void buttonInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonInventoryMouseEntered
        backButtonInventory.setBackground(new Color(103, 175, 163));
    }//GEN-LAST:event_buttonInventoryMouseEntered
    //buttonInventory: Restablecer color al posicionar puntero
    private void buttonInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonInventoryMouseExited
        backButtonInventory.setBackground(new Color(136, 219, 255));
    }//GEN-LAST:event_buttonInventoryMouseExited
    //buttonInventory: Inventory
    private void buttonInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonInventoryMouseClicked
        FramePrincipal framePrincipal = (FramePrincipal) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
        PanelInventory panelInventory = new PanelInventory();
        framePrincipal.showOptionPanels(panelInventory);
    }//GEN-LAST:event_buttonInventoryMouseClicked
    //buttonAdmin: Cambiar color al posicionar puntero
    private void buttonAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdminMouseEntered
        backButtonAdmin.setBackground(new Color(103, 175, 163));
    }//GEN-LAST:event_buttonAdminMouseEntered
    //buttonAdmin: Restablecer color al posicionar puntero
    private void buttonAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdminMouseExited
        backButtonAdmin.setBackground(new Color(136, 219, 255));
    }//GEN-LAST:event_buttonAdminMouseExited
    //buttonAdmin: Administración
    private void buttonAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAdminMouseClicked
        FramePrincipal framePrincipal = (FramePrincipal) SwingUtilities.getWindowAncestor(PanelPrincipal.this);
        PanelAdmin panelAdmin = new PanelAdmin();
        framePrincipal.showOptionPanels(panelAdmin);
    }//GEN-LAST:event_buttonAdminMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backButtonAdmin;
    private javax.swing.JPanel backButtonCloseSession;
    private javax.swing.JPanel backButtonInventory;
    private javax.swing.JPanel backButtonProducts;
    private javax.swing.JPanel backButtonTrade;
    private javax.swing.JPanel backLogoArea;
    private javax.swing.JPanel backOptions;
    private javax.swing.JLabel buttonAdmin;
    private javax.swing.JLabel buttonCloseSession;
    private javax.swing.JLabel buttonInventory;
    private javax.swing.JLabel buttonProducts;
    private javax.swing.JLabel buttonTrade;
    private javax.swing.JLabel imageLogo;
    private javax.swing.JLabel labelMainMenu;
    // End of variables declaration//GEN-END:variables
}
