/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfac;



/**
 *
 * @author Júlio
 */
public class interface1 extends javax.swing.JFrame {

    /**

     */
    public interface1() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jLabel1.setText("jLabel1");

        jToggleButton4.setText("jToggleButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        getContentPane().setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Estoque1.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 10, 70, 70);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Clientes.png"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(170, 10, 75, 70);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rel.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 0, 90, 90);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura-de-tela-2024-05-08-23373.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 40, 30, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura-de-tela-2024-05-08-23220.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 130, 360, 380);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura de tela 2024-05-08 214701.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 100, 830, 420);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura de tela 2024-05-01 193006.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 80, 830, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Captura de tela 2024-05-09 003357.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 830, 80);

        setSize(new java.awt.Dimension(844, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int larguraPadrao = 844; // Alar se valor se necessário
    int alturaPadrao = 558;  // Altar se valor se necessário
    interface2 novaJanela = new interface2();
    novaJanela.setSize(larguraPadrao, alturaPadrao);
    novaJanela.setLocationRelativeTo(null);

    
    novaJanela.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          int larguraPadrao = 844; // Alar se valor se necessário
    int alturaPadrao = 558;  // Altar se valor se necessário
    interface3 novaJanela = new interface3();
    novaJanela.setSize(larguraPadrao, alturaPadrao);
    novaJanela.setLocationRelativeTo(null);

    
    novaJanela.setVisible(true);

 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int larguraPadrao = 844; // Alar se valor se necessário
        int alturaPadrao = 558;  // Altar se valor se necessário
    interface6 novaJanela = new interface6();
    novaJanela.setSize(larguraPadrao, alturaPadrao);
    novaJanela.setLocationRelativeTo(null);

    
    novaJanela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
