package MainFrame;
import Model.*;
import Controller.ItemController;
import Controller.ItembrandController;
import Controller.ItemcategoryController;
import Controller.SupplierController;
import Controller.SupplierorderController;
import Controller.SupplierorderdetailsController;
import Model.Supplier;
import Model.Supplierorder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewOrders extends javax.swing.JFrame {

  
    public ViewOrders() {
        initComponents();
        setLocationRelativeTo(null);
        loadsuppliernames();
        Uneditable();
        condition();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCenterforVieworders = new javax.swing.JPanel();
        pnlOrdertblforVieworders = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderforVieworders = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelforVieworders = new javax.swing.JButton();
        btnRefreshforVieworders = new javax.swing.JButton();
        btnRemoveorderforVieworders = new javax.swing.JButton();
        btnUpdateforVieworders = new javax.swing.JButton();
        pnlSearchordersforVieworders = new javax.swing.JPanel();
        lblSupplernameforVieworder = new javax.swing.JLabel();
        cmbSuppliernameforVieworders = new javax.swing.JComboBox<>();
        btnSearchforVieworders = new javax.swing.JButton();
        pnlOrderdetailstblforVieworders = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderdetailsforVieworders = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBrandforVieworder = new javax.swing.JTextField();
        txtCategoryforVieworders = new javax.swing.JTextField();
        txtCountryforVieworder = new javax.swing.JTextField();
        btnRemoveorderdetailsforVieworders = new javax.swing.JButton();
        pnlUpperforVieworders = new javax.swing.JPanel();
        lblCloseforViewOrders = new javax.swing.JLabel();
        lblMinimizeforViewOrders = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlCenterforVieworders.setBackground(new java.awt.Color(153, 153, 255));
        pnlCenterforVieworders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pnlOrdertblforVieworders.setBackground(new java.awt.Color(153, 153, 255));
        pnlOrdertblforVieworders.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Order Table", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblOrderforVieworders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tblOrderforVieworders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Supplier ID", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderforVieworders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderforViewordersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrderforVieworders);

        javax.swing.GroupLayout pnlOrdertblforViewordersLayout = new javax.swing.GroupLayout(pnlOrdertblforVieworders);
        pnlOrdertblforVieworders.setLayout(pnlOrdertblforViewordersLayout);
        pnlOrdertblforViewordersLayout.setHorizontalGroup(
            pnlOrdertblforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdertblforViewordersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlOrdertblforViewordersLayout.setVerticalGroup(
            pnlOrdertblforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrdertblforViewordersLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnCancelforVieworders.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelforVieworders.setText("Cancel");
        btnCancelforVieworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelforViewordersActionPerformed(evt);
            }
        });

        btnRefreshforVieworders.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshforVieworders.setText("Refresh Table");
        btnRefreshforVieworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshforViewordersActionPerformed(evt);
            }
        });

        btnRemoveorderforVieworders.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveorderforVieworders.setText("Remove Order");
        btnRemoveorderforVieworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveorderforViewordersActionPerformed(evt);
            }
        });

        btnUpdateforVieworders.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateforVieworders.setText("Update");
        btnUpdateforVieworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateforViewordersActionPerformed(evt);
            }
        });

        pnlSearchordersforVieworders.setBackground(new java.awt.Color(153, 153, 255));
        pnlSearchordersforVieworders.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Search Orders", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblSupplernameforVieworder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSupplernameforVieworder.setText("Supplier Name");

        cmbSuppliernameforVieworders.setEditable(true);
        cmbSuppliernameforVieworders.setToolTipText("Type or select Supplier Name");

        btnSearchforVieworders.setBackground(new java.awt.Color(153, 153, 255));
        btnSearchforVieworders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/search-icon.png"))); // NOI18N
        btnSearchforVieworders.setToolTipText("Search");
        btnSearchforVieworders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnSearchforVieworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchforViewordersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchordersforViewordersLayout = new javax.swing.GroupLayout(pnlSearchordersforVieworders);
        pnlSearchordersforVieworders.setLayout(pnlSearchordersforViewordersLayout);
        pnlSearchordersforViewordersLayout.setHorizontalGroup(
            pnlSearchordersforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchordersforViewordersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSupplernameforVieworder)
                .addGap(18, 18, 18)
                .addComponent(cmbSuppliernameforVieworders, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchforVieworders, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSearchordersforViewordersLayout.setVerticalGroup(
            pnlSearchordersforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchordersforViewordersLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlSearchordersforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplernameforVieworder)
                    .addComponent(cmbSuppliernameforVieworders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchordersforViewordersLayout.createSequentialGroup()
                .addComponent(btnSearchforVieworders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlOrderdetailstblforVieworders.setBackground(new java.awt.Color(153, 153, 255));
        pnlOrderdetailstblforVieworders.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Order Details", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblOrderdetailsforVieworders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tblOrderdetailsforVieworders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Item Code", "QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblOrderdetailsforVieworders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderdetailsforViewordersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOrderdetailsforVieworders);

        jLabel1.setText("Brand");

        jLabel2.setText("Category");

        jLabel3.setText("Country");

        txtBrandforVieworder.setToolTipText("Brand");

        txtCategoryforVieworders.setToolTipText("Category");

        txtCountryforVieworder.setToolTipText("Country");

        javax.swing.GroupLayout pnlOrderdetailstblforViewordersLayout = new javax.swing.GroupLayout(pnlOrderdetailstblforVieworders);
        pnlOrderdetailstblforVieworders.setLayout(pnlOrderdetailstblforViewordersLayout);
        pnlOrderdetailstblforViewordersLayout.setHorizontalGroup(
            pnlOrderdetailstblforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderdetailstblforViewordersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlOrderdetailstblforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(pnlOrderdetailstblforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBrandforVieworder)
                    .addComponent(txtCategoryforVieworders)
                    .addComponent(txtCountryforVieworder, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOrderdetailstblforViewordersLayout.setVerticalGroup(
            pnlOrderdetailstblforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderdetailstblforViewordersLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlOrderdetailstblforViewordersLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlOrderdetailstblforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBrandforVieworder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(pnlOrderdetailstblforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCategoryforVieworders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(pnlOrderdetailstblforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCountryforVieworder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        btnRemoveorderdetailsforVieworders.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveorderdetailsforVieworders.setText("Remove Order Detail");
        btnRemoveorderdetailsforVieworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveorderdetailsforViewordersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCenterforViewordersLayout = new javax.swing.GroupLayout(pnlCenterforVieworders);
        pnlCenterforVieworders.setLayout(pnlCenterforViewordersLayout);
        pnlCenterforViewordersLayout.setHorizontalGroup(
            pnlCenterforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterforViewordersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenterforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchordersforVieworders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterforViewordersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdateforVieworders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveorderdetailsforVieworders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveorderforVieworders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefreshforVieworders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelforVieworders))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterforViewordersLayout.createSequentialGroup()
                        .addComponent(pnlOrdertblforVieworders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlOrderdetailstblforVieworders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlCenterforViewordersLayout.setVerticalGroup(
            pnlCenterforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterforViewordersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSearchordersforVieworders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCenterforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOrdertblforVieworders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOrderdetailstblforVieworders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCenterforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRefreshforVieworders)
                        .addComponent(btnRemoveorderforVieworders)
                        .addComponent(btnUpdateforVieworders)
                        .addComponent(btnRemoveorderdetailsforVieworders))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterforViewordersLayout.createSequentialGroup()
                        .addComponent(btnCancelforVieworders)
                        .addContainerGap())))
        );

        pnlUpperforVieworders.setBackground(new java.awt.Color(153, 153, 255));
        pnlUpperforVieworders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlUpperforVieworders.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlUpperforViewordersMouseDragged(evt);
            }
        });
        pnlUpperforVieworders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlUpperforViewordersMousePressed(evt);
            }
        });

        lblCloseforViewOrders.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCloseforViewOrders.setForeground(new java.awt.Color(204, 0, 51));
        lblCloseforViewOrders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseforViewOrders.setText("X");
        lblCloseforViewOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseforViewOrdersMouseClicked(evt);
            }
        });

        lblMinimizeforViewOrders.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimizeforViewOrders.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizeforViewOrders.setText("-");
        lblMinimizeforViewOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeforViewOrdersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlUpperforViewordersLayout = new javax.swing.GroupLayout(pnlUpperforVieworders);
        pnlUpperforVieworders.setLayout(pnlUpperforViewordersLayout);
        pnlUpperforViewordersLayout.setHorizontalGroup(
            pnlUpperforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpperforViewordersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizeforViewOrders)
                .addGap(18, 18, 18)
                .addComponent(lblCloseforViewOrders)
                .addContainerGap())
        );
        pnlUpperforViewordersLayout.setVerticalGroup(
            pnlUpperforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpperforViewordersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUpperforViewordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCloseforViewOrders)
                    .addComponent(lblMinimizeforViewOrders))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCenterforVieworders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlUpperforVieworders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlUpperforVieworders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCenterforVieworders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelforViewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelforViewordersActionPerformed
