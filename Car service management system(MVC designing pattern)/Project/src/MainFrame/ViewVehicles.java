package MainFrame;

import Controller.CustomerController;
import Controller.VehicleController;
import Model.Customer;
import Model.Vehicle;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewVehicles extends javax.swing.JFrame {

    public ViewVehicles() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehicleforViewVehicles = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtVehicleNoforViewVehicles = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        btnRefreshforViewVehicles = new javax.swing.JButton();
        btnDeleteforViewVehicles = new javax.swing.JButton();
        btnRemovefromDatabaseforViewVehicles = new javax.swing.JButton();
        btnUpdateforViewvehicles = new javax.swing.JButton();
        btnSearchforViewVehicle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCustomerforViewVehicles = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Vehicle Information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblVehicleforViewVehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Brand", "Model", "Engine Type", "Vehicle Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblVehicleforViewVehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehicleforViewVehiclesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVehicleforViewVehicles);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Vehicle No");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRefreshforViewVehicles.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshforViewVehicles.setText("Refresh");
        btnRefreshforViewVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshforViewVehiclesActionPerformed(evt);
            }
        });

        btnDeleteforViewVehicles.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteforViewVehicles.setText("Delete");
        btnDeleteforViewVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteforViewVehiclesActionPerformed(evt);
            }
        });

        btnRemovefromDatabaseforViewVehicles.setBackground(new java.awt.Color(255, 255, 255));
        btnRemovefromDatabaseforViewVehicles.setText("Remove from Database");
        btnRemovefromDatabaseforViewVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovefromDatabaseforViewVehiclesActionPerformed(evt);
            }
        });

        btnUpdateforViewvehicles.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateforViewvehicles.setText("Update");
        btnUpdateforViewvehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateforViewvehiclesActionPerformed(evt);
            }
        });

        btnSearchforViewVehicle.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchforViewVehicle.setText("Search");
        btnSearchforViewVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchforViewVehicleActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Customer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(txtVehicleNoforViewVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchforViewVehicle)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCustomerforViewVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdateforViewvehicles)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemovefromDatabaseforViewVehicles)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteforViewVehicles)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefreshforViewVehicles)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVehicleNoforViewVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchforViewVehicle)
                    .addComponent(jLabel4)
                    .addComponent(txtCustomerforViewVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnRefreshforViewVehicles)
                    .addComponent(btnDeleteforViewVehicles)
                    .addComponent(btnRemovefromDatabaseforViewVehicles)
                    .addComponent(btnUpdateforViewvehicles))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int pX,pY;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
         setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       setState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            this.hide();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRefreshforViewVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshforViewVehiclesActionPerformed
     DefaultTableModel dtm=(DefaultTableModel)tblVehicleforViewVehicles.getModel();
     
        try{
          Vehicle [] vehiclelist=VehicleController.viewVehicle();
          dtm.setRowCount(0);
          for(Vehicle v :vehiclelist){
              Object [] row={v.getCustomerID(),v.getBrand(),v.getModel(),v.getEnginetype(),v.getVehicletype()};
              dtm.addRow(row);
          }
      }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex.getMessage());
      }catch(ClassNotFoundException ex){
      JOptionPane.showMessageDialog(null, ex.getMessage());
      }
    }//GEN-LAST:event_btnRefreshforViewVehiclesActionPerformed

    private void btnSearchforViewVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchforViewVehicleActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblVehicleforViewVehicles.getModel();
        String num=txtVehicleNoforViewVehicles.getText();
        try{
       Vehicle [] vehicle=VehicleController.searchVehicle(num);
       dtm.setRowCount(0);
       for(Vehicle vh:vehicle){
       Object [] row={vh.getCustomerID(),vh.getBrand(),vh.getModel(),vh.getEnginetype(),vh.getVehicletype()};
       dtm.addRow(row);
       }
       }catch(SQLException ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }catch(ClassNotFoundException ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }//GEN-LAST:event_btnSearchforViewVehicleActionPerformed

    private void btnDeleteforViewVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteforViewVehiclesActionPerformed
        DefaultTableModel dtm1=(DefaultTableModel)tblVehicleforViewVehicles.getModel();
        int index=tblVehicleforViewVehicles.getSelectedRow();
        if(index<0){
        JOptionPane.showMessageDialog(null,"please select a row");
        }else{
        dtm1.removeRow(index);
        }
    }//GEN-LAST:event_btnDeleteforViewVehiclesActionPerformed

    private void btnRemovefromDatabaseforViewVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovefromDatabaseforViewVehiclesActionPerformed
      DefaultTableModel dtm2=(DefaultTableModel)tblVehicleforViewVehicles.getModel();
      int row=tblVehicleforViewVehicles.getSelectedRow();
      if(row<0){
     JOptionPane.showMessageDialog(null,"please select a row");
      }else{
     String custid=(String) dtm2.getValueAt(row, 0);
      try{
      boolean isDeleted=VehicleController.deletevehicle(custid);
      if(isDeleted){
      JOptionPane.showMessageDialog(null, "Vehicle details are Deleted...");
      }else{
      JOptionPane.showMessageDialog(null, "Cannot Delete...");
      }
      }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, ex.getMessage());
      }catch(ClassNotFoundException ex){
      JOptionPane.showMessageDialog(null, ex.getMessage());
      }
      }
    }//GEN-LAST:event_btnRemovefromDatabaseforViewVehiclesActionPerformed

    private void btnUpdateforViewvehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateforViewvehiclesActionPerformed
        DefaultTableModel dtm3=(DefaultTableModel)tblVehicleforViewVehicles.getModel();
        int row=tblVehicleforViewVehicles.getSelectedRow();
        //int column=tblVehicleforViewVehicles.getSelectedColumn();
        if(row<0){
        JOptionPane.showMessageDialog(null,"please select a row");
        }else{
            String vehicleno=txtVehicleNoforViewVehicles.getText();
        String customerid=(String) dtm3.getValueAt(row, 0);
        String brand=(String) dtm3.getValueAt(row,1);
        String model=(String) dtm3.getValueAt(row,2);
        String enginetype=(String) dtm3.getValueAt(row,3);
        String vehicletype=(String) dtm3.getValueAt(row,4);
        
        Vehicle vehicle=new Vehicle(vehicleno,customerid,brand,model,enginetype,vehicletype);
        try{
        boolean isUpdated=VehicleController.updatevehicle(vehicle);
        if(isUpdated){
        JOptionPane.showMessageDialog(null,"Vehicle details Updated...");
        }else{
        JOptionPane.showMessageDialog(null,"Cannot Update...");
        }
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnUpdateforViewvehiclesActionPerformed

    private void tblVehicleforViewVehiclesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehicleforViewVehiclesMouseClicked
        DefaultTableModel dtm4=(DefaultTableModel)tblVehicleforViewVehicles.getModel();
        int row=tblVehicleforViewVehicles.getSelectedRow();
        String id=(String) dtm4.getValueAt(row,0);
        try {
            Customer  name=CustomerController.getCustomer(id);
            Vehicle no=VehicleController.getVehicleno(id);
            txtVehicleNoforViewVehicles.setText(no.getVehicleno());
            if(name!=null){
            txtCustomerforViewVehicles.setText(name.getName());
            }else{
            JOptionPane.showMessageDialog(null,"No Customer Found...");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage()); 
        }
    }//GEN-LAST:event_tblVehicleforViewVehiclesMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVehicles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteforViewVehicles;
    private javax.swing.JButton btnRefreshforViewVehicles;
    private javax.swing.JButton btnRemovefromDatabaseforViewVehicles;
    private javax.swing.JButton btnSearchforViewVehicle;
    private javax.swing.JButton btnUpdateforViewvehicles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblVehicleforViewVehicles;
    private javax.swing.JTextField txtCustomerforViewVehicles;
    private javax.swing.JTextField txtVehicleNoforViewVehicles;
    // End of variables declaration//GEN-END:variables
}
