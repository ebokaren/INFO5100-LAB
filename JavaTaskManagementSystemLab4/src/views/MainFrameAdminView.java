/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.CardLayout;

/**
 *
 * @author eboka
 */
public class MainFrameAdminView extends javax.swing.JPanel {

    /**
     * Creates new form UserPageView
     */
    public MainFrameAdminView() {
        initComponents();
        
       bottomPanel.setLayout(new java.awt.CardLayout());
        
       AdminPageView adminPageView = new AdminPageView(this.bottomPanel);
        bottomPanel.add(adminPageView);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        btnAdminDashboard = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPanel.setBackground(new java.awt.Color(45, 118, 232));

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnAdminDashboard.setText("Dashboard");
        btnAdminDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnReturn)
                .addGap(107, 107, 107)
                .addComponent(btnAdminDashboard)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnAdminDashboard))
                .addGap(32, 32, 32))
        );

        jSplitPane1.setTopComponent(topPanel);

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
                AdminPageView adminPageView = new AdminPageView(bottomPanel);
                bottomPanel.add(adminPageView);
                
                CardLayout cl = (CardLayout) bottomPanel.getLayout();
                cl.next(bottomPanel);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnAdminDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminDashboardActionPerformed
        // TODO add your handling code here:
        
//                UserDashboard userDashboard = new UserDashboard(bottomPanel);
//                bottomPanel.add(userDashboard);
//                
//                CardLayout cl = (CardLayout) bottomPanel.getLayout();
//                cl.next(bottomPanel);
    }//GEN-LAST:event_btnAdminDashboardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton btnAdminDashboard;
    private javax.swing.JButton btnReturn;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}