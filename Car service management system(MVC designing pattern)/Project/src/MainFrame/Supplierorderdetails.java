package MainFrame;
import Controller.ItemController;
import Controller.ItembrandController;
import Controller.ItemcategoryController;
import Controller.SupplierorderController;
import Controller.SupplierorderdetailsController;
import Model.Item;
import Model.Itembrand;
import Model.Itemcategory;
import Model.Supplierorderdetail;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Supplierorderdetails extends javax.swing.JFrame {

    public Supplierorderdetails() {
        initComponents();
        SwingUtilities.updateComponentTreeUI(this);
      
        setLocationRelativeTo(null);
        loadorderid();
        loaditemcode();
        protecter();
        txtOrderIDforSupplierorderdetails.setEnabled(true);
             cmbOrderIDforSupplierorderdetails.setEnabled(true);
//         getandshow();
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUpperforSupplierorder = new javax.swing.JPanel();
        lblCloseforSupplierorderdetails = new javax.swing.JLabel();
        lblMinimizeforSupplierorderdetails = new javax.swing.JLabel();
        pnlLowerforSupplierorderdetails = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblOrderIDforSupplierorderdetails = new javax.swing.JLabel();
        lblItemCodeforSupplierorderdetails = new javax.swing.JLabel();
        lblQtyforSupplierorderdetails = new javax.swing.JLabel();
        cmbItemCodeforSupplierorderdetails = new javax.swing.JComboBox<>();
        txtQtyforSupplierorderdetails = new javax.swing.JTextField();
        lblpic = new javax.swing.JLabel();
        lblItemNameforSupplierorderdetails = new javax.swing.JLabel();
        txtItemNameforSupplierorderdetails = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnSearchforSupplierorderdetails = new javax.swing.JButton();
        btnAddtothelistforSupplierorderdetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtItembrandforSupplierorderdetails = new javax.swing.JTextField();
        txtCategoryforSupplierorderdetails = new javax.swing.JTextField();
        txtCountryforSupplierorderdetails = new javax.swing.JTextField();
        txtOrderIDforSupplierorderdetails = new javax.swing.JTextField();
        cmbOrderIDforSupplierorderdetails = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderlistforSupplierorderdetails = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelforSupplierorderdetails = new javax.swing.JButton();
        btnOrderforSupplierorderdetails = new javax.swing.JButton();
        btnDeleteforSupplierorderdetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlUpperforSupplierorder.setBackground(new java.awt.Color(153, 153, 255));
        pnlUpperforSupplierorder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlUpperforSupplierorder.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlUpperforSupplierorderMouseDragged(evt);
            }
        });
        pnlUpperforSupplierorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlUpperforSupplierorderMousePressed(evt);
            }
        });

        lblCloseforSupplierorderdetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCloseforSupplierorderdetails.setForeground(new java.awt.Color(255, 0, 51));
        lblCloseforSupplierorderdetails.setText("X");
        lblCloseforSupplierorderdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseforSupplierorderdetailsMouseClicked(evt);
            }
        });

        lblMinimizeforSupplierorderdetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimizeforSupplierorderdetails.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizeforSupplierorderdetails.setText("-");
        lblMinimizeforSupplierorderdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeforSupplierorderdetailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlUpperforSupplierorderLayout = new javax.swing.GroupLayout(pnlUpperforSupplierorder);
        pnlUpperforSupplierorder.setLayout(pnlUpperforSupplierorderLayout);
        pnlUpperforSupplierorderLayout.setHorizontalGroup(
            pnlUpperforSupplierorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpperforSupplierorderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizeforSupplierorderdetails)
                .addGap(18, 18, 18)
                .addComponent(lblCloseforSupplierorderdetails)
                .addContainerGap())
        );
        pnlUpperforSupplierorderLayout.setVerticalGroup(
            pnlUpperforSupplierorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpperforSupplierorderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUpperforSupplierorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCloseforSupplierorderdetails)
                    .addComponent(lblMinimizeforSupplierorderdetails))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLowerforSupplierorderdetails.setBackground(new java.awt.Color(153, 153, 255));
        pnlLowerforSupplierorderdetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Order Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        lblOrderIDforSupplierorderdetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOrderIDforSupplierorderdetails.setText("Order ID");

        lblItemCodeforSupplierorderdetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblItemCodeforSupplierorderdetails.setText("Item Code");

        lblQtyforSupplierorderdetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQtyforSupplierorderdetails.setText("Quantity");

        cmbItemCodeforSupplierorderdetails.setToolTipText("Select Item Code");
        cmbItemCodeforSupplierorderdetails.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemCodeforSupplierorderdetailsItemStateChanged(evt);
            }
        });
        cmbItemCodeforSupplierorderdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemCodeforSupplierorderdetailsActionPerformed(evt);
            }
        });

        txtQtyforSupplierorderdetails.setText("0");
        txtQtyforSupplierorderdetails.setToolTipText("Ordering quantity");

        lblpic.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/order-icon-21627.png"))); // NOI18N

        lblItemNameforSupplierorderdetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblItemNameforSupplierorderdetails.setText("Item Name");

        txtItemNameforSupplierorderdetails.setToolTipText("Item Name");

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        btnSearchforSupplierorderdetails.setBackground(new java.awt.Color(204, 204, 255));
        btnSearchforSupplierorderdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/search-icon.png"))); // NOI18N
        btnSearchforSupplierorderdetails.setToolTipText("Search Item");

        btnAddtothelistforSupplierorderdetails.setBackground(new java.awt.Color(204, 204, 255));
        btnAddtothelistforSupplierorderdetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/math-add-icon.png"))); // NOI18N
        btnAddtothelistforSupplierorderdetails.setToolTipText("Add to the List");
        btnAddtothelistforSupplierorderdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtothelistforSupplierorderdetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchforSupplierorderdetails, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btnAddtothelistforSupplierorderdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearchforSupplierorderdetails)
                .addGap(18, 18, 18)
                .addComponent(btnAddtothelistforSupplierorderdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Item Brand");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Country");

        txtOrderIDforSupplierorderdetails.setToolTipText("Order ID ");
        txtOrderIDforSupplierorderdetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrderIDforSupplierorderdetailsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOrderIDforSupplierorderdetailsKeyReleased(evt);
            }
        });

        cmbOrderIDforSupplierorderdetails.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrderIDforSupplierorderdetailsItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderIDforSupplierorderdetails)
                    .addComponent(lblItemCodeforSupplierorderdetails)
                    .addComponent(lblQtyforSupplierorderdetails)
                    .addComponent(lblItemNameforSupplierorderdetails)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbItemCodeforSupplierorderdetails, 0, 227, Short.MAX_VALUE)
                    .addComponent(txtQtyforSupplierorderdetails)
                    .addComponent(txtItemNameforSupplierorderdetails)
                    .addComponent(txtItembrandforSupplierorderdetails)
                    .addComponent(txtCategoryforSupplierorderdetails)
                    .addComponent(txtCountryforSupplierorderdetails)
                    .addComponent(cmbOrderIDforSupplierorderdetails, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOrderIDforSupplierorderdetails))
                .addGap(18, 18, 18)
                .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrderIDforSupplierorderdetails)
                            .addComponent(txtOrderIDforSupplierorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbOrderIDforSupplierorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblItemNameforSupplierorderdetails)
                                    .addComponent(txtItemNameforSupplierorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblItemCodeforSupplierorderdetails)
                                    .addComponent(cmbItemCodeforSupplierorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtItembrandforSupplierorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCategoryforSupplierorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCountryforSupplierorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtQtyforSupplierorderdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQtyforSupplierorderdetails)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        tblOrderlistforSupplierorderdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Item Name", "Item Code", "Item Brand", "Category", "Country", "Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderlistforSupplierorderdetails);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnCancelforSupplierorderdetails.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelforSupplierorderdetails.setText("Cancel");
        btnCancelforSupplierorderdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelforSupplierorderdetailsMouseClicked(evt);
            }
        });

        btnOrderforSupplierorderdetails.setBackground(new java.awt.Color(255, 255, 255));
        btnOrderforSupplierorderdetails.setText("Order");
        btnOrderforSupplierorderdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderforSupplierorderdetailsActionPerformed(evt);
            }
        });

        btnDeleteforSupplierorderdetails.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteforSupplierorderdetails.setText("Delete");
        btnDeleteforSupplierorderdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteforSupplierorderdetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLowerforSupplierorderdetailsLayout = new javax.swing.GroupLayout(pnlLowerforSupplierorderdetails);
        pnlLowerforSupplierorderdetails.setLayout(pnlLowerforSupplierorderdetailsLayout);
        pnlLowerforSupplierorderdetailsLayout.setHorizontalGroup(
            pnlLowerforSupplierorderdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLowerforSupplierorderdetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLowerforSupplierorderdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLowerforSupplierorderdetailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeleteforSupplierorderdetails)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrderforSupplierorderdetails)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelforSupplierorderdetails)))
                .addContainerGap())
        );
        pnlLowerforSupplierorderdetailsLayout.setVerticalGroup(
            pnlLowerforSupplierorderdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLowerforSupplierorderdetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLowerforSupplierorderdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelforSupplierorderdetails)
                    .addComponent(btnOrderforSupplierorderdetails)
                    .addComponent(btnDeleteforSupplierorderdetails))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUpperforSupplierorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlLowerforSupplierorderdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlUpperforSupplierorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlLowerforSupplierorderdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        int pX,pY;
    private void pnlUpperforSupplierorderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpperforSupplierorderMousePressed
       pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_pnlUpperforSupplierorderMousePressed

    private void pnlUpperforSupplierorderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpperforSupplierorderMouseDragged
         setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_pnlUpperforSupplierorderMouseDragged

    private void lblMinimizeforSupplierorderdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeforSupplierorderdetailsMouseClicked
      setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeforSupplierorderdetailsMouseClicked

    private void lblCloseforSupplierorderdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseforSupplierorderdetailsMouseClicked
       this.dispose();
    }//GEN-LAST:event_lblCloseforSupplierorderdetailsMouseClicked

    private void btnCancelforSupplierorderdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelforSupplierorderdetailsMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnCancelforSupplierorderdetailsMouseClicked

    private void cmbItemCodeforSupplierorderdetailsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemCodeforSupplierorderdetailsItemStateChanged
        searchbyItemcode();
    }//GEN-LAST:event_cmbItemCodeforSupplierorderdetailsItemStateChanged

    private void btnAddtothelistforSupplierorderdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtothelistforSupplierorderdetailsActionPerformed
       check();
    }//GEN-LAST:event_btnAddtothelistforSupplierorderdetailsActionPerformed
