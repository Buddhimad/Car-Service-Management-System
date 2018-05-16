
package MainFrame;
import Controller.SupplierController;
import Controller.SupplierorderController;
import Model.Supplier;
import Model.Supplierorder;
import Validation.Manageordervalidation;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
public class pnlManageOrders extends javax.swing.JPanel {

  
    public pnlManageOrders() {
        initComponents();
        loadsupplierid();
        loadDate();
        loadorderid();
        // btnAddorderdetailsforManageorders.setEnabled(false);
        loadallsupplierrid();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlOrderdetailsforManageorders = new javax.swing.JPanel();
        pnlSupplierorderforManageorders = new javax.swing.JPanel();
        lblOrderIDforManageorders = new javax.swing.JLabel();
        lblDateforManageorders = new javax.swing.JLabel();
        jsSupplierOrderforManageorders = new javax.swing.JSeparator();
        btnAddorderdetailsforManageorders = new javax.swing.JButton();
        txtDateforManageOrders = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbSupplierIDforpnlManageorders = new javax.swing.JComboBox<>();
        lblSNameforpnlManageorders = new javax.swing.JLabel();
        cmbOrderIDforManageorders = new javax.swing.JComboBox<>();
        lblshoworderidforpnlManageorders = new javax.swing.JLabel();
        btnLoadSupplieridforpnlManageorders = new javax.swing.JButton();
        btnLoadOrderidforpnlManageorder = new javax.swing.JButton();
        pnlSupplierforManageorders = new javax.swing.JPanel();
        lblSupplierIDforManageorders = new javax.swing.JLabel();
        lblNameforManageorders = new javax.swing.JLabel();
        lblAddressforManageorders = new javax.swing.JLabel();
        lblCompanyforManageorders = new javax.swing.JLabel();
        lblDate2forManageorders = new javax.swing.JLabel();
        lblBatchforManageOrders = new javax.swing.JLabel();
        jsSupplierforManageorders = new javax.swing.JSeparator();
        txtNameforManageorders = new javax.swing.JTextField();
        txtAddressforManageorders = new javax.swing.JTextField();
        txtCompanyforManageorders = new javax.swing.JTextField();
        txtDate2forManageorders = new javax.swing.JTextField();
        btnSupplierConfirmforManageorders = new javax.swing.JButton();
        btnViewOrdersforManageorders = new javax.swing.JButton();
        btnReturnforManageOrders = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtContactNoforManageorders = new javax.swing.JFormattedTextField();
        cmbSupplierIDforManageorders = new javax.swing.JComboBox<>();
        lblshowsupplieridforpnlManageorders = new javax.swing.JLabel();
        btnLoadSupplieridforpnlManageorder = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pnlOrderdetailsforManageorders.setBackground(new java.awt.Color(153, 153, 255));
        pnlOrderdetailsforManageorders.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Order Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        pnlSupplierorderforManageorders.setBackground(new java.awt.Color(153, 153, 255));
        pnlSupplierorderforManageorders.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Supplier Order", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblOrderIDforManageorders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrderIDforManageorders.setText("Order ID");

        lblDateforManageorders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDateforManageorders.setText("Date");

        jsSupplierOrderforManageorders.setForeground(new java.awt.Color(255, 255, 255));

        btnAddorderdetailsforManageorders.setBackground(new java.awt.Color(255, 255, 255));
        btnAddorderdetailsforManageorders.setText("Add Order Details");
        btnAddorderdetailsforManageorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddorderdetailsforManageordersActionPerformed(evt);
            }
        });

        txtDateforManageOrders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtDateforManageOrders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateforManageOrdersKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateforManageOrdersKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Supplier Order Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/Status-mail-task-icon (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Supplier ID");

        cmbSupplierIDforpnlManageorders.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSupplierIDforpnlManageordersItemStateChanged(evt);
            }
        });

        lblSNameforpnlManageorders.setText(".....");

        cmbOrderIDforManageorders.setEditable(true);
        cmbOrderIDforManageorders.setToolTipText("");

        lblshoworderidforpnlManageorders.setText(".........");

        btnLoadSupplieridforpnlManageorders.setBackground(new java.awt.Color(153, 153, 255));
        btnLoadSupplieridforpnlManageorders.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoadSupplieridforpnlManageorders.setForeground(new java.awt.Color(255, 0, 102));
        btnLoadSupplieridforpnlManageorders.setText("Load");
        btnLoadSupplieridforpnlManageorders.setToolTipText("please click Twice Load Supplier ID");
        btnLoadSupplieridforpnlManageorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadSupplieridforpnlManageordersActionPerformed(evt);
            }
        });

        btnLoadOrderidforpnlManageorder.setBackground(new java.awt.Color(153, 153, 255));
        btnLoadOrderidforpnlManageorder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoadOrderidforpnlManageorder.setForeground(new java.awt.Color(255, 0, 102));
        btnLoadOrderidforpnlManageorder.setText("Load");
        btnLoadOrderidforpnlManageorder.setToolTipText("Please Click Twice Load last Order ID");
        btnLoadOrderidforpnlManageorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadOrderidforpnlManageorderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSupplierorderforManageordersLayout = new javax.swing.GroupLayout(pnlSupplierorderforManageorders);
        pnlSupplierorderforManageorders.setLayout(pnlSupplierorderforManageordersLayout);
        pnlSupplierorderforManageordersLayout.setHorizontalGroup(
            pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierorderforManageordersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsSupplierOrderforManageorders)
                    .addGroup(pnlSupplierorderforManageordersLayout.createSequentialGroup()
                        .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrderIDforManageorders)
                            .addComponent(lblDateforManageorders)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDateforManageOrders, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSupplierorderforManageordersLayout.createSequentialGroup()
                                .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbOrderIDforManageorders, javax.swing.GroupLayout.Alignment.LEADING, 0, 232, Short.MAX_VALUE)
                                    .addComponent(cmbSupplierIDforpnlManageorders, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSNameforpnlManageorders)
                                    .addComponent(lblshoworderidforpnlManageorders))
                                .addGap(28, 28, 28)
                                .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLoadOrderidforpnlManageorder)
                                    .addComponent(btnLoadSupplieridforpnlManageorders))))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSupplierorderforManageordersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddorderdetailsforManageorders)))
                .addContainerGap())
        );
        pnlSupplierorderforManageordersLayout.setVerticalGroup(
            pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierorderforManageordersLayout.createSequentialGroup()
                .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlSupplierorderforManageordersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSupplierorderforManageordersLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOrderIDforManageorders)
                            .addComponent(cmbOrderIDforManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblshoworderidforpnlManageorders)
                                .addComponent(btnLoadOrderidforpnlManageorder)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbSupplierIDforpnlManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSNameforpnlManageorders)
                                .addComponent(btnLoadSupplieridforpnlManageorders))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDateforManageOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDateforManageorders))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jsSupplierOrderforManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSupplierorderforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddorderdetailsforManageorders)
                    .addComponent(jButton1)))
        );

        pnlSupplierforManageorders.setBackground(new java.awt.Color(153, 153, 255));
        pnlSupplierforManageorders.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Supplier", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblSupplierIDforManageorders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSupplierIDforManageorders.setText("Supplier ID");

        lblNameforManageorders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNameforManageorders.setText("Name");

        lblAddressforManageorders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAddressforManageorders.setText("Address");

        lblCompanyforManageorders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCompanyforManageorders.setText("Company");

        lblDate2forManageorders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate2forManageorders.setText("Contact No");

        lblBatchforManageOrders.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBatchforManageOrders.setText("Date");

        jsSupplierforManageorders.setForeground(new java.awt.Color(255, 255, 255));

        txtNameforManageorders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtNameforManageorders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameforManageordersKeyTyped(evt);
            }
        });

        txtAddressforManageorders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtAddressforManageorders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressforManageordersKeyTyped(evt);
            }
        });

        txtCompanyforManageorders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtCompanyforManageorders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCompanyforManageordersKeyTyped(evt);
            }
        });

        txtDate2forManageorders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnSupplierConfirmforManageorders.setBackground(new java.awt.Color(255, 255, 255));
        btnSupplierConfirmforManageorders.setText("Save");
        btnSupplierConfirmforManageorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierConfirmforManageordersActionPerformed(evt);
            }
        });

        btnViewOrdersforManageorders.setBackground(new java.awt.Color(255, 255, 255));
        btnViewOrdersforManageorders.setText("View Orders");
        btnViewOrdersforManageorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersforManageordersActionPerformed(evt);
            }
        });

        btnReturnforManageOrders.setBackground(new java.awt.Color(255, 255, 255));
        btnReturnforManageOrders.setText("Returns");
        btnReturnforManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnforManageOrdersActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/128 sup.png"))); // NOI18N

        try {
            txtContactNoforManageorders.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cmbSupplierIDforManageorders.setEditable(true);
        cmbSupplierIDforManageorders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbSupplierIDforManageordersKeyPressed(evt);
            }
        });

        lblshowsupplieridforpnlManageorders.setText(".........");
        lblshowsupplieridforpnlManageorders.setToolTipText("Today Last Registered Supplier's ID");

        btnLoadSupplieridforpnlManageorder.setBackground(new java.awt.Color(153, 153, 255));
        btnLoadSupplieridforpnlManageorder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoadSupplieridforpnlManageorder.setForeground(new java.awt.Color(255, 0, 102));
        btnLoadSupplieridforpnlManageorder.setText("Load");
        btnLoadSupplieridforpnlManageorder.setToolTipText("Please Click twice Load Last Supplier ID");
        btnLoadSupplieridforpnlManageorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadSupplieridforpnlManageorderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSupplierforManageordersLayout = new javax.swing.GroupLayout(pnlSupplierforManageorders);
        pnlSupplierforManageorders.setLayout(pnlSupplierforManageordersLayout);
        pnlSupplierforManageordersLayout.setHorizontalGroup(
            pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierforManageordersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsSupplierforManageorders)
                    .addGroup(pnlSupplierforManageordersLayout.createSequentialGroup()
                        .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSupplierIDforManageorders)
                            .addComponent(lblNameforManageorders)
                            .addComponent(lblAddressforManageorders)
                            .addComponent(lblCompanyforManageorders)
                            .addComponent(lblDate2forManageorders)
                            .addComponent(lblBatchforManageOrders))
                        .addGap(45, 45, 45)
                        .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSupplierforManageordersLayout.createSequentialGroup()
                                .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNameforManageorders)
                                    .addComponent(txtAddressforManageorders)
                                    .addComponent(txtCompanyforManageorders)
                                    .addComponent(txtDate2forManageorders, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                                    .addComponent(txtContactNoforManageorders))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlSupplierforManageordersLayout.createSequentialGroup()
                                .addComponent(cmbSupplierIDforManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblshowsupplieridforpnlManageorders)
                                .addGap(31, 31, 31)
                                .addComponent(btnLoadSupplieridforpnlManageorder)
                                .addGap(59, 59, 59)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSupplierforManageordersLayout.createSequentialGroup()
                        .addGap(0, 480, Short.MAX_VALUE)
                        .addComponent(btnReturnforManageOrders)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewOrdersforManageorders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSupplierConfirmforManageorders)))
                .addContainerGap())
        );
        pnlSupplierforManageordersLayout.setVerticalGroup(
            pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSupplierforManageordersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSupplierforManageordersLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSupplierIDforManageorders)
                            .addComponent(cmbSupplierIDforManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblshowsupplieridforpnlManageorders)
                            .addComponent(btnLoadSupplieridforpnlManageorder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNameforManageorders)
                            .addComponent(txtNameforManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddressforManageorders)
                            .addComponent(txtAddressforManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCompanyforManageorders)
                            .addComponent(txtCompanyforManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate2forManageorders)
                            .addComponent(txtContactNoforManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBatchforManageOrders)
                            .addComponent(txtDate2forManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlSupplierforManageordersLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jsSupplierforManageorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnlSupplierforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupplierConfirmforManageorders)
                    .addComponent(btnViewOrdersforManageorders)
                    .addComponent(btnReturnforManageOrders)))
        );

        javax.swing.GroupLayout pnlOrderdetailsforManageordersLayout = new javax.swing.GroupLayout(pnlOrderdetailsforManageorders);
        pnlOrderdetailsforManageorders.setLayout(pnlOrderdetailsforManageordersLayout);
        pnlOrderdetailsforManageordersLayout.setHorizontalGroup(
            pnlOrderdetailsforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderdetailsforManageordersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrderdetailsforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSupplierorderforManageorders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSupplierforManageorders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOrderdetailsforManageordersLayout.setVerticalGroup(
            pnlOrderdetailsforManageordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderdetailsforManageordersLayout.createSequentialGroup()
                .addComponent(pnlSupplierorderforManageorders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSupplierforManageorders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOrderdetailsforManageorders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOrderdetailsforManageorders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void btnReturnforManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnforManageOrdersActionPerformed
     ManageSupplierReturns msr=new ManageSupplierReturns();
     msr.setVisible(true);
      this.hide();
    }//GEN-LAST:event_btnReturnforManageOrdersActionPerformed

    private void btnViewOrdersforManageordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersforManageordersActionPerformed
       ViewOrders vieworders=new ViewOrders();
       vieworders.setVisible(true);
      // this.setEnabled(false);
      //this.setVisible(true);
    }//GEN-LAST:event_btnViewOrdersforManageordersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ViewGRN viewgrn=new ViewGRN();
      viewgrn.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSupplierConfirmforManageordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierConfirmforManageordersActionPerformed
            checkfield();
      
//       }else{
//       JOptionPane.showMessageDialog(null,"Please fill all informations");
//       }
    }//GEN-LAST:event_btnSupplierConfirmforManageordersActionPerformed
