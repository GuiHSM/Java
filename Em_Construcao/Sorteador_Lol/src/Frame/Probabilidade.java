
package Frame;

import Banco.ExtractDoc;
import static Frame.Tela.lista;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author guisa
 */
public class Probabilidade extends javax.swing.JFrame{

    /**
     * Creates new form Probabilidade
     * @param lista
     */
    public Probabilidade() {
        initComponents();
        Tela.lista.forEach(campeao -> {
            jCBLista.addItem(campeao.getNome());
        });
        for (int i=0;i<10;i++) {
            cBList.get(i).setSelectedIndex(Tela.lista.get(0).getStatus()[i]);
        }
    }                        
    private void initComponents(){
        String[] aux_Tier={"Nula","Altíssimo","Alta","Média", "Baixa", "Baixíssima"};
        String[] aux_Dificuldade={"Não Existe","Díficil","Médio","Fácil", "Fácilimo", "Sei Jogar", "Troll"};
        String[] aux_Label={"Top Dif","Jg Dif","Mid Dif","Adc Dif", "Sup Dif", "Top Prob","Jg Prob","Mid Prob","Adc Prob","Sup Prob"};
        cBList=new ArrayList<>();
        jList=new ArrayList<>();
        jCBLista = new javax.swing.JComboBox<>();
        for (int i = 0; i < 10; i++) {
            cBList.add(new javax.swing.JComboBox<>());
        }
        for (int i = 0; i < 5; i++) {
            for (String string : aux_Dificuldade) {
                cBList.get(i).addItem(string);
            }
        }
        for (int i = 5; i < 10; i++) {
            for (String string : aux_Tier) {
                cBList.get(i).addItem(string);
            }
        }
        for (int i = 0; i < 10; i++) {
            jList.add(new javax.swing.JLabel());
            jList.get(i).setText(aux_Label[i]);
        }
        jLSumario = new javax.swing.JLabel();
        jBSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(jCBLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 11, 396, -1));
        jCBLista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBListaItemStateChanged(evt);
            }
            
        });
        
        for (int i = 0; i < 5; i++) {
            getContentPane().add(cBList.get(i), new org.netbeans.lib.awtextra.AbsoluteConstraints(60+i*145, 55, 90, -1));
        }
        for (int i = 5; i < 10; i++) {
            getContentPane().add(cBList.get(i), new org.netbeans.lib.awtextra.AbsoluteConstraints(60+(i-5)*145, 90, 90, -1));
        }
        for (int i = 0; i < 5; i++) {
            getContentPane().add(jList.get(i), new org.netbeans.lib.awtextra.AbsoluteConstraints(5+i*145+7, 60, 40, -1));
        }
        for (int i = 5; i < 10; i++) {
            getContentPane().add(jList.get(i), new org.netbeans.lib.awtextra.AbsoluteConstraints(5+(i-5)*145, 95, 55, -1));
        }
        jLSumario.setText("Chances Dentro do Grupo: Altíssimas="+Tela.tiers[1]+", Alta="+Tela.tiers[2]+", Médias="+Tela.tiers[3]+", Baixas="+Tela.tiers[4]+", Baixíssimas="+Tela.tiers[5]);
        getContentPane().add(jLSumario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, -1, -1));

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 117, 100, -1));

        pack();
    }// </editor-fold>           
    private void jBSalvarActionPerformed(ActionEvent evt){
        int[] status = new int[10];
        String newLine=Tela.lista.get(jCBLista.getSelectedIndex()).getNome();
        for (int i=0;i<10;i++) {
            status[i]=cBList.get(i).getSelectedIndex();
            newLine+=" "+String.valueOf(status[i]);
        }
        Tela.lista.get(jCBLista.getSelectedIndex()).setStatus(status);
        ExtractDoc.linhas.set(jCBLista.getSelectedIndex()+2,newLine);
        try{
        ExtractDoc.AlterDados();
        }catch(IOException exc){
            System.out.println(exc.getMessage());
        }
        if(jCBLista.getSelectedIndex()+1<jCBLista.getItemCount()){
            jCBLista.setSelectedIndex(jCBLista.getSelectedIndex()+1);
        }
    }
    private void jCBListaItemStateChanged(ItemEvent evt) {
        for (int i=0;i<10;i++) {
            cBList.get(i).setSelectedIndex(Tela.lista.get(jCBLista.getSelectedIndex()).getStatus()[i]);
        }
    }
// Variables declaration - do not modify                     
    
    // End of variables declaration     
    // Variables declaration - do not modify                     
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCBLista;
    private ArrayList<javax.swing.JComboBox<String>> cBList;
    private ArrayList<javax.swing.JLabel> jList; 
    private javax.swing.JLabel jLSumario;
    // End of variables declaration                   
}
