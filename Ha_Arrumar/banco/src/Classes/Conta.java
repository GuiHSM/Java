/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author guisa
 */
public class Conta {
    private double saldo;
    private int numero;
    private int agencia;
    private Cliente titular;
    private static int total;
    
    public Conta(int numero, int agencia){
        Conta.total++;
        this.agencia=agencia;
        this.numero = numero;
        System.out.println("o total de classes instanciadas é " + total);
    }
    
    public static int getTotal(){
        return total;
    }
    
    public Cliente getCliente(){
        return titular;
    }
    
    public void setCliente(Cliente titular){
        this.titular = titular;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
    public void setAgencia(int agencia){
        if (agencia<=0){
            System.out.println("agencia não pode ser negativo");
            return;
        }
        this.agencia = agencia;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        if (agencia<=0){
            System.out.println("número não pode ser negativo");
            return;
        }
        this.numero = numero;
    }
    
    public double mostraSaldo(){
        return saldo;
    }
    
    public void deposita(double valor){
        this.saldo +=valor;
    }
    
    public boolean saca(double valor){
        if(saldo>valor && valor>0){
            saldo-=valor;
            return true;
        }return false;
    }
    
    public boolean transfere(double valor, Conta ahTransferir){
        if (saca(valor)){
            ahTransferir.deposita(valor);
            return true;
        }return false;
    }
}
