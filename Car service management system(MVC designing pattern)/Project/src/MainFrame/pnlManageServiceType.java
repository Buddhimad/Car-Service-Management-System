
package MainFrame;

import Controller.ServicecategoryController;
import Model.Servicecategory;
import Validation.Servicetypevalidation;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class pnlManageServiceType extends javax.swing.JPanel {

    
    public pnlManageServiceType() {
        initComponents();
       loadcategoryid();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlcanvasManageservicetype = new javax.swing.JPanel();
        pnlNewServiceTypeforManageservicetype = new javax.swing.JPanel();
        lblCategoryIDforManageservicetypes = new javax.swing.JLabel();
        lblVehicleTypeforManageservicetype = new javax.swing.JLabel();
        lblDescriptionforManageservicetype = new javax.swing.JLabel();
        lblChargeforManageservicetype = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtVehicleTypeforManageservicetype = new javax.swing.JTextField();
        txtChargeforManageservicetype = new javax.swing.JTextField();
        txtDescriptionforManageservicetype = new javax.swing.JTextField();
        btnViewservicetypeforManageservicetype = new javax.swing.JButton();
        btnSaveforManageservicetype = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbCategoryIDforManageservicetype = new javax.swing.JComboBox<>();
        btnLoadcategoryIDforpnlManageService = new javax.swing.JButton();

        pnlcanvasManageservicetype.setBackground(new java.awt.Color(153, 153, 255));
        pnlcanvasManageservicetype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pnlNewServiceTypeforManageservicetype.setBackground(new java.awt.Color(153, 153, 255));
        pnlNewServiceTypeforManageservicetype.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "New Service Type", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 51))); // NOI18N

        lblCategoryIDforManageservicetypes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCategoryIDforManageservicetypes.setText("Category ID");

        lblVehicleTypeforManageservicetype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVehicleTypeforManageservicetype.setText("Vehicle Type");

        lblDescriptionforManageservicetype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescriptionforManageservicetype.setText("Description");

        lblChargeforManageservicetype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblChargeforManageservicetype.setText("Charge");

        jSeparator1.setBackground(new java.awt.Color(153, 204, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        txtVehicleTypeforManageservicetype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtVehicleTypeforManageservicetype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVehicleTypeforManageservicetypeKeyTyped(evt);
            }
        });

        txtChargeforManageservicetype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtChargeforManageservicetype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChargeforManageservicetypeKeyTyped(evt);
            }
        });

        txtDescriptionforManageservicetype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtDescriptionforManageservicetype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescriptionforManageservicetypeKeyTyped(evt);
            }
        });

        btnViewservicetypeforManageservicetype.setBackground(new java.awt.Color(255, 255, 255));
        btnViewservicetypeforManageservicetype.setText("Vew Service Types");
        btnViewservicetypeforManageservicetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewservicetypeforManageservicetypeActionPerformed(evt);
            }
        });

        btnSaveforManageservicetype.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveforManageservicetype.setText("Save");
        btnSaveforManageservicetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveforManageservicetypeActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/car_transport_traffic_auto_transportation_vehicle_automobile_v2-512.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        cmbCategoryIDforManageservicetype.setEditable(true);

        btnLoadcategoryIDforpnlManageService.setBackground(new java.awt.Color(153, 153, 255));
        btnLoadcategoryIDforpnlManageService.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoadcategoryIDforpnlManageService.setForeground(new java.awt.Color(255, 0, 153));
        btnLoadcategoryIDforpnlManageService.setText("Load");
        btnLoadcategoryIDforpnlManageService.setToolTipText("Please click twice for Load Last Category ID");
        btnLoadcategoryIDforpnlManageService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadcategoryIDforpnlManageServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewServiceTypeforManageservicetypeLayout = new javax.swing.GroupLayout(pnlNewServiceTypeforManageservicetype);
        pnlNewServiceTypeforManageservicetype.setLayout(pnlNewServiceTypeforManageservicetypeLayout);
        pnlNewServiceTypeforManageservicetypeLayout.setHorizontalGroup(
            pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createSequentialGroup()
                        .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoryIDforManageservicetypes)
                            .addComponent(lblVehicleTypeforManageservicetype)
                            .addComponent(lblChargeforManageservicetype)
                            .addComponent(lblDescriptionforManageservicetype))
                        .addGap(18, 18, 18)
                        .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createSequentialGroup()
                                .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtChargeforManageservicetype, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txtVehicleTypeforManageservicetype, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescriptionforManageservicetype))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createSequentialGroup()
                                .addComponent(cmbCategoryIDforManageservicetype, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLoadcategoryIDforpnlManageService)
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createSequentialGroup()
                        .addGap(0, 110, Short.MAX_VALUE)
                        .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createSequentialGroup()
                                .addComponent(btnViewservicetypeforManageservicetype)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaveforManageservicetype))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlNewServiceTypeforManageservicetypeLayout.setVerticalGroup(
            pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createSequentialGroup()
                .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createSequentialGroup()
                        .addContainerGap(90, Short.MAX_VALUE)
                        .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCategoryIDforManageservicetypes)
                            .addComponent(cmbCategoryIDforManageservicetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoadcategoryIDforpnlManageService))
                        .addGap(18, 92, Short.MAX_VALUE)
                        .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVehicleTypeforManageservicetype)
                            .addComponent(txtVehicleTypeforManageservicetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 96, Short.MAX_VALUE)
                        .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChargeforManageservicetype)
                            .addComponent(txtChargeforManageservicetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 96, Short.MAX_VALUE)
                        .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescriptionforManageservicetype)
                            .addComponent(txtDescriptionforManageservicetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 96, Short.MAX_VALUE))
                    .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNewServiceTypeforManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewservicetypeforManageservicetype)
                    .addComponent(btnSaveforManageservicetype))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout pnlcanvasManageservicetypeLayout = new javax.swing.GroupLayout(pnlcanvasManageservicetype);
        pnlcanvasManageservicetype.setLayout(pnlcanvasManageservicetypeLayout);
        pnlcanvasManageservicetypeLayout.setHorizontalGroup(
            pnlcanvasManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlcanvasManageservicetypeLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(pnlNewServiceTypeforManageservicetype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );
        pnlcanvasManageservicetypeLayout.setVerticalGroup(
            pnlcanvasManageservicetypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcanvasManageservicetypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNewServiceTypeforManageservicetype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlcanvasManageservicetype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlcanvasManageservicetype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewservicetypeforManageservicetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewservicetypeforManageservicetypeActionPerformed
       ViewServiceType viewservicetype=new ViewServiceType();
       viewservicetype.setVisible(true);
    }//GEN-LAST:event_btnViewservicetypeforManageservicetypeActionPerformed

    private void btnSaveforManageservicetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveforManageservicetypeActionPerformed
       String CID=cmbCategoryIDforManageservicetype.getSelectedItem().toString();
       boolean iscategoryidok= Servicetypevalidation.checkservicetype(CID);
       if(iscategoryidok&!(txtVehicleTypeforManageservicetype.getText().length()<=0||txtChargeforManageservicetype.getText().length()<=0||txtDescriptionforManageservicetype.getText().length()<=0)){
        save();
       } else {
           JOptionPane.showMessageDialog(null,"Please check informations that you entered");
       }
    }//GEN-LAST:event_btnSaveforManageservicetypeActionPerformed

    private void txtVehicleTypeforManageservicetypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleTypeforManageservicetypeKeyTyped
        Servicetypevalidation.checkvehicletypes(evt);
    }//GEN-LAST:event_txtVehicleTypeforManageservicetypeKeyTyped

    private void txtChargeforManageservicetypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChargeforManageservicetypeKeyTyped
       Servicetypevalidation.checkcharge(evt);
    }//GEN-LAST:event_txtChargeforManageservicetypeKeyTyped

    private void txtDescriptionforManageservicetypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionforManageservicetypeKeyTyped
       Servicetypevalidation.checkdiscription(evt);
    }//GEN-LAST:event_txtDescriptionforManageservicetypeKeyTyped

    private void btnLoadcategoryIDforpnlManageServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadcategoryIDforpnlManageServiceActionPerformed

        loadcategoryid();
    }//GEN-LAST:event_btnLoadcategoryIDforpnlManageServiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadcategoryIDforpnlManageService;
    private javax.swing.JButton btnSaveforManageservicetype;
    private javax.swing.JButton btnViewservicetypeforManageservicetype;
    private javax.swing.JComboBox<String> cmbCategoryIDforManageservicetype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCategoryIDforManageservicetypes;
    private javax.swing.JLabel lblChargeforManageservicetype;
    private javax.swing.JLabel lblDescriptionforManageservicetype;
    private javax.swing.JLabel lblVehicleTypeforManageservicetype;
    private javax.swing.JPanel pnlNewServiceTypeforManageservicetype;
    private javax.swing.JPanel pnlcanvasManageservicetype;
    private javax.swing.JTextField txtChargeforManageservicetype;
    private javax.swing.JTextField txtDescriptionforManageservicetype;
    private javax.swing.JTextField txtVehicleTypeforManageservicetype;
    // End of variables declaration//GEN-END:variables

    private void loadcategoryid() {
        try {
            ArrayList<String>categoryid=ServicecategoryController.getlastservicecategory();
            for(String cid:categoryid){
            cmbCategoryIDforManageservicetype.addItem(cid);
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void save(){
     String CID=cmbCategoryIDforManageservicetype.getSelectedItem().toString();
       String VT=txtVehicleTypeforManageservicetype.getText();
       int C=Integer.parseInt(txtChargeforManageservicetype.getText());
       String D=txtDescriptionforManageservicetype.getText();
    Servicecategory service=new Servicecategory(CID,VT,D,C);
     
       
       try{
       boolean IsAdded=ServicecategoryController.addServicecategory(service);
       if(IsAdded){
       JOptionPane.showMessageDialog(null, "Service Type Save to the Database...");
        cmbCategoryIDforManageservicetype.setSelectedIndex(0);
       txtVehicleTypeforManageservicetype.setText("");
       txtChargeforManageservicetype.setText("");
       txtDescriptionforManageservicetype.setText("");
       }else{
       JOptionPane.showMessageDialog(null,"Cannot Save...");
       }
       }catch(SQLException | ClassNotFoundException ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
    
}
