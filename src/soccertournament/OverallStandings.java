package soccertournament;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class OverallStandings extends javax.swing.JFrame {

    public OverallStandings() {
        initComponents();
    }

    private boolean checkEmpty() {
        return !(jtxtTeam1.getText().isEmpty() || jtxtTeam2.getText().isEmpty() || jtxtTeam3.getText().isEmpty()
                || jtxtTeam4.getText().isEmpty() || jtxtTeam5.getText().isEmpty() || jtxtTeam6.getText().isEmpty()
                || jtxtTeam7.getText().isEmpty() || jtxtTeam8.getText().isEmpty() || jtxtTeam9.getText().isEmpty()
                || jtxtTeam10.getText().isEmpty() || jtxtTeam11.getText().isEmpty() || jtxtTeam12.getText().isEmpty()
                || jtxtTeam13.getText().isEmpty() || jtxtTeam14.getText().isEmpty() || jtxtTeam15.getText().isEmpty()
                || jtxtTeam16.getText().isEmpty());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbStanding = new javax.swing.JLabel();
        jtxtTeam16 = new javax.swing.JTextField();
        jtxtTeam1 = new javax.swing.JTextField();
        jtxtTeam2 = new javax.swing.JTextField();
        jtxtTeam3 = new javax.swing.JTextField();
        jtxtTeam4 = new javax.swing.JTextField();
        jtxtTeam5 = new javax.swing.JTextField();
        jtxtTeam6 = new javax.swing.JTextField();
        jtxtTeam7 = new javax.swing.JTextField();
        jtxtTeam8 = new javax.swing.JTextField();
        jtxtTeam9 = new javax.swing.JTextField();
        jtxtTeam10 = new javax.swing.JTextField();
        jtxtTeam11 = new javax.swing.JTextField();
        jtxtTeam12 = new javax.swing.JTextField();
        jtxtTeam13 = new javax.swing.JTextField();
        jtxtTeam14 = new javax.swing.JTextField();
        jtxtTeam15 = new javax.swing.JTextField();
        jlbPosition1 = new javax.swing.JLabel();
        jlbPosition2 = new javax.swing.JLabel();
        jlbPosition3 = new javax.swing.JLabel();
        jlbPosition4 = new javax.swing.JLabel();
        jlbPosition5 = new javax.swing.JLabel();
        jlbPosition6 = new javax.swing.JLabel();
        jlbPosition7 = new javax.swing.JLabel();
        jlbPosition8 = new javax.swing.JLabel();
        jlbPosition9 = new javax.swing.JLabel();
        jlbPosition10 = new javax.swing.JLabel();
        jlbPosition11 = new javax.swing.JLabel();
        jlbPosition12 = new javax.swing.JLabel();
        jlbPosition13 = new javax.swing.JLabel();
        jlbPosition14 = new javax.swing.JLabel();
        jlbPosition15 = new javax.swing.JLabel();
        jlbPosition16 = new javax.swing.JLabel();
        jbtMatches = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbStanding.setFont(new java.awt.Font("Cambria Math", 1, 17)); // NOI18N
        jlbStanding.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbStanding.setText("Classificação Geral");
        jPanel1.add(jlbStanding, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 210, 30));
        jPanel1.add(jtxtTeam16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 170, 20));

        jtxtTeam1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, 20));

        jtxtTeam2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 170, 20));

        jtxtTeam3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 170, 20));

        jtxtTeam4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 170, 20));

        jtxtTeam5.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 170, 20));

        jtxtTeam6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 170, 20));

        jtxtTeam7.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtTeam7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 170, 20));

        jtxtTeam8.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPanel1.add(jtxtTeam8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 170, 20));
        jPanel1.add(jtxtTeam9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 170, 20));
        jPanel1.add(jtxtTeam10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 170, 20));
        jPanel1.add(jtxtTeam11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 170, 20));
        jPanel1.add(jtxtTeam12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 170, 20));
        jPanel1.add(jtxtTeam13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 170, 20));
        jPanel1.add(jtxtTeam14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 170, 20));
        jPanel1.add(jtxtTeam15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 170, 20));

        jlbPosition1.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition1.setText("1º");
        jPanel1.add(jlbPosition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jlbPosition2.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition2.setText("2º");
        jPanel1.add(jlbPosition2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jlbPosition3.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition3.setText("3º");
        jPanel1.add(jlbPosition3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jlbPosition4.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition4.setText("4º");
        jPanel1.add(jlbPosition4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jlbPosition5.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition5.setText("5º");
        jPanel1.add(jlbPosition5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jlbPosition6.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition6.setText("6º");
        jPanel1.add(jlbPosition6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jlbPosition7.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition7.setText("7º");
        jPanel1.add(jlbPosition7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jlbPosition8.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition8.setText("8º");
        jPanel1.add(jlbPosition8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jlbPosition9.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition9.setText("9º");
        jPanel1.add(jlbPosition9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jlbPosition10.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition10.setText("10º");
        jPanel1.add(jlbPosition10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jlbPosition11.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition11.setText("11º");
        jPanel1.add(jlbPosition11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jlbPosition12.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition12.setText("12º");
        jPanel1.add(jlbPosition12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jlbPosition13.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition13.setText("13º");
        jPanel1.add(jlbPosition13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jlbPosition14.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition14.setText("14º");
        jPanel1.add(jlbPosition14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jlbPosition15.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition15.setText("15º");
        jPanel1.add(jlbPosition15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jlbPosition16.setFont(new java.awt.Font("Cambria Math", 1, 15)); // NOI18N
        jlbPosition16.setText("16º");
        jPanel1.add(jlbPosition16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jbtMatches.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jbtMatches.setText("Confrontos");
        jbtMatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMatchesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtMatches, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtMatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMatchesActionPerformed
        if (checkEmpty()) {
            String[] group1 = new String[8];
            String[] group2 = new String[8];

            group1[0] = jtxtTeam1.getText();
            group1[1] = jtxtTeam2.getText();
            group1[2] = jtxtTeam3.getText();
            group1[3] = jtxtTeam4.getText();
            group1[4] = jtxtTeam5.getText();
            group1[5] = jtxtTeam6.getText();
            group1[6] = jtxtTeam7.getText();
            group1[7] = jtxtTeam8.getText();

            group2[0] = jtxtTeam9.getText();
            group2[1] = jtxtTeam10.getText();
            group2[2] = jtxtTeam11.getText();
            group2[3] = jtxtTeam12.getText();
            group2[4] = jtxtTeam13.getText();
            group2[5] = jtxtTeam14.getText();
            group2[6] = jtxtTeam15.getText();
            group2[7] = jtxtTeam16.getText();

            List<String> group1_list = Arrays.asList(group1);
            List<String> group2_list = Arrays.asList(group2);

            Collections.shuffle(group1_list);
            Collections.shuffle(group2_list);

            group1_list.toArray(group1);
            group2_list.toArray(group2);
            
            new Matches(group1, group2).setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Preencha a classificação geral!");
        }

    }//GEN-LAST:event_jbtMatchesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OverallStandings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtMatches;
    private javax.swing.JLabel jlbPosition1;
    private javax.swing.JLabel jlbPosition10;
    private javax.swing.JLabel jlbPosition11;
    private javax.swing.JLabel jlbPosition12;
    private javax.swing.JLabel jlbPosition13;
    private javax.swing.JLabel jlbPosition14;
    private javax.swing.JLabel jlbPosition15;
    private javax.swing.JLabel jlbPosition16;
    private javax.swing.JLabel jlbPosition2;
    private javax.swing.JLabel jlbPosition3;
    private javax.swing.JLabel jlbPosition4;
    private javax.swing.JLabel jlbPosition5;
    private javax.swing.JLabel jlbPosition6;
    private javax.swing.JLabel jlbPosition7;
    private javax.swing.JLabel jlbPosition8;
    private javax.swing.JLabel jlbPosition9;
    private javax.swing.JLabel jlbStanding;
    private javax.swing.JTextField jtxtTeam1;
    private javax.swing.JTextField jtxtTeam10;
    private javax.swing.JTextField jtxtTeam11;
    private javax.swing.JTextField jtxtTeam12;
    private javax.swing.JTextField jtxtTeam13;
    private javax.swing.JTextField jtxtTeam14;
    private javax.swing.JTextField jtxtTeam15;
    private javax.swing.JTextField jtxtTeam16;
    private javax.swing.JTextField jtxtTeam2;
    private javax.swing.JTextField jtxtTeam3;
    private javax.swing.JTextField jtxtTeam4;
    private javax.swing.JTextField jtxtTeam5;
    private javax.swing.JTextField jtxtTeam6;
    private javax.swing.JTextField jtxtTeam7;
    private javax.swing.JTextField jtxtTeam8;
    private javax.swing.JTextField jtxtTeam9;
    // End of variables declaration//GEN-END:variables
}
