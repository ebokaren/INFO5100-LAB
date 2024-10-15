/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author eboka
 */
public class CreateNewTaskView extends javax.swing.JFrame {

    /**
     * Creates new form CreateNewTaskView
     */
    public CreateNewTaskView() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        panelNewTaskPageView = new javax.swing.JPanel();
        lblNewTask = new javax.swing.JLabel();
        lblNewTaskName = new javax.swing.JLabel();
        lblNewTaskAssignee = new javax.swing.JLabel();
        txtNewTask = new javax.swing.JTextField();
        txtNewTaskAssignee = new javax.swing.JTextField();
        btnSubmitNewTask = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scTextArea = new javax.swing.JTextArea();
        rdLow = new javax.swing.JRadioButton();
        rdMedium = new javax.swing.JRadioButton();
        rdHigh = new javax.swing.JRadioButton();
        lblTaskPriority = new javax.swing.JLabel();
        lblTaskDetails = new javax.swing.JLabel();
        lblTaskDueDate = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelNewTaskPageView.setBackground(new java.awt.Color(45, 118, 232));

        lblNewTask.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblNewTask.setText("Create New Task");

        lblNewTaskName.setText("New Task:");

        lblNewTaskAssignee.setText("Assignee:");

        btnSubmitNewTask.setText("Submit New Task");

        scTextArea.setColumns(20);
        scTextArea.setRows(5);
        jScrollPane1.setViewportView(scTextArea);

        buttonGroup1.add(rdLow);
        rdLow.setText("Low");

        buttonGroup1.add(rdMedium);
        rdMedium.setText("Medium");

        buttonGroup1.add(rdHigh);
        rdHigh.setText("High");
        rdHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdHighActionPerformed(evt);
            }
        });

        lblTaskPriority.setText("Priority Level:");

        lblTaskDetails.setText("Task Details:");

        lblTaskDueDate.setText("Task Due Date:");

        javax.swing.GroupLayout panelNewTaskPageViewLayout = new javax.swing.GroupLayout(panelNewTaskPageView);
        panelNewTaskPageView.setLayout(panelNewTaskPageViewLayout);
        panelNewTaskPageViewLayout.setHorizontalGroup(
            panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewTaskPageViewLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNewTaskPageViewLayout.createSequentialGroup()
                        .addComponent(lblTaskDueDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSubmitNewTask))
                    .addGroup(panelNewTaskPageViewLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNewTaskPageViewLayout.createSequentialGroup()
                                .addGroup(panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNewTaskAssignee)
                                    .addComponent(lblNewTaskName)
                                    .addComponent(lblTaskPriority)
                                    .addComponent(lblTaskDetails))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNewTaskAssignee, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelNewTaskPageViewLayout.createSequentialGroup()
                                        .addComponent(rdHigh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdMedium)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdLow))))
                            .addComponent(lblNewTask, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNewTaskPageViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panelNewTaskPageViewLayout.setVerticalGroup(
            panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewTaskPageViewLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblNewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewTaskName)
                    .addComponent(txtNewTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewTaskAssignee)
                    .addComponent(txtNewTaskAssignee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaskPriority)
                    .addComponent(rdHigh)
                    .addComponent(rdMedium)
                    .addComponent(rdLow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTaskDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNewTaskPageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaskDueDate)
                    .addComponent(btnSubmitNewTask)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNewTaskPageView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNewTaskPageView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdHighActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdHighActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CreateNewTaskView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewTaskView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewTaskView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewTaskView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewTaskView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitNewTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNewTask;
    private javax.swing.JLabel lblNewTaskAssignee;
    private javax.swing.JLabel lblNewTaskName;
    private javax.swing.JLabel lblTaskDetails;
    private javax.swing.JLabel lblTaskDueDate;
    private javax.swing.JLabel lblTaskPriority;
    private javax.swing.JPanel panelNewTaskPageView;
    private javax.swing.JRadioButton rdHigh;
    private javax.swing.JRadioButton rdLow;
    private javax.swing.JRadioButton rdMedium;
    private javax.swing.JTextArea scTextArea;
    private javax.swing.JTextField txtNewTask;
    private javax.swing.JTextField txtNewTaskAssignee;
    // End of variables declaration//GEN-END:variables
}
