package MainFrame;


import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;


public class Additionalmainframe extends javax.swing.JFrame {

//     void setPanel() {
//         pnlShowforAdditionalmainframe.removeAll();
//       pnlManageOrders pmo=new  pnlManageOrders();
//        pmo.setSize(pnlShowforAdditionalmainframe.getSize());
//        pnlShowforAdditionalmainframe.add(pmo);
//        pmo.setVisible(true);
//        pnlShowforAdditionalmainframe.repaint();
//        pnlShowforAdditionalmainframe.revalidate();
//    }
        
    
    public Additionalmainframe() {
        initComponents();
        setLocationRelativeTo(null);
        GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
         GraphicsDevice[] g=env.getScreenDevices();
          g[0].setFullScreenWindow(g[0].getFullScreenWindow()==this?null:this);
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        pnlControllforAdditionalmainframe = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnlUpperforadditionalmainframe = new javax.swing.JPanel();
        lblCloseforAdditionalmainframe = new javax.swing.JLabel();
        lblMaximizeforAdditionalmainframe = new javax.swing.JLabel();
        lblMinimizeforAdditionalmainframe = new javax.swing.JLabel();
        pnlShowforAdditionalmainframe = new javax.swing.JPanel();

        jButton3.setText("jButton1");

        jButton6.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);

        pnlControllforAdditionalmainframe.setBackground(new java.awt.Color(153, 153, 255));
        pnlControllforAdditionalmainframe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Make Reservation");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Service");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Manage Service Types");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Payments ");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Stock");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText(" Report");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Manage Orders");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControllforAdditionalmainframeLayout = new javax.swing.GroupLayout(pnlControllforAdditionalmainframe);
        pnlControllforAdditionalmainframe.setLayout(pnlControllforAdditionalmainframeLayout);
        pnlControllforAdditionalmainframeLayout.setHorizontalGroup(
            pnlControllforAdditionalmainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlControllforAdditionalmainframeLayout.setVerticalGroup(
            pnlControllforAdditionalmainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControllforAdditionalmainframeLayout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlUpperforadditionalmainframe.setBackground(new java.awt.Color(153, 153, 255));
        pnlUpperforadditionalmainframe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));
        pnlUpperforadditionalmainframe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlUpperforadditionalmainframeMouseDragged(evt);
            }
        });
        pnlUpperforadditionalmainframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlUpperforadditionalmainframeMousePressed(evt);
            }
        });
        pnlUpperforadditionalmainframe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCloseforAdditionalmainframe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCloseforAdditionalmainframe.setForeground(new java.awt.Color(255, 0, 102));
        lblCloseforAdditionalmainframe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseforAdditionalmainframe.setText("X");
        lblCloseforAdditionalmainframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseforAdditionalmainframeMouseClicked(evt);
            }
        });
        pnlUpperforadditionalmainframe.add(lblCloseforAdditionalmainframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 18, -1, -1));

        lblMaximizeforAdditionalmainframe.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        lblMaximizeforAdditionalmainframe.setForeground(new java.awt.Color(255, 255, 255));
        lblMaximizeforAdditionalmainframe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaximizeforAdditionalmainframe.setText("+");
        lblMaximizeforAdditionalmainframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaximizeforAdditionalmainframeMouseClicked(evt);
            }
        });
        pnlUpperforadditionalmainframe.add(lblMaximizeforAdditionalmainframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 17, -1, -1));

        lblMinimizeforAdditionalmainframe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimizeforAdditionalmainframe.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizeforAdditionalmainframe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizeforAdditionalmainframe.setText("-");
        lblMinimizeforAdditionalmainframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeforAdditionalmainframeMouseClicked(evt);
            }
        });
        pnlUpperforadditionalmainframe.add(lblMinimizeforAdditionalmainframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 12, 29, -1));

        pnlShowforAdditionalmainframe.setBackground(new java.awt.Color(153, 153, 255));
        pnlShowforAdditionalmainframe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlShowforAdditionalmainframe.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlControllforAdditionalmainframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlShowforAdditionalmainframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUpperforadditionalmainframe, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlControllforAdditionalmainframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlUpperforadditionalmainframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlShowforAdditionalmainframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         pnlMakeReservation pmr=new  pnlMakeReservation();
//         pnlManageServiceType pmst=new  pnlManageServiceType();
//         pnlManageOrders pmo=new  pnlManageOrders();
//        // pnlViewGRN pvg=new  pnlViewGRN();
//         pnlStockLoader psl=new pnlStockLoader();
//         pnlMakePayment pmp=new pnlMakePayment();
//         pnlReport pr=new pnlReport();
//         pnlService ps=new pnlService();
    private void lblMaximizeforAdditionalmainframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaximizeforAdditionalmainframeMouseClicked
        GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
         GraphicsDevice[] g=env.getScreenDevices();
          g[0].setFullScreenWindow(g[0].getFullScreenWindow()==this?null:this);
