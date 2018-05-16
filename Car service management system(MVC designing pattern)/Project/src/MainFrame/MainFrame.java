package MainFrame;


public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainforMainframe = new javax.swing.JPanel();
        pnlUpperforMainframe = new javax.swing.JPanel();
        lblCloseforMainframe = new javax.swing.JLabel();
        lblMinimizeforMainframe = new javax.swing.JLabel();
        btnMakereservationforMainframe = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlMainforMainframe.setBackground(new java.awt.Color(153, 153, 255));
        pnlMainforMainframe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        pnlUpperforMainframe.setBackground(new java.awt.Color(153, 153, 255));
        pnlUpperforMainframe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlUpperforMainframe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlUpperforMainframeMouseDragged(evt);
            }
        });
        pnlUpperforMainframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlUpperforMainframeMousePressed(evt);
            }
        });

        lblCloseforMainframe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCloseforMainframe.setForeground(new java.awt.Color(204, 0, 51));
        lblCloseforMainframe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseforMainframe.setText("X");
        lblCloseforMainframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseforMainframeMouseClicked(evt);
            }
        });

        lblMinimizeforMainframe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimizeforMainframe.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizeforMainframe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizeforMainframe.setText("-");
        lblMinimizeforMainframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeforMainframeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlUpperforMainframeLayout = new javax.swing.GroupLayout(pnlUpperforMainframe);
        pnlUpperforMainframe.setLayout(pnlUpperforMainframeLayout);
        pnlUpperforMainframeLayout.setHorizontalGroup(
            pnlUpperforMainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpperforMainframeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizeforMainframe)
                .addGap(18, 18, 18)
                .addComponent(lblCloseforMainframe)
                .addContainerGap())
        );
        pnlUpperforMainframeLayout.setVerticalGroup(
            pnlUpperforMainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpperforMainframeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlUpperforMainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCloseforMainframe)
                    .addComponent(lblMinimizeforMainframe))
                .addContainerGap())
        );

        btnMakereservationforMainframe.setBackground(new java.awt.Color(255, 255, 255));
        btnMakereservationforMainframe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        javax.swing.GroupLayout pnlMainforMainframeLayout = new javax.swing.GroupLayout(pnlMainforMainframe);
        pnlMainforMainframe.setLayout(pnlMainforMainframeLayout);
        pnlMainforMainframeLayout.setHorizontalGroup(
            pnlMainforMainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUpperforMainframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainforMainframeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(pnlMainforMainframeLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnMakereservationforMainframe, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addGroup(pnlMainforMainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainforMainframeLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMainforMainframeLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        pnlMainforMainframeLayout.setVerticalGroup(
            pnlMainforMainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainforMainframeLayout.createSequentialGroup()
                .addComponent(pnlUpperforMainframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(pnlMainforMainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMakereservationforMainframe, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainforMainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainforMainframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainforMainframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int pX,pY;
    private void pnlUpperforMainframeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpperforMainframeMousePressed
        pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_pnlUpperforMainframeMousePressed

    private void pnlUpperforMainframeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUpperforMainframeMouseDragged
        setLocation(getLocation().x+evt.getX()-pX,getLocation().y+evt.getY()-pY);
    }//GEN-LAST:event_pnlUpperforMainframeMouseDragged

    private void lblMinimizeforMainframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeforMainframeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizeforMainframeMouseClicked

    private void lblCloseforMainframeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseforMainframeMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lblCloseforMainframeMouseClicked

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMakereservationforMainframe;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel lblCloseforMainframe;
    private javax.swing.JLabel lblMinimizeforMainframe;
    private javax.swing.JPanel pnlMainforMainframe;
    private javax.swing.JPanel pnlUpperforMainframe;
    // End of variables declaration//GEN-END:variables
}
