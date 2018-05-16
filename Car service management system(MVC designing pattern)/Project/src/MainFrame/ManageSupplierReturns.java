package MainFrame;

import Controller.BatchController;
import Controller.SupplierController;
import Controller.SupplierreturnController;
import Model.Supplier;
import Model.Supplierreturn;
import Validation.Managesupplierreturnvalidation;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class ManageSupplierReturns extends javax.swing.JFrame {

    public ManageSupplierReturns() {
        initComponents();
        setLocationRelativeTo(null);
        loadbatchno();
        loadSupplierid();
        loaddate();
        loadreturnid();
        txtSupplierNameforSupplierreturns.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlReturnsforSupplierreturns = new javax.swing.JPanel();
        lblBatchforSupplierreturns = new javax.swing.JLabel();
        lblSupplierIDforSupplierreturns = new javax.swing.JLabel();
        lblReturnsIDforSupplierreturns = new javax.swing.JLabel();
        lblSupplierNameforSupplierreturns = new javax.swing.JLabel();
        lblDateforSupplierreturns = new javax.swing.JLabel();
        lblQtyforSupplierreturns = new javax.swing.JLabel();
        lblReasonforSupplierreturns = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmbBatchforSupplierreturns = new javax.swing.JComboBox<>();
        cmbSupplierIDforSupplierreturns = new javax.swing.JComboBox<>();
        txtSupplierNameforSupplierreturns = new javax.swing.JTextField();
        txtDateforSupplierreturns = new javax.swing.JTextField();
        txtQtyforSupplierreturns = new javax.swing.JTextField();
        txtReasonforSupplierreturns = new javax.swing.JTextField();
        btnReturnConfirmforManagesupplierreturns = new javax.swing.JButton();
        btnCancelforManagesupplierreturns = new javax.swing.JButton();
        btnViewReturnsforSupplierReturns = new javax.swing.JButton();
        cmbReturnIDforSupplierreturns = new javax.swing.JComboBox<>();
        lblshowlreturnidforManagesupplierreturn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCloseforManageSupplierReturns = new javax.swing.JLabel();
        lblMinimizeforManageSupplierReturns = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        pnlReturnsforSupplierreturns.setBackground(new java.awt.Color(153, 153, 255));
        pnlReturnsforSupplierreturns.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Returns", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        lblBatchforSupplierreturns.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBatchforSupplierreturns.setText("Batch");

        lblSupplierIDforSupplierreturns.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSupplierIDforSupplierreturns.setText("Supplier ID");

        lblReturnsIDforSupplierreturns.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblReturnsIDforSupplierreturns.setText("Return ID");

        lblSupplierNameforSupplierreturns.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSupplierNameforSupplierreturns.setText("Supplier Name");

        lblDateforSupplierreturns.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDateforSupplierreturns.setText("Date");

        lblQtyforSupplierreturns.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQtyforSupplierreturns.setText("Qty");

        lblReasonforSupplierreturns.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblReasonforSupplierreturns.setText("Reason");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        cmbBatchforSupplierreturns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbBatchforSupplierreturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBatchforSupplierreturnsActionPerformed(evt);
            }
        });
        cmbBatchforSupplierreturns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbBatchforSupplierreturnsKeyPressed(evt);
            }
        });

        cmbSupplierIDforSupplierreturns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbSupplierIDforSupplierreturns.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSupplierIDforSupplierreturnsItemStateChanged(evt);
            }
        });
        cmbSupplierIDforSupplierreturns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbSupplierIDforSupplierreturnsKeyPressed(evt);
            }
        });

        txtSupplierNameforSupplierreturns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtSupplierNameforSupplierreturns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSupplierNameforSupplierreturnsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSupplierNameforSupplierreturnsKeyTyped(evt);
            }
        });

        txtDateforSupplierreturns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtDateforSupplierreturns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateforSupplierreturnsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateforSupplierreturnsKeyTyped(evt);
            }
        });

        txtQtyforSupplierreturns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtQtyforSupplierreturns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtyforSupplierreturnsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtyforSupplierreturnsKeyTyped(evt);
            }
        });

        txtReasonforSupplierreturns.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtReasonforSupplierreturns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReasonforSupplierreturnsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReasonforSupplierreturnsKeyTyped(evt);
            }
        });

        btnReturnConfirmforManagesupplierreturns.setBackground(new java.awt.Color(255, 255, 255));
        btnReturnConfirmforManagesupplierreturns.setText("Confirm");
        btnReturnConfirmforManagesupplierreturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnConfirmforManagesupplierreturnsActionPerformed(evt);
            }
        });

        btnCancelforManagesupplierreturns.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelforManagesupplierreturns.setText("Cancel");
        btnCancelforManagesupplierreturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelforManagesupplierreturnsActionPerformed(evt);
            }
        });

        btnViewReturnsforSupplierReturns.setBackground(new java.awt.Color(255, 255, 255));
        btnViewReturnsforSupplierReturns.setText("View Returns");
        btnViewReturnsforSupplierReturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReturnsforSupplierReturnsActionPerformed(evt);
            }
        });

        cmbReturnIDforSupplierreturns.setEditable(true);
        cmbReturnIDforSupplierreturns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbReturnIDforSupplierreturnsKeyPressed(evt);
            }
        });

        lblshowlreturnidforManagesupplierreturn.setText("..............");
        lblshowlreturnidforManagesupplierreturn.setToolTipText("Lastly Added Return ID till the Programme Start");

        javax.swing.GroupLayout pnlReturnsforSupplierreturnsLayout = new javax.swing.GroupLayout(pnlReturnsforSupplierreturns);
        pnlReturnsforSupplierreturns.setLayout(pnlReturnsforSupplierreturnsLayout);
        pnlReturnsforSupplierreturnsLayout.setHorizontalGroup(
            pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReturnsforSupplierreturnsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReturnsIDforSupplierreturns)
                    .addComponent(lblBatchforSupplierreturns)
                    .addComponent(lblSupplierIDforSupplierreturns)
                    .addComponent(lblSupplierNameforSupplierreturns)
                    .addComponent(lblDateforSupplierreturns)
                    .addComponent(lblQtyforSupplierreturns)
                    .addComponent(lblReasonforSupplierreturns))
                .addGap(62, 62, 62)
                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbBatchforSupplierreturns, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbSupplierIDforSupplierreturns, 0, 458, Short.MAX_VALUE)
                        .addComponent(txtSupplierNameforSupplierreturns)
                        .addComponent(txtDateforSupplierreturns)
                        .addComponent(txtQtyforSupplierreturns)
                        .addComponent(txtReasonforSupplierreturns))
                    .addGroup(pnlReturnsforSupplierreturnsLayout.createSequentialGroup()
                        .addComponent(cmbReturnIDforSupplierreturns, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblshowlreturnidforManagesupplierreturn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlReturnsforSupplierreturnsLayout.createSequentialGroup()
                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReturnsforSupplierreturnsLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReturnsforSupplierreturnsLayout.createSequentialGroup()
                        .addContainerGap(362, Short.MAX_VALUE)
                        .addComponent(btnViewReturnsforSupplierReturns)
                        .addGap(18, 18, 18)
                        .addComponent(btnReturnConfirmforManagesupplierreturns)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelforManagesupplierreturns)))
                .addContainerGap())
        );
        pnlReturnsforSupplierreturnsLayout.setVerticalGroup(
            pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReturnsforSupplierreturnsLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlReturnsforSupplierreturnsLayout.createSequentialGroup()
                        .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlReturnsforSupplierreturnsLayout.createSequentialGroup()
                                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBatchforSupplierreturns)
                                    .addComponent(cmbBatchforSupplierreturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSupplierIDforSupplierreturns)
                                    .addComponent(cmbSupplierIDforSupplierreturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 19, Short.MAX_VALUE)
                                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblReturnsIDforSupplierreturns)
                                    .addComponent(cmbReturnIDforSupplierreturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblshowlreturnidforManagesupplierreturn))
                                .addGap(18, 19, Short.MAX_VALUE)
                                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSupplierNameforSupplierreturns)
                                    .addComponent(txtSupplierNameforSupplierreturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(lblDateforSupplierreturns))
                            .addComponent(txtDateforSupplierreturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblQtyforSupplierreturns))
                    .addComponent(txtQtyforSupplierreturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblReasonforSupplierreturns)
                    .addComponent(txtReasonforSupplierreturns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(pnlReturnsforSupplierreturnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnConfirmforManagesupplierreturns)
                    .addComponent(btnCancelforManagesupplierreturns)
                    .addComponent(btnViewReturnsforSupplierReturns))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlReturnsforSupplierreturns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlReturnsforSupplierreturns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        lblCloseforManageSupplierReturns.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCloseforManageSupplierReturns.setForeground(new java.awt.Color(204, 0, 51));
        lblCloseforManageSupplierReturns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseforManageSupplierReturns.setText("X");
        lblCloseforManageSupplierReturns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseforManageSupplierReturnsMouseClicked(evt);
            }
        });

        lblMinimizeforManageSupplierReturns.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimizeforManageSupplierReturns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizeforManageSupplierReturns.setText("-");
        lblMinimizeforManageSupplierReturns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeforManageSupplierReturnsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(615, Short.MAX_VALUE)
                .addComponent(lblMinimizeforManageSupplierReturns)
                .addGap(18, 18, 18)
                .addComponent(lblCloseforManageSupplierReturns)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCloseforManageSupplierReturns)
                    .addComponent(lblMinimizeforManageSupplierReturns))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int pX,pY;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
         pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
         setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void lblCloseforManageSupplierReturnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseforManageSupplierReturnsMouseClicked
      this.dispose();
    }//GEN-LAST:event_lblCloseforManageSupplierReturnsMouseClicked

    private void lblMinimizeforManageSupplierReturnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeforManageSupplierReturnsMouseClicked
       setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeforManageSupplierReturnsMouseClicked

    private void btnViewReturnsforSupplierReturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReturnsforSupplierReturnsActionPerformed
        ViewReturns viewreturns=new ViewReturns();
        viewreturns.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewReturnsforSupplierReturnsActionPerformed

    private void btnCancelforManagesupplierreturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelforManagesupplierreturnsActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelforManagesupplierreturnsActionPerformed

    private void btnReturnConfirmforManagesupplierreturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnConfirmforManagesupplierreturnsActionPerformed
        String returnid=cmbReturnIDforSupplierreturns.getSelectedItem().toString();
        if(cmbReturnIDforSupplierreturns.getSelectedItem().toString().length()<=0|txtQtyforSupplierreturns.getText().length()<=0|txtReasonforSupplierreturns.getText().length()<=0){
           JOptionPane.showMessageDialog(null,"Please fill all the informations");
     }else{
             boolean isreturnidok=Managesupplierreturnvalidation.checkreturnid(returnid);
             if(isreturnidok){
       savereturns();
             }else{
             JOptionPane.showMessageDialog(null,"Invalid Return ID");
             }
        }
    }//GEN-LAST:event_btnReturnConfirmforManagesupplierreturnsActionPerformed

    private void cmbBatchforSupplierreturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBatchforSupplierreturnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBatchforSupplierreturnsActionPerformed

    private void cmbSupplierIDforSupplierreturnsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSupplierIDforSupplierreturnsItemStateChanged
       String id=cmbSupplierIDforSupplierreturns.getSelectedItem().toString();
       
        try {
            Supplier sp=SupplierController.searchsupplier(id);
            if(sp!=null){
            txtSupplierNameforSupplierreturns.setText(sp.getName());
            }else{
            JOptionPane.showMessageDialog(null,"No Supplier Found...");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbSupplierIDforSupplierreturnsItemStateChanged

    private void txtDateforSupplierreturnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateforSupplierreturnsKeyPressed
//      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
//          
//      }
    }//GEN-LAST:event_txtDateforSupplierreturnsKeyPressed

    private void txtSupplierNameforSupplierreturnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSupplierNameforSupplierreturnsKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         
      }
    }//GEN-LAST:event_txtSupplierNameforSupplierreturnsKeyPressed

    private void txtQtyforSupplierreturnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyforSupplierreturnsKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        txtReasonforSupplierreturns.grabFocus();
      }
    }//GEN-LAST:event_txtQtyforSupplierreturnsKeyPressed

    private void txtReasonforSupplierreturnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReasonforSupplierreturnsKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       
      }
    }//GEN-LAST:event_txtReasonforSupplierreturnsKeyPressed

    private void txtSupplierNameforSupplierreturnsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSupplierNameforSupplierreturnsKeyTyped
        Managesupplierreturnvalidation.checksuppliername(evt);
    }//GEN-LAST:event_txtSupplierNameforSupplierreturnsKeyTyped

    private void txtDateforSupplierreturnsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateforSupplierreturnsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateforSupplierreturnsKeyTyped

    private void txtQtyforSupplierreturnsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyforSupplierreturnsKeyTyped
          Managesupplierreturnvalidation.checkqty(evt);
    }//GEN-LAST:event_txtQtyforSupplierreturnsKeyTyped

    private void txtReasonforSupplierreturnsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReasonforSupplierreturnsKeyTyped
          Managesupplierreturnvalidation.checkreason(evt);
    }//GEN-LAST:event_txtReasonforSupplierreturnsKeyTyped

    private void cmbReturnIDforSupplierreturnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbReturnIDforSupplierreturnsKeyPressed
        String returnid=cmbReturnIDforSupplierreturns.getSelectedItem().toString();
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            
       txtQtyforSupplierreturns.grabFocus();
      }
    }//GEN-LAST:event_cmbReturnIDforSupplierreturnsKeyPressed

    private void cmbSupplierIDforSupplierreturnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbSupplierIDforSupplierreturnsKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       cmbReturnIDforSupplierreturns.grabFocus();
      }
    }//GEN-LAST:event_cmbSupplierIDforSupplierreturnsKeyPressed

    private void cmbBatchforSupplierreturnsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbBatchforSupplierreturnsKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       cmbSupplierIDforSupplierreturns.grabFocus();
      }
    }//GEN-LAST:event_cmbBatchforSupplierreturnsKeyPressed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSupplierReturns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelforManagesupplierreturns;
    private javax.swing.JButton btnReturnConfirmforManagesupplierreturns;
    private javax.swing.JButton btnViewReturnsforSupplierReturns;
    private javax.swing.JComboBox<String> cmbBatchforSupplierreturns;
    private javax.swing.JComboBox<String> cmbReturnIDforSupplierreturns;
    private javax.swing.JComboBox<String> cmbSupplierIDforSupplierreturns;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBatchforSupplierreturns;
    private javax.swing.JLabel lblCloseforManageSupplierReturns;
    private javax.swing.JLabel lblDateforSupplierreturns;
    private javax.swing.JLabel lblMinimizeforManageSupplierReturns;
    private javax.swing.JLabel lblQtyforSupplierreturns;
    private javax.swing.JLabel lblReasonforSupplierreturns;
    private javax.swing.JLabel lblReturnsIDforSupplierreturns;
    private javax.swing.JLabel lblSupplierIDforSupplierreturns;
    private javax.swing.JLabel lblSupplierNameforSupplierreturns;
    private javax.swing.JLabel lblshowlreturnidforManagesupplierreturn;
    private javax.swing.JPanel pnlReturnsforSupplierreturns;
    private javax.swing.JTextField txtDateforSupplierreturns;
    private javax.swing.JTextField txtQtyforSupplierreturns;
    private javax.swing.JTextField txtReasonforSupplierreturns;
    private javax.swing.JTextField txtSupplierNameforSupplierreturns;
    // End of variables declaration//GEN-END:variables

    private void loadbatchno() {
        try {
            ArrayList<String>blist=BatchController.showbatchno();
            for(String l:blist){
            cmbBatchforSupplierreturns.addItem(l);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loadSupplierid() {
        try {
            ArrayList<String>slist=SupplierController.getSupplierid();
            for(String t:slist){
            cmbSupplierIDforSupplierreturns.addItem(t);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loaddate() {
        txtDateforSupplierreturns.setEditable(false);
        Date date=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        String d=sf.format(date);
        txtDateforSupplierreturns.setText(d);
    }

    private void loadreturnid() {
        try { 
            ArrayList<String>returnid=SupplierreturnController.showreturnid();
            for(String ri:returnid){
            cmbReturnIDforSupplierreturns.addItem(ri);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void savereturns(){
     String id=cmbBatchforSupplierreturns.getSelectedItem().toString();
        String sid=cmbSupplierIDforSupplierreturns.getSelectedItem().toString();
        String rid=cmbReturnIDforSupplierreturns.getSelectedItem().toString();
        String sn=txtSupplierNameforSupplierreturns.getText();
        String d=txtDateforSupplierreturns.getText();
        double q=Double.parseDouble(txtQtyforSupplierreturns.getText());
        String r=txtReasonforSupplierreturns.getText();
        Supplierreturn sr=new Supplierreturn(rid,sid,id,r,q,d);
        try {
            boolean IsAdded=SupplierreturnController.addsupplierreturn(sr);
            if(IsAdded){
                lblshowlreturnidforManagesupplierreturn.setText(rid);
            JOptionPane.showMessageDialog(null,"Save supplier return details...");
            cmbReturnIDforSupplierreturns.setSelectedIndex(0);
           
            txtQtyforSupplierreturns.setText("");
            txtReasonforSupplierreturns.setText("");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot Save...");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
//    private boolean checkfields(){
//   
//    return false;
//    }
}
