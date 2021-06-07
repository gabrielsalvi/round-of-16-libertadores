package soccertournament;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class OverallStandings extends javax.swing.JFrame {

    public OverallStandings() {
        initComponents();
    }

    private boolean isEmpty() {
        return (jtxtTeam1.getText().isEmpty() || jtxtTeam2.getText().isEmpty() || jtxtTeam3.getText().isEmpty()
                || jtxtTeam4.getText().isEmpty() || jtxtTeam5.getText().isEmpty() || jtxtTeam6.getText().isEmpty()
                || jtxtTeam7.getText().isEmpty() || jtxtTeam8.getText().isEmpty() || jtxtTeam9.getText().isEmpty()
                || jtxtTeam10.getText().isEmpty() || jtxtTeam11.getText().isEmpty() || jtxtTeam12.getText().isEmpty()
                || jtxtTeam13.getText().isEmpty() || jtxtTeam14.getText().isEmpty() || jtxtTeam15.getText().isEmpty()
                || jtxtTeam16.getText().isEmpty());
    }

    private String[] setGroup1() {
        String[] group1 = new String[8];
        
        group1[0] = jtxtTeam1.getText();
        group1[1] = jtxtTeam2.getText();
        group1[2] = jtxtTeam3.getText();
        group1[3] = jtxtTeam4.getText();
        group1[4] = jtxtTeam5.getText();
        group1[5] = jtxtTeam6.getText();
        group1[6] = jtxtTeam7.getText();
        group1[7] = jtxtTeam8.getText();

        return group1;
    }

    private String[] setGroup2() {
        String[] group2 = new String[8];
        
        group2[0] = jtxtTeam9.getText();
        group2[1] = jtxtTeam10.getText();
        group2[2] = jtxtTeam11.getText();
        group2[3] = jtxtTeam12.getText();
        group2[4] = jtxtTeam13.getText();
        group2[5] = jtxtTeam14.getText();
        group2[6] = jtxtTeam15.getText();
        group2[7] = jtxtTeam16.getText();

        return group2;
    }
    
    private String[] shuffleArray(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        
        list.toArray(array);
        
        return array;
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
        jbtMatches = new javax.swing.JButton();
        jlbGroup1 = new javax.swing.JLabel();
        jlbGroup2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbStanding.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jlbStanding.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbStanding.setText("Classificação Geral");
        jPanel1.add(jlbStanding, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 210, 30));

        jtxtTeam16.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 170, 20));

        jtxtTeam1.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 170, 20));

        jtxtTeam2.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 170, 20));

        jtxtTeam3.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 170, 20));

        jtxtTeam4.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 170, 20));

        jtxtTeam5.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 170, 20));

        jtxtTeam6.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 170, 20));

        jtxtTeam7.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 170, 20));

        jtxtTeam8.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 170, 20));

        jtxtTeam9.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 170, 20));

        jtxtTeam10.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 170, 20));

        jtxtTeam11.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 170, 20));

        jtxtTeam12.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 170, 20));

        jtxtTeam13.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 170, 20));

        jtxtTeam14.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 170, 20));

        jtxtTeam15.setFont(new java.awt.Font("Cambria Math", 0, 17)); // NOI18N
        jPanel1.add(jtxtTeam15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 170, 20));

        jbtMatches.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jbtMatches.setText("Confrontos");
        jbtMatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtMatchesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtMatches, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jlbGroup1.setFont(new java.awt.Font("Cambria Math", 1, 17)); // NOI18N
        jlbGroup1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbGroup1.setText("Pote 1");
        jPanel1.add(jlbGroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 210, 30));

        jlbGroup2.setFont(new java.awt.Font("Cambria Math", 1, 17)); // NOI18N
        jlbGroup2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbGroup2.setText("Pote 2");
        jPanel1.add(jlbGroup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtMatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtMatchesActionPerformed
        if (!isEmpty()) {
            String[] group1 = setGroup1();
            String[] group2 = setGroup2();
            
            group1 = shuffleArray(group1);
            group2 = shuffleArray(group2);

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
    private javax.swing.JLabel jlbGroup1;
    private javax.swing.JLabel jlbGroup2;
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
