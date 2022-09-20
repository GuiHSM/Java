/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorvete21.pkg03;


/**
 *
 * @author PC-01
 */
public class tabelaDeIdadeNatacao extends javax.swing.JFrame {

    /**
     * Creates new form segundo
     */
    public tabelaDeIdadeNatacao() {
        super("Idade Natação");
        initComponents();
        setDefaultCloseOperation(2);
        cbData.addItem("Limpo");
        for (int i = 2017; i>1917; i--) {
            cbData.addItem(""+i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbData = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        labInfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbData.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDataItemStateChanged(evt);
            }
        });

        jLabel1.setText("Ano de Nascimento");

        jLabel2.setText("Idade na Natação");

        txtIdade.setEditable(false);
        txtIdade.setText("Muito jovem para essa classificação");

        labInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorvete21/Imagens/simbolInfo.png"))); // NOI18N
        labInfo.setText("Info");
        labInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labInfoMouseClicked(evt);
            }
        });

        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labInfo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbData, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labInfo)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDataItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDataItemStateChanged
        if(evt.getStateChange()==1)
        {
            String data = cbData.getSelectedItem().toString(),valor;
            if(data=="Limpo")
            {
                valor="Mude a Data";
            }
            else{
                int idade = 2017-(Integer.parseInt(data));
                if(idade<5)
                    valor="Muito jovem para essa classificação";
                else if(idade<8)
                    valor="Infantil A";
                else if(idade<12)
                    valor="Infantil B";
                else if(idade<14)
                    valor="Juvenil A";
                else if(idade<18)
                    valor ="Juvenil B";
                else
                    valor ="Adulto";
            }
            txtIdade.setText(valor);
        }
    }//GEN-LAST:event_cbDataItemStateChanged

    private void labInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labInfoMouseClicked
        new info("natacao").setVisible(true);
    }//GEN-LAST:event_labInfoMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labInfo;
    private javax.swing.JTextField txtIdade;
    // End of variables declaration//GEN-END:variables
}
