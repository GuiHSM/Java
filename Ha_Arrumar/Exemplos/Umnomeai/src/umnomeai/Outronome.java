/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umnomeai;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-01
 */
public class Outronome extends javax.swing.JFrame {

    /**
     * Creates new form Outronome
     */
    public Outronome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoplaneta = new javax.swing.ButtonGroup();
        rbtsaturno = new javax.swing.JRadioButton();
        rbturano = new javax.swing.JRadioButton();
        rbtjupiter = new javax.swing.JRadioButton();
        rbtmercurio = new javax.swing.JRadioButton();
        rbtvenus = new javax.swing.JRadioButton();
        rbtmarte = new javax.swing.JRadioButton();
        labpeso = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grupoplaneta.add(rbtsaturno);
        rbtsaturno.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        rbtsaturno.setText("Saturno");

        grupoplaneta.add(rbturano);
        rbturano.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        rbturano.setText("Urano");

        grupoplaneta.add(rbtjupiter);
        rbtjupiter.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        rbtjupiter.setText("Júpiter");

        grupoplaneta.add(rbtmercurio);
        rbtmercurio.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        rbtmercurio.setText("Mercúrio");

        grupoplaneta.add(rbtvenus);
        rbtvenus.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        rbtvenus.setText("Vênus");

        grupoplaneta.add(rbtmarte);
        rbtmarte.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        rbtmarte.setText("Marte");

        labpeso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labpeso.setForeground(new java.awt.Color(0, 153, 153));
        labpeso.setText("Peso na Terra (Kg):");

        btncalcular.setBackground(new java.awt.Color(0, 153, 153));
        btncalcular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btncalcular.setForeground(new java.awt.Color(255, 255, 255));
        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1489533184_success.png"))); // NOI18N
        jLabel1.setText("ta funcional");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labpeso)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtmercurio)
                                .addComponent(rbtvenus))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtjupiter)
                                .addComponent(rbtmarte))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbturano)
                                .addComponent(rbtsaturno)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labpeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtmercurio)
                    .addComponent(rbtsaturno)
                    .addComponent(rbtmarte))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtvenus)
                    .addComponent(rbturano)
                    .addComponent(rbtjupiter))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
       
        double pesoterra = 0, pesofinal=0;
        String tipo = "";
        if(txtpeso.getText() != "")
            pesoterra = Double.parseDouble(txtpeso.getText());
        
        if(rbtmercurio.isSelected())
       {
           pesofinal = (pesoterra/10)*0.37;
           tipo = "Mercurio";
       }
       else if(rbtmarte.isSelected())
       {
           pesofinal = (pesoterra/10)*0.88;
           tipo = "Marte";
       }
       else if(rbtsaturno.isSelected())
       {
           pesofinal = (pesoterra/10)*1.15;
           tipo = "Saturno";
       }
       else if(rbturano.isSelected())
       {
           pesofinal = (pesoterra/10)*1.17;
           tipo = "Urano";
       }
       else if(rbtvenus.isSelected())
       {
           pesofinal = (pesoterra/10)*2.64;
           tipo = "Vênus";
       }    
       else if(rbtjupiter.isSelected())
       {
           pesofinal = (pesoterra/10);
           tipo = "Júpiter";
       }
        
        JOptionPane.showMessageDialog(null, "O peso do planeta " + tipo + " é " + pesofinal);
    }//GEN-LAST:event_btncalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Outronome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Outronome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Outronome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Outronome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Outronome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.ButtonGroup grupoplaneta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labpeso;
    private javax.swing.JRadioButton rbtjupiter;
    private javax.swing.JRadioButton rbtmarte;
    private javax.swing.JRadioButton rbtmercurio;
    private javax.swing.JRadioButton rbtsaturno;
    private javax.swing.JRadioButton rbturano;
    private javax.swing.JRadioButton rbtvenus;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