//           pmr.setSize(pnlShowforAdditionalmainframe.getSize());
//           pmst.setSize(pnlShowforAdditionalmainframe.getSize());
//           pmo.setSize(pnlShowforAdditionalmainframe.getSize());
    }//GEN-LAST:event_lblMaximizeforAdditionalmainframeMouseClicked

    private void lblCloseforAdditionalmainframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseforAdditionalmainframeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseforAdditionalmainframeMouseClicked
        int pX,pY;
    private void pnlUpperforadditionalmainframeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpperforadditionalmainframeMousePressed
          pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_pnlUpperforadditionalmainframeMousePressed

    private void pnlUpperforadditionalmainframeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpperforadditionalmainframeMouseDragged
        setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_pnlUpperforadditionalmainframeMouseDragged

    private void lblMinimizeforAdditionalmainframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeforAdditionalmainframeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeforAdditionalmainframeMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        pnlShowforAdditionalmainframe.removeAll();
       
        pmr.setSize(pnlShowforAdditionalmainframe.getSize());
        pnlShowforAdditionalmainframe.add(pmr);
        pmr.setVisible(true);
        pnlShowforAdditionalmainframe.repaint();
        pnlShowforAdditionalmainframe.revalidate();
    }//GEN-LAST:event_jButton2MouseClicked
//        public  Additionalmainframe setPanel(){
//            return Additionalmainframe;
////        pmos=new pnlSupplierReturns();
////        pnlShowforAdditionalmainframe.removeAll();
////        pmos.setSize(pnlShowforAdditionalmainframe.getSize());
////        pnlShowforAdditionalmainframe.add(pmos);
////        pmos.setVisible(true);
////        pnlShowforAdditionalmainframe.repaint();
////        pnlShowforAdditionalmainframe.revalidate();
//         }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//         pnlShowforAdditionalmainframe.removeAll();
//       
//        pmst.setSize(pnlShowforAdditionalmainframe.getSize());
//        pnlShowforAdditionalmainframe.add(pmst);
//        pmst.setVisible(true);
//        pnlShowforAdditionalmainframe.repaint();
//        pnlShowforAdditionalmainframe.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnlShowforAdditionalmainframe.removeAll();
//       
//        pmo.setSize(pnlShowforAdditionalmainframe.getSize());
//        pnlShowforAdditionalmainframe.add(pmo);
//        pmo.setVisible(true);
//        pnlShowforAdditionalmainframe.repaint();
//        pnlShowforAdditionalmainframe.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pnlShowforAdditionalmainframe.removeAll();
       
//        psl.setSize(pnlShowforAdditionalmainframe.getSize());
//        pnlShowforAdditionalmainframe.add(psl);
//        psl.setVisible(true);
//        pnlShowforAdditionalmainframe.repaint();
//        pnlShowforAdditionalmainframe.revalidate();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        pnlShowforAdditionalmainframe.removeAll();
       
//        pmp.setSize(pnlShowforAdditionalmainframe.getSize());
//        pnlShowforAdditionalmainframe.add(pmp);
//        pmp.setVisible(true);
//        pnlShowforAdditionalmainframe.repaint();
//        pnlShowforAdditionalmainframe.revalidate();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        pnlShowforAdditionalmainframe.removeAll();
       
//        pr.setSize(pnlShowforAdditionalmainframe.getSize());
//        pnlShowforAdditionalmainframe.add(pr);
//        pr.setVisible(true);
//        pnlShowforAdditionalmainframe.repaint();
//        pnlShowforAdditionalmainframe.revalidate();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         pnlShowforAdditionalmainframe.removeAll();
       
//        ps.setSize(pnlShowforAdditionalmainframe.getSize());
//        pnlShowforAdditionalmainframe.add(ps);
//        ps.setVisible(true);
//        pnlShowforAdditionalmainframe.repaint();
//        pnlShowforAdditionalmainframe.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Additionalmainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel lblCloseforAdditionalmainframe;
    private javax.swing.JLabel lblMaximizeforAdditionalmainframe;
    private javax.swing.JLabel lblMinimizeforAdditionalmainframe;
    private javax.swing.JPanel pnlControllforAdditionalmainframe;
    private javax.swing.JPanel pnlShowforAdditionalmainframe;
    private javax.swing.JPanel pnlUpperforadditionalmainframe;
    // End of variables declaration//GEN-END:variables
}