//lblSNameforpnlManageorders
    private void cmbSupplierIDforpnlManageordersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSupplierIDforpnlManageordersItemStateChanged
       String id=cmbSupplierIDforpnlManageorders.getSelectedItem().toString();
        try {
            Supplier s=SupplierController.searchsupplier(id);
            if(s!=null){
            lblSNameforpnlManageorders.setText(s.getName());
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbSupplierIDforpnlManageordersItemStateChanged

    private void btnAddorderdetailsforManageordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddorderdetailsforManageordersActionPerformed
       String supplierid1=cmbOrderIDforManageorders.getSelectedItem().toString();
        boolean isorderid=Manageordervalidation.checkorderid(supplierid1);
        if(isorderid){
            
        String oid=cmbOrderIDforManageorders.getSelectedItem().toString();
        String sid=cmbSupplierIDforpnlManageorders.getSelectedItem().toString();
        String date=txtDateforManageOrders.getText();
        String supplierid=cmbSupplierIDforManageorders.getSelectedItem().toString();
        
        Supplierorder so=new Supplierorder(oid,sid,date);
        try {
            Supplierorderdetails supplierorderdetails=new Supplierorderdetails();
            boolean isadded=SupplierorderController.addsupplierorder(so);
            if(isadded){
//            JOptionPane.showMessageDialog(null,"Save Order...");
           lblshoworderidforpnlManageorders.setText(oid);
            supplierorderdetails.txtOrderIDforSupplierorderdetails.setText(this.cmbOrderIDforManageorders.getSelectedItem().toString());
            supplierorderdetails.setVisible(true);
            
            }else{
               JOptionPane.showMessageDialog(null,"Can't Save Order...");  
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        }else{
        JOptionPane.showMessageDialog(null,"Invalid order id");
        }
    }//GEN-LAST:event_btnAddorderdetailsforManageordersActionPerformed
     
    private void txtDateforManageOrdersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateforManageOrdersKeyReleased
       ordertxtboxcheck();
    }//GEN-LAST:event_txtDateforManageOrdersKeyReleased

    private void txtDateforManageOrdersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateforManageOrdersKeyPressed
         ordertxtboxcheck();
    }//GEN-LAST:event_txtDateforManageOrdersKeyPressed

    private void txtNameforManageordersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameforManageordersKeyTyped
       Manageordervalidation.checkname(evt);
    }//GEN-LAST:event_txtNameforManageordersKeyTyped

    private void txtAddressforManageordersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressforManageordersKeyTyped
      Manageordervalidation.checkAddress(evt);
    }//GEN-LAST:event_txtAddressforManageordersKeyTyped

    private void txtCompanyforManageordersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompanyforManageordersKeyTyped
       Manageordervalidation.checkCompany(evt);
    }//GEN-LAST:event_txtCompanyforManageordersKeyTyped

    private void cmbSupplierIDforManageordersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbSupplierIDforManageordersKeyPressed
      String supplierid=cmbSupplierIDforManageorders.getSelectedItem().toString();
      boolean issupplierid=Manageordervalidation.checkorderid(supplierid);
        if(issupplierid){
            JOptionPane.showMessageDialog(null,"Invalid Order ID");
      }
    }//GEN-LAST:event_cmbSupplierIDforManageordersKeyPressed

    private void btnLoadOrderidforpnlManageorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadOrderidforpnlManageorderActionPerformed
        cmbOrderIDforManageorders.removeAllItems();
        loadorderid();
    }//GEN-LAST:event_btnLoadOrderidforpnlManageorderActionPerformed

    private void btnLoadSupplieridforpnlManageorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadSupplieridforpnlManageorderActionPerformed
      cmbSupplierIDforManageorders.removeAllItems();
        loadsupplierid();
    }//GEN-LAST:event_btnLoadSupplieridforpnlManageorderActionPerformed

    private void btnLoadSupplieridforpnlManageordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadSupplieridforpnlManageordersActionPerformed
        cmbSupplierIDforpnlManageorders.removeAllItems();
        loadallsupplierrid();
    }//GEN-LAST:event_btnLoadSupplieridforpnlManageordersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddorderdetailsforManageorders;
    private javax.swing.JButton btnLoadOrderidforpnlManageorder;
    private javax.swing.JButton btnLoadSupplieridforpnlManageorder;
    private javax.swing.JButton btnLoadSupplieridforpnlManageorders;
    private javax.swing.JButton btnReturnforManageOrders;
    private javax.swing.JButton btnSupplierConfirmforManageorders;
    private javax.swing.JButton btnViewOrdersforManageorders;
    private javax.swing.JComboBox<String> cmbOrderIDforManageorders;
    private javax.swing.JComboBox<String> cmbSupplierIDforManageorders;
    private javax.swing.JComboBox<String> cmbSupplierIDforpnlManageorders;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jsSupplierOrderforManageorders;
    private javax.swing.JSeparator jsSupplierforManageorders;
    private javax.swing.JLabel lblAddressforManageorders;
    private javax.swing.JLabel lblBatchforManageOrders;
    private javax.swing.JLabel lblCompanyforManageorders;
    private javax.swing.JLabel lblDate2forManageorders;
    private javax.swing.JLabel lblDateforManageorders;
    private javax.swing.JLabel lblNameforManageorders;
    private javax.swing.JLabel lblOrderIDforManageorders;
    private javax.swing.JLabel lblSNameforpnlManageorders;
    private javax.swing.JLabel lblSupplierIDforManageorders;
    private javax.swing.JLabel lblshoworderidforpnlManageorders;
    private javax.swing.JLabel lblshowsupplieridforpnlManageorders;
    private javax.swing.JPanel pnlOrderdetailsforManageorders;
    private javax.swing.JPanel pnlSupplierforManageorders;
    private javax.swing.JPanel pnlSupplierorderforManageorders;
    private javax.swing.JTextField txtAddressforManageorders;
    private javax.swing.JTextField txtCompanyforManageorders;
    private javax.swing.JFormattedTextField txtContactNoforManageorders;
    private javax.swing.JTextField txtDate2forManageorders;
    private javax.swing.JTextField txtDateforManageOrders;
    private javax.swing.JTextField txtNameforManageorders;
    // End of variables declaration//GEN-END:variables

    private void loadsupplierid() {
        try {
            ArrayList<String>lst=SupplierController.getSupplierid();
            for(String l:lst){
            cmbSupplierIDforpnlManageorders.addItem(l);
            cmbSupplierIDforManageorders.addItem(l);
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void loadDate() {
       Date date=new Date();
       SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd");
       String d=sdf.format(date);
       txtDateforManageOrders.setText(d);
       txtDate2forManageorders.setText(d);
        txtDate2forManageorders.setEditable(false);
    }
   private void ordertxtboxcheck(){
       if(cmbOrderIDforManageorders.getSelectedItem().toString().length()<=0 | txtDateforManageOrders.getText().length()<=0){
       btnAddorderdetailsforManageorders.setEnabled(false);
       }
       else{
       btnAddorderdetailsforManageorders.setEnabled(true);
       }
   }

    private void loadorderid() {
        try {
            ArrayList<String>orderid=SupplierorderController.getallorderid();
            for(String o:orderid){
            cmbOrderIDforManageorders.addItem(o);
            }
        } catch (SQLException | ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void savesupplier(){
      String sid=cmbSupplierIDforManageorders.getSelectedItem().toString();
      String n=txtNameforManageorders.getText();
      String A=txtAddressforManageorders.getText();
      String C=txtCompanyforManageorders.getText();
      String contact=txtContactNoforManageorders.getText();
      contact=contact.replace("-","");
      int CN=Integer.parseInt(contact);
      String D=txtDate2forManageorders.getText();
      
      Supplier sp=new Supplier(sid,n,A,C,CN,D);
        try {
            boolean IsAdded=SupplierController.addsupplier(sp);
            if(IsAdded){
                lblshowsupplieridforpnlManageorders.setText(sid);
                lblshowsupplieridforpnlManageorders.setText(sid);
                JOptionPane.showMessageDialog(null,"Supplier Details Add to Database...");
                cmbSupplierIDforManageorders.setSelectedIndex(0);
                txtNameforManageorders.setText("");
                txtAddressforManageorders.setText("");
                txtCompanyforManageorders.setText("");
                txtContactNoforManageorders.setText("");
                //txtDate2forManageorders.setText("");
            }else{
            JOptionPane.showMessageDialog(null,"Cannot Add...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }

    private void loadallsupplierrid() {
        try {
            ArrayList<String>supplierid=SupplierorderController.getorderid();
            for(String o:supplierid){
            cmbSupplierIDforpnlManageorders.addItem(o);
            }
        } catch (SQLException | ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
        private void checkfield(){

               String supplierid=cmbSupplierIDforManageorders.getSelectedItem().toString();
        boolean issupplierid=Manageordervalidation.checksupplierid(supplierid);
        if(issupplierid&!(txtNameforManageorders.getText().length()<=0||txtAddressforManageorders.getText().length()<=0||txtCompanyforManageorders.getText().length()<=0||txtDate2forManageorders.getText().length()<=0)){
            savesupplier();
         }else{
             JOptionPane.showMessageDialog(null,"Please Check Enterd informations");
         }

    }
    
}
