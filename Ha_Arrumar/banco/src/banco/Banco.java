/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import Classes.Conta;

/**
 *
 * @author guisa
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta.titular);
    }
    
}
