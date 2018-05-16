
package MainFrame;

import Controller.BatchController;
import Controller.CustomerController;
import Controller.CustomerpaymentController;
import Controller.ItemController;
import Controller.ItembrandController;
import Controller.ItemcategoryController;
import Controller.ServicecategoryController;
import Controller.ServiceinvoiceController;
import Controller.VehicleController;
import Model.Customer;
import Model.Customerpayment;
import Model.Item;
import Model.Itembrand;
import Model.Itemcategory;
import Model.Servicecategory;
import Model.Servicedetails;
import Model.Serviceinvoice;
import Model.Vehicle;
import Model.serviceitemdetails;
import Validation.Servicevalidation;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pnlService extends javax.swing.JPanel {

    public pnlService() {
        initComponents();
        loadVehiclenumbers();
        loaddate();
        loadServicetypes();
        loadbatch();
        loadinvoiceno();
        disabledfields();
         cmbSelectServiceTypeforpnlService.setSelectedIndex(0);
         txtCustomerNameforpnlService.setEditable(false);
         cmbSelectServiceTypeforpnlService.setEnabled(true);
         loadpaymentid();
//        btnIssueforpnlService.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIssuedItems = new javax.swing.JTable();
        btnDeleteforpnlService = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbSelectvehicleforpnlService = new javax.swing.JComboBox<>();
        txtCustomerNameforpnlService = new javax.swing.JTextField();
        txtMilageforpnlService = new javax.swing.JTextField();
        txtDateforpnlService = new javax.swing.JTextField();
        cmbSelectServiceTypeforpnlService = new javax.swing.JComboBox<>();
        txtServiceTypeChargeforpnlService = new javax.swing.JTextField();
        txtTotalItemPriceforpnlService = new javax.swing.JTextField();
        txtTotalServicePriceforpnlService = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnOkforpnlService = new javax.swing.JButton();
        btnViewissuedinvoiceforpnlService = new javax.swing.JButton();
        lblServiceTypeIDforpnlService = new javax.swing.JLabel();
        lblVehicleIDforpnlService = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblTotalItemCountforpnlService = new javax.swing.JLabel();
        cmbInvoiceNoforpnlService = new javax.swing.JComboBox<>();
        btnloadforpnlService = new javax.swing.JButton();
        btnLoadinvoicenoforpnlService = new javax.swing.JButton();
        cmbPaymentIDforpnlService = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbBatchforpnlService = new javax.swing.JComboBox<>();
        cmbBrandforpnlService = new javax.swing.JComboBox<>();
        cmbCategoryforpnlService = new javax.swing.JComboBox<>();
        cmbNameforpnlService = new javax.swing.JComboBox<>();
        txtItemCodeforpnlService = new javax.swing.JTextField();
        txtDiscountforpnlService = new javax.swing.JTextField();
        txtItemPriceforpnlService = new javax.swing.JTextField();
        txtQTYforpnlService = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnIssueforpnlService = new javax.swing.JButton();
        lblBrandforpnlService = new javax.swing.JLabel();
        lblCategoryforpnlService = new javax.swing.JLabel();
        txtCountryforpnlService = new javax.swing.JTextField();
        btnloadbatchforpnlMakereservation = new javax.swing.JButton();
        btnViewstockforpnlService = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Issue Service Invoice", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        tblIssuedItems.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tblIssuedItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Batch No", "Brand ID", "Category ID", "Name", "QTY", "Discount", "Price", "Total Item Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblIssuedItems);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDeleteforpnlService.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteforpnlService.setText("Delete");
        btnDeleteforpnlService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteforpnlServiceActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Invoice", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Select Vehicle");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Invoice No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Milage");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Select Service Type");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Service Type Charge");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total Item price");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Total Service Price");

        cmbSelectvehicleforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbSelectvehicleforpnlService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSelectvehicleforpnlServiceItemStateChanged(evt);
            }
        });
        cmbSelectvehicleforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbSelectvehicleforpnlServiceKeyPressed(evt);
            }
        });

        txtCustomerNameforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        txtMilageforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtMilageforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMilageforpnlServiceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMilageforpnlServiceKeyTyped(evt);
            }
        });

        txtDateforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        cmbSelectServiceTypeforpnlService.setToolTipText("If you want to change delete add Items from the table");
        cmbSelectServiceTypeforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbSelectServiceTypeforpnlService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSelectServiceTypeforpnlServiceItemStateChanged(evt);
            }
        });
        cmbSelectServiceTypeforpnlService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbSelectServiceTypeforpnlServiceMouseClicked(evt);
            }
        });
        cmbSelectServiceTypeforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbSelectServiceTypeforpnlServiceKeyPressed(evt);
            }
        });

        txtServiceTypeChargeforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtServiceTypeChargeforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtServiceTypeChargeforpnlServiceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServiceTypeChargeforpnlServiceKeyTyped(evt);
            }
        });

        txtTotalItemPriceforpnlService.setText("0");
        txtTotalItemPriceforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtTotalItemPriceforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalItemPriceforpnlServiceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalItemPriceforpnlServiceKeyTyped(evt);
            }
        });

        txtTotalServicePriceforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtTotalServicePriceforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalServicePriceforpnlServiceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalServicePriceforpnlServiceKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnOkforpnlService.setBackground(new java.awt.Color(255, 255, 255));
        btnOkforpnlService.setText("OK");
        btnOkforpnlService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkforpnlServiceActionPerformed(evt);
            }
        });

        btnViewissuedinvoiceforpnlService.setBackground(new java.awt.Color(255, 255, 255));
        btnViewissuedinvoiceforpnlService.setText("View Issued Invoices");
        btnViewissuedinvoiceforpnlService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewissuedinvoiceforpnlServiceActionPerformed(evt);
            }
        });

        lblServiceTypeIDforpnlService.setText("Service Type ID");

        lblVehicleIDforpnlService.setText("Vehicle ID");

        jLabel19.setText("Payment ID");

        lblTotalItemCountforpnlService.setText("0");

        cmbInvoiceNoforpnlService.setEditable(true);
        cmbInvoiceNoforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbInvoiceNoforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbInvoiceNoforpnlServiceKeyPressed(evt);
            }
        });

        btnloadforpnlService.setBackground(new java.awt.Color(153, 153, 255));
        btnloadforpnlService.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnloadforpnlService.setForeground(new java.awt.Color(255, 0, 51));
        btnloadforpnlService.setText("Load");
        btnloadforpnlService.setToolTipText("Please Click Two time Load Numbers");
        btnloadforpnlService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadforpnlServiceActionPerformed(evt);
            }
        });

        btnLoadinvoicenoforpnlService.setBackground(new java.awt.Color(153, 153, 255));
        btnLoadinvoicenoforpnlService.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoadinvoicenoforpnlService.setForeground(new java.awt.Color(255, 0, 102));
        btnLoadinvoicenoforpnlService.setText("Load");
        btnLoadinvoicenoforpnlService.setToolTipText("Load Lastly added Invoice No");
        btnLoadinvoicenoforpnlService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadinvoicenoforpnlServiceActionPerformed(evt);
            }
        });

        cmbPaymentIDforpnlService.setEditable(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewissuedinvoiceforpnlService)
                        .addGap(18, 18, 18)
                        .addComponent(btnOkforpnlService))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerNameforpnlService)
                            .addComponent(txtMilageforpnlService)
                            .addComponent(txtDateforpnlService)
                            .addComponent(txtServiceTypeChargeforpnlService)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cmbSelectServiceTypeforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(lblServiceTypeIDforpnlService)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtTotalItemPriceforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtTotalServicePriceforpnlService)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19)
                                        .addGap(8, 8, 8)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblTotalItemCountforpnlService)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cmbPaymentIDforpnlService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cmbSelectvehicleforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblVehicleIDforpnlService)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnloadforpnlService))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cmbInvoiceNoforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLoadinvoicenoforpnlService)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbSelectvehicleforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVehicleIDforpnlService)
                    .addComponent(btnloadforpnlService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCustomerNameforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbInvoiceNoforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLoadinvoicenoforpnlService)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMilageforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDateforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbSelectServiceTypeforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceTypeIDforpnlService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtServiceTypeChargeforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTotalItemPriceforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalItemCountforpnlService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotalServicePriceforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(cmbPaymentIDforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOkforpnlService)
                    .addComponent(btnViewissuedinvoiceforpnlService)))
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Items for Service", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Batch");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Brand ID");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Category ID");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Country");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Name");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Item Code");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Discount");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Item Price");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Quantity");

        cmbBatchforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbBatchforpnlService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBatchforpnlServiceItemStateChanged(evt);
            }
        });

        cmbBrandforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbBrandforpnlService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBrandforpnlServiceItemStateChanged(evt);
            }
        });

        cmbCategoryforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbCategoryforpnlService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoryforpnlServiceItemStateChanged(evt);
            }
        });

        cmbNameforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cmbNameforpnlService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNameforpnlServiceItemStateChanged(evt);
            }
        });

        txtItemCodeforpnlService.setEditable(false);
        txtItemCodeforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtItemCodeforpnlService.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtItemCodeforpnlServicePropertyChange(evt);
            }
        });

        txtDiscountforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtDiscountforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountforpnlServiceKeyTyped(evt);
            }
        });

        txtItemPriceforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtItemPriceforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtItemPriceforpnlServiceKeyTyped(evt);
            }
        });

        txtQTYforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtQTYforpnlService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYforpnlServiceKeyTyped(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        btnIssueforpnlService.setBackground(new java.awt.Color(255, 255, 255));
        btnIssueforpnlService.setText("Issue");
        btnIssueforpnlService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueforpnlServiceActionPerformed(evt);
            }
        });

        lblBrandforpnlService.setText("Brand");

        lblCategoryforpnlService.setText("Category");

        txtCountryforpnlService.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnloadbatchforpnlMakereservation.setBackground(new java.awt.Color(153, 153, 255));
        btnloadbatchforpnlMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnloadbatchforpnlMakereservation.setForeground(new java.awt.Color(255, 0, 102));
        btnloadbatchforpnlMakereservation.setText("Load");
        btnloadbatchforpnlMakereservation.setToolTipText("Please Click Twice for Load Batch List");
        btnloadbatchforpnlMakereservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadbatchforpnlMakereservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIssueforpnlService))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbNameforpnlService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtItemCodeforpnlService)
                                    .addComponent(txtDiscountforpnlService)
                                    .addComponent(txtItemPriceforpnlService)
                                    .addComponent(txtQTYforpnlService)
                                    .addComponent(txtCountryforpnlService)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cmbBrandforpnlService, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE)
                                            .addComponent(cmbBatchforpnlService, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbCategoryforpnlService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBrandforpnlService)
                                            .addComponent(lblCategoryforpnlService))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnloadbatchforpnlMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbBatchforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnloadbatchforpnlMakereservation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbBrandforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrandforpnlService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbCategoryforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoryforpnlService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCountryforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbNameforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtItemCodeforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtDiscountforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtItemPriceforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtQTYforpnlService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIssueforpnlService))
        );

        btnViewstockforpnlService.setBackground(new java.awt.Color(255, 255, 255));
        btnViewstockforpnlService.setText("View Stock");
        btnViewstockforpnlService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewstockforpnlServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewstockforpnlService)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteforpnlService))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteforpnlService)
                    .addComponent(btnViewstockforpnlService))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSelectvehicleforpnlServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSelectvehicleforpnlServiceItemStateChanged
         
        String vehicleno=cmbSelectvehicleforpnlService.getSelectedItem().toString();
        
        try {
            Vehicle id=VehicleController.getCustomerid(vehicleno);
            if(id!=null){
                Customer name=CustomerController.getName(id.getCustomerID());
                if(name!=null){
                txtCustomerNameforpnlService.setText(name.getName());
                }
            }
            else{
            JOptionPane.showMessageDialog(null,"Cannot find Customer...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbSelectvehicleforpnlServiceItemStateChanged
//        private double tcharge=0;
    private void cmbSelectServiceTypeforpnlServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSelectServiceTypeforpnlServiceItemStateChanged
        String servicetype=cmbSelectServiceTypeforpnlService.getSelectedItem().toString();
        Servicecategory sc;
        try {
            sc = ServicecategoryController.serchservicedetails(servicetype);
            if(sc!=null){
            lblServiceTypeIDforpnlService.setText(sc.getCategoryID());
            txtServiceTypeChargeforpnlService.setText(Integer.toString(sc.getCharge()));
            txtServiceTypeChargeforpnlService.getText();
            //tcharge=charge;
            txtTotalServicePriceforpnlService.setText(txtServiceTypeChargeforpnlService.getText());
            cmbSelectServiceTypeforpnlService.setEnabled(false);
        }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_cmbSelectServiceTypeforpnlServiceItemStateChanged

    private void cmbBatchforpnlServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBatchforpnlServiceItemStateChanged
       String batchno=cmbBatchforpnlService.getSelectedItem().toString();

        try {
             ArrayList<String>brand=ItemController.getItem(batchno);

            for(String lst:brand) {
              cmbBrandforpnlService.addItem(lst);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbBatchforpnlServiceItemStateChanged

    private void cmbBrandforpnlServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBrandforpnlServiceItemStateChanged
       String batchno=cmbBatchforpnlService.getSelectedItem().toString();
       String brandid=cmbBrandforpnlService.getSelectedItem().toString();
       Itembrand brandname;
        try {
            brandname = ItembrandController.searchitemBrand(brandid);
             if(brandname!=null){
                 lblBrandforpnlService.setText(brandname.getBrand());
       }else{
             JOptionPane.showMessageDialog(null,"Cannot find Brand Name");
             }
        } catch (SQLException | ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
      
        try {
            ArrayList<String>category=ItemController.getCategory(batchno,brandid);
           
            for(String cat:category){
                cmbCategoryforpnlService.addItem(cat);
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbBrandforpnlServiceItemStateChanged

    private void cmbCategoryforpnlServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoryforpnlServiceItemStateChanged
        String batchno=cmbBatchforpnlService.getSelectedItem().toString();
       String brandid=cmbBrandforpnlService.getSelectedItem().toString();
       String categoryid=cmbCategoryforpnlService.getSelectedItem().toString();
        try {
            Itemcategory categoryname=ItemcategoryController.searchItemcategory(categoryid);
            if(categoryname!=null){
                lblCategoryforpnlService.setText(categoryname.getCategory());
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            ArrayList<String>Country=ItemController.getCountry(categoryid);
            ArrayList<String>name=ItemController.getName(batchno,brandid,categoryid);
            
            for(String country:Country){
                txtCountryforpnlService.setText(country);
            }
          
            for(String Name:name){
                cmbNameforpnlService.addItem(Name);
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbCategoryforpnlServiceItemStateChanged

    private void cmbNameforpnlServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNameforpnlServiceItemStateChanged
         String batchno=cmbBatchforpnlService.getSelectedItem().toString();
         
       String brandid=cmbBrandforpnlService.getSelectedItem().toString();
       String categoryid=cmbCategoryforpnlService.getSelectedItem().toString();
        try {
            Item item=ItemController.getItems(batchno,brandid,categoryid);
            if(item!=null){
            txtItemCodeforpnlService.setText(item.getItemcode());
            txtDiscountforpnlService.setText(Double.toString(item.getDiscount()));
            txtItemPriceforpnlService.setText(Double.toString(item.getPrice()));
            
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbNameforpnlServiceItemStateChanged

    private void txtItemCodeforpnlServicePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtItemCodeforpnlServicePropertyChange
        txtItemCodeforpnlService.setEditable(false);
    }//GEN-LAST:event_txtItemCodeforpnlServicePropertyChange

    private void btnIssueforpnlServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueforpnlServiceActionPerformed
//        if(txtDiscountforpnlService.getText().length()<=0||txtItemPriceforpnlService.getText().length()<=0||txtQTYforpnlService.getText().length()<=0){
//            btnIssueforpnlService.setEnabled(false);
//        }else{
            btnIssueforpnlService.setEnabled(true);
       paymentmachanisam();
      AddtotheTable();
      AdditemforthetableandRemovefromdatabase();
//        }
//       cmbBrandforpnlService.removeAllItems();
//      cmbCategoryforpnlService.removeAllItems();
    }//GEN-LAST:event_btnIssueforpnlServiceActionPerformed

    private void btnOkforpnlServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkforpnlServiceActionPerformed
//       loadpaymentid();
        boolean isfldcheck=checktextfields();
        String invoiceno=cmbInvoiceNoforpnlService.getSelectedItem().toString();
        String paymentid=cmbPaymentIDforpnlService.getSelectedItem().toString();
        boolean ischeckinvoice=Servicevalidation.checkgrnno(invoiceno);
        boolean ischeckpaymentid=Servicevalidation.checkpaymentid(paymentid);
        if(isfldcheck&ischeckpaymentid){
           
        addAllInOne();
        loadpaymentid();
        }else{
        JOptionPane.showMessageDialog(null,"Please Check Entered informations");
        }
    }//GEN-LAST:event_btnOkforpnlServiceActionPerformed

    private void btnDeleteforpnlServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteforpnlServiceActionPerformed
        labelandTextboxfixer();
          clearall();
         removeitemfromtableandAddtotheItemtable();
        cmbSelectServiceTypeforpnlService.setEnabled(true);
       
    }//GEN-LAST:event_btnDeleteforpnlServiceActionPerformed

    private void btnViewissuedinvoiceforpnlServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewissuedinvoiceforpnlServiceActionPerformed
      ViewInvoicedetails viewinvoicedetails=new ViewInvoicedetails();
      viewinvoicedetails.setVisible(true);
    }//GEN-LAST:event_btnViewissuedinvoiceforpnlServiceActionPerformed

    private void btnViewstockforpnlServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewstockforpnlServiceActionPerformed
        ViewStock viewstock=new ViewStock();
        viewstock.setVisible(true);
    }//GEN-LAST:event_btnViewstockforpnlServiceActionPerformed

    private void txtDiscountforpnlServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountforpnlServiceKeyTyped
      Servicevalidation.checkdiscount(evt);
    }//GEN-LAST:event_txtDiscountforpnlServiceKeyTyped

    private void txtItemPriceforpnlServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemPriceforpnlServiceKeyTyped
      Servicevalidation.checkitemprice(evt);
    }//GEN-LAST:event_txtItemPriceforpnlServiceKeyTyped

    private void txtQTYforpnlServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYforpnlServiceKeyTyped
    Servicevalidation.checkitemqty(evt);
    }//GEN-LAST:event_txtQTYforpnlServiceKeyTyped

    private void btnloadforpnlServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadforpnlServiceActionPerformed
        cmbSelectvehicleforpnlService.removeAllItems();
        loadVehiclenumbers();
    }//GEN-LAST:event_btnloadforpnlServiceActionPerformed

    private void btnloadbatchforpnlMakereservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadbatchforpnlMakereservationActionPerformed
      cmbBatchforpnlService.removeAllItems();
        loadbatch();
    }//GEN-LAST:event_btnloadbatchforpnlMakereservationActionPerformed

    private void txtMilageforpnlServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMilageforpnlServiceKeyTyped
        Servicevalidation.checkmilage(evt);
    }//GEN-LAST:event_txtMilageforpnlServiceKeyTyped

    private void txtServiceTypeChargeforpnlServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServiceTypeChargeforpnlServiceKeyTyped
       Servicevalidation.checkservicetypecharge(evt);
    }//GEN-LAST:event_txtServiceTypeChargeforpnlServiceKeyTyped

    private void txtTotalItemPriceforpnlServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalItemPriceforpnlServiceKeyTyped
       Servicevalidation.checktotalitemprice(evt);
    }//GEN-LAST:event_txtTotalItemPriceforpnlServiceKeyTyped

    private void txtTotalServicePriceforpnlServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalServicePriceforpnlServiceKeyTyped
        Servicevalidation.checktotalserviceprice(evt);
    }//GEN-LAST:event_txtTotalServicePriceforpnlServiceKeyTyped

    private void btnLoadinvoicenoforpnlServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadinvoicenoforpnlServiceActionPerformed
       loadinvoiceno();
    }//GEN-LAST:event_btnLoadinvoicenoforpnlServiceActionPerformed

    private void cmbInvoiceNoforpnlServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbInvoiceNoforpnlServiceKeyPressed
    if(evt.getKeyChar()==KeyEvent.VK_ENTER){
        String invoiceno=cmbInvoiceNoforpnlService.getSelectedItem().toString();
     boolean ischeckinvoice=Servicevalidation.checkgrnno(invoiceno);
     if(ischeckinvoice){
     txtMilageforpnlService.grabFocus();
     }
    }
    }//GEN-LAST:event_cmbInvoiceNoforpnlServiceKeyPressed

    private void cmbSelectvehicleforpnlServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbSelectvehicleforpnlServiceKeyPressed
     if(evt.getKeyChar()==KeyEvent.VK_ENTER){
    cmbInvoiceNoforpnlService.grabFocus();
     }
    }//GEN-LAST:event_cmbSelectvehicleforpnlServiceKeyPressed

    private void txtMilageforpnlServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMilageforpnlServiceKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
        cmbSelectServiceTypeforpnlService.grabFocus();
        }
    }//GEN-LAST:event_txtMilageforpnlServiceKeyPressed

    private void cmbSelectServiceTypeforpnlServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbSelectServiceTypeforpnlServiceKeyPressed
       if(evt.getKeyChar()==KeyEvent.VK_ENTER){
       txtServiceTypeChargeforpnlService.grabFocus();
        }
    }//GEN-LAST:event_cmbSelectServiceTypeforpnlServiceKeyPressed

    private void txtServiceTypeChargeforpnlServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServiceTypeChargeforpnlServiceKeyPressed
       if(evt.getKeyChar()==KeyEvent.VK_ENTER){
       txtTotalItemPriceforpnlService.grabFocus();
        }
        
       
    }//GEN-LAST:event_txtServiceTypeChargeforpnlServiceKeyPressed

    private void txtTotalItemPriceforpnlServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalItemPriceforpnlServiceKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
       txtTotalServicePriceforpnlService.grabFocus();
        }
        
       
    }//GEN-LAST:event_txtTotalItemPriceforpnlServiceKeyPressed

    private void txtTotalServicePriceforpnlServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalServicePriceforpnlServiceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalServicePriceforpnlServiceKeyPressed

    private void cmbSelectServiceTypeforpnlServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbSelectServiceTypeforpnlServiceMouseClicked
      
    }//GEN-LAST:event_cmbSelectServiceTypeforpnlServiceMouseClicked
    private void paymentmachanisam(){
        double itemprice=Double.parseDouble(txtItemPriceforpnlService.getText());
        double discount=Double.parseDouble(txtDiscountforpnlService.getText());
        double qty=Double.parseDouble(txtQTYforpnlService.getText());
        double discountprice=itemprice-(itemprice*discount/100);
        double amount=discountprice*qty;
        double payment=((int)((amount)*100))/100.0;
        
        double pay=Double.parseDouble(txtTotalItemPriceforpnlService.getText());
        
        txtTotalItemPriceforpnlService.setText(Double.toString(pay+=payment));
        
        double value=0;
        value+=qty;
         double d=Double.parseDouble(lblTotalItemCountforpnlService.getText());
         double count=0;
         count=d+value;
        lblTotalItemCountforpnlService.setText(Double.toString(count));
        
        double fullpayment=Double.parseDouble(txtTotalServicePriceforpnlService.getText());
        double itemamount=Double.parseDouble(txtTotalItemPriceforpnlService.getText());
        double total=0;
        total+=fullpayment+payment;
        txtTotalServicePriceforpnlService.setText(Double.toString(total));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteforpnlService;
    private javax.swing.JButton btnIssueforpnlService;
    private javax.swing.JButton btnLoadinvoicenoforpnlService;
    private javax.swing.JButton btnOkforpnlService;
    private javax.swing.JButton btnViewissuedinvoiceforpnlService;
    private javax.swing.JButton btnViewstockforpnlService;
    private javax.swing.JButton btnloadbatchforpnlMakereservation;
    private javax.swing.JButton btnloadforpnlService;
    private javax.swing.JComboBox<String> cmbBatchforpnlService;
    private javax.swing.JComboBox<String> cmbBrandforpnlService;
    private javax.swing.JComboBox<String> cmbCategoryforpnlService;
    private javax.swing.JComboBox<String> cmbInvoiceNoforpnlService;
    private javax.swing.JComboBox<String> cmbNameforpnlService;
    private javax.swing.JComboBox<String> cmbPaymentIDforpnlService;
    private javax.swing.JComboBox<String> cmbSelectServiceTypeforpnlService;
    private static javax.swing.JComboBox<String> cmbSelectvehicleforpnlService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBrandforpnlService;
    private javax.swing.JLabel lblCategoryforpnlService;
    private javax.swing.JLabel lblServiceTypeIDforpnlService;
    private javax.swing.JLabel lblTotalItemCountforpnlService;
    private javax.swing.JLabel lblVehicleIDforpnlService;
    private javax.swing.JTable tblIssuedItems;
    private javax.swing.JTextField txtCountryforpnlService;
    private javax.swing.JTextField txtCustomerNameforpnlService;
    private javax.swing.JTextField txtDateforpnlService;
    private javax.swing.JTextField txtDiscountforpnlService;
    private javax.swing.JTextField txtItemCodeforpnlService;
    private javax.swing.JTextField txtItemPriceforpnlService;
    private javax.swing.JTextField txtMilageforpnlService;
    private javax.swing.JTextField txtQTYforpnlService;
    private javax.swing.JTextField txtServiceTypeChargeforpnlService;
    private javax.swing.JTextField txtTotalItemPriceforpnlService;
    private javax.swing.JTextField txtTotalServicePriceforpnlService;
    // End of variables declaration//GEN-END:variables

    

    private void loaddate() {
       Date date=new Date();
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       String Date=sdf.format(date);
       txtDateforpnlService.setText(Date);
    }

    private void loadServicetypes() {
        try {
            ArrayList<String> sc=ServicecategoryController.getservicetypes();
            
            sc.stream().forEach((lst) -> {
                cmbSelectServiceTypeforpnlService.addItem(lst);
                
                
            });
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loadbatch() {
        try {
            ArrayList<String>blst=BatchController.showbatchno();
            blst.stream().forEach((batch) -> {
                cmbBatchforpnlService.addItem(batch);
            });
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void AddtotheTable(){
        DefaultTableModel dtm=(DefaultTableModel)tblIssuedItems.getModel();
        String Itemcode=txtItemCodeforpnlService.getText();
        String Batchno=cmbBatchforpnlService.getSelectedItem().toString();
        String Brandid=cmbBrandforpnlService.getSelectedItem().toString();
        String Categoryid=cmbCategoryforpnlService.getSelectedItem().toString();
        String Name=cmbNameforpnlService.getSelectedItem().toString();
        double qty=Double.parseDouble(txtQTYforpnlService.getText());
        double Discount=Double.parseDouble(txtDiscountforpnlService.getText());
        double Price=Double.parseDouble(txtItemPriceforpnlService.getText());
        double Totalitemprice=Double.parseDouble(txtTotalItemPriceforpnlService.getText());
        
        Object [] rows={Itemcode,Batchno,Brandid,Categoryid,Name,qty,Discount,Price,Totalitemprice};
        dtm.addRow(rows);
    }
    private void removeitemfromtableandAddtotheItemtable(){
        DefaultTableModel dtm1=(DefaultTableModel)tblIssuedItems.getModel();
        int row=tblIssuedItems.getSelectedRow();
        if(row<0){
        JOptionPane.showMessageDialog(null,"Please select a row");
        }else{
       String item=(String) dtm1.getValueAt(row,0);
        double qty=(Double) dtm1.getValueAt(row,5);
        try {
            boolean Isupdated=ItemController.removeandadd(item,qty);
            if(Isupdated){
            dtm1.removeRow(row);
           
            }else{
             JOptionPane.showMessageDialog(null,"Cannot add item to the Database...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
    }
    private void AdditemforthetableandRemovefromdatabase(){
            String itemcode=txtItemCodeforpnlService.getText();
            double qty=Double.parseDouble(txtQTYforpnlService.getText());
        try {
            boolean Isupdated=ItemController.decrease(itemcode,qty);
            if(Isupdated){
                  
            }else{
             JOptionPane.showMessageDialog(null,"Cannot get item from Database...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    //txtPaymentIDforpnlService
    }
   
    private void addAllInOne(){
        try{
        String invoiceno=cmbInvoiceNoforpnlService.getSelectedItem().toString();
        String vehicleno=cmbSelectvehicleforpnlService.getSelectedItem().toString();
        double milage=Double.parseDouble(txtMilageforpnlService.getText());
        String date=txtDateforpnlService.getText();
        String categoryid=cmbCategoryforpnlService.getSelectedItem().toString();
        String batchno=cmbBatchforpnlService.getSelectedItem().toString();
        double qty=Double.parseDouble(lblTotalItemCountforpnlService.getText());
        double totaldiscount=Double.parseDouble(txtDiscountforpnlService.getText());
        double totalamount=Double.parseDouble(txtTotalItemPriceforpnlService.getText());
        String paymentid=cmbPaymentIDforpnlService.getSelectedItem().toString();
        double paymentamount=Double.parseDouble(txtTotalServicePriceforpnlService.getText());
        Serviceinvoice serviceinvoice=new Serviceinvoice(invoiceno,vehicleno,milage,date);
        Servicedetails servicedetails=new Servicedetails(invoiceno,categoryid);
        serviceitemdetails serviceitemdetails=new serviceitemdetails(invoiceno,batchno,qty,totaldiscount,totalamount);
        Customerpayment customerpayment=new Customerpayment(paymentid,invoiceno,paymentamount,date);
       // Batch batch=new Batch(batchno,invoiceno,totalamount,date);
        try {
            boolean Isadded=ServiceinvoiceController.addInvoice(serviceinvoice,servicedetails,serviceitemdetails,customerpayment);
            if(Isadded){
                JOptionPane.showMessageDialog(null,"Save to Database");
            }else{
                JOptionPane.showMessageDialog(null,"Can't save to the Database...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }catch(NumberFormatException | HeadlessException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loadinvoiceno() {
        try {  
            ArrayList<String>invoiceno=ServiceinvoiceController.getInvoiceno();
            for(String ino:invoiceno){
                cmbInvoiceNoforpnlService.addItem(ino);
                
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void labelandTextboxfixer(){
        DefaultTableModel dtm=(DefaultTableModel)tblIssuedItems.getModel();
        int row=tblIssuedItems.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null,"Please select a row");
    
    }else{
                double qty=(double) dtm.getValueAt(row,5);
        double discount=(double) dtm.getValueAt(row,6);
        double price=(double) dtm.getValueAt(row,7);
        double fullamount=(double) dtm.getValueAt(row,8);
        
        double lblqty=Double.parseDouble(lblTotalItemCountforpnlService.getText());
        if(lblqty!=0){
            double removeqty=0;
            removeqty=lblqty-qty;
            lblTotalItemCountforpnlService.setText(Double.toString(removeqty));
        }else{
        JOptionPane.showMessageDialog(null,"Please add items...");
        }
        double totalpayment=Double.parseDouble(txtTotalItemPriceforpnlService.getText());
        if(totalpayment!=0){
            double discountprice=price-(price*discount/100);
            double amount=discountprice*qty;
            double payment=((int)((amount)*100))/100.0;
            txtTotalItemPriceforpnlService.setText(Double.toString(totalpayment-payment));
        
        double fullpayment=Double.parseDouble(txtTotalServicePriceforpnlService.getText());
        txtTotalServicePriceforpnlService.setText(Double.toString(fullpayment-payment));
    }else{
        JOptionPane.showMessageDialog(null,"Please Add Items...");
        }
    }
}

    private void disabledfields() {
      txtDateforpnlService.setEditable(false);
      txtTotalItemPriceforpnlService.setEditable(false);
      txtCountryforpnlService.setEditable(false);
      txtItemCodeforpnlService.setEditable(false);
    }
    private static void load(){
    loadVehiclenumbers();
    }
     private static void loadVehiclenumbers() {
         try {
            ArrayList<String> vehicleno = VehicleController.getVehiclenum2();
            vehicleno.stream().forEach((num) -> {
                cmbSelectvehicleforpnlService.addItem(num);
            });
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
       
    }

    private void loadpaymentid() {
        try {
            ArrayList<String>paymentid=CustomerpaymentController.getlastpaymentid();
            for(String pid:paymentid){
            cmbPaymentIDforpnlService.addItem(pid);
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
               }
    private boolean checktextfields(){
        if(!(txtMilageforpnlService.getText().length()<=0||txtServiceTypeChargeforpnlService.getText().length()<=0||txtTotalServicePriceforpnlService.getText().length()<=0)){
        return true;
        }
        return false;
    }
private void clearall(){
        txtMilageforpnlService.setText("");
        txtServiceTypeChargeforpnlService.setText("");
        txtTotalItemPriceforpnlService.setText("0");
        txtTotalServicePriceforpnlService.setText("");
        lblTotalItemCountforpnlService.setText("..");
}
}
/*
txtMilageforpnlService
txtServiceTypeChargeforpnlService
txtTotalItemPriceforpnlService
txtTotalServicePriceforpnlService

*/