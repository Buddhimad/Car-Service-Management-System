package MainFrame;

import Controller.CustomerController;
import Controller.VehicleController;
import Model.Customer;
import Model.Vehicle;
import Validation.Makereservationvalidation;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;
public class pnlMakeReservation extends javax.swing.JPanel {

    
    public pnlMakeReservation() {
        initComponents();
        loadDate();
        txtDateforMakereservation.setEditable(false);
        getlastcustomerid();
        //btnSaveforMakereservation.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCustomerinfoforpnlMakereservation = new javax.swing.JPanel();
        jsCustomerInformationforMakereservation = new javax.swing.JSeparator();
        lblCustomerIDforMakereservation = new javax.swing.JLabel();
        lblCustomerNameforMakereservation = new javax.swing.JLabel();
        lblAddressforMakereservation = new javax.swing.JLabel();
        lblTelephoneNoforMakereservation = new javax.swing.JLabel();
        lblDateforMakereservation = new javax.swing.JLabel();
        txtCustomerNameforMakereservation = new javax.swing.JTextField();
        txtAddressforMakereservation = new javax.swing.JTextField();
        txtDateforMakereservation = new javax.swing.JTextField();
        btnViewCustomerforMakereservation = new javax.swing.JButton();
        pnlLblcustomerforpnlMakereservation = new javax.swing.JPanel();
        lblCustomerforMakereservation = new javax.swing.JLabel();
        cmbCustomerIDforMakereservation = new javax.swing.JComboBox<>();
        lblShowcustomeridforpnlMakereservation = new javax.swing.JLabel();
        txtTelephoneNoforMakereservation = new javax.swing.JFormattedTextField();
        pnlVehicleInformationforMakereservation = new javax.swing.JPanel();
        jsVehicleInformationforMakereservation = new javax.swing.JSeparator();
        lblVehicleNoforMakereservation = new javax.swing.JLabel();
        lblBrandforMakereservation = new javax.swing.JLabel();
        lblModelforMakereservation = new javax.swing.JLabel();
        lblEngineTypeforMakereservation = new javax.swing.JLabel();
        lblVehicleTypeforMakereservation = new javax.swing.JLabel();
        txtVehicleNoforMakereservation = new javax.swing.JTextField();
        txtBrandforMakereservation = new javax.swing.JTextField();
        txtModelforMakereservation = new javax.swing.JTextField();
        txtEngineTypeforMakereservation = new javax.swing.JTextField();
        txtVehicleTypeforMakereservation = new javax.swing.JTextField();
        btnSaveforMakereservation = new javax.swing.JButton();
        btnViewVehicleInformationforMakereservation = new javax.swing.JButton();
        pnlLblVehicleforMakereservations = new javax.swing.JPanel();
        lblVehicleforMakereservation = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pnlCustomerinfoforpnlMakereservation.setBackground(new java.awt.Color(153, 153, 255));
        pnlCustomerinfoforpnlMakereservation.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Customer Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jsCustomerInformationforMakereservation.setForeground(new java.awt.Color(255, 255, 255));

        lblCustomerIDforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCustomerIDforMakereservation.setText("Customer ID");

        lblCustomerNameforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCustomerNameforMakereservation.setText("Customer Name");

        lblAddressforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAddressforMakereservation.setText("Address");

        lblTelephoneNoforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelephoneNoforMakereservation.setText("Telephone No");

        lblDateforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDateforMakereservation.setText("Date");

        txtCustomerNameforMakereservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtCustomerNameforMakereservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustomerNameforMakereservationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerNameforMakereservationKeyTyped(evt);
            }
        });

        txtAddressforMakereservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtAddressforMakereservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressforMakereservationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressforMakereservationKeyTyped(evt);
            }
        });

        txtDateforMakereservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtDateforMakereservation.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDateforMakereservationPropertyChange(evt);
            }
        });

        btnViewCustomerforMakereservation.setBackground(new java.awt.Color(255, 255, 255));
        btnViewCustomerforMakereservation.setText("View Customers");
        btnViewCustomerforMakereservation.setBorder(null);
        btnViewCustomerforMakereservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerforMakereservationActionPerformed(evt);
            }
        });

        pnlLblcustomerforpnlMakereservation.setBackground(new java.awt.Color(153, 153, 255));

        lblCustomerforMakereservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerforMakereservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/administrator-icon.png"))); // NOI18N

        javax.swing.GroupLayout pnlLblcustomerforpnlMakereservationLayout = new javax.swing.GroupLayout(pnlLblcustomerforpnlMakereservation);
        pnlLblcustomerforpnlMakereservation.setLayout(pnlLblcustomerforpnlMakereservationLayout);
        pnlLblcustomerforpnlMakereservationLayout.setHorizontalGroup(
            pnlLblcustomerforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCustomerforMakereservation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLblcustomerforpnlMakereservationLayout.setVerticalGroup(
            pnlLblcustomerforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCustomerforMakereservation, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        cmbCustomerIDforMakereservation.setEditable(true);

        lblShowcustomeridforpnlMakereservation.setText(".............");
        lblShowcustomeridforpnlMakereservation.setToolTipText("Last Register Customer");

        try {
            txtTelephoneNoforMakereservation.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelephoneNoforMakereservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelephoneNoforMakereservationKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlCustomerinfoforpnlMakereservationLayout = new javax.swing.GroupLayout(pnlCustomerinfoforpnlMakereservation);
        pnlCustomerinfoforpnlMakereservation.setLayout(pnlCustomerinfoforpnlMakereservationLayout);
        pnlCustomerinfoforpnlMakereservationLayout.setHorizontalGroup(
            pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createSequentialGroup()
                        .addComponent(lblAddressforMakereservation)
                        .addGap(68, 68, 68)
                        .addComponent(txtAddressforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jsCustomerInformationforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewCustomerforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createSequentialGroup()
                        .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDateforMakereservation)
                            .addComponent(lblTelephoneNoforMakereservation))
                        .addGap(34, 34, 34)
                        .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDateforMakereservation, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(txtTelephoneNoforMakereservation)))
                    .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createSequentialGroup()
                        .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerNameforMakereservation)
                            .addComponent(lblCustomerIDforMakereservation))
                        .addGap(21, 21, 21)
                        .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerNameforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createSequentialGroup()
                                .addComponent(cmbCustomerIDforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(lblShowcustomeridforpnlMakereservation)))))
                .addGap(17, 17, 17)
                .addComponent(pnlLblcustomerforpnlMakereservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCustomerinfoforpnlMakereservationLayout.setVerticalGroup(
            pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCustomerIDforMakereservation)
                    .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCustomerIDforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblShowcustomeridforpnlMakereservation)))
                .addGap(18, 18, 18)
                .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblCustomerNameforMakereservation))
                    .addComponent(txtCustomerNameforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblAddressforMakereservation))
                    .addComponent(txtAddressforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelephoneNoforMakereservation)
                    .addComponent(txtTelephoneNoforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCustomerinfoforpnlMakereservationLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblDateforMakereservation))
                    .addComponent(txtDateforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jsCustomerInformationforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnViewCustomerforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlLblcustomerforpnlMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlVehicleInformationforMakereservation.setBackground(new java.awt.Color(153, 153, 255));
        pnlVehicleInformationforMakereservation.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Vehicle Information", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jsVehicleInformationforMakereservation.setForeground(new java.awt.Color(255, 255, 255));

        lblVehicleNoforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVehicleNoforMakereservation.setText("Vehicle No");

        lblBrandforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBrandforMakereservation.setText("Brand");

        lblModelforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModelforMakereservation.setText("Model");

        lblEngineTypeforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEngineTypeforMakereservation.setText("Engine Type");

        lblVehicleTypeforMakereservation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVehicleTypeforMakereservation.setText("Vehicle Type");

        txtVehicleNoforMakereservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtVehicleNoforMakereservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVehicleNoforMakereservationKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVehicleNoforMakereservationKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVehicleNoforMakereservationKeyTyped(evt);
            }
        });

        txtBrandforMakereservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtBrandforMakereservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBrandforMakereservationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBrandforMakereservationKeyTyped(evt);
            }
        });

        txtModelforMakereservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtModelforMakereservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelforMakereservationActionPerformed(evt);
            }
        });
        txtModelforMakereservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModelforMakereservationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModelforMakereservationKeyTyped(evt);
            }
        });

        txtEngineTypeforMakereservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtEngineTypeforMakereservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEngineTypeforMakereservationKeyPressed(evt);
            }
        });

        txtVehicleTypeforMakereservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtVehicleTypeforMakereservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVehicleTypeforMakereservationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVehicleTypeforMakereservationKeyTyped(evt);
            }
        });

        btnSaveforMakereservation.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveforMakereservation.setText("Save");
        btnSaveforMakereservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveforMakereservationActionPerformed(evt);
            }
        });

        btnViewVehicleInformationforMakereservation.setBackground(new java.awt.Color(255, 255, 255));
        btnViewVehicleInformationforMakereservation.setText("View Vehicle Information");
        btnViewVehicleInformationforMakereservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVehicleInformationforMakereservationActionPerformed(evt);
            }
        });

        pnlLblVehicleforMakereservations.setBackground(new java.awt.Color(153, 153, 255));

        lblVehicleforMakereservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehicleforMakereservation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFrame/ImagesIcons/chevrolet-impala-icon.png"))); // NOI18N

        javax.swing.GroupLayout pnlLblVehicleforMakereservationsLayout = new javax.swing.GroupLayout(pnlLblVehicleforMakereservations);
        pnlLblVehicleforMakereservations.setLayout(pnlLblVehicleforMakereservationsLayout);
        pnlLblVehicleforMakereservationsLayout.setHorizontalGroup(
            pnlLblVehicleforMakereservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLblVehicleforMakereservationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVehicleforMakereservation, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
        );
        pnlLblVehicleforMakereservationsLayout.setVerticalGroup(
            pnlLblVehicleforMakereservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLblVehicleforMakereservationsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVehicleforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlVehicleInformationforMakereservationLayout = new javax.swing.GroupLayout(pnlVehicleInformationforMakereservation);
        pnlVehicleInformationforMakereservation.setLayout(pnlVehicleInformationforMakereservationLayout);
        pnlVehicleInformationforMakereservationLayout.setHorizontalGroup(
            pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                        .addComponent(lblVehicleNoforMakereservation)
                        .addGap(67, 67, 67)
                        .addComponent(txtVehicleNoforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                        .addComponent(lblBrandforMakereservation)
                        .addGap(93, 93, 93)
                        .addComponent(txtBrandforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                        .addComponent(lblModelforMakereservation)
                        .addGap(92, 92, 92)
                        .addComponent(txtModelforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                        .addComponent(lblEngineTypeforMakereservation)
                        .addGap(55, 55, 55)
                        .addComponent(txtEngineTypeforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                        .addComponent(lblVehicleTypeforMakereservation)
                        .addGap(54, 54, 54)
                        .addComponent(txtVehicleTypeforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jsVehicleInformationforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                        .addComponent(btnViewVehicleInformationforMakereservation)
                        .addGap(298, 298, 298)
                        .addComponent(btnSaveforMakereservation)))
                .addGap(18, 18, 18)
                .addComponent(pnlLblVehicleforMakereservations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlVehicleInformationforMakereservationLayout.setVerticalGroup(
            pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                        .addGroup(pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblVehicleNoforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtVehicleNoforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBrandforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtBrandforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblModelforMakereservation))
                            .addComponent(txtModelforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblEngineTypeforMakereservation))
                            .addComponent(txtEngineTypeforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVehicleInformationforMakereservationLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblVehicleTypeforMakereservation))
                            .addComponent(txtVehicleTypeforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jsVehicleInformationforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(pnlVehicleInformationforMakereservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewVehicleInformationforMakereservation)
                            .addComponent(btnSaveforMakereservation)))
                    .addComponent(pnlLblVehicleforMakereservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCustomerinfoforpnlMakereservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(pnlVehicleInformationforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(pnlCustomerinfoforpnlMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnlVehicleInformationforMakereservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    void loadDate(){
     Date d1 = new Date(); //Current System date
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String sDate = df.format(d1);
        txtDateforMakereservation.setText(sDate);
    }
    private void btnViewCustomerforMakereservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerforMakereservationActionPerformed
       ViewCustomers viewcustomer=new ViewCustomers();
       viewcustomer.setVisible(true);
    }//GEN-LAST:event_btnViewCustomerforMakereservationActionPerformed

    private void btnViewVehicleInformationforMakereservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVehicleInformationforMakereservationActionPerformed
        ViewVehicles viewvehicles=new ViewVehicles();
        viewvehicles.setVisible(true);
    }//GEN-LAST:event_btnViewVehicleInformationforMakereservationActionPerformed
          
    private void btnSaveforMakereservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveforMakereservationActionPerformed
//       String pnumber=txtTelephoneNoforMakereservation.getText();
//       pnumber=pnumber.replace("-","");
//       
        if(cmbCustomerIDforMakereservation.getSelectedItem().toString().length()<=0|txtCustomerNameforMakereservation.getText().length()<=0|txtAddressforMakereservation.getText().length()<=0|txtVehicleNoforMakereservation.getText().length()<=0|txtBrandforMakereservation.getText().length()<=0|txtModelforMakereservation.getText().length()<=0|txtEngineTypeforMakereservation.getText().length()<=0|txtVehicleTypeforMakereservation.getText().length()<=0){
         btnSaveforMakereservation.setEnabled(false);
        }else{
            btnSaveforMakereservation.setEnabled(true);
        String CustomerID=cmbCustomerIDforMakereservation.getSelectedItem().toString();
        String customername=txtCustomerNameforMakereservation.getText();
        String Address=txtAddressforMakereservation.getText();
        String pnum=txtTelephoneNoforMakereservation.getText();
        pnum=pnum.replace("-","");
        int  telenum=Integer.parseInt(pnum);
        String Date=txtDateforMakereservation.getText();
        String vehicleno=txtVehicleNoforMakereservation.getText();
        String Brand=txtBrandforMakereservation.getText();
        String model=txtModelforMakereservation.getText();
        String enginetype=txtEngineTypeforMakereservation.getText();
        String vehicletype=txtVehicleTypeforMakereservation.getText();
         
        Customer customer=new Customer(CustomerID,customername,Address,telenum,Date);
        
        try{
            boolean IsAddedCustomer=CustomerController.addcustomer(customer);
            
            if(IsAddedCustomer){
                lblShowcustomeridforpnlMakereservation.setText(CustomerID);
                lblShowcustomeridforpnlMakereservation.setText(CustomerID);
            JOptionPane.showMessageDialog(null, "Customer Successfully save to Database...");
            
            Vehicle vehicle=new Vehicle(vehicleno,CustomerID,Brand,model,enginetype,vehicletype);
            
            boolean IsAddedVehicle=VehicleController.addvehicle(vehicle);
            
            if(IsAddedVehicle){
            JOptionPane.showMessageDialog(null, "Vehicle Successfully save to Database...");
            }else{
            JOptionPane.showMessageDialog(null, "Can't add to Database...");
            }
            }else{
            JOptionPane.showMessageDialog(null, "Can't add to Database...");
            }
      
           
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null, e.getMessage());
      }catch(ClassNotFoundException e){
          JOptionPane.showMessageDialog(null, e);
      }
       
        cmbCustomerIDforMakereservation.setSelectedIndex(0);
        txtCustomerNameforMakereservation.setText("");
        txtAddressforMakereservation.setText("");
        txtTelephoneNoforMakereservation.setText("");
//        txtDateforMakereservation.setText("");
        txtVehicleNoforMakereservation.setText("");
        txtBrandforMakereservation.setText("");
        txtModelforMakereservation.setText("");
        txtEngineTypeforMakereservation.setText("");
        txtVehicleTypeforMakereservation.setText("");
        }
    }//GEN-LAST:event_btnSaveforMakereservationActionPerformed

    private void txtDateforMakereservationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDateforMakereservationPropertyChange
     txtDateforMakereservation.setDisabledTextColor(Color.red);
    }//GEN-LAST:event_txtDateforMakereservationPropertyChange

    private void txtCustomerNameforMakereservationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameforMakereservationKeyTyped
          Makereservationvalidation.getnumber(evt);
    }//GEN-LAST:event_txtCustomerNameforMakereservationKeyTyped

    private void txtAddressforMakereservationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressforMakereservationKeyTyped
       Makereservationvalidation.checkaddresstextfield(evt);
    }//GEN-LAST:event_txtAddressforMakereservationKeyTyped

    private void txtVehicleNoforMakereservationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNoforMakereservationKeyTyped
//       String vehicleno=txtVehicleNoforMakereservation.getText();
//        boolean isvehiclenocorrect=Makereservationvalidation.isgood(vehicleno);
//        if(isvehiclenocorrect){
//           
//        }else{
//        JOptionPane.showMessageDialog(null,"Test");
////            Tooltip tp=new Tooltip("invalid number");
////            txtVehicleNoforMakereservation.setToolTipText(tp.toString());
////        //txtVehicleNoforMakereservation.setToolTipText("Invalid Vehicle No");
//        }
    }//GEN-LAST:event_txtVehicleNoforMakereservationKeyTyped

    private void txtVehicleNoforMakereservationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNoforMakereservationKeyReleased
//        String vehicleno=txtVehicleNoforMakereservation.getText();
//        boolean isvehiclenocorrect=Makereservationvalidation.isgood(vehicleno);
//        if(isvehiclenocorrect){
//                 JOptionPane.showMessageDialog(null,"Test s");
//        }else{
//                   JOptionPane.showMessageDialog(null,"Test");
//           Tooltip tp=new Tooltip("invalid number");
//            txtVehicleNoforMakereservation.setToolTipText(tp.toString());
//        //txtVehicleNoforMakereservation.setToolTipText("Invalid Vehicle No");
//        }
    }//GEN-LAST:event_txtVehicleNoforMakereservationKeyReleased

    private void txtVehicleNoforMakereservationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNoforMakereservationKeyPressed
         if(evt.getKeyChar()==KeyEvent.VK_ENTER){       
        String vehicleno=txtVehicleNoforMakereservation.getText();
        boolean isvehiclenocorrect=Makereservationvalidation.isgood(vehicleno);
       
        if(isvehiclenocorrect){
                txtBrandforMakereservation.grabFocus();
        }else{
                   JOptionPane.showMessageDialog(null,"invalid number");

        }
        }if(evt.getKeyChar()==KeyEvent.VK_UP){
          txtTelephoneNoforMakereservation.grabFocus();
          }
    }//GEN-LAST:event_txtVehicleNoforMakereservationKeyPressed

    private void txtBrandforMakereservationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandforMakereservationKeyTyped
        Makereservationvalidation.checkbrand(evt);
    }//GEN-LAST:event_txtBrandforMakereservationKeyTyped

    private void txtBrandforMakereservationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandforMakereservationKeyPressed
     
       if(evt.getKeyChar()==KeyEvent.VK_ENTER){     
        txtModelforMakereservation.grabFocus();
          }if(evt.getKeyChar()==KeyEvent.VK_UP){
         txtVehicleNoforMakereservation.grabFocus();
          }
    }//GEN-LAST:event_txtBrandforMakereservationKeyPressed

    private void txtModelforMakereservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelforMakereservationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelforMakereservationActionPerformed

    private void txtModelforMakereservationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelforMakereservationKeyTyped
      Makereservationvalidation.checkmodel(evt);
    }//GEN-LAST:event_txtModelforMakereservationKeyTyped

    private void txtModelforMakereservationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelforMakereservationKeyPressed
       
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){     
         txtEngineTypeforMakereservation.grabFocus();
          } if(evt.getKeyChar()==KeyEvent.VK_UP){
          txtBrandforMakereservation.grabFocus();
          }
    }//GEN-LAST:event_txtModelforMakereservationKeyPressed

    private void txtEngineTypeforMakereservationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEngineTypeforMakereservationKeyPressed
          if(evt.getKeyChar()==KeyEvent.VK_ENTER){     
        String enginetype=txtEngineTypeforMakereservation.getText();
        boolean ischeck=Makereservationvalidation.checkenginetype(enginetype);
        if(ischeck){
        txtVehicleTypeforMakereservation.grabFocus();
        }
        else{
        JOptionPane.showMessageDialog(null,"Invalid engine type");
        }
          } if(evt.getKeyChar()==KeyEvent.VK_UP){
          txtModelforMakereservation.grabFocus();
          }
    }//GEN-LAST:event_txtEngineTypeforMakereservationKeyPressed

    private void txtVehicleTypeforMakereservationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleTypeforMakereservationKeyTyped
      Makereservationvalidation.checkvehicletype(evt);
     
    }//GEN-LAST:event_txtVehicleTypeforMakereservationKeyTyped

    private void txtVehicleTypeforMakereservationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleTypeforMakereservationKeyPressed
      
       if(evt.getKeyChar()==KeyEvent.VK_ENTER){     
            btnSaveforMakereservation.grabFocus();
          } if(evt.getKeyChar()==KeyEvent.VK_UP){
          txtEngineTypeforMakereservation.grabFocus();
          }
    }//GEN-LAST:event_txtVehicleTypeforMakereservationKeyPressed

    private void txtCustomerNameforMakereservationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameforMakereservationKeyPressed
    
     if(evt.getKeyChar()==KeyEvent.VK_ENTER){     
          txtAddressforMakereservation.grabFocus();
          }if(evt.getKeyChar()==KeyEvent.VK_UP){
          cmbCustomerIDforMakereservation.grabFocus();
          }
    }//GEN-LAST:event_txtCustomerNameforMakereservationKeyPressed

    private void txtAddressforMakereservationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressforMakereservationKeyPressed
         if(evt.getKeyChar()==KeyEvent.VK_ENTER){ 
         txtTelephoneNoforMakereservation.grabFocus();
         }
    }//GEN-LAST:event_txtAddressforMakereservationKeyPressed

    private void txtTelephoneNoforMakereservationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephoneNoforMakereservationKeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){ 
         txtVehicleNoforMakereservation.grabFocus();
         }
    }//GEN-LAST:event_txtTelephoneNoforMakereservationKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveforMakereservation;
    private javax.swing.JButton btnViewCustomerforMakereservation;
    private javax.swing.JButton btnViewVehicleInformationforMakereservation;
    private javax.swing.JComboBox<String> cmbCustomerIDforMakereservation;
    private javax.swing.JSeparator jsCustomerInformationforMakereservation;
    private javax.swing.JSeparator jsVehicleInformationforMakereservation;
    private javax.swing.JLabel lblAddressforMakereservation;
    private javax.swing.JLabel lblBrandforMakereservation;
    private javax.swing.JLabel lblCustomerIDforMakereservation;
    private javax.swing.JLabel lblCustomerNameforMakereservation;
    private javax.swing.JLabel lblCustomerforMakereservation;
    private javax.swing.JLabel lblDateforMakereservation;
    private javax.swing.JLabel lblEngineTypeforMakereservation;
    private javax.swing.JLabel lblModelforMakereservation;
    private javax.swing.JLabel lblShowcustomeridforpnlMakereservation;
    private javax.swing.JLabel lblTelephoneNoforMakereservation;
    private javax.swing.JLabel lblVehicleNoforMakereservation;
    private javax.swing.JLabel lblVehicleTypeforMakereservation;
    private javax.swing.JLabel lblVehicleforMakereservation;
    private javax.swing.JPanel pnlCustomerinfoforpnlMakereservation;
    private javax.swing.JPanel pnlLblVehicleforMakereservations;
    private javax.swing.JPanel pnlLblcustomerforpnlMakereservation;
    private javax.swing.JPanel pnlVehicleInformationforMakereservation;
    private javax.swing.JTextField txtAddressforMakereservation;
    private javax.swing.JTextField txtBrandforMakereservation;
    private javax.swing.JTextField txtCustomerNameforMakereservation;
    private javax.swing.JTextField txtDateforMakereservation;
    private javax.swing.JTextField txtEngineTypeforMakereservation;
    private javax.swing.JTextField txtModelforMakereservation;
    private javax.swing.JFormattedTextField txtTelephoneNoforMakereservation;
    private javax.swing.JTextField txtVehicleNoforMakereservation;
    private javax.swing.JTextField txtVehicleTypeforMakereservation;
    // End of variables declaration//GEN-END:variables

    private void getlastcustomerid() {
        try {
            ArrayList<String>customerid=CustomerController.getlastcustomerid();
            for(String cid:customerid){
            cmbCustomerIDforMakereservation.addItem(cid);
            }
        } catch (SQLException | ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
            
//    private void check() {
//       
//       }
//    }
    
}
