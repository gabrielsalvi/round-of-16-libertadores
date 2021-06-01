package soccertournament;


public class Matches extends javax.swing.JFrame {

    public Matches() {
    }

    public Matches(String[] group1, String[] group2) {
        initComponents();

        jtxtMatch1_home.setText(group1[0]);
        jtxtMatch2_home.setText(group1[1]);
        jtxtMatch3_home.setText(group1[2]);
        jtxtMatch4_home.setText(group1[3]);
        jtxtMatch5_home.setText(group1[4]);
        jtxtMatch6_home.setText(group1[5]);
        jtxtMatch7_home.setText(group1[6]);
        jtxtMatch8_home.setText(group1[7]);

        jtxtMatch1_away.setText(group2[0]);
        jtxtMatch2_away.setText(group2[1]);
        jtxtMatch3_away.setText(group2[2]);
        jtxtMatch4_away.setText(group2[3]);
        jtxtMatch5_away.setText(group2[4]);
        jtxtMatch6_away.setText(group2[5]);
        jtxtMatch7_away.setText(group2[6]);
        jtxtMatch8_away.setText(group2[7]);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbMatches = new javax.swing.JLabel();
        jtxtMatch1_home = new javax.swing.JTextField();
        jlbX = new javax.swing.JLabel();
        jtxtMatch1_away = new javax.swing.JTextField();
        jtxtMatch2_home = new javax.swing.JTextField();
        jlbX2 = new javax.swing.JLabel();
        jtxtMatch2_away = new javax.swing.JTextField();
        jtxtMatch3_home = new javax.swing.JTextField();
        jlbX3 = new javax.swing.JLabel();
        jtxtMatch3_away = new javax.swing.JTextField();
        jtxtMatch4_home = new javax.swing.JTextField();
        jlbX4 = new javax.swing.JLabel();
        jtxtMatch4_away = new javax.swing.JTextField();
        jtxtMatch5_home = new javax.swing.JTextField();
        jlbX5 = new javax.swing.JLabel();
        jtxtMatch5_away = new javax.swing.JTextField();
        jtxtMatch6_home = new javax.swing.JTextField();
        jlbX6 = new javax.swing.JLabel();
        jtxtMatch6_away = new javax.swing.JTextField();
        jtxtMatch7_home = new javax.swing.JTextField();
        jlbX7 = new javax.swing.JLabel();
        jtxtMatch7_away = new javax.swing.JTextField();
        jtxtMatch8_home = new javax.swing.JTextField();
        jlbX8 = new javax.swing.JLabel();
        jtxtMatch8_away = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMatches.setFont(new java.awt.Font("Cambria Math", 1, 17)); // NOI18N
        jlbMatches.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMatches.setText("Confrontos");
        jPanel1.add(jlbMatches, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 210, 30));

        jtxtMatch1_home.setEditable(false);
        jtxtMatch1_home.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch1_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, -1));

        jlbX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbX.setText("X");
        jPanel1.add(jlbX, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 20, 20));

        jtxtMatch1_away.setEditable(false);
        jtxtMatch1_away.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch1_away, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 170, -1));

        jtxtMatch2_home.setEditable(false);
        jtxtMatch2_home.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch2_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 170, -1));

        jlbX2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbX2.setText("X");
        jPanel1.add(jlbX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 20, 20));

        jtxtMatch2_away.setEditable(false);
        jtxtMatch2_away.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch2_away, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 170, -1));

        jtxtMatch3_home.setEditable(false);
        jtxtMatch3_home.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch3_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 170, -1));

        jlbX3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbX3.setText("X");
        jPanel1.add(jlbX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 20, 20));

        jtxtMatch3_away.setEditable(false);
        jtxtMatch3_away.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch3_away, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 170, -1));

        jtxtMatch4_home.setEditable(false);
        jtxtMatch4_home.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch4_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 170, -1));

        jlbX4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbX4.setText("X");
        jPanel1.add(jlbX4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 20, 20));

        jtxtMatch4_away.setEditable(false);
        jtxtMatch4_away.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch4_away, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 170, -1));

        jtxtMatch5_home.setEditable(false);
        jtxtMatch5_home.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch5_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 170, -1));

        jlbX5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbX5.setText("X");
        jPanel1.add(jlbX5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 20, 20));

        jtxtMatch5_away.setEditable(false);
        jtxtMatch5_away.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch5_away, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 170, -1));

        jtxtMatch6_home.setEditable(false);
        jtxtMatch6_home.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch6_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, -1));

        jlbX6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbX6.setText("X");
        jPanel1.add(jlbX6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 20, 20));

        jtxtMatch6_away.setEditable(false);
        jtxtMatch6_away.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch6_away, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 170, -1));

        jtxtMatch7_home.setEditable(false);
        jtxtMatch7_home.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch7_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, -1));

        jlbX7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbX7.setText("X");
        jPanel1.add(jlbX7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 20, 20));

        jtxtMatch7_away.setEditable(false);
        jtxtMatch7_away.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch7_away, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 170, -1));

        jtxtMatch8_home.setEditable(false);
        jtxtMatch8_home.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch8_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 170, -1));

        jlbX8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbX8.setText("X");
        jPanel1.add(jlbX8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 20, 20));

        jtxtMatch8_away.setEditable(false);
        jtxtMatch8_away.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtMatch8_away, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matches().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbMatches;
    private javax.swing.JLabel jlbX;
    private javax.swing.JLabel jlbX2;
    private javax.swing.JLabel jlbX3;
    private javax.swing.JLabel jlbX4;
    private javax.swing.JLabel jlbX5;
    private javax.swing.JLabel jlbX6;
    private javax.swing.JLabel jlbX7;
    private javax.swing.JLabel jlbX8;
    private javax.swing.JTextField jtxtMatch1_away;
    private javax.swing.JTextField jtxtMatch1_home;
    private javax.swing.JTextField jtxtMatch2_away;
    private javax.swing.JTextField jtxtMatch2_home;
    private javax.swing.JTextField jtxtMatch3_away;
    private javax.swing.JTextField jtxtMatch3_home;
    private javax.swing.JTextField jtxtMatch4_away;
    private javax.swing.JTextField jtxtMatch4_home;
    private javax.swing.JTextField jtxtMatch5_away;
    private javax.swing.JTextField jtxtMatch5_home;
    private javax.swing.JTextField jtxtMatch6_away;
    private javax.swing.JTextField jtxtMatch6_home;
    private javax.swing.JTextField jtxtMatch7_away;
    private javax.swing.JTextField jtxtMatch7_home;
    private javax.swing.JTextField jtxtMatch8_away;
    private javax.swing.JTextField jtxtMatch8_home;
    // End of variables declaration//GEN-END:variables
}
