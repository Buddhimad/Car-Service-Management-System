package MainFrame;

import Controller.ItemController;
import Controller.ItembrandController;
import Controller.ItemcategoryController;
import Controller.SupplierorderController;
import Model.Item;
import Model.Itembrand;
import Model.Itemcategory;
import Validation.Stockloadervalidation;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pnlStockLoader extends javax.swing.JPanel {

    public pnlStockLoader() {
        initComponents();
        loaditemcode();
        loadorderID();
        txtCurrentitemqtyforpnlStockloader.setEditable(false);
        loadtable2();
         txtNameforpnlStockLoader.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddeditemtable = new javax.swing.JTable();
        btnRefreshitemtableforpnlStockloader = new javax.swing.JButton();
        btnDeleteforpnlStockloader = new javax.swing.JButton();
        btnRemoveitemfromstockforpnlStockLoader = new javax.swing.JButton();
        btnUpdateforpnlStockloader = new javax.swing.JButton();
        btnSearchforpnlStockloader = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblItemforpnlStockLoader = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtMCountryforpnlStockloader = new javax.swing.JTextField();
        cmbOrderIDforpnlStockloader = new javax.swing.JComboBox<>();
        txtItemqtyforpnlStockloader = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDiscountforpnlStockloader = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbItemCodeforpnlStockLoader = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPriceforpnlStockloader = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtItembrandforpnlStockloader = new javax.swing.JTextField();
        txtItembrand1forpnlStockloader = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCategoryforpnlStockloader = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCurrentitemqtyforpnlStockloader = new javax.swing.JTextField();
        txtNameforpnlStockLoader = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        btnAddforpnlStockLoader = new javax.swing.JButton();
        btnRemoverowforpnlStockloader = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Add new Items into Stock", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Added Item Table", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblAddeditemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Batch No", "Brand", "Category", "M.Country", "Order ID", "Item QTY", "QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAddeditemtable);

        btnRefreshitemtableforpnlStockloader.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshitemtableforpnlStockloader.setText("Refresh Item Table");
        btnRefreshitemtableforpnlStockloader.setToolTipText("Refresh Item table");
        btnRefreshitemtableforpnlStockloader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshitemtableforpnlStockloaderActionPerformed(evt);
            }
        });

        btnDeleteforpnlStockloader.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteforpnlStockloader.setText("Delete");
        btnDeleteforpnlStockloader.setToolTipText("Delete Item");
        btnDeleteforpnlStockloader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteforpnlStockloaderActionPerformed(evt);
            }
        });

        btnRemoveitemfromstockforpnlStockLoader.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoveitemfromstockforpnlStockLoader.setText("-");
        btnRemoveitemfromstockforpnlStockLoader.setToolTipText("Low Item Quantity");
        btnRemoveitemfromstockforpnlStockLoader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveitemfromstockforpnlStockLoaderActionPerformed(evt);
            }
        });

        btnUpdateforpnlStockloader.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateforpnlStockloader.setText("Update");
        btnUpdateforpnlStockloader.setToolTipText("Update Order");
        btnUpdateforpnlStockloader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateforpnlStockloaderActionPerformed(evt);
            }
        });

        btnSearchforpnlStockloader.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchforpnlStockloader.setText("Search");
        btnSearchforpnlStockloader.setToolTipText("Search Item using Name");
        btnSearchforpnlStockloader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchforpnlStockloaderActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/1469913581_delivery.png"))); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Show Items", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblItemforpnlStockLoader.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Show Items", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        tblItemforpnlStockLoader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Code", "Batch No", "Brand ID", "Category ID", "Name", "Quantity", "Discount", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblItemforpnlStockLoader);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        txtMCountryforpnlStockloader.setToolTipText("Manufactured Country");
        txtMCountryforpnlStockloader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtMCountryforpnlStockloader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMCountryforpnlStockloaderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMCountryforpnlStockloaderKeyTyped(evt);
            }
        });

        cmbOrderIDforpnlStockloader.setToolTipText("Select Order ID");
        cmbOrderIDforpnlStockloader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbOrderIDforpnlStockloader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbOrderIDforpnlStockloaderKeyPressed(evt);
            }
        });

        txtItemqtyforpnlStockloader.setToolTipText("Newly added Quantity");
        txtItemqtyforpnlStockloader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtItemqtyforpnlStockloader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItemqtyforpnlStockloaderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtItemqtyforpnlStockloaderKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Discount");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Select Item Code");

        txtDiscountforpnlStockloader.setToolTipText("Givien Discount");
        txtDiscountforpnlStockloader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtDiscountforpnlStockloader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiscountforpnlStockloaderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountforpnlStockloaderKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Item Brand");

        cmbItemCodeforpnlStockLoader.setToolTipText("Select Item Code");
        cmbItemCodeforpnlStockLoader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbItemCodeforpnlStockLoader.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemCodeforpnlStockLoaderItemStateChanged(evt);
            }
        });
        cmbItemCodeforpnlStockLoader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbItemCodeforpnlStockLoaderKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Batch No");

        txtPriceforpnlStockloader.setToolTipText("Given Price");
        txtPriceforpnlStockloader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtPriceforpnlStockloader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceforpnlStockloaderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceforpnlStockloaderKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Item Category");

        txtItembrandforpnlStockloader.setToolTipText("Batch No");
        txtItembrandforpnlStockloader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtItembrandforpnlStockloader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItembrandforpnlStockloaderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtItembrandforpnlStockloaderKeyTyped(evt);
            }
        });

        txtItembrand1forpnlStockloader.setToolTipText("Item Brand");
        txtItembrand1forpnlStockloader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtItembrand1forpnlStockloader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItembrand1forpnlStockloaderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtItembrand1forpnlStockloaderKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Manufactured Country");

        txtCategoryforpnlStockloader.setToolTipText("Item Category");
        txtCategoryforpnlStockloader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtCategoryforpnlStockloader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCategoryforpnlStockloaderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoryforpnlStockloaderKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Select Order ID");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Current Item Quantity");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Item Quantity");

        txtCurrentitemqtyforpnlStockloader.setToolTipText("Current Item Quantity ");
        txtCurrentitemqtyforpnlStockloader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtCurrentitemqtyforpnlStockloader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCurrentitemqtyforpnlStockloaderKeyPressed(evt);
            }
        });

        txtNameforpnlStockLoader.setToolTipText("Item Name");
        txtNameforpnlStockLoader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtNameforpnlStockLoader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameforpnlStockLoaderKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameforpnlStockLoaderKeyTyped(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Stock Manager");
        jButton6.setToolTipText("Go to Stock Manager");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnAddforpnlStockLoader.setBackground(new java.awt.Color(255, 255, 255));
        btnAddforpnlStockLoader.setText("+");
        btnAddforpnlStockLoader.setToolTipText("Add  new Items");
        btnAddforpnlStockLoader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddforpnlStockLoaderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNameforpnlStockLoader)
                                    .addComponent(cmbItemCodeforpnlStockLoader, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtItembrandforpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItembrand1forpnlStockloader)
                                    .addComponent(txtCategoryforpnlStockloader)
                                    .addComponent(txtMCountryforpnlStockloader, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbOrderIDforpnlStockloader, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtItemqtyforpnlStockloader)
                                    .addComponent(txtCurrentitemqtyforpnlStockloader))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDiscountforpnlStockloader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriceforpnlStockloader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddforpnlStockLoader)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameforpnlStockLoader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbItemCodeforpnlStockLoader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItembrandforpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItembrand1forpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoryforpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMCountryforpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrderIDforpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiscountforpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPriceforpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemqtyforpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurrentitemqtyforpnlStockloader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 35, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(btnAddforpnlStockLoader))
                .addContainerGap())
        );

        btnRemoverowforpnlStockloader.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoverowforpnlStockloader.setText("- Row");
        btnRemoverowforpnlStockloader.setToolTipText("Remove a row");
        btnRemoverowforpnlStockloader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverowforpnlStockloaderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearchforpnlStockloader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveitemfromstockforpnlStockLoader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoverowforpnlStockloader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnUpdateforpnlStockloader)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteforpnlStockloader)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefreshitemtableforpnlStockloader))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSearchforpnlStockloader)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemoveitemfromstockforpnlStockLoader)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemoverowforpnlStockloader)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefreshitemtableforpnlStockloader)
                            .addComponent(btnDeleteforpnlStockloader)
                            .addComponent(btnUpdateforpnlStockloader)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        StockManager stockmanager = new StockManager();
        stockmanager.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnSearchforpnlStockloaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchforpnlStockloaderActionPerformed
        String name = txtNameforpnlStockLoader.getText();
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) cmbItemCodeforpnlStockLoader.getModel();
        try {
            ArrayList<String> ino = ItemController.getItemcode(name);
            dcm.removeAllElements();
            ino.stream().forEach((i) -> {
                dcm.addElement(i);
            });
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSearchforpnlStockloaderActionPerformed

    private void btnAddforpnlStockLoaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddforpnlStockLoaderActionPerformed
//      loadtable();
            boolean istxtfill=checktxt();
            if(istxtfill){
        if (txtItemqtyforpnlStockloader.getText().length() <= 0) {
//            JOptionPane.showMessageDialog(null, "Please Enter Item Qty that you want  add to the Stock");

        } else {
            check();
            loaditemstostock();
            addtothecurrentitemqtywhentheaddbuttonclick();
        }
            }else{
            JOptionPane.showMessageDialog(null,"Please fill all the Text Fields...");
            }
    }//GEN-LAST:event_btnAddforpnlStockLoaderActionPerformed

    private void btnRemoveitemfromstockforpnlStockLoaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveitemfromstockforpnlStockLoaderActionPerformed
        deleteitemfromstock();
    }//GEN-LAST:event_btnRemoveitemfromstockforpnlStockLoaderActionPerformed

    private void btnUpdateforpnlStockloaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateforpnlStockloaderActionPerformed
        Updateitemdatabase();
    }//GEN-LAST:event_btnUpdateforpnlStockloaderActionPerformed

    private void cmbItemCodeforpnlStockLoaderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemCodeforpnlStockLoaderItemStateChanged
        String id = cmbItemCodeforpnlStockLoader.getSelectedItem().toString();
        try {
            Item item = ItemController.searchitem(id);
            if (item != null) {
                txtCurrentitemqtyforpnlStockloader.setText(Double.toString(item.getQty()));
               txtItembrandforpnlStockloader.setText(item.getBatchno());
                txtDiscountforpnlStockloader.setText(Double.toString(item.getDiscount()));
                txtPriceforpnlStockloader.setText(Double.toString(item.getPrice()));
                txtNameforpnlStockLoader.setText(item.getName());
                Itembrand ib = ItembrandController.searchitemBrand(item.getBrandID());
                Itemcategory ic = ItemcategoryController.searchItemcategory(item.getCategoryID());

                if (ib != null) {
                   txtItembrand1forpnlStockloader.setText(ib.getBrand());
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot find brand..");
                }
                if (ic != null) {
                    txtCategoryforpnlStockloader.setText(ic.getCategory());
                    txtMCountryforpnlStockloader.setText(ic.getCountry());
                } else {
                    JOptionPane.showMessageDialog(null, "cannot find...");
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbItemCodeforpnlStockLoaderItemStateChanged

    private void btnRefreshitemtableforpnlStockloaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshitemtableforpnlStockloaderActionPerformed
        loadtable2();
    }//GEN-LAST:event_btnRefreshitemtableforpnlStockloaderActionPerformed

    private void btnDeleteforpnlStockloaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteforpnlStockloaderActionPerformed
        deleteitem();
    }//GEN-LAST:event_btnDeleteforpnlStockloaderActionPerformed

    private void btnRemoverowforpnlStockloaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverowforpnlStockloaderActionPerformed
      DefaultTableModel dtm=(DefaultTableModel)tblAddeditemtable.getModel();
      int index=tblAddeditemtable.getSelectedRow();
      if(index<0){
      JOptionPane.showMessageDialog(null,"Please select a row");
      }else{
      dtm.removeRow(index);
      }
    }//GEN-LAST:event_btnRemoverowforpnlStockloaderActionPerformed

    private void txtNameforpnlStockLoaderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameforpnlStockLoaderKeyTyped
      Stockloadervalidation.checkname(evt);
    }//GEN-LAST:event_txtNameforpnlStockLoaderKeyTyped

    private void txtItembrandforpnlStockloaderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItembrandforpnlStockloaderKeyTyped
       
        
    }//GEN-LAST:event_txtItembrandforpnlStockloaderKeyTyped

    private void txtItembrand1forpnlStockloaderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItembrand1forpnlStockloaderKeyTyped
        Stockloadervalidation.checkbrand(evt);
    }//GEN-LAST:event_txtItembrand1forpnlStockloaderKeyTyped

    private void txtCategoryforpnlStockloaderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoryforpnlStockloaderKeyTyped
        Stockloadervalidation.checkcategory(evt);
    }//GEN-LAST:event_txtCategoryforpnlStockloaderKeyTyped

    private void txtMCountryforpnlStockloaderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMCountryforpnlStockloaderKeyTyped
        Stockloadervalidation.checkmanufacturedcuntry(evt);
    }//GEN-LAST:event_txtMCountryforpnlStockloaderKeyTyped

    private void txtDiscountforpnlStockloaderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountforpnlStockloaderKeyTyped
        Stockloadervalidation.checkdiscount(evt);
    }//GEN-LAST:event_txtDiscountforpnlStockloaderKeyTyped

    private void txtPriceforpnlStockloaderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceforpnlStockloaderKeyTyped
        Stockloadervalidation.checkprice(evt);
    }//GEN-LAST:event_txtPriceforpnlStockloaderKeyTyped

    private void txtItemqtyforpnlStockloaderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemqtyforpnlStockloaderKeyTyped
        Stockloadervalidation.checkitemqty(evt);
    }//GEN-LAST:event_txtItemqtyforpnlStockloaderKeyTyped

    private void txtNameforpnlStockLoaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameforpnlStockLoaderKeyPressed
      if(evt.getKeyChar()==KeyEvent.VK_ENTER){
       cmbItemCodeforpnlStockLoader.grabFocus();
      }
    }//GEN-LAST:event_txtNameforpnlStockLoaderKeyPressed

    private void cmbItemCodeforpnlStockLoaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbItemCodeforpnlStockLoaderKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
      txtItembrandforpnlStockloader.grabFocus();
      }
    }//GEN-LAST:event_cmbItemCodeforpnlStockLoaderKeyPressed

    private void txtItembrandforpnlStockloaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItembrandforpnlStockloaderKeyPressed
       if(evt.getKeyChar()==KeyEvent.VK_ENTER){
           String batchno=txtItembrandforpnlStockloader.getText();
        Stockloadervalidation.checkbatchno(batchno);
        boolean ischeckedbatch=Stockloadervalidation.checkbatchno(batchno);
        if(ischeckedbatch){
      txtItembrand1forpnlStockloader.grabFocus();
        }else{
        JOptionPane.showMessageDialog(null,"Invalid Batchno");
        }
        }
        
    }//GEN-LAST:event_txtItembrandforpnlStockloaderKeyPressed

    private void txtItembrand1forpnlStockloaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItembrand1forpnlStockloaderKeyPressed
       if(evt.getKeyChar()==KeyEvent.VK_ENTER){
      txtCategoryforpnlStockloader.grabFocus();
      }
    }//GEN-LAST:event_txtItembrand1forpnlStockloaderKeyPressed

    private void txtCategoryforpnlStockloaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoryforpnlStockloaderKeyPressed
       if(evt.getKeyChar()==KeyEvent.VK_ENTER){
      txtMCountryforpnlStockloader.grabFocus();
      }
    }//GEN-LAST:event_txtCategoryforpnlStockloaderKeyPressed

    private void txtMCountryforpnlStockloaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMCountryforpnlStockloaderKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
      cmbOrderIDforpnlStockloader.grabFocus();
      }
    }//GEN-LAST:event_txtMCountryforpnlStockloaderKeyPressed

    private void cmbOrderIDforpnlStockloaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbOrderIDforpnlStockloaderKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
      txtDiscountforpnlStockloader.grabFocus();
      }
    }//GEN-LAST:event_cmbOrderIDforpnlStockloaderKeyPressed

    private void txtDiscountforpnlStockloaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountforpnlStockloaderKeyPressed
         if(evt.getKeyChar()==KeyEvent.VK_ENTER){
      txtPriceforpnlStockloader.grabFocus();
      }
    }//GEN-LAST:event_txtDiscountforpnlStockloaderKeyPressed

    private void txtPriceforpnlStockloaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceforpnlStockloaderKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
      txtItemqtyforpnlStockloader.grabFocus();
      }
    }//GEN-LAST:event_txtPriceforpnlStockloaderKeyPressed

    private void txtItemqtyforpnlStockloaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemqtyforpnlStockloaderKeyPressed
     if(evt.getKeyChar()==KeyEvent.VK_ENTER){
      btnAddforpnlStockLoader.grabFocus();
      }
    }//GEN-LAST:event_txtItemqtyforpnlStockloaderKeyPressed

    private void txtCurrentitemqtyforpnlStockloaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurrentitemqtyforpnlStockloaderKeyPressed
       if(evt.getKeyChar()==KeyEvent.VK_ENTER){
      txtNameforpnlStockLoader.grabFocus();
      }
    }//GEN-LAST:event_txtCurrentitemqtyforpnlStockloaderKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddforpnlStockLoader;
    private javax.swing.JButton btnDeleteforpnlStockloader;
    private javax.swing.JButton btnRefreshitemtableforpnlStockloader;
    private javax.swing.JButton btnRemoveitemfromstockforpnlStockLoader;
    private javax.swing.JButton btnRemoverowforpnlStockloader;
    private javax.swing.JButton btnSearchforpnlStockloader;
    private javax.swing.JButton btnUpdateforpnlStockloader;
    private javax.swing.JComboBox<String> cmbItemCodeforpnlStockLoader;
    private javax.swing.JComboBox<String> cmbOrderIDforpnlStockloader;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblAddeditemtable;
    private javax.swing.JTable tblItemforpnlStockLoader;
    private javax.swing.JTextField txtCategoryforpnlStockloader;
    private javax.swing.JTextField txtCurrentitemqtyforpnlStockloader;
    private javax.swing.JTextField txtDiscountforpnlStockloader;
    private javax.swing.JTextField txtItembrand1forpnlStockloader;
    private javax.swing.JTextField txtItembrandforpnlStockloader;
    private javax.swing.JTextField txtItemqtyforpnlStockloader;
    private javax.swing.JTextField txtMCountryforpnlStockloader;
    private javax.swing.JTextField txtNameforpnlStockLoader;
    private javax.swing.JTextField txtPriceforpnlStockloader;
    // End of variables declaration//GEN-END:variables

    private void loaditemcode() {
        try {
            ArrayList<String> itemcodes = ItemController.getAllitemcodes();
            for (String i : itemcodes) {
                cmbItemCodeforpnlStockLoader.addItem(i);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loadorderID() {
        try {
            ArrayList<String> list = SupplierorderController.getallorderid();
            for (String l : list) {
                cmbOrderIDforpnlStockloader.addItem(l);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loadtable() {
        DefaultTableModel dtm2 = (DefaultTableModel) tblAddeditemtable.getModel();
        int row = tblAddeditemtable.getSelectedRow();

        String itemcode = cmbItemCodeforpnlStockLoader.getSelectedItem().toString();
        String batchno = txtItembrandforpnlStockloader.getText();
        String itembrand =  txtItembrand1forpnlStockloader.getText();
        String itemcategory = txtCategoryforpnlStockloader.getText();
        String manufacturedcountry = txtMCountryforpnlStockloader.getText();
        String orderid = cmbOrderIDforpnlStockloader.getSelectedItem().toString();
        double qty = Double.parseDouble(txtItemqtyforpnlStockloader.getText());

        Object[] row1 = {itemcode, batchno, itembrand, itemcategory, manufacturedcountry, orderid, qty, qty};
        dtm2.addRow(row1);

    }

    private void check() {

        DefaultTableModel dtm = (DefaultTableModel) tblAddeditemtable.getModel();
        String txtitemcode = cmbItemCodeforpnlStockLoader.getSelectedItem().toString().trim();
        double txtqty = Double.parseDouble(txtItemqtyforpnlStockloader.getText());
        try {

            boolean isDuplicate = false;
            int row = 0;
            int i = 0;
            for (; i < dtm.getRowCount(); i++) {
                String tblitemcode = (String) dtm.getValueAt(i, 0);
                if (txtitemcode.equals(tblitemcode)) {
                    isDuplicate = true;
                    row = i;

                }
            }
            if (isDuplicate) {
                double tblqty = (double) dtm.getValueAt(row, 6);
                tblqty += txtqty;
                dtm.setValueAt(tblqty, row, 6);

            } else {
                loadtable();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

//    private void Checkqty() {
//       if(txtItemqtyforpnlStockloader.getText().equals(" ")){
//           JOptionPane.showMessageDialog(null,"Enter qty");
//       }
    private void loaditemstostock() {
        String itemcode = cmbItemCodeforpnlStockLoader.getSelectedItem().toString().trim();
        double qty = Double.parseDouble(txtItemqtyforpnlStockloader.getText());
        try {
            boolean IsAdded = ItemController.addItems(itemcode, qty);
            if (IsAdded) {
//            JOptionPane.showMessageDialog(null,"Item add to the Stock...");
            } else {
                JOptionPane.showMessageDialog(null, "Can't add to the stock please check details & try again!");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    private void deleteitemfromstock() {
        DefaultTableModel dtm = (DefaultTableModel) tblAddeditemtable.getModel();
        int row = tblAddeditemtable.getSelectedRow();
        String id = cmbItemCodeforpnlStockLoader.getSelectedItem().toString();
        if(row<0){
       JOptionPane.showMessageDialog(null,"Please select a row");
    }else{
         String itemcode = (String) dtm.getValueAt(row, 0);
        String qty = JOptionPane.showInputDialog(null, "How many items do you need to remove from stock");
        double qty1 = Double.parseDouble(qty);
        try {
            Item item = ItemController.searchitem(id);
            if(item!=null){
                double databaseqty=item.getQty();
                if(databaseqty>=qty1){
                 boolean IsDeleteitem = ItemController.removeitemqty(itemcode, qty1);
                        if (IsDeleteitem) {
                             JOptionPane.showMessageDialog(null, "Deleted..");
                         } else {
                             JOptionPane.showMessageDialog(null, "cannot Deleted..");
                         }
                }else{
                JOptionPane.showMessageDialog(null,"Stock doesn't have that much items to delete...");
                }
            }
           
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }

        
}
//    private void validremove(){
//         DefaultTableModel dtm = (DefaultTableModel) tblAddeditemtable.getModel();
//        int row = tblAddeditemtable.getSelectedRow();
//        double qty=(double) dtm.getValueAt(row,6);
//        double currentqtyqty=Double.parseDouble(txtCurrentitemqtyforpnlStockloader.getText());
//        if(currentqty<joptiondeleteqty){
//        JOptionPane.showMessageDialog(null,"Stock doesn't have that much items to delete...");
//        }
//        else{
//        
//        }
//    }
    private void addtothecurrentitemqtywhentheaddbuttonclick(){
    double additemqty=Double.parseDouble(txtItemqtyforpnlStockloader.getText());
    double currentitemqty=Double.parseDouble(txtCurrentitemqtyforpnlStockloader.getText());
    txtCurrentitemqtyforpnlStockloader.setText(Double.toString(currentitemqty+=additemqty));
    
    }
//    private void deletefromcurrentitems(){
//        
//    }
    private void Updateitemdatabase(){
        String itemcode=cmbItemCodeforpnlStockLoader.getSelectedItem().toString();
        String brandID;
        String categoryid;
        String batchno;
        String name;
        double price;
        double discount;
        double qty;
        try {
            Item item=ItemController.searchbyitemcode(itemcode);
            if(item!=null){
            brandID=item.getBrandID();
            categoryid=item.getCategoryID();
            batchno=txtItembrand1forpnlStockloader.getText();
            name=txtNameforpnlStockLoader.getText();
            price=Double.parseDouble(txtPriceforpnlStockloader.getText());
            discount=Double.parseDouble(txtDiscountforpnlStockloader.getText());
            qty=Double.parseDouble(txtCurrentitemqtyforpnlStockloader.getText());
            Item itm=new Item(itemcode,batchno,brandID,categoryid,name,qty,discount,price);
            boolean IsUpdated=ItemController.Updateitem(itm);
            if(IsUpdated){
            JOptionPane.showMessageDialog(null,"Successfully Updated...");
            }else{
            JOptionPane.showMessageDialog(null,"Can't update...");
            }
            }else{
            JOptionPane.showMessageDialog(null,"Doesn't exist...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    private void loadtable2(){
    DefaultTableModel dtm=(DefaultTableModel)tblItemforpnlStockLoader.getModel();
        try {
            Item [] item=ItemController.showItem();
            dtm.setRowCount(0);
            for(Item ITem:item){
            Object [] row={ITem.getItemcode(),ITem.getBatchno(),ITem.getBrandID(),ITem.getCategoryID(),ITem.getName(),ITem.getQty(),ITem.getDiscount(),ITem.getPrice()};
            dtm.addRow(row);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void deleteitem(){
        
    DefaultTableModel dtm=(DefaultTableModel)tblItemforpnlStockLoader.getModel();
    int row=tblItemforpnlStockLoader.getSelectedRow();
    if(row<0){
        JOptionPane.showMessageDialog(null,"Please select a row");
    }else{
    String itemcode=(String) dtm.getValueAt(row,0);
        try {
            boolean IsDelete=ItemController.deleteitem(itemcode);
            if(IsDelete){
            JOptionPane.showMessageDialog(null,"Item is Deleted...");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot delete Item...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    }
    private boolean checktxt(){
    if(txtNameforpnlStockLoader.getText().length()>0 & txtItembrandforpnlStockloader.getText().length()>0 & txtItembrand1forpnlStockloader.getText().length()>0 & txtCategoryforpnlStockloader.getText().length()>0 & txtMCountryforpnlStockloader.getText().length()>0 & txtDiscountforpnlStockloader.getText().length()>0&txtPriceforpnlStockloader.getText().length()>0&txtItemqtyforpnlStockloader.getText().length()>0){
    return true;
    }
    return false;
    }
}
