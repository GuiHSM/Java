/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author guisa
 */
public class Campeao {
    String Nome;
    int[] status;

    public Campeao(String Nome, int topDif, int jgDif, int midDif, int adcDif, int supDif, int topProb, int jgProb, int midProb, int adcProb, int supProb) {
        this.Nome = Nome;
        this.status = new int[10];
        this.status[0] = topDif;
        this.status[1] = jgDif;
        this.status[2] = midDif;
        this.status[3] = adcDif;
        this.status[4] = supDif;
        this.status[5] = topProb;
        this.status[6] = jgProb;
        this.status[7] = midProb;
        this.status[8] = adcProb;
        this.status[9] = supProb;
    }

    public void setStatus(int[] status) {
        this.status = status;
    }

    public String getNome() {
        return Nome;
    }

    public int[] getStatus() {
        return status;
    }
    
}
