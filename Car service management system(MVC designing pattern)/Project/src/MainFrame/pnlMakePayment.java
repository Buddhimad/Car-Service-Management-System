package MainFrame;

import Controller.BatchController;
import Controller.GoodreceivenoteController;
import Controller.SupplierorderController;
import Controller.SupplierpaymentController;
import Model.Goodreceivenote;
import Model.Supplierpayment;
import Validation.Makepaymentvalidation;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class pnlMakePayment extends javax.swing.JPanel {
    
    public pnlMakePayment() {
        initComponents();
        loadGRNtable();
        loadallcboxes();
        loaddate();
        txtDateforpnlMakepayment.setEditable(false);
//        addpaymentforsupplier();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCanvasforMakepayment = new javax.swing.JPanel();
        pnlSupplierPaymentforMakepayment = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnOKforMakepayment = new javax.swing.JButton();
        btnViewPaymentforMakepayment = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbBatchnoforpnlMakepayment = new javax.swing.JComboBox<>();
        cmbOrderIdforpnlMakepayment = new javax.swing.JComboBox<>();
        txtTotaldiscountforpnlMakepayment = new javax.swing.JTextField();
        txtTotalamountforpnlMakepayment = new javax.swing.JTextField();
        txtQtyforpnlMakepayment = new javax.swing.JTextField();
        txtDateforpnlMakepayment = new javax.swing.JTextField();
        cmbGoodreceivenoforpnlMakepayment = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAddPaymentforpnlMakepayment = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblPaymentIDforpnlMakepayment = new javax.swing.JLabel();
        cmbPaymentIDforpnlMakepayment = new javax.swing.JComboBox<>();
        btnRefreshforpnlMakepayment = new javax.swing.JButton();
        lblshowgrnnoforpnlMakepayment = new javax.swing.JLabel();
        lblShowpaymentidforpnlMakepayment = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGoodreceivenoteforpnlMakepayment = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaymentforpnlMakepayment = new javax.swing.JTable();

        pnlCanvasforMakepayment.setBackground(new java.awt.Color(153, 153, 255));
        pnlCanvasforMakepayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pnlSupplierPaymentforMakepayment.setBackground(new java.awt.Color(153, 153, 255));
        pnlSupplierPaymentforMakepayment.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Supplier Payment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(102, 153, 255));

        btnOKforMakepayment.setBackground(new java.awt.Color(255, 255, 255));
        btnOKforMakepayment.setText("OK");

        btnViewPaymentforMakepayment.setBackground(new java.awt.Color(255, 255, 255));
        btnViewPaymentforMakepayment.setText("Refresh");
        btnViewPaymentforMakepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPaymentforMakepaymentActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Remove from Database");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Good receive no");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Batch No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Order ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Total Discount");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Total Amount");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("QTY");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Date");

        txtTotaldiscountforpnlMakepayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtTotaldiscountforpnlMakepayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotaldiscountforpnlMakepaymentKeyTyped(evt);
            }
        });

        txtTotalamountforpnlMakepayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtTotalamountforpnlMakepayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalamountforpnlMakepaymentKeyTyped(evt);
            }
        });

        txtQtyforpnlMakepayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtQtyforpnlMakepayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQtyforpnlMakepaymentKeyTyped(evt);
            }
        });

        txtDateforpnlMakepayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        cmbGoodreceivenoforpnlMakepayment.setEditable(true);
        cmbGoodreceivenoforpnlMakepayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbGoodreceivenoforpnlMakepaymentKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbGoodreceivenoforpnlMakepaymentKeyTyped(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/payment-creditcard-visa-icon (5).png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        btnAddPaymentforpnlMakepayment.setBackground(new java.awt.Color(153, 153, 255));
        btnAddPaymentforpnlMakepayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/math-add-icon.png"))); // NOI18N
        btnAddPaymentforpnlMakepayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAddPaymentforpnlMakepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPaymentforpnlMakepaymentActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/clear-icon (1).png"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lblPaymentIDforpnlMakepayment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPaymentIDforpnlMakepayment.setText("Payment ID");

        cmbPaymentIDforpnlMakepayment.setEditable(true);

        btnRefreshforpnlMakepayment.setBackground(new java.awt.Color(153, 153, 255));
        btnRefreshforpnlMakepayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/button-round-reload-icon.png"))); // NOI18N
        btnRefreshforpnlMakepayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnRefreshforpnlMakepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshforpnlMakepaymentActionPerformed(evt);
            }
        });

        lblshowgrnnoforpnlMakepayment.setText(".........");

        lblShowpaymentidforpnlMakepayment.setText("..........");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(lblPaymentIDforpnlMakepayment))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbBatchnoforpnlMakepayment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbOrderIdforpnlMakepayment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotaldiscountforpnlMakepayment)
                    .addComponent(txtTotalamountforpnlMakepayment)
                    .addComponent(txtQtyforpnlMakepayment)
                    .addComponent(txtDateforpnlMakepayment)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbGoodreceivenoforpnlMakepayment, 0, 217, Short.MAX_VALUE)
                            .addComponent(cmbPaymentIDforpnlMakepayment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblshowgrnnoforpnlMakepayment)
                            .addComponent(lblShowpaymentidforpnlMakepayment))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddPaymentforpnlMakepayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnRefreshforpnlMakepayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbGoodreceivenoforpnlMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(lblshowgrnnoforpnlMakepayment))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPaymentIDforpnlMakepayment)
                                    .addComponent(cmbPaymentIDforpnlMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblShowpaymentidforpnlMakepayment))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRefreshforpnlMakepayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cmbBatchnoforpnlMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cmbOrderIdforpnlMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtTotaldiscountforpnlMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTotalamountforpnlMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtQtyforpnlMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtDateforpnlMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddPaymentforpnlMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Good Receive Note", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblGoodreceivenoteforpnlMakepayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN No", "Batch No", "Order ID", "Payment ID", "Total Discount", "Total Amount", "QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGoodreceivenoteforpnlMakepayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGoodreceivenoteforpnlMakepaymentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGoodreceivenoteforpnlMakepayment);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Payment", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblPaymentforpnlMakepayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tblPaymentforpnlMakepayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment ID", "Date", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPaymentforpnlMakepayment);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSupplierPaymentforMakepaymentLayout = new javax.swing.GroupLayout(pnlSupplierPaymentforMakepayment);
        pnlSupplierPaymentforMakepayment.setLayout(pnlSupplierPaymentforMakepaymentLayout);
        pnlSupplierPaymentforMakepaymentLayout.setHorizontalGroup(
            pnlSupplierPaymentforMakepaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierPaymentforMakepaymentLayout.createSequentialGroup()
                .addGroup(pnlSupplierPaymentforMakepaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSupplierPaymentforMakepaymentLayout.createSequentialGroup()
                        .addContainerGap(471, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewPaymentforMakepayment)
                        .addGap(18, 18, 18)
                        .addComponent(btnOKforMakepayment, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(pnlSupplierPaymentforMakepaymentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSupplierPaymentforMakepaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSupplierPaymentforMakepaymentLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlSupplierPaymentforMakepaymentLayout.setVerticalGroup(
            pnlSupplierPaymentforMakepaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierPaymentforMakepaymentLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSupplierPaymentforMakepaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSupplierPaymentforMakepaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOKforMakepayment)
                    .addComponent(btnViewPaymentforMakepayment)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnlCanvasforMakepaymentLayout = new javax.swing.GroupLayout(pnlCanvasforMakepayment);
        pnlCanvasforMakepayment.setLayout(pnlCanvasforMakepaymentLayout);
        pnlCanvasforMakepaymentLayout.setHorizontalGroup(
            pnlCanvasforMakepaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCanvasforMakepaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSupplierPaymentforMakepayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCanvasforMakepaymentLayout.setVerticalGroup(
            pnlCanvasforMakepaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCanvasforMakepaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSupplierPaymentforMakepayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCanvasforMakepayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCanvasforMakepayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       updatetwotables();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblGoodreceivenoteforpnlMakepaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGoodreceivenoteforpnlMakepaymentMouseClicked
        Selectgrnandgetpayment();
    }//GEN-LAST:event_tblGoodreceivenoteforpnlMakepaymentMouseClicked

    private void btnAddPaymentforpnlMakepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPaymentforpnlMakepaymentActionPerformed
       if(Istextfieldcheck()){
           String grnno=cmbGoodreceivenoforpnlMakepayment.getSelectedItem().toString();
           String paymentid=cmbPaymentIDforpnlMakepayment.getSelectedItem().toString();
         boolean isgrnchecked=Makepaymentvalidation.Grnnochecked(grnno);
         boolean ispaymentidcheck=Makepaymentvalidation.paymentidcheck(paymentid);
         if(isgrnchecked){
             if(ispaymentidcheck){
         addpaymentforsupplier();
         }else{
                 JOptionPane.showMessageDialog(null,"Invalid OrderID");
             }}
         else{
         JOptionPane.showMessageDialog(null,"Invalid GRN No");
         }
//           checktablecell();
         
       }else{
       JOptionPane.showMessageDialog(null,"Please fill all fields");
       }
    }//GEN-LAST:event_btnAddPaymentforpnlMakepaymentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       deletepayment();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRefreshforpnlMakepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshforpnlMakepaymentActionPerformed
//        SwingUtilities.updateComponentTreeUI(Additionalmainframe);
            this.invalidate();
            this.validate();
            this.repaint();
            
    }//GEN-LAST:event_btnRefreshforpnlMakepaymentActionPerformed

    private void txtTotaldiscountforpnlMakepaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotaldiscountforpnlMakepaymentKeyTyped
     Makepaymentvalidation.checktotaldiscount(evt);
    }//GEN-LAST:event_txtTotaldiscountforpnlMakepaymentKeyTyped

    private void txtTotalamountforpnlMakepaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalamountforpnlMakepaymentKeyTyped
       Makepaymentvalidation.checktotalamount(evt);
    }//GEN-LAST:event_txtTotalamountforpnlMakepaymentKeyTyped

    private void txtQtyforpnlMakepaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyforpnlMakepaymentKeyTyped
       Makepaymentvalidation.checktotalqty(evt);
    }//GEN-LAST:event_txtQtyforpnlMakepaymentKeyTyped

    private void btnViewPaymentforMakepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPaymentforMakepaymentActionPerformed
       loadGRNtable();
    }//GEN-LAST:event_btnViewPaymentforMakepaymentActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      cleartextfield();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cmbGoodreceivenoforpnlMakepaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbGoodreceivenoforpnlMakepaymentKeyTyped
       
    }//GEN-LAST:event_cmbGoodreceivenoforpnlMakepaymentKeyTyped

    private void cmbGoodreceivenoforpnlMakepaymentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbGoodreceivenoforpnlMakepaymentKeyPressed
     if(evt.getKeyChar()==KeyEvent.VK_ENTER){
         
     }
    }//GEN-LAST:event_cmbGoodreceivenoforpnlMakepaymentKeyPressed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPaymentforpnlMakepayment;
    private javax.swing.JButton btnOKforMakepayment;
    private javax.swing.JButton btnRefreshforpnlMakepayment;
    private javax.swing.JButton btnViewPaymentforMakepayment;
    private javax.swing.JComboBox<String> cmbBatchnoforpnlMakepayment;
    private javax.swing.JComboBox<String> cmbGoodreceivenoforpnlMakepayment;
    private javax.swing.JComboBox<String> cmbOrderIdforpnlMakepayment;
    private javax.swing.JComboBox<String> cmbPaymentIDforpnlMakepayment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPaymentIDforpnlMakepayment;
    private javax.swing.JLabel lblShowpaymentidforpnlMakepayment;
    private javax.swing.JLabel lblshowgrnnoforpnlMakepayment;
    private javax.swing.JPanel pnlCanvasforMakepayment;
    private javax.swing.JPanel pnlSupplierPaymentforMakepayment;
    private javax.swing.JTable tblGoodreceivenoteforpnlMakepayment;
    private javax.swing.JTable tblPaymentforpnlMakepayment;
    private javax.swing.JTextField txtDateforpnlMakepayment;
    private javax.swing.JTextField txtQtyforpnlMakepayment;
    private javax.swing.JTextField txtTotalamountforpnlMakepayment;
    private javax.swing.JTextField txtTotaldiscountforpnlMakepayment;
    // End of variables declaration//GEN-END:variables

    private void addpaymentforsupplier() {
        String goodreceivenotet=cmbGoodreceivenoforpnlMakepayment.getSelectedItem().toString();
        String paymentid=cmbPaymentIDforpnlMakepayment.getSelectedItem().toString();
        String batchno=cmbBatchnoforpnlMakepayment.getSelectedItem().toString();
        String orderid=cmbOrderIdforpnlMakepayment.getSelectedItem().toString();
        double totaldiscount=Double.parseDouble(txtTotaldiscountforpnlMakepayment.getText());
        double totalamount=Double.parseDouble(txtTotalamountforpnlMakepayment.getText());
        double qty=Double.parseDouble(txtQtyforpnlMakepayment.getText());
        String date=txtDateforpnlMakepayment.getText();
       
        
        Goodreceivenote grn=new Goodreceivenote(goodreceivenotet,batchno,orderid,paymentid,totaldiscount,totalamount,qty);
        Supplierpayment sp=new Supplierpayment(paymentid,date,totalamount);
        try {
            boolean Isadded=GoodreceivenoteController.addpaymentdetails(grn,sp);
            if(Isadded){
                lblshowgrnnoforpnlMakepayment.setText(goodreceivenotet);
                lblShowpaymentidforpnlMakepayment.setText(paymentid);
            DefaultTableModel dtm=(DefaultTableModel)tblGoodreceivenoteforpnlMakepayment.getModel();
            DefaultTableModel dtm2=(DefaultTableModel)tblPaymentforpnlMakepayment.getModel();
            dtm.setRowCount(0); dtm2.setRowCount(0);
            Object [] row1={goodreceivenotet,batchno,orderid,paymentid,totaldiscount,totalamount,qty};
            dtm.addRow(row1);
            Object [] row2={paymentid,date,totalamount};
            dtm2.addRow(row2);
            JOptionPane.showMessageDialog(null,"Supplier Payment add...");
            }else{
              JOptionPane.showMessageDialog(null,"Supplier Payment cannot save...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    private boolean Istextfieldcheck(){
        
        if(txtTotaldiscountforpnlMakepayment.getText().length()<=0 &txtTotalamountforpnlMakepayment.getText().length()<=0 & txtQtyforpnlMakepayment.getText().length()<=0 ){
            return false;
        }
        return true;
    }
    private void cleartextfield(){
        
        
        cmbGoodreceivenoforpnlMakepayment.setSelectedIndex(0);
        cmbPaymentIDforpnlMakepayment.setSelectedIndex(0);
        txtTotaldiscountforpnlMakepayment.setText("0");
        txtTotalamountforpnlMakepayment.setText("0");
        txtQtyforpnlMakepayment.setText("0");
        cmbBatchnoforpnlMakepayment.setSelectedIndex(0);
        cmbOrderIdforpnlMakepayment.setSelectedIndex(0);
    }
    private void Selectgrnandgetpayment(){
    DefaultTableModel dtm=(DefaultTableModel)tblGoodreceivenoteforpnlMakepayment.getModel();
    DefaultTableModel dtm2=(DefaultTableModel)tblPaymentforpnlMakepayment.getModel();
    int tbl1row=tblGoodreceivenoteforpnlMakepayment.getSelectedRow();
    int tbl2row=tblPaymentforpnlMakepayment.getSelectedRow();
    
    String paymentid=(String) dtm.getValueAt(tbl1row,3);
        try {
            Supplierpayment [] supplierpayment=SupplierpaymentController.searchandshow(paymentid);
            dtm2.setRowCount(0);
            for(Supplierpayment sp:supplierpayment){
                Object [] row={sp.getPaymentID(),sp.getDate(),sp.getAmount()};
                dtm2.addRow(row);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    private void loadGRNtable(){
     DefaultTableModel dtm=(DefaultTableModel)tblGoodreceivenoteforpnlMakepayment.getModel();
        try {
            Goodreceivenote [] goodreceivenote=GoodreceivenoteController.showGRN();
            dtm.setRowCount(0);
            for(Goodreceivenote grn:goodreceivenote){
            Object [] row={grn.getGRNno(),grn.getBatchno(),grn.getOrderID(),grn.getPaymentID(),grn.getTotaldiscount(),grn.getTotalamount(),grn.getQty()};
            dtm.addRow(row);
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    private void updatetwotables(){
        try{
        DefaultTableModel dtm=(DefaultTableModel)tblGoodreceivenoteforpnlMakepayment.getModel();
        DefaultTableModel dtm2=(DefaultTableModel)tblPaymentforpnlMakepayment.getModel();
        int tbl1row=tblGoodreceivenoteforpnlMakepayment.getSelectedRow();
        int tbl2row=tblPaymentforpnlMakepayment.getSelectedRow();
        
        if(tbl1row<0){
            JOptionPane.showMessageDialog(null,"Please select a row each table");
        }else{
        
         String goodreceiveno=(String) dtm.getValueAt(tbl1row,0);
        String batchno=(String) dtm.getValueAt(tbl1row,1);
        String orderid=(String) dtm.getValueAt(tbl1row, 2);
        String paymentid=(String) dtm.getValueAt(tbl1row,3);
        double totaldiscount=(double) dtm.getValueAt(tbl1row,4);
        double amount=(double) dtm.getValueAt(tbl1row,5);
        double qty=(double) dtm.getValueAt(tbl1row,6);
        
        String Paymentidd=(String) dtm2.getValueAt(tbl2row,0);
        String date=(String) dtm2.getValueAt(tbl2row,1);
        double tqty=(double) dtm2.getValueAt(tbl2row,2);
        
        Goodreceivenote goodreceivenote=new Goodreceivenote(goodreceiveno,batchno,orderid,paymentid,totaldiscount,amount,qty);
        Supplierpayment supplierpayment=new Supplierpayment(paymentid,date,tqty);
            try {
                boolean isUpdated=GoodreceivenoteController.allUpdate(goodreceivenote,supplierpayment);
                if(isUpdated){
                JOptionPane.showMessageDialog(null,"Successfully Updated");
                }else{
                JOptionPane.showMessageDialog(null,"Can't update...");
                }
            } catch (SQLException | ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null,"Successfully Updated");
        }
    }
    private void loadallcboxes(){
       
        try {
             ArrayList<String>grnno=GoodreceivenoteController.getgrnno();
             ArrayList<String>paymentid=SupplierpaymentController.getpaymentid();
             ArrayList<String>batchno=BatchController.showbatchno();
             ArrayList<String>orderid=SupplierorderController.getallorderid();
             
             for(String g:grnno){
             cmbGoodreceivenoforpnlMakepayment.addItem(g);
             }
             for(String p:paymentid){
             cmbPaymentIDforpnlMakepayment.addItem(p);
             }
             for(String b:batchno){
             cmbBatchnoforpnlMakepayment.addItem(b);
             }
             for(String o:orderid){
             cmbOrderIdforpnlMakepayment.addItem(o);
             }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }

    private void loaddate() {
        Date dt=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(dt);
        txtDateforpnlMakepayment.setText(date);
        txtDateforpnlMakepayment.setEditable(false);
    }
    private void deletepayment(){
         DefaultTableModel dtm=(DefaultTableModel)tblGoodreceivenoteforpnlMakepayment.getModel();
         DefaultTableModel dtm2=(DefaultTableModel)tblPaymentforpnlMakepayment.getModel();
         int row=tblGoodreceivenoteforpnlMakepayment.getSelectedRow();
         String grnno=(String) dtm.getValueAt(row,0);
         String paymentid=(String) dtm.getValueAt(row,3);
         
        try {
            boolean Isdeleted=GoodreceivenoteController.deleteall(grnno,paymentid);
            if(Isdeleted){
            JOptionPane.showMessageDialog(null,"Payment Delete...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
//    private void checktablecell(){
//     DefaultTableModel dtm=(DefaultTableModel)tblGoodreceivenoteforpnlMakepayment.getModel();
//        DefaultTableModel dtm2=(DefaultTableModel)tblPaymentforpnlMakepayment.getModel();
//        int tbl1row=tblGoodreceivenoteforpnlMakepayment.getSelectedRow();
//        int tbl2row=tblPaymentforpnlMakepayment.getSelectedRow();
//        
//         String goodreceiveno=(String) dtm.getValueAt(tbl1row,0);
//        String batchno=(String) dtm.getValueAt(tbl1row,1);
//        String orderid=(String) dtm.getValueAt(tbl1row, 2);
//        String paymentid=(String) dtm.getValueAt(tbl1row,3);
//        double totaldiscount=(double) dtm.getValueAt(tbl1row,4);  String totaldiscount1=Double.toString(totaldiscount);
//        double amount=(double) dtm.getValueAt(tbl1row,5);   String amount1=Double.toString(amount);
//        double qty=(double) dtm.getValueAt(tbl1row,6);      String qty1=Double.toString(qty);
//        
//        String Paymentidd=(String) dtm2.getValueAt(tbl2row,0);
//        String date=(String) dtm2.getValueAt(tbl2row,1);
//        double tqty=(double) dtm2.getValueAt(tbl2row,2);
//        
//      
//        boolean tbl1check=Makepaymentvalidation.checktable(goodreceiveno,batchno,orderid,paymentid,totaldiscount1,amount1,qty1);
//        if(tbl1check){
////        addpaymentforsupplier();
//            
//        }else{
//         JOptionPane.showMessageDialog(null,"Invalid test");
//        }
//    }
}

