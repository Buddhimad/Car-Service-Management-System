package MainFrame;
import Controller.ServicecategoryController;
import Model.Servicecategory;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewServiceType extends javax.swing.JFrame {

    
    public ViewServiceType() {
        initComponents();
        setLocationRelativeTo(null);
        loadservicetypes();
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
        tblServicetypesforViewservicetype = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelforViewservicetype = new javax.swing.JButton();
        btnRefreshforViewservicetype = new javax.swing.JButton();
        btnDeleteforViewservicetype = new javax.swing.JButton();
        btnRemovefromDatabaseforViewservicetype = new javax.swing.JButton();
        btnUpdateforViewservicetype = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbVehicleTypeforViewservicetype = new javax.swing.JComboBox<>();

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Service Type Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        tblServicetypesforViewservicetype.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Vehicle Type", "Description", "Charge"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblServicetypesforViewservicetype);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnCancelforViewservicetype.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelforViewservicetype.setText("Cancel");
        btnCancelforViewservicetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelforViewservicetypeActionPerformed(evt);
            }
        });

        btnRefreshforViewservicetype.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshforViewservicetype.setText("Refresh");
        btnRefreshforViewservicetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshforViewservicetypeActionPerformed(evt);
            }
        });

        btnDeleteforViewservicetype.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteforViewservicetype.setText("Delete");
        btnDeleteforViewservicetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteforViewservicetypeActionPerformed(evt);
            }
        });

        btnRemovefromDatabaseforViewservicetype.setBackground(new java.awt.Color(255, 255, 255));
        btnRemovefromDatabaseforViewservicetype.setText("Remove from Database");
        btnRemovefromDatabaseforViewservicetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovefromDatabaseforViewservicetypeActionPerformed(evt);
            }
        });

        btnUpdateforViewservicetype.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateforViewservicetype.setText("Update");
        btnUpdateforViewservicetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateforViewservicetypeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Vehicle Type");

        cmbVehicleTypeforViewservicetype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbVehicleTypeforViewservicetype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVehicleTypeforViewservicetypeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 317, Short.MAX_VALUE)
                        .addComponent(btnUpdateforViewservicetype)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemovefromDatabaseforViewservicetype)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteforViewservicetype)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefreshforViewservicetype)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelforViewservicetype)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(cmbVehicleTypeforViewservicetype, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbVehicleTypeforViewservicetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelforViewservicetype)
                    .addComponent(btnRefreshforViewservicetype)
                    .addComponent(btnDeleteforViewservicetype)
                    .addComponent(btnRemovefromDatabaseforViewservicetype)
                    .addComponent(btnUpdateforViewservicetype))
                .addGap(20, 20, 20))
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
        pX=evt.getX();
        pY=evt.getY();
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

    private void btnCancelforViewservicetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelforViewservicetypeActionPerformed
        this.hide();
    }//GEN-LAST:event_btnCancelforViewservicetypeActionPerformed

    private void btnRefreshforViewservicetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshforViewservicetypeActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)tblServicetypesforViewservicetype.getModel();
        try{
            Servicecategory[] SC=ServicecategoryController.showservicecategory();
            dtm.setRowCount(0);
            for(Servicecategory  sc:SC ){
            Object [] rows={sc.getCategoryID(),sc.getVehicletype(),sc.getDescription(),sc.getCharge()};
            dtm.addRow(rows);
            }
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnRefreshforViewservicetypeActionPerformed

    private void cmbVehicleTypeforViewservicetypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVehicleTypeforViewservicetypeItemStateChanged
         DefaultTableModel dtm2=(DefaultTableModel)tblServicetypesforViewservicetype.getModel();
        String stype=cmbVehicleTypeforViewservicetype.getSelectedItem().toString();
        try {
            Servicecategory [] sc=ServicecategoryController.getshow(stype);
            dtm2.setRowCount(0);
            for(Servicecategory  st:sc){
                Object [] row={st.getCategoryID(),st.getVehicletype(),st.getDescription(),st.getCharge()};
                dtm2.addRow(row);
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbVehicleTypeforViewservicetypeItemStateChanged

    private void btnDeleteforViewservicetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteforViewservicetypeActionPerformed
         DefaultTableModel dtm3=(DefaultTableModel)tblServicetypesforViewservicetype.getModel();
         int index=tblServicetypesforViewservicetype.getSelectedRow();
         if(index<0){
        JOptionPane.showMessageDialog(null,"Please select a row");
         }else{
        dtm3.removeRow(index);
         }
    }//GEN-LAST:event_btnDeleteforViewservicetypeActionPerformed

    private void btnRemovefromDatabaseforViewservicetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovefromDatabaseforViewservicetypeActionPerformed
         DefaultTableModel dtm4=(DefaultTableModel)tblServicetypesforViewservicetype.getModel();
         int row=tblServicetypesforViewservicetype.getSelectedRow();
         if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row");
         }else{
          try  {
               String id=(String) dtm4.getValueAt(row,0);
            boolean isDeleted=ServicecategoryController.deleteservicecategory(id);
            if(isDeleted){
            JOptionPane.showMessageDialog(null,"Service type Deleted...");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot Delete...");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());  
        } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         }
    }//GEN-LAST:event_btnRemovefromDatabaseforViewservicetypeActionPerformed

    private void btnUpdateforViewservicetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateforViewservicetypeActionPerformed
        DefaultTableModel dtm4=(DefaultTableModel)tblServicetypesforViewservicetype.getModel();
        int row=tblServicetypesforViewservicetype.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row");
        }else{
       String id= (String) dtm4.getValueAt(row,0);
       String vt=(String) dtm4.getValueAt(row,1);
       String D=(String) dtm4.getValueAt(row,2);
       int C=(int) dtm4.getValueAt(row,3);
       Servicecategory  sc=new Servicecategory(id,vt,D,C);
       boolean isUpdated;
        try {
            isUpdated = ServicecategoryController.Updateservicecategory(sc);
             if(isUpdated){
                  JOptionPane.showMessageDialog(null,"Service Type Updated...");
              }else{
                  JOptionPane.showMessageDialog(null,"Cannot Update...");
              }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
      
    }//GEN-LAST:event_btnUpdateforViewservicetypeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewServiceType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelforViewservicetype;
    private javax.swing.JButton btnDeleteforViewservicetype;
    private javax.swing.JButton btnRefreshforViewservicetype;
    private javax.swing.JButton btnRemovefromDatabaseforViewservicetype;
    private javax.swing.JButton btnUpdateforViewservicetype;
    private javax.swing.JComboBox<String> cmbVehicleTypeforViewservicetype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblServicetypesforViewservicetype;
    // End of variables declaration//GEN-END:variables

    private void loadservicetypes() {
        
        try{
        ArrayList<String>list=ServicecategoryController.getservicetypes();
        for(String lst:list){
        cmbVehicleTypeforViewservicetype.addItem(lst);
        }
        }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ClassNotFoundException ex){
         JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