//       Additionalmainframe aditionalmainframe=new Additionalmainframe();
//       aditionalmainframe.setVisible(true);
//       Additionalmainframe.setPanel();
//       pnlManageOrders manageorder=new pnlManageOrders();
//       aditionalmainframe.pnlShowforAdditionalmainframe.add(manageorder);
        this.hide();
    }//GEN-LAST:event_btnCancelforViewordersActionPerformed

    private void lblCloseforViewOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseforViewOrdersMouseClicked
      this.hide();
    }//GEN-LAST:event_lblCloseforViewOrdersMouseClicked

    private void lblMinimizeforViewOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeforViewOrdersMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeforViewOrdersMouseClicked
    int pX,pY;
    private void pnlUpperforViewordersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpperforViewordersMousePressed
        pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_pnlUpperforViewordersMousePressed

    private void pnlUpperforViewordersMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpperforViewordersMouseDragged
        setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_pnlUpperforViewordersMouseDragged

    private void btnRefreshforViewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshforViewordersActionPerformed
         txtCountryforVieworder.setText("");
         txtCategoryforVieworders.setText("");
         txtBrandforVieworder.setText("");
        DefaultTableModel dtm=(DefaultTableModel)tblOrderforVieworders.getModel();
        try {
            Supplierorder [] od=SupplierorderController.showsupplierorder();
            dtm.setRowCount(0);
            for(Supplierorder s:od){
                Object [] row={s.getOrderID(),s.getSupplierID(),s.getDate()};
                dtm.addRow(row);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnRefreshforViewordersActionPerformed

    private void btnRemoveorderforViewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveorderforViewordersActionPerformed
       DefaultTableModel dtm1=(DefaultTableModel)tblOrderforVieworders.getModel();
       int row=tblOrderforVieworders.getSelectedRow();
       if(row<0){
              JOptionPane.showMessageDialog(null,"Please select a row");
       }else{
       deleteorder();
       }
    }//GEN-LAST:event_btnRemoveorderforViewordersActionPerformed

    private void btnUpdateforViewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateforViewordersActionPerformed
       updateorder();
       
    }//GEN-LAST:event_btnUpdateforViewordersActionPerformed

    private void btnSearchforViewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchforViewordersActionPerformed
        searchItems();
    }//GEN-LAST:event_btnSearchforViewordersActionPerformed

    private void tblOrderforViewordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderforViewordersMouseClicked
        showorderdetails();
    }//GEN-LAST:event_tblOrderforViewordersMouseClicked

    private void tblOrderdetailsforViewordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderdetailsforViewordersMouseClicked
        showinfo();
    }//GEN-LAST:event_tblOrderdetailsforViewordersMouseClicked

    private void btnRemoveorderdetailsforViewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveorderdetailsforViewordersActionPerformed
      deleteorderdetails() ;
    }//GEN-LAST:event_btnRemoveorderdetailsforViewordersActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelforVieworders;
    private javax.swing.JButton btnRefreshforVieworders;
    private javax.swing.JButton btnRemoveorderdetailsforVieworders;
    private javax.swing.JButton btnRemoveorderforVieworders;
    private javax.swing.JButton btnSearchforVieworders;
    private javax.swing.JButton btnUpdateforVieworders;
    private javax.swing.JComboBox<String> cmbSuppliernameforVieworders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCloseforViewOrders;
    private javax.swing.JLabel lblMinimizeforViewOrders;
    private javax.swing.JLabel lblSupplernameforVieworder;
    private javax.swing.JPanel pnlCenterforVieworders;
    private javax.swing.JPanel pnlOrderdetailstblforVieworders;
    private javax.swing.JPanel pnlOrdertblforVieworders;
    private javax.swing.JPanel pnlSearchordersforVieworders;
    private javax.swing.JPanel pnlUpperforVieworders;
    private javax.swing.JTable tblOrderdetailsforVieworders;
    private javax.swing.JTable tblOrderforVieworders;
    private javax.swing.JTextField txtBrandforVieworder;
    private javax.swing.JTextField txtCategoryforVieworders;
    private javax.swing.JTextField txtCountryforVieworder;
    // End of variables declaration//GEN-END:variables

    private void searchorderbysuppliername() {
        boolean isenable=false;
        String Suppliernamecmb=cmbSuppliernameforVieworders.getSelectedItem().toString();
       
        
    }
    private void loadsuppliernames(){
        try {
            ArrayList<String>Suppliername=SupplierController.getSuppliername();
            for(String sn:Suppliername){
            cmbSuppliernameforVieworders.addItem(sn);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void searchItems(){
        String Suppliername=cmbSuppliernameforVieworders.getSelectedItem().toString();
        DefaultTableModel dtm=(DefaultTableModel)tblOrderforVieworders.getModel();
        try {
            Supplier sid=SupplierController.getsupplieridbyname(Suppliername);
            Supplierorder [] so=SupplierorderController.searchbyname(sid.getSupplierID());
            dtm.setRowCount(0);
            for(Supplierorder s:so){
            Object [] row={s.getOrderID(),s.getSupplierID(),s.getDate()};
            dtm.addRow(row);
            }
//        Supplierorderdetails [] sod=SupplierorderdetailsController.searchbysuppliername(Suppliername);
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void showorderdetails(){
         DefaultTableModel dtm=(DefaultTableModel)tblOrderforVieworders.getModel();
        DefaultTableModel dtm2=(DefaultTableModel)tblOrderdetailsforVieworders.getModel();
        int row=tblOrderforVieworders.getSelectedRow();
        String orderid=(String) dtm.getValueAt(row,0);
        try {
            Supplierorderdetail[] sod=SupplierorderdetailsController.searchdetails(orderid);
            dtm2.setRowCount(0);
            for(Supplierorderdetail s:sod){
            Object [] rows={s.getOrderid(),s.getItemcode(),s.getQty()};
            dtm2.addRow(rows);
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
                   
    private void showinfo() {
        DefaultTableModel dtm=(DefaultTableModel)tblOrderdetailsforVieworders.getModel();
        int index=tblOrderdetailsforVieworders.getSelectedRow();
        String itemcode=(String) dtm.getValueAt(index,1);
        try {
            Item item=ItemController.searchbyitemcode(itemcode);
            if(item!=null){
            String brandid=item.getBrandID();
            Itembrand itembrand=ItembrandController.searchitemBrand(brandid);
            if(itembrand!=null){
            txtBrandforVieworder.setText(itembrand.getBrand());
            Itemcategory itemcategory=ItemcategoryController.searchItemcategory(item.getCategoryID());
            if(itemcategory!=null){
                txtCategoryforVieworders.setText(itemcategory.getCategory());
                txtCountryforVieworder.setText(itemcategory.getCountry());
            }
            }
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void Uneditable() {
                    txtCountryforVieworder.setEditable(false);
                    txtCategoryforVieworders.setEditable(false);
                    txtBrandforVieworder.setEditable(false);
    }

    private void condition() {
         DefaultTableModel dtm2=(DefaultTableModel)tblOrderdetailsforVieworders.getModel();
         int row=tblOrderdetailsforVieworders.getRowCount();
         if(row<0){
              txtCountryforVieworder.setText("");
              txtCategoryforVieworders.setText("");
               txtBrandforVieworder.setText("");
         }
    }
    private void deleteorder(){
         DefaultTableModel dtm4=(DefaultTableModel)tblOrderforVieworders.getModel();
        int row=tblOrderforVieworders.getSelectedRow();
        if(row<=0){
        JOptionPane.showMessageDialog(null,"Please select a row");
        }else{
        String orderid=(String) dtm4.getValueAt(row, 0);
        try {
            boolean ISorderdeleted=SupplierorderController.deleteholeorder(orderid);
            if(ISorderdeleted){
            JOptionPane.showMessageDialog(null,"Supplier Order deleted...");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot delete Supplierorder...");
            }
        } catch (SQLException | ClassNotFoundException |ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
    }
    private void updateorder(){
    DefaultTableModel dtm1=(DefaultTableModel)tblOrderforVieworders.getModel();
    int row=tblOrderforVieworders.getSelectedRow();
    DefaultTableModel dtm2=(DefaultTableModel)tblOrderdetailsforVieworders.getModel();
    int row1=tblOrderdetailsforVieworders.getRowCount();
    if(row<=0 | row1<=0){
        JOptionPane.showMessageDialog(null,"Please select The row that you want to update...");
    }else{
    String orderid=(String) dtm1.getValueAt(row,0);
    String Supplierid=(String) dtm1.getValueAt(row, 1);
    String Date=(String) dtm1.getValueAt(row,2);
    Supplierorder supplierorder=new Supplierorder(orderid,Supplierid,Date);
    
    String orderid2=(String) dtm2.getValueAt(row1,0);
     String itemcode=(String) dtm2.getValueAt(row1,1);
     double qty=(double) dtm2.getValueAt(row1,2);
     Supplierorderdetail supplierorderdetails=new Supplierorderdetail(orderid2,itemcode,qty);
     
        try {
            boolean IsUpdate=SupplierorderController.updateorder(supplierorder,supplierorderdetails);
            if(IsUpdate){
            JOptionPane.showMessageDialog(null,"Order is updated...");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot update order...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    }
    private void deleteorderdetails() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrderdetailsforVieworders.getModel();
        int row=tblOrderdetailsforVieworders.getSelectedRow();
        if(row<=0){
        JOptionPane.showMessageDialog(null,"Please select the row that you want't to Delete");
        }else{
        String orderid=(String) dtm.getValueAt(row,0);
        String itemcode=(String) dtm.getValueAt(row,1);
        try {
            boolean Isdeleted=SupplierorderdetailsController.deleteorder(orderid,itemcode);
            if(Isdeleted){
            JOptionPane.showMessageDialog(null,"Supplier order details deleted...");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot delete supplier order details...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
    }
}
