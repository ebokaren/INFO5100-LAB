/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package JavaSwingUI;

import JavaSwingModels.User;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author eboka
 */
public class FormPage extends javax.swing.JPanel {
//    User user = new User();
    
    /**
     * Creates new form FormPage
     */
    
    JPanel bottomPanel;
    public FormPage(JPanel bottomPage) {
        initComponents();
        this.bottomPanel = bottomPage;
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
        lblFormPage = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblPatientType = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        cmbPatientType = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        lblLastName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        btnPhoto = new javax.swing.JButton();
        lblGender = new javax.swing.JLabel();
        rdFemale = new javax.swing.JRadioButton();
        rdMale = new javax.swing.JRadioButton();
        rdOther = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scTextArea = new javax.swing.JTextArea();
        dateChooser = new com.toedter.calendar.JDateChooser();
        lblDateOfBirth = new javax.swing.JLabel();

        lblFormPage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFormPage.setText("Patient Registration Form");

        lblFirstName.setText("First Name:");

        lblPatientType.setText("Patient Type:");

        cmbPatientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Type-", "Physical Exam", "Regular Check In", "Post Operation", "Walk In Appointment" }));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblLastName.setText("Last Name:");

        lblAge.setText("Age:");

        lblEmail.setText("Email:");

        lblPhoto.setFont(new java.awt.Font("Segoe UI Black", 1, 8)); // NOI18N
        lblPhoto.setText("UPLOAD TO VIEW PHOTO");

        btnPhoto.setText("Upload Photo");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        lblGender.setText("Gender:");

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");

        buttonGroup1.add(rdMale);
        rdMale.setText("Male");

        buttonGroup1.add(rdOther);
        rdOther.setText("Other");

        scTextArea.setColumns(20);
        scTextArea.setRows(5);
        jScrollPane1.setViewportView(scTextArea);

        lblDateOfBirth.setText("Date of Birth:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFormPage, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFirstName)
                                        .addComponent(lblPatientType)
                                        .addComponent(lblLastName)
                                        .addComponent(lblAge)
                                        .addComponent(lblEmail)
                                        .addComponent(lblGender)
                                        .addComponent(lblDateOfBirth))
                                    .addGap(53, 53, 53)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbPatientType, 0, 1, Short.MAX_VALUE)
                                            .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(txtLastName)
                                            .addComponent(txtAge)
                                            .addComponent(txtEmail))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rdFemale)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdMale)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdOther))
                                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnPhoto)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblPhoto))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnSubmit)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFormPage)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientType)
                            .addComponent(cmbPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(rdFemale)
                            .addComponent(rdMale)
                            .addComponent(rdOther))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDateOfBirth)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPhoto)
                            .addComponent(lblPhoto))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
       
       //  User user = new User(txtName.getText(),cmbProgram.getSelectedItem().toString());
       //txtFirstName.getText(),
           //  txtLastName.getText(), txtEmail.getText(), scTextArea.getText(), cmbPatientType.getSelectedItem().toString());
       
      try {
          
     User user;
     
        //Researched and got assistance from Stackoverflow for the Date output format 
        java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat("dd-MM-yyyy");
        
        ButtonModel selectedGender = buttonGroup1.getSelection();
        String gender = "";
         if (selectedGender == null) {
        // Researched and got some help from ChatGPT for radio button output
        JOptionPane.showMessageDialog(this, "Please select a gender!", "Error", JOptionPane.ERROR_MESSAGE);
        return;  
    } else {
        // Determine gender
        if (rdFemale.isSelected()) {
            gender = "Female";
        } else if (rdMale.isSelected()) {
            gender = "Male";
        } else if (rdOther.isSelected()) {
            gender = "Other";
        }
    }
//          user = new User(txtFirstName.getText(), txtLastName.getText(), Double.parseDouble(txtAge.getText()),
//                 gender, txtEmail.getText(), scTextArea.getText(), cmbPatientType.getSelectedItem().toString(), fmt.format(dateChooser.getDate()));

          user = new User(txtFirstName.getText(), txtLastName.getText(), Double.parseDouble(txtAge.getText()),
                 gender, txtEmail.getText(), scTextArea.getText(), cmbPatientType.getSelectedItem().toString(), fmt.format(dateChooser.getDate()), (ImageIcon ) lblPhoto.getIcon());
          
        ViewPage viewPage = new ViewPage(user);
        bottomPanel.add(viewPage);
        CardLayout cl = (CardLayout) bottomPanel.getLayout();
        cl.next(bottomPanel);
        
        }catch(NumberFormatException e){
            System.out.println("Invalid Input");
            JOptionPane.showMessageDialog(this, "Invalid Input! Please review input and try again", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:
        
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80,
                    Image.SCALE_SMOOTH);

                if (edited_image != null) {
                    lblPhoto.setText(file.getSelectedFile().getAbsolutePath());
                    //        this.userInfo.setPic(new ImageIcon(edited_image));
                                        
              ImageIcon icon = new ImageIcon(edited_image);
                JOptionPane.showMessageDialog(this, lblPhoto, "UPLOAD SUCCESSFUL", JOptionPane.ERROR_MESSAGE, icon);
                    
         //    user.setPic(icon);

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload "
                    + "image correctly in JPG/JPEG/PNG format.", "Error - Incorrect Image", JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbPatientType;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFormPage;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPatientType;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JRadioButton rdOther;
    private javax.swing.JTextArea scTextArea;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
