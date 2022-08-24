/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import Classes.Campeao;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guisa
 */
public class Extrair {
    public static ArrayList<Campeao> extrair() throws FileNotFoundException{
        ArrayList<Campeao> campeoes = new ArrayList<>();
        Scanner in = new Scanner(new FileReader("dados.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] lista = line.split(" ");
                Campeao novo = new Campeao(lista[0], 
                        Integer.parseInt(lista[1]),Integer.parseInt(lista[2]),Integer.parseInt(lista[3]),
                        Integer.parseInt(lista[4]),Integer.parseInt(lista[5]),Integer.parseInt(lista[6]),
                        Integer.parseInt(lista[7]),Integer.parseInt(lista[8]),Integer.parseInt(lista[9]),
                        Integer.parseInt(lista[10]));
                campeoes.add(novo);
            }
        return campeoes;
    }
}