//        private String itemcode;
    private void btnOrderforSupplierorderdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderforSupplierorderdetailsActionPerformed
      int rowcount=tblOrderlistforSupplierorderdetails.getRowCount();
      if(rowcount<=0){
          JOptionPane.showMessageDialog(null,"Please enter items before order...");
      }else{
        DefaultTableModel dtm1=(DefaultTableModel)tblOrderlistforSupplierorderdetails.getModel();
     
      
      ArrayList<Supplierorderdetail>list=new ArrayList<>();
       Supplierorderdetail sod=null;
      for(int i=0;i<rowcount;i++){
          String orderid=(String) dtm1.getValueAt(i,0);
          String itemcode=(String) dtm1.getValueAt(i,2);
          double qty=(double) dtm1.getValueAt(i,6);
          sod=new Supplierorderdetail(orderid,itemcode,qty);
          sod.setOrderid(orderid);
          sod.setItemcode(itemcode);
          sod.setQty(qty);
          //list.add(sod);
      }
        try {
            boolean isAdded=SupplierorderdetailsController.addlist(sod);
            if(isAdded){
            JOptionPane.showMessageDialog(null, "Save");
            }else{
            JOptionPane.showMessageDialog(null,"cannot save");
            }
        } catch (SQLException | ClassNotFoundException ex) {
         JOptionPane.showMessageDialog(null,ex.getMessage());
        }
      }
      
    }//GEN-LAST:event_btnOrderforSupplierorderdetailsActionPerformed

    private void cmbItemCodeforSupplierorderdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemCodeforSupplierorderdetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbItemCodeforSupplierorderdetailsActionPerformed

    private void txtOrderIDforSupplierorderdetailsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderIDforSupplierorderdetailsKeyReleased
