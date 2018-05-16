package MainFrame;

import Controller.BatchController;
import Controller.ItemController;
import Model.Item;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewStock extends javax.swing.JFrame {

    public ViewStock() {
        initComponents();
        loaditemtable();
        setLocationRelativeTo(null);
        loadbatchno();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCloseforViewstock = new javax.swing.JLabel();
        lblMinimizeforViewstock = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbBatchforViewstock = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemtableforViewstock = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnResearchforViewstock = new javax.swing.JButton();
        btnCancelforViewstock = new javax.swing.JButton();

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

        lblCloseforViewstock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCloseforViewstock.setForeground(new java.awt.Color(255, 0, 51));
        lblCloseforViewstock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseforViewstock.setText("X");
        lblCloseforViewstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseforViewstockMouseClicked(evt);
            }
        });

        lblMinimizeforViewstock.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimizeforViewstock.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizeforViewstock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizeforViewstock.setText("-");
        lblMinimizeforViewstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeforViewstockMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizeforViewstock)
                .addGap(18, 18, 18)
                .addComponent(lblCloseforViewstock)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCloseforViewstock)
                    .addComponent(lblMinimizeforViewstock))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Search", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Batch");

        cmbBatchforViewstock.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBatchforViewstockItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(cmbBatchforViewstock, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbBatchforViewstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Item Table", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblItemtableforViewstock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Batch No", "Brand ID", "Category ID", "Name", "QTY", "Discount", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItemtableforViewstock);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnResearchforViewstock.setBackground(new java.awt.Color(255, 255, 255));
        btnResearchforViewstock.setText("Research");
        btnResearchforViewstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResearchforViewstockActionPerformed(evt);
            }
        });

        btnCancelforViewstock.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelforViewstock.setText("Cancel");
        btnCancelforViewstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelforViewstockActionPerformed(evt);
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnResearchforViewstock)
                        .addGap(26, 26, 26)
                        .addComponent(btnCancelforViewstock)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResearchforViewstock)
                    .addComponent(btnCancelforViewstock))
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

    private void btnResearchforViewstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResearchforViewstockActionPerformed
       loaditemtable() ;
    }//GEN-LAST:event_btnResearchforViewstockActionPerformed
        int pX,pY;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
          pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void lblMinimizeforViewstockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeforViewstockMouseClicked
         setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeforViewstockMouseClicked

    private void lblCloseforViewstockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseforViewstockMouseClicked
       this.dispose();
    }//GEN-LAST:event_lblCloseforViewstockMouseClicked

    private void btnCancelforViewstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelforViewstockActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCancelforViewstockActionPerformed

    private void cmbBatchforViewstockItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBatchforViewstockItemStateChanged
        searchitemfrombatchno();
    }//GEN-LAST:event_cmbBatchforViewstockItemStateChanged

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelforViewstock;
    private javax.swing.JButton btnResearchforViewstock;
    private javax.swing.JComboBox<String> cmbBatchforViewstock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCloseforViewstock;
    private javax.swing.JLabel lblMinimizeforViewstock;
    private javax.swing.JTable tblItemtableforViewstock;
    // End of variables declaration//GEN-END:variables

    private void loaditemtable() {
        DefaultTableModel dtm=(DefaultTableModel)tblItemtableforViewstock.getModel();
        try {
            Item [] item=ItemController.showItem();
            dtm.setRowCount(0);
            for(Item i:item){
            Object [] row={i.getItemcode(),i.getBatchno(),i.getBrandID(),i.getCategoryID(),i.getName(),i.getQty(),i.getDiscount(),i.getPrice()};
            dtm.addRow(row);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loadbatchno() {
        try {
            ArrayList<String>batchno=BatchController.showbatchno();
            for(String bno:batchno){
            cmbBatchforViewstock.addItem(bno);
            
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void searchitemfrombatchno(){
          DefaultTableModel dtm2=(DefaultTableModel)tblItemtableforViewstock.getModel();
        String batchno=cmbBatchforViewstock.getSelectedItem().toString();
        try {
            Item [] itemlist=ItemController.showitemusingbatchno(batchno);
            dtm2.setRowCount(0);
            for(Item i:itemlist){
            Object [] row={i.getItemcode(),i.getBatchno(),i.getBrandID(),i.getCategoryID(),i.getName(),i.getQty(),i.getDiscount(),i.getPrice()};
            dtm2.addRow(row);
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }
}
