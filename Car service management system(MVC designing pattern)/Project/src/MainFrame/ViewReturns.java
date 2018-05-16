
package MainFrame;

import Controller.SupplierController;
import Controller.SupplierreturnController;
import Model.Supplier;
import Model.Supplierreturn;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewReturns extends javax.swing.JFrame {

   
    public ViewReturns() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturnforViewreturn = new javax.swing.JTable();
        btnUpdateforViewreturns = new javax.swing.JButton();
        btnRemovefromDatabaseforViewreturns = new javax.swing.JButton();
        btnDeleteforViewreturns = new javax.swing.JButton();
        btnRefreshTableforViewreturns = new javax.swing.JButton();
        btnBackforViewreturns = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSuppliernameforViewreturns = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Table", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblReturnforViewreturn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Return ID", "Supplier ID", "Batch No", "Reason", "Qty", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblReturnforViewreturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReturnforViewreturnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReturnforViewreturn);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnUpdateforViewreturns.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateforViewreturns.setText("Update");
        btnUpdateforViewreturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateforViewreturnsActionPerformed(evt);
            }
        });

        btnRemovefromDatabaseforViewreturns.setBackground(new java.awt.Color(255, 255, 255));
        btnRemovefromDatabaseforViewreturns.setText("Remove from Database");
        btnRemovefromDatabaseforViewreturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovefromDatabaseforViewreturnsActionPerformed(evt);
            }
        });

        btnDeleteforViewreturns.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteforViewreturns.setText("Delete");
        btnDeleteforViewreturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteforViewreturnsActionPerformed(evt);
            }
        });

        btnRefreshTableforViewreturns.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshTableforViewreturns.setText("Refresh Table");
        btnRefreshTableforViewreturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableforViewreturnsActionPerformed(evt);
            }
        });

        btnBackforViewreturns.setBackground(new java.awt.Color(255, 255, 255));
        btnBackforViewreturns.setText("Back");
        btnBackforViewreturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackforViewreturnsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Supplier Name");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator1))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(btnUpdateforViewreturns)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemovefromDatabaseforViewreturns)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteforViewreturns)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRefreshTableforViewreturns)
                                .addGap(18, 18, 18)
                                .addComponent(btnBackforViewreturns))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtSuppliernameforViewreturns, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSuppliernameforViewreturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateforViewreturns)
                    .addComponent(btnRemovefromDatabaseforViewreturns)
                    .addComponent(btnDeleteforViewreturns)
                    .addComponent(btnRefreshTableforViewreturns)
                    .addComponent(btnBackforViewreturns))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       setState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked
        int pX,pY;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void btnBackforViewreturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackforViewreturnsActionPerformed
       ManageSupplierReturns managesupplierreturns=new ManageSupplierReturns();
        managesupplierreturns.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnBackforViewreturnsActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       this.hide();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnRefreshTableforViewreturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableforViewreturnsActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblReturnforViewreturn.getModel();
        try {
            Supplierreturn [] srt=SupplierreturnController.showsupplierreturn();
            dtm.setRowCount(0);
            for(Supplierreturn t:srt){
                Object [] row={t.getSrID(),t.getSupplierID(),t.getBatchno(),t.getReson(),t.getQty(),t.getDate()};
                dtm.addRow(row);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnRefreshTableforViewreturnsActionPerformed

    private void tblReturnforViewreturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReturnforViewreturnMouseClicked
       DefaultTableModel dtm1=(DefaultTableModel)tblReturnforViewreturn.getModel();
       int row=tblReturnforViewreturn.getSelectedRow();
       String sid=(String) dtm1.getValueAt(row,1);
        try {
            Supplier sp=SupplierController.searchsupplier(sid);
            txtSuppliernameforViewreturns.setText(sp.getName());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_tblReturnforViewreturnMouseClicked

    private void btnDeleteforViewreturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteforViewreturnsActionPerformed
       DefaultTableModel dtm2=(DefaultTableModel)tblReturnforViewreturn.getModel();
       int index=tblReturnforViewreturn.getSelectedRow();
       if(index>0){
       dtm2.removeRow(index);
       }else{
       JOptionPane.showMessageDialog(null,"Please select a row");
       }
    }//GEN-LAST:event_btnDeleteforViewreturnsActionPerformed

    private void btnRemovefromDatabaseforViewreturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovefromDatabaseforViewreturnsActionPerformed
        DefaultTableModel dtm3=(DefaultTableModel)tblReturnforViewreturn.getModel();
        int row=tblReturnforViewreturn.getSelectedRow();
        if(row>0){
        String sid=(String) dtm3.getValueAt(row,1);
        try {
            boolean IsDeleted=SupplierreturnController.deletesupplierreturn(sid);
            if(IsDeleted){
            JOptionPane.showMessageDialog(null,"Supplierreturn Details Deleted...");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot Delete...");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }else{
        JOptionPane.showMessageDialog(null,"Please select SupplierID column selected row");
        }
    }//GEN-LAST:event_btnRemovefromDatabaseforViewreturnsActionPerformed

    private void btnUpdateforViewreturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateforViewreturnsActionPerformed
        DefaultTableModel dtm4=(DefaultTableModel)tblReturnforViewreturn.getModel();
        int row=tblReturnforViewreturn.getSelectedRow();
        if(row>0){
        String rid=(String) dtm4.getValueAt(row,0);
        String sid=(String) dtm4.getValueAt(row,1);
        String bno=(String) dtm4.getValueAt(row,2);
        String r=(String) dtm4.getValueAt(row, 3);
        double q=(double) dtm4.getValueAt(row,4);
        String d=(String) dtm4.getValueAt(row,5);
        Supplierreturn sp=new Supplierreturn(rid,sid,bno,r,q,d);
        try {
            boolean Isupdated=SupplierreturnController.Updatesupplierreturn(sp);
            if(Isupdated){
            JOptionPane.showMessageDialog(null,"Successfully Updated...");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot Update...");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }else{
        JOptionPane.showMessageDialog(null,"Please select a row");
        }
    }//GEN-LAST:event_btnUpdateforViewreturnsActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReturns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackforViewreturns;
    private javax.swing.JButton btnDeleteforViewreturns;
    private javax.swing.JButton btnRefreshTableforViewreturns;
    private javax.swing.JButton btnRemovefromDatabaseforViewreturns;
    private javax.swing.JButton btnUpdateforViewreturns;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblReturnforViewreturn;
    private javax.swing.JTextField txtSuppliernameforViewreturns;
    // End of variables declaration//GEN-END:variables
}
