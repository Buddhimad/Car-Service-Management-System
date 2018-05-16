package MainFrame;

import Controller.CustomerController;
import Controller.VehicleController;
import Model.Customer;
import Model.Vehicle;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ViewCustomers extends javax.swing.JFrame {

  
    public ViewCustomers() {
        initComponents();
        setLocationRelativeTo(null);
        loadcustomernamecombo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCloseforViewCustomer = new javax.swing.JLabel();
        lblMinimizeforViewCustomer = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerforViewCustomer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbCustomerNameforViewCustomers = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnRefreshforViewCustomers = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnDeleteforViewCustomer = new javax.swing.JButton();
        btnRdeleteforViewcustomer = new javax.swing.JButton();
        btnUpdateforViewCustomer = new javax.swing.JButton();
        lblVehicleNoforViewCustomer = new javax.swing.JLabel();
        txtVehicleNoforViewCustomer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        lblCloseforViewCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCloseforViewCustomer.setForeground(new java.awt.Color(204, 0, 51));
        lblCloseforViewCustomer.setText("X");
        lblCloseforViewCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseforViewCustomerMouseClicked(evt);
            }
        });

        lblMinimizeforViewCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimizeforViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizeforViewCustomer.setText("-");
        lblMinimizeforViewCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeforViewCustomerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizeforViewCustomer)
                .addGap(18, 18, 18)
                .addComponent(lblCloseforViewCustomer)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCloseforViewCustomer)
                    .addComponent(lblMinimizeforViewCustomer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Customer Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblCustomerforViewCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "Address", "TelePhone No", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCustomerforViewCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerforViewCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomerforViewCustomer);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Customer Name");

        cmbCustomerNameforViewCustomers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerNameforViewCustomersItemStateChanged(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnRefreshforViewCustomers.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshforViewCustomers.setText("Refresh");
        btnRefreshforViewCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshforViewCustomersActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDeleteforViewCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteforViewCustomer.setText("Delete");
        btnDeleteforViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteforViewCustomerActionPerformed(evt);
            }
        });

        btnRdeleteforViewcustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnRdeleteforViewcustomer.setText("Remove from Database");
        btnRdeleteforViewcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRdeleteforViewcustomerActionPerformed(evt);
            }
        });

        btnUpdateforViewCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateforViewCustomer.setText("Update");
        btnUpdateforViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateforViewCustomerActionPerformed(evt);
            }
        });

        lblVehicleNoforViewCustomer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVehicleNoforViewCustomer.setText("Vehicle No");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCustomerNameforViewCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(lblVehicleNoforViewCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(txtVehicleNoforViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateforViewCustomer)
                .addGap(18, 18, 18)
                .addComponent(btnRdeleteforViewcustomer)
                .addGap(32, 32, 32)
                .addComponent(btnDeleteforViewCustomer)
                .addGap(32, 32, 32)
                .addComponent(btnRefreshforViewCustomers)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCustomerNameforViewCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVehicleNoforViewCustomer)
                    .addComponent(txtVehicleNoforViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefreshforViewCustomers)
                    .addComponent(jButton1)
                    .addComponent(btnDeleteforViewCustomer)
                    .addComponent(btnRdeleteforViewcustomer)
                    .addComponent(btnUpdateforViewCustomer))
                .addContainerGap())
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

    private void lblMinimizeforViewCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeforViewCustomerMouseClicked
            setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeforViewCustomerMouseClicked

    private void lblCloseforViewCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseforViewCustomerMouseClicked
        this.hide();
    }//GEN-LAST:event_lblCloseforViewCustomerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRefreshforViewCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshforViewCustomersActionPerformed
       DefaultTableModel dtm=(DefaultTableModel)tblCustomerforViewCustomer.getModel();
        try{
           
       Customer [] list=CustomerController.viewcustomer();
       dtm.setRowCount(0);
       for(Customer  lst:list){
           Object [] row={lst.getCustomerID(),lst.getName(),lst.getAddress(),lst.getTelephoneno(),lst.getDate()};
           dtm.addRow(row);
       }
       }catch(SQLException ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }catch(ClassNotFoundException ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }//GEN-LAST:event_btnRefreshforViewCustomersActionPerformed

    private void btnUpdateforViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateforViewCustomerActionPerformed
      DefaultTableModel dtm1=(DefaultTableModel)tblCustomerforViewCustomer.getModel();
     int row= tblCustomerforViewCustomer.getSelectedRow();
     if(row<0){
         JOptionPane.showMessageDialog(null,"please select a row");
     }else{
        String customerid=(String) dtm1.getValueAt(row,0);
     String customername=(String) dtm1.getValueAt(row,1);
     String address=(String) dtm1.getValueAt(row,2);
     int tele=(int) dtm1.getValueAt(row,3);
     String Date=(String) dtm1.getValueAt(row,4);
     
      Customer customerupdate=new Customer(customerid,customername,address,tele,Date);
      try{
      boolean isCustomerUpdate=CustomerController.updatecustomer(customerupdate);
      if(isCustomerUpdate){
      JOptionPane.showMessageDialog(null,"Customer Updated...");
      }else{
      JOptionPane.showMessageDialog(null,"Cannot Update...");
      }
      }catch(ClassNotFoundException ex){
      JOptionPane.showMessageDialog(null, ex.getMessage());
      }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, ex.getMessage());
      }
    }
    }//GEN-LAST:event_btnUpdateforViewCustomerActionPerformed

    private void cmbCustomerNameforViewCustomersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerNameforViewCustomersItemStateChanged
       String customername=cmbCustomerNameforViewCustomers.getSelectedItem().toString();
        DefaultTableModel dtm2=(DefaultTableModel)tblCustomerforViewCustomer.getModel();
       try{
       Customer [] cst=CustomerController.searchcustomer(customername);
       
       dtm2.setRowCount(0);
       for(Customer  customer :cst){
           Object [] item={customer.getCustomerID(),customer.getName(),customer.getAddress(),customer.getTelephoneno(),customer.getDate()};
           dtm2.addRow(item);
       }
       }catch(SQLException ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }catch(ClassNotFoundException ex){
       JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }//GEN-LAST:event_cmbCustomerNameforViewCustomersItemStateChanged

    private void btnDeleteforViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteforViewCustomerActionPerformed
        int index=tblCustomerforViewCustomer.getSelectedRow();
        if(index<0){
        JOptionPane.showMessageDialog(null,"please select a row");
        }else{
         DefaultTableModel dtm3=(DefaultTableModel)tblCustomerforViewCustomer.getModel();
        dtm3.removeRow(index);
        }
    }//GEN-LAST:event_btnDeleteforViewCustomerActionPerformed

    private void btnRdeleteforViewcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRdeleteforViewcustomerActionPerformed
        DefaultTableModel dtm4=(DefaultTableModel)tblCustomerforViewCustomer.getModel();
        int rows=tblCustomerforViewCustomer.getSelectedRow();
       if(rows<0){
           JOptionPane.showMessageDialog(null,"please select a row");
        
       }else{
      String customerid=(String) dtm4.getValueAt(rows, 0);
        try{
        boolean IsDeleted=CustomerController.deletecustomer(customerid);
        if(IsDeleted){
         JOptionPane.showMessageDialog(null, "Deleted...");
        }else{
            JOptionPane.showMessageDialog(null, "Cannot Delete...");
        }
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
       } 
       
    }//GEN-LAST:event_btnRdeleteforViewcustomerActionPerformed

    private void tblCustomerforViewCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerforViewCustomerMouseClicked
        DefaultTableModel dtm5=(DefaultTableModel)tblCustomerforViewCustomer.getModel();
        int row=tblCustomerforViewCustomer.getSelectedRow();
        String id=(String)dtm5.getValueAt(row,0);
        try {
            Vehicle vehicleno=VehicleController.getVehicleno(id);
            if(vehicleno!=null){
                txtVehicleNoforViewCustomer.setText(vehicleno.getVehicleno());
            }else{
            JOptionPane.showMessageDialog(null,"Can't find any Vehicle...");
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_tblCustomerforViewCustomerMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteforViewCustomer;
    private javax.swing.JButton btnRdeleteforViewcustomer;
    private javax.swing.JButton btnRefreshforViewCustomers;
    private javax.swing.JButton btnUpdateforViewCustomer;
    private javax.swing.JComboBox<String> cmbCustomerNameforViewCustomers;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCloseforViewCustomer;
    private javax.swing.JLabel lblMinimizeforViewCustomer;
    private javax.swing.JLabel lblVehicleNoforViewCustomer;
    private javax.swing.JTable tblCustomerforViewCustomer;
    private javax.swing.JTextField txtVehicleNoforViewCustomer;
    // End of variables declaration//GEN-END:variables

    private void loadcustomernamecombo() {
        //ArrayList<String> customernamelist=new ArrayList<>();
        try{
        ArrayList<String> customerlist=CustomerController.getCustomerName();
        for(String customer : customerlist){
            cmbCustomerNameforViewCustomers.addItem(customer);
        }
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