//       getandshow();
    }//GEN-LAST:event_txtOrderIDforSupplierorderdetailsKeyReleased

    private void txtOrderIDforSupplierorderdetailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderIDforSupplierorderdetailsKeyPressed
      
    }//GEN-LAST:event_txtOrderIDforSupplierorderdetailsKeyPressed

    private void cmbOrderIDforSupplierorderdetailsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrderIDforSupplierorderdetailsItemStateChanged
       String orderid=cmbOrderIDforSupplierorderdetails.getSelectedItem().toString();
       txtOrderIDforSupplierorderdetails.setText(orderid);
    }//GEN-LAST:event_cmbOrderIDforSupplierorderdetailsItemStateChanged

    private void btnDeleteforSupplierorderdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteforSupplierorderdetailsActionPerformed
     
    }//GEN-LAST:event_btnDeleteforSupplierorderdetailsActionPerformed
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplierorderdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtothelistforSupplierorderdetails;
    private javax.swing.JButton btnCancelforSupplierorderdetails;
    private javax.swing.JButton btnDeleteforSupplierorderdetails;
    private javax.swing.JButton btnOrderforSupplierorderdetails;
    private javax.swing.JButton btnSearchforSupplierorderdetails;
    private javax.swing.JComboBox<String> cmbItemCodeforSupplierorderdetails;
    private javax.swing.JComboBox<String> cmbOrderIDforSupplierorderdetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCloseforSupplierorderdetails;
    private javax.swing.JLabel lblItemCodeforSupplierorderdetails;
    private javax.swing.JLabel lblItemNameforSupplierorderdetails;
    private javax.swing.JLabel lblMinimizeforSupplierorderdetails;
    private javax.swing.JLabel lblOrderIDforSupplierorderdetails;
    private javax.swing.JLabel lblQtyforSupplierorderdetails;
    private javax.swing.JLabel lblpic;
    private javax.swing.JPanel pnlLowerforSupplierorderdetails;
    private javax.swing.JPanel pnlUpperforSupplierorder;
    private javax.swing.JTable tblOrderlistforSupplierorderdetails;
    private javax.swing.JTextField txtCategoryforSupplierorderdetails;
    private javax.swing.JTextField txtCountryforSupplierorderdetails;
    private javax.swing.JTextField txtItemNameforSupplierorderdetails;
    private javax.swing.JTextField txtItembrandforSupplierorderdetails;
    public static javax.swing.JTextField txtOrderIDforSupplierorderdetails;
    private javax.swing.JTextField txtQtyforSupplierorderdetails;
    // End of variables declaration//GEN-END:variables

    private void loadorderid() {
        try {
            ArrayList<String>orderidlist=SupplierorderController.getallorderid();
            for(String oid:orderidlist){
                cmbOrderIDforSupplierorderdetails.addItem(oid);
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loaditemcode() {
        try {
            ArrayList<String>itemcodelist=ItemController.getAllitemcodes();
            for(String icd:itemcodelist){
            cmbItemCodeforSupplierorderdetails.addItem(icd);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void searchbyItemcode(){
           
        String itemcode=cmbItemCodeforSupplierorderdetails.getSelectedItem().toString();
//        txtOrderIDforSupplierorderdetails.setText(itemcode1);
//         String itemcode=txtOrderIDforSupplierorderdetails.getText();
        try {
            Item item=ItemController.searchitem(itemcode);
            String brandid=item.getBrandID();
            Itembrand itembrand=ItembrandController.searchitemBrand(brandid);
            txtItembrandforSupplierorderdetails.setText(itembrand.getBrand());
            txtItemNameforSupplierorderdetails.setText(item.getName());
            String categoryid=item.getCategoryID();
            Itemcategory itemcategory=ItemcategoryController.searchItemcategory(categoryid);
            txtCategoryforSupplierorderdetails.setText(itemcategory.getCategory());
            txtCountryforSupplierorderdetails.setText(itemcategory.getCountry());
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }   
        
        
        
    }
    private void protecter(){
        txtItembrandforSupplierorderdetails.setEditable(false);
        txtCategoryforSupplierorderdetails.setEditable(false);
         txtCountryforSupplierorderdetails.setEditable(false);
    }

    private void addtothetable() {
       String orderid=txtOrderIDforSupplierorderdetails.getText();
       String name=txtItemNameforSupplierorderdetails.getText();
       String itemcode=cmbItemCodeforSupplierorderdetails.getSelectedItem().toString();
       String itembrand=txtItembrandforSupplierorderdetails.getText();
       String category=txtCategoryforSupplierorderdetails.getText();
       String country=txtCountryforSupplierorderdetails.getText();
       double qty=Double.parseDouble(txtQtyforSupplierorderdetails.getText());
       
       DefaultTableModel dtm=(DefaultTableModel)tblOrderlistforSupplierorderdetails.getModel();
       Object [] rows={orderid,name,itemcode,itembrand,category,country,qty};
       //txtQtyforSupplierorderdetails.setText("0");
       dtm.addRow(rows);
    }

    private void check() {
         DefaultTableModel dtm = (DefaultTableModel) tblOrderlistforSupplierorderdetails.getModel();
        String txtitemcode = cmbItemCodeforSupplierorderdetails.getSelectedItem().toString();
        String txtorderid=txtOrderIDforSupplierorderdetails.getText();
        double txtqty = Double.parseDouble(txtQtyforSupplierorderdetails.getText());
        try {

            boolean isDuplicate = false;
            int row = 0;
            int i = 0;
            for (; i < dtm.getRowCount(); i++) {
                String tblitemcode = (String) dtm.getValueAt(i, 2);
                String tblorderid=(String) dtm.getValueAt(i,0);
                if (txtitemcode.equals(tblitemcode) & txtorderid.equals(tblorderid)) {
                    isDuplicate = true;
                    row = i;

                }
            }
            if (isDuplicate) {
                double tblqty = (double) dtm.getValueAt(row, 6);
                tblqty += txtqty;
                dtm.setValueAt(tblqty, row, 6);

            } else {
               addtothetable();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }


    
     
}
