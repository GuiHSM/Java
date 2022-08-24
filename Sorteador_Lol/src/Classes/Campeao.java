/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author guisa
 */
public class Campeao {
    String Nome;
    int topDif;
    int jgDif;
    int midDif;
    int adcDif;
    int supDif;
    int topProb;
    int jgProb;
    int midProb;
    int adcProb;
    int supProb;

    public Campeao(String Nome, int topDif, int jgDif, int midDif, int adcDif, int supDif, int topProb, int jgProb, int midProb, int adcProb, int supProb) {
        this.Nome = Nome;
        this.topDif = topDif;
        this.jgDif = jgDif;
        this.midDif = midDif;
        this.adcDif = adcDif;
        this.supDif = supDif;
        this.topProb = topProb;
        this.jgProb = jgProb;
        this.midProb = midProb;
        this.adcProb = adcProb;
        this.supProb = supProb;
    }

    public String getNome() {
        return Nome;
    }

    public int getTopDif() {
        return topDif;
    }

    public void setTopDif(int topDif) {
        this.topDif = topDif;
    }

    public int getJgDif() {
        return jgDif;
    }

    public void setJgDif(int jgDif) {
        this.jgDif = jgDif;
    }

    public int getMidDif() {
        return midDif;
    }

    public void setMidDif(int midDif) {
        this.midDif = midDif;
    }

    public int getAdcDif() {
        return adcDif;
    }

    public void setAdcDif(int adcDif) {
        this.adcDif = adcDif;
    }

    public int getSupDif() {
        return supDif;
    }

    public void setSupDif(int supDif) {
        this.supDif = supDif;
    }

    public int getTopProb() {
        return topProb;
    }

    public void setTopProb(int topProb) {
        this.topProb = topProb;
    }

    public int getJgProb() {
        return jgProb;
    }

    public void setJgProb(int jgProb) {
        this.jgProb = jgProb;
    }

    public int getMidProb() {
        return midProb;
    }

    public void setMidProb(int midProb) {
        this.midProb = midProb;
    }

    public int getAdcProb() {
        return adcProb;
    }

    public void setAdcProb(int adcProb) {
        this.adcProb = adcProb;
    }

    public int getSupProb() {
        return supProb;
    }

    public void setSupProb(int supProb) {
        this.supProb = supProb;
    }
    
}
