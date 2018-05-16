
package MainFrame;

import Controller.CustomerController;
import Controller.CustomerpaymentController;
import Controller.ServicecategoryController;
import Controller.ServicedetailsController;
import Controller.ServiceinvoiceController;
import Controller.ServiceitemdetailsController;
import Controller.VehicleController;
import Model.Customer;
import Model.Customerpayment;
import Model.Servicecategory;
import Model.Servicedetails;
import Model.Serviceinvoice;
import Model.Vehicle;
import Model.serviceitemdetails;
import Validation.Viewinvoicedetailsvalidation;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewInvoicedetails extends javax.swing.JFrame {

    public ViewInvoicedetails() {
        initComponents();
        Frame();
        loadalltables();
        txtCustomernameforViewinvoicedetails.setEditable(false);
        txtServicetypeforViewinvoicedetails.setEditable(false);
        txtaDescriptionforViewinvoice.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtCustomernameforViewinvoicedetails = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtInvoicenoforViewinvoicedetails = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCustomerpaymentforViewinvoicedetails = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        btnCustomerpaymentUpdateforViewinvoicedetails = new javax.swing.JButton();
        btnCustomerpaymenttableDeleteforViewinvoicedetails = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblServiceitemdetailsforViewinvoicedetails = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        btnServiceitemdetailsforViewinvoicedetails = new javax.swing.JButton();
        btnServiceitemdetailstableDeleteforViewinvoicedetails = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblServiceinvoiceforViewinvoicedetails = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        btnUpdateServiceinvoiceforViewinvoicedetails = new javax.swing.JButton();
        btnServiceinvoicetableDeleteforViewinvoicedetails = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblServicedetailsforViewinvoicedetails = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtServicetypeforViewinvoicedetails = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnRefreshforViewinvoicedetails = new javax.swing.JButton();
        btnUpdateAllforViewinvoicedetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescriptionforViewinvoice = new javax.swing.JTextArea();
        btnDeleteforViewinvoicedetails = new javax.swing.JButton();
        btnSearchforViewinvoicedetails = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCloseforViewinvoicedetails = new javax.swing.JLabel();
        lblMaximizeforViewinvoicedetails = new javax.swing.JLabel();
        lblMinimizeforViewinvoicedetails = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Customer Name");

        jLabel5.setText("Invoice No");

        txtInvoicenoforViewinvoicedetails.setToolTipText("Enter Invoice No to search");
        txtInvoicenoforViewinvoicedetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInvoicenoforViewinvoicedetailsKeyPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Customer Payments", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblCustomerpaymentforViewinvoicedetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment ID", "Invoice No", "Amount", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomerpaymentforViewinvoicedetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerpaymentforViewinvoicedetailsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCustomerpaymentforViewinvoicedetails);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnCustomerpaymentUpdateforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerpaymentUpdateforViewinvoicedetails.setText("Update");
        btnCustomerpaymentUpdateforViewinvoicedetails.setToolTipText("Update Customer Payment");
        btnCustomerpaymentUpdateforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerpaymentUpdateforViewinvoicedetailsActionPerformed(evt);
            }
        });

        btnCustomerpaymenttableDeleteforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerpaymenttableDeleteforViewinvoicedetails.setText("Delete");
        btnCustomerpaymenttableDeleteforViewinvoicedetails.setToolTipText("Delete row from Customer Payment Table");
        btnCustomerpaymenttableDeleteforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerpaymenttableDeleteforViewinvoicedetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCustomerpaymentUpdateforViewinvoicedetails, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(btnCustomerpaymenttableDeleteforViewinvoicedetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCustomerpaymentUpdateforViewinvoicedetails)
                                .addGap(18, 18, 18)
                                .addComponent(btnCustomerpaymenttableDeleteforViewinvoicedetails)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Service Item Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblServiceitemdetailsforViewinvoicedetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Batch N0", "QTY", "Total Discount", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblServiceitemdetailsforViewinvoicedetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServiceitemdetailsforViewinvoicedetailsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblServiceitemdetailsforViewinvoicedetails);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnServiceitemdetailsforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnServiceitemdetailsforViewinvoicedetails.setText("Update");
        btnServiceitemdetailsforViewinvoicedetails.setToolTipText("Update Service Item Details Table");
        btnServiceitemdetailsforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceitemdetailsforViewinvoicedetailsActionPerformed(evt);
            }
        });

        btnServiceitemdetailstableDeleteforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnServiceitemdetailstableDeleteforViewinvoicedetails.setText("Delete");
        btnServiceitemdetailstableDeleteforViewinvoicedetails.setToolTipText("Delete row from Service Item Detail");
        btnServiceitemdetailstableDeleteforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceitemdetailstableDeleteforViewinvoicedetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnServiceitemdetailsforViewinvoicedetails, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(btnServiceitemdetailstableDeleteforViewinvoicedetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnServiceitemdetailsforViewinvoicedetails)
                                .addGap(18, 18, 18)
                                .addComponent(btnServiceitemdetailstableDeleteforViewinvoicedetails)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Service Invoice", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblServiceinvoiceforViewinvoicedetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Vehicle No", "Milage", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblServiceinvoiceforViewinvoicedetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServiceinvoiceforViewinvoicedetailsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblServiceinvoiceforViewinvoicedetails);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnUpdateServiceinvoiceforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateServiceinvoiceforViewinvoicedetails.setText("Update");
        btnUpdateServiceinvoiceforViewinvoicedetails.setToolTipText("Update Service Invoice Table");
        btnUpdateServiceinvoiceforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateServiceinvoiceforViewinvoicedetailsActionPerformed(evt);
            }
        });

        btnServiceinvoicetableDeleteforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnServiceinvoicetableDeleteforViewinvoicedetails.setText("Delete");
        btnServiceinvoicetableDeleteforViewinvoicedetails.setToolTipText("Delete row from Service Invoice Table");
        btnServiceinvoicetableDeleteforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceinvoicetableDeleteforViewinvoicedetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateServiceinvoiceforViewinvoicedetails, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(btnServiceinvoicetableDeleteforViewinvoicedetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnUpdateServiceinvoiceforViewinvoicedetails)
                                .addGap(18, 18, 18)
                                .addComponent(btnServiceinvoicetableDeleteforViewinvoicedetails))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Service Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblServicedetailsforViewinvoicedetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Category ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblServicedetailsforViewinvoicedetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServicedetailsforViewinvoicedetailsMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblServicedetailsforViewinvoicedetails);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Vehicle Type");

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        btnRefreshforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnRefreshforViewinvoicedetails.setText("Refresh");
        btnRefreshforViewinvoicedetails.setToolTipText("Refresh Tables");
        btnRefreshforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshforViewinvoicedetailsActionPerformed(evt);
            }
        });

        btnUpdateAllforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateAllforViewinvoicedetails.setText("Update All");
        btnUpdateAllforViewinvoicedetails.setToolTipText("Update All Tables at once");
        btnUpdateAllforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAllforViewinvoicedetailsActionPerformed(evt);
            }
        });

        jLabel2.setText("Description");

        txtaDescriptionforViewinvoice.setColumns(20);
        txtaDescriptionforViewinvoice.setRows(5);
        jScrollPane1.setViewportView(txtaDescriptionforViewinvoice);

        btnDeleteforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteforViewinvoicedetails.setText("Delete Invoice");
        btnDeleteforViewinvoicedetails.setToolTipText("Delete Customer Invoice");
        btnDeleteforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteforViewinvoicedetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(btnDeleteforViewinvoicedetails, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateAllforViewinvoicedetails)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefreshforViewinvoicedetails))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtServicetypeforViewinvoicedetails, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtServicetypeforViewinvoicedetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefreshforViewinvoicedetails)
                            .addComponent(btnUpdateAllforViewinvoicedetails)
                            .addComponent(btnDeleteforViewinvoicedetails))
                        .addGap(9, 9, 9))))
        );

        btnSearchforViewinvoicedetails.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchforViewinvoicedetails.setText("Search");
        btnSearchforViewinvoicedetails.setToolTipText("Search Invoice No");
        btnSearchforViewinvoicedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchforViewinvoicedetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtCustomernameforViewinvoicedetails, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtInvoicenoforViewinvoicedetails, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchforViewinvoicedetails))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCustomernameforViewinvoicedetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtInvoicenoforViewinvoicedetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchforViewinvoicedetails))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

        lblCloseforViewinvoicedetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCloseforViewinvoicedetails.setForeground(new java.awt.Color(204, 0, 51));
        lblCloseforViewinvoicedetails.setText("X");
        lblCloseforViewinvoicedetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseforViewinvoicedetailsMouseClicked(evt);
            }
        });

        lblMaximizeforViewinvoicedetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMaximizeforViewinvoicedetails.setForeground(new java.awt.Color(255, 255, 255));
        lblMaximizeforViewinvoicedetails.setText("+");
        lblMaximizeforViewinvoicedetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaximizeforViewinvoicedetailsMouseClicked(evt);
            }
        });

        lblMinimizeforViewinvoicedetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimizeforViewinvoicedetails.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizeforViewinvoicedetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizeforViewinvoicedetails.setText("-");
        lblMinimizeforViewinvoicedetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeforViewinvoicedetailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizeforViewinvoicedetails)
                .addGap(18, 18, 18)
                .addComponent(lblMaximizeforViewinvoicedetails)
                .addGap(18, 18, 18)
                .addComponent(lblCloseforViewinvoicedetails)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCloseforViewinvoicedetails)
                    .addComponent(lblMaximizeforViewinvoicedetails)
                    .addComponent(lblMinimizeforViewinvoicedetails))
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

    private void lblMinimizeforViewinvoicedetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeforViewinvoicedetailsMouseClicked
         setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeforViewinvoicedetailsMouseClicked

    private void lblMaximizeforViewinvoicedetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaximizeforViewinvoicedetailsMouseClicked
         GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
         GraphicsDevice[] g=env.getScreenDevices();
         g[0].setFullScreenWindow(g[0].getFullScreenWindow()==this?null:this);
    }//GEN-LAST:event_lblMaximizeforViewinvoicedetailsMouseClicked

    private void lblCloseforViewinvoicedetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseforViewinvoicedetailsMouseClicked
            this.hide();
    }//GEN-LAST:event_lblCloseforViewinvoicedetailsMouseClicked

    private void btnSearchforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchforViewinvoicedetailsActionPerformed
        getsearch();
    }//GEN-LAST:event_btnSearchforViewinvoicedetailsActionPerformed

    private void txtInvoicenoforViewinvoicedetailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInvoicenoforViewinvoicedetailsKeyPressed
       if(evt.getKeyChar()==KeyEvent.VK_ENTER){
           String grnno=txtInvoicenoforViewinvoicedetails.getText();
          boolean isgrnnochecked= Viewinvoicedetailsvalidation.checkgrnno(grnno);
          if(isgrnnochecked){
           getsearch();
          }else{
          JOptionPane.showMessageDialog(null,"Invalid Good receive number");
          }
       }
    }//GEN-LAST:event_txtInvoicenoforViewinvoicedetailsKeyPressed

    private void tblCustomerpaymentforViewinvoicedetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerpaymentforViewinvoicedetailsMouseClicked
          DefaultTableModel dtm=(DefaultTableModel)tblCustomerpaymentforViewinvoicedetails.getModel();
          int row=tblCustomerpaymentforViewinvoicedetails.getSelectedRow();
            String invoiceno=(String) dtm.getValueAt(row,1);
               try{
               Serviceinvoice vehicleno=ServiceinvoiceController.searchserviceinvoice(invoiceno);
  
            if(vehicleno!=null){
                Vehicle customername=VehicleController.getCustomerid(vehicleno.getVehicleno());
                if(customername!=null){
                    Customer customer=CustomerController.getName(customername.getCustomerID());
                    if(customer!=null){
                    txtCustomernameforViewinvoicedetails.setText(customer.getName());
                    }
                }else{
                JOptionPane.showMessageDialog(null,"Can't find customer in that name");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Cannot find vehicleno");
            }
               }catch(SQLException | ClassNotFoundException ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
               }
    }//GEN-LAST:event_tblCustomerpaymentforViewinvoicedetailsMouseClicked

    private void tblServiceitemdetailsforViewinvoicedetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServiceitemdetailsforViewinvoicedetailsMouseClicked
         DefaultTableModel dtm=(DefaultTableModel)tblServiceitemdetailsforViewinvoicedetails.getModel();
          int row=tblServiceitemdetailsforViewinvoicedetails.getSelectedRow();
            String invoiceno=(String) dtm.getValueAt(row,0);
               try{
               Serviceinvoice vehicleno=ServiceinvoiceController.searchserviceinvoice(invoiceno);
  
            if(vehicleno!=null){
                Vehicle customername=VehicleController.getCustomerid(vehicleno.getVehicleno());
                if(customername!=null){
                    Customer customer=CustomerController.getName(customername.getCustomerID());
                    if(customer!=null){
                    txtCustomernameforViewinvoicedetails.setText(customer.getName());
                    }
                }else{
                JOptionPane.showMessageDialog(null,"Can't find customer in that name");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Cannot find vehicleno");
            }
               }catch(SQLException | ClassNotFoundException ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
               }
    }//GEN-LAST:event_tblServiceitemdetailsforViewinvoicedetailsMouseClicked

    private void tblServiceinvoiceforViewinvoicedetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServiceinvoiceforViewinvoicedetailsMouseClicked
        DefaultTableModel dtm=(DefaultTableModel)tblServiceinvoiceforViewinvoicedetails.getModel();
          int row=tblServiceinvoiceforViewinvoicedetails.getSelectedRow();
            String invoiceno=(String) dtm.getValueAt(row,0);
               try{
               Serviceinvoice vehicleno=ServiceinvoiceController.searchserviceinvoice(invoiceno);
  
            if(vehicleno!=null){
                Vehicle customername=VehicleController.getCustomerid(vehicleno.getVehicleno());
                if(customername!=null){
                    Customer customer=CustomerController.getName(customername.getCustomerID());
                    if(customer!=null){
                    txtCustomernameforViewinvoicedetails.setText(customer.getName());
                    }
                }else{
                JOptionPane.showMessageDialog(null,"Can't find customer in that name");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Cannot find vehicleno");
            }
               }catch(SQLException | ClassNotFoundException ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
               }
    }//GEN-LAST:event_tblServiceinvoiceforViewinvoicedetailsMouseClicked

    private void tblServicedetailsforViewinvoicedetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServicedetailsforViewinvoicedetailsMouseClicked
            getservicetype();
        DefaultTableModel dtm=(DefaultTableModel)tblServicedetailsforViewinvoicedetails.getModel();
          int row=tblServicedetailsforViewinvoicedetails.getSelectedRow();
            String invoiceno=(String) dtm.getValueAt(row,0);
               try{
               Serviceinvoice vehicleno=ServiceinvoiceController.searchserviceinvoice(invoiceno);
  
            if(vehicleno!=null){
                Vehicle customername=VehicleController.getCustomerid(vehicleno.getVehicleno());
                if(customername!=null){
                    Customer customer=CustomerController.getName(customername.getCustomerID());
                    if(customer!=null){
                    txtCustomernameforViewinvoicedetails.setText(customer.getName());
                    }
                }else{
                JOptionPane.showMessageDialog(null,"Can't find customer in that name");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Cannot find vehicleno");
            }
               }catch(SQLException | ClassNotFoundException ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
               }
    }//GEN-LAST:event_tblServicedetailsforViewinvoicedetailsMouseClicked

    private void btnCustomerpaymentUpdateforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerpaymentUpdateforViewinvoicedetailsActionPerformed
       updatetabletable1();
    }//GEN-LAST:event_btnCustomerpaymentUpdateforViewinvoicedetailsActionPerformed

    private void btnServiceitemdetailsforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceitemdetailsforViewinvoicedetailsActionPerformed
      updatetabletable2();
    }//GEN-LAST:event_btnServiceitemdetailsforViewinvoicedetailsActionPerformed

    private void btnUpdateServiceinvoiceforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateServiceinvoiceforViewinvoicedetailsActionPerformed
       updatetabletable3();
    }//GEN-LAST:event_btnUpdateServiceinvoiceforViewinvoicedetailsActionPerformed

    private void btnUpdateAllforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAllforViewinvoicedetailsActionPerformed
       updatetabletable1();
         updatetabletable2();
            updatetabletable3();
    }//GEN-LAST:event_btnUpdateAllforViewinvoicedetailsActionPerformed

    private void btnRefreshforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshforViewinvoicedetailsActionPerformed
        loadalltables();
    }//GEN-LAST:event_btnRefreshforViewinvoicedetailsActionPerformed

    private void btnDeleteforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteforViewinvoicedetailsActionPerformed
       deletepayment();
    }//GEN-LAST:event_btnDeleteforViewinvoicedetailsActionPerformed

    private void btnCustomerpaymenttableDeleteforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerpaymenttableDeleteforViewinvoicedetailsActionPerformed
       DefaultTableModel dtm=(DefaultTableModel)tblCustomerpaymentforViewinvoicedetails.getModel();
       int row=tblCustomerpaymentforViewinvoicedetails.getSelectedRow();
       dtm.removeRow(row);
    }//GEN-LAST:event_btnCustomerpaymenttableDeleteforViewinvoicedetailsActionPerformed

    private void btnServiceitemdetailstableDeleteforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceitemdetailstableDeleteforViewinvoicedetailsActionPerformed
       DefaultTableModel dtm2=(DefaultTableModel)tblServiceitemdetailsforViewinvoicedetails.getModel();
       int row=tblServiceitemdetailsforViewinvoicedetails.getSelectedRow();
       dtm2.removeRow(row);
    }//GEN-LAST:event_btnServiceitemdetailstableDeleteforViewinvoicedetailsActionPerformed

    private void btnServiceinvoicetableDeleteforViewinvoicedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceinvoicetableDeleteforViewinvoicedetailsActionPerformed
         DefaultTableModel dtm3=(DefaultTableModel)tblServiceinvoiceforViewinvoicedetails.getModel();
         int row=tblServiceinvoiceforViewinvoicedetails.getSelectedRow();
         dtm3.removeRow(row);
    }//GEN-LAST:event_btnServiceinvoicetableDeleteforViewinvoicedetailsActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInvoicedetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerpaymentUpdateforViewinvoicedetails;
    private javax.swing.JButton btnCustomerpaymenttableDeleteforViewinvoicedetails;
    private javax.swing.JButton btnDeleteforViewinvoicedetails;
    private javax.swing.JButton btnRefreshforViewinvoicedetails;
    private javax.swing.JButton btnSearchforViewinvoicedetails;
    private javax.swing.JButton btnServiceinvoicetableDeleteforViewinvoicedetails;
    private javax.swing.JButton btnServiceitemdetailsforViewinvoicedetails;
    private javax.swing.JButton btnServiceitemdetailstableDeleteforViewinvoicedetails;
    private javax.swing.JButton btnUpdateAllforViewinvoicedetails;
    private javax.swing.JButton btnUpdateServiceinvoiceforViewinvoicedetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblCloseforViewinvoicedetails;
    private javax.swing.JLabel lblMaximizeforViewinvoicedetails;
    private javax.swing.JLabel lblMinimizeforViewinvoicedetails;
    private javax.swing.JTable tblCustomerpaymentforViewinvoicedetails;
    private javax.swing.JTable tblServicedetailsforViewinvoicedetails;
    private javax.swing.JTable tblServiceinvoiceforViewinvoicedetails;
    private javax.swing.JTable tblServiceitemdetailsforViewinvoicedetails;
    private javax.swing.JTextField txtCustomernameforViewinvoicedetails;
    private javax.swing.JTextField txtInvoicenoforViewinvoicedetails;
    private javax.swing.JTextField txtServicetypeforViewinvoicedetails;
    private javax.swing.JTextArea txtaDescriptionforViewinvoice;
    // End of variables declaration//GEN-END:variables

    private void Frame() {
        GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] g=env.getScreenDevices();
        g[0].setFullScreenWindow(g[0].getFullScreenWindow()==this?null:this);
    }
    private void getsearch(){
        String invoiceno=txtInvoicenoforViewinvoicedetails.getText();
        
        try {
            Customerpayment [] customerpayment=CustomerpaymentController.searchbyinvoiceno(invoiceno);
            serviceitemdetails [] serviceitemdetails=ServiceitemdetailsController.searchitemdetails(invoiceno);
            Serviceinvoice [] serviceinvoice=ServiceinvoiceController.searchinvoicedetails(invoiceno);
            Servicedetails [] servicedetails=ServicedetailsController.searchservice(invoiceno);
            Serviceinvoice vehicleno=ServiceinvoiceController.searchserviceinvoice(invoiceno);
            if(vehicleno!=null){
                Vehicle customername=VehicleController.getCustomerid(vehicleno.getVehicleno());
                if(customername!=null){
                    Customer customer=CustomerController.getName(customername.getCustomerID());
                    if(customer!=null){
                    txtCustomernameforViewinvoicedetails.setText(customer.getName());
                    }
                }else{
                JOptionPane.showMessageDialog(null,"Can't find customer in that name");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Cannot find vehicleno");
            }
            DefaultTableModel dtm=(DefaultTableModel)tblCustomerpaymentforViewinvoicedetails.getModel();
            dtm.setRowCount(0);
            for(Customerpayment cp:customerpayment){
                Object [] rows={cp.getPaymentID(),cp.getInvoiceno(),cp.getAmount(),cp.getDate()};
                dtm.addRow(rows);
            }
            DefaultTableModel dtm2=(DefaultTableModel)tblServiceitemdetailsforViewinvoicedetails.getModel();
            dtm2.setRowCount(0);
            for(serviceitemdetails sd:serviceitemdetails){
                Object [] row={sd.getInvoiceno(),sd.getBatchno(),sd.getQty(),sd.getTotaldiscount(),sd.getTotalamount()};
                dtm2.addRow(row);
            }
             DefaultTableModel dtm3=(DefaultTableModel)tblServiceinvoiceforViewinvoicedetails.getModel();
             dtm3.setRowCount(0);
             for(Serviceinvoice si:serviceinvoice){
                 Object[] row={si.getInvoiceno(),si.getVehicleno(),si.getMilage(),si.getDate()};
                 dtm3.addRow(row);
             }
              DefaultTableModel dtm4=(DefaultTableModel)tblServicedetailsforViewinvoicedetails.getModel();
              dtm4.setRowCount(0);
              for(Servicedetails s:servicedetails){
                  Object [] row={s.getInvoiceno(),s.getCategoryID()};
                  dtm4.addRow(row);
              }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void loadalltables(){
     try {
            Customerpayment [] customerpayment=CustomerpaymentController.getAll();
            serviceitemdetails [] serviceitemdetails=ServiceitemdetailsController.showserviceitem();
            Serviceinvoice [] serviceinvoice=ServiceinvoiceController.showserviceinvoice();
            Servicedetails [] servicedetails=ServicedetailsController.showbatch();
             DefaultTableModel dtm=(DefaultTableModel)tblCustomerpaymentforViewinvoicedetails.getModel();
              DefaultTableModel dtm2=(DefaultTableModel)tblServiceitemdetailsforViewinvoicedetails.getModel();
              DefaultTableModel dtm3=(DefaultTableModel)tblServiceinvoiceforViewinvoicedetails.getModel();
               DefaultTableModel dtm4=(DefaultTableModel)tblServicedetailsforViewinvoicedetails.getModel();
               

           
            dtm.setRowCount(0);
            for(Customerpayment cp:customerpayment){
                Object [] rows={cp.getPaymentID(),cp.getInvoiceno(),cp.getAmount(),cp.getDate()};
                dtm.addRow(rows);
            }
           
            dtm2.setRowCount(0);
            for(serviceitemdetails sd:serviceitemdetails){
                Object [] row={sd.getInvoiceno(),sd.getBatchno(),sd.getQty(),sd.getTotaldiscount(),sd.getTotalamount()};
                dtm2.addRow(row);
            }
             
             dtm3.setRowCount(0);
             for(Serviceinvoice si:serviceinvoice){
                 Object[] row={si.getInvoiceno(),si.getVehicleno(),si.getMilage(),si.getDate()};
                 dtm3.addRow(row);
             }
             
              dtm4.setRowCount(0);
              for(Servicedetails s:servicedetails){
                  Object [] row={s.getInvoiceno(),s.getCategoryID()};
                  dtm4.addRow(row);
              }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }
    private void updatetabletable1(){
         DefaultTableModel dtm=(DefaultTableModel)tblCustomerpaymentforViewinvoicedetails.getModel();
          int row=tblCustomerpaymentforViewinvoicedetails.getSelectedRow();
          if(row>0){
          String paymentid=(String) dtm.getValueAt(row,0);
          String invoiceno=(String) dtm.getValueAt(row,1);
          double amount=(double) dtm.getValueAt(row,2);
          String date=(String) dtm.getValueAt(row, 3);
          Customerpayment customerpayment=new Customerpayment(paymentid,invoiceno,amount,date);
        try {
            boolean isUpdated=CustomerpaymentController.updatecustomerpayment(customerpayment);
            if(isUpdated){
                JOptionPane.showMessageDialog(null,"Updated...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage());
        }
          }else{
          JOptionPane.showMessageDialog(null,"Please select a row");
          }
    }
    private void updatetabletable2(){
          DefaultTableModel dtm2=(DefaultTableModel)tblServiceitemdetailsforViewinvoicedetails.getModel();
          int row=tblServiceitemdetailsforViewinvoicedetails.getSelectedRow();
          if(row>0){
          String invoiceno=(String) dtm2.getValueAt(row,0);
          String batchno=(String) dtm2.getValueAt(row,1);
          double qty=(double) dtm2.getValueAt(row,2);
          double totaldiscount=(double) dtm2.getValueAt(row,3);
          double totalamount=(double) dtm2.getValueAt(row,4);
          
          serviceitemdetails serviceitemdetails=new serviceitemdetails(invoiceno,batchno,qty,totaldiscount,totalamount);
        try {
            boolean isUpdated=ServiceitemdetailsController.Updateserviceitems(serviceitemdetails);
            if(isUpdated){
                JOptionPane.showMessageDialog(null,"Updated...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null,ex.getMessage());
        }
          }else{
          JOptionPane.showMessageDialog(null,"Please select a row");
          }
    }
    private void updatetabletable3(){
      DefaultTableModel dtm3=(DefaultTableModel)tblServiceinvoiceforViewinvoicedetails.getModel();
       int row=tblServiceinvoiceforViewinvoicedetails.getSelectedRow();
       if(row>0){
      String invoiceno=(String) dtm3.getValueAt(row,0);
      String vehicleno=(String) dtm3.getValueAt(row,1);
      double milage=(double) dtm3.getValueAt(row,2);
      String date=(String) dtm3.getValueAt(row,3);
      
      Serviceinvoice serviceinvoice=new Serviceinvoice(invoiceno,vehicleno,milage,date);
        try {
            boolean isUpdated=ServiceinvoiceController.Updateserviceinvoice(serviceinvoice);
            if(isUpdated){
                JOptionPane.showMessageDialog(null,"Updated...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage());
        }
       }else{
       JOptionPane.showMessageDialog(null,"Please select a row");
       }
    }
    private void deletepayment(){
         DefaultTableModel dtm=(DefaultTableModel)tblCustomerpaymentforViewinvoicedetails.getModel();
         int row=tblCustomerpaymentforViewinvoicedetails.getSelectedRow();
         if(row>0){
         String paymentID=(String) dtm.getValueAt(row,0);
         String invoiceno=(String) dtm.getValueAt(row,1);
         txtServicetypeforViewinvoicedetails.setText(paymentID);
        try {
            boolean IsDeleted=CustomerpaymentController.deletepayment(paymentID,invoiceno);
            if(IsDeleted){
                JOptionPane.showMessageDialog(null,"Delete Payment Details");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot Delete...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         }else{
         JOptionPane.showMessageDialog(null,"Please select a row");
         }
    }
    private void getservicetype(){
        DefaultTableModel dtm4=(DefaultTableModel)tblServicedetailsforViewinvoicedetails.getModel();
        int row=tblServicedetailsforViewinvoicedetails.getSelectedRow();
        if(row>0){
        String categoryID=(String)dtm4.getValueAt(row,1);
        try {
            Servicecategory servicecategory=ServicecategoryController.searchservicecategory(categoryID);
            if(servicecategory!=null){
                txtServicetypeforViewinvoicedetails.setText(servicecategory.getVehicletype());
                txtaDescriptionforViewinvoice.setText(servicecategory.getDescription());
            }
        } catch (SQLException | ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }else{
        JOptionPane.showMessageDialog(null,"Please select a row");
        }
    }
}
