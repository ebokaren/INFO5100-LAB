/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import javax.swing.JPanel;

/**
 *
 * @author eboka
 */
public class UserPageView extends javax.swing.JPanel {

    /**
     * Creates new form UserPageView
     */
    public UserPageView(JPanel bottomPanel) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUserPageView = new javax.swing.JPanel();
        lblUserLogin = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblUserPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtUserPassword = new javax.swing.JTextField();
        btnUserSubmit = new javax.swing.JButton();

        panelUserPageView.setBackground(new java.awt.Color(45, 118, 232));

        lblUserLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblUserLogin.setText("User Login");

        lblUserName.setText("User Name:");

        lblUserPassword.setText("Password:");

        btnUserSubmit.setText("Login");

        javax.swing.GroupLayout panelUserPageViewLayout = new javax.swing.GroupLayout(panelUserPageView);
        panelUserPageView.setLayout(panelUserPageViewLayout);
        panelUserPageViewLayout.setHorizontalGroup(
            panelUserPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserPageViewLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(panelUserPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUserSubmit)
                    .addComponent(lblUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelUserPageViewLayout.createSequentialGroup()
                        .addGroup(panelUserPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserPassword)
                            .addComponent(lblUserName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelUserPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        panelUserPageViewLayout.setVerticalGroup(
            panelUserPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserPageViewLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(panelUserPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelUserPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserPassword)
                    .addComponent(txtUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnUserSubmit)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUserPageView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUserPageView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserSubmit;
    private javax.swing.JLabel lblUserLogin;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserPassword;
    private javax.swing.JPanel panelUserPageView;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPassword;
    // End of variables declaration//GEN-END:variables
}
