/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import Classes.Campeao;
import Frame.Tela;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author guisa
 */
public class ExtractDoc {
    public static ArrayList<String> linhas;
    public static void extrairCampeoes() throws FileNotFoundException{
        Scanner in = new Scanner(new FileReader("dados.txt"));
        String line=in.nextLine();
        linhas = new ArrayList<>();
        linhas.add(line);
        String[] lista = line.split(" ");
        for(int i=0;i<lista.length;i++){
            Tela.tiers[i]=Integer.parseInt(lista[i]);
        }
        line=in.nextLine();
        linhas.add(line);
        while (in.hasNextLine()) {
            line = in.nextLine();
            linhas.add(line);
            lista = line.split(" ");
            Campeao novo = new Campeao(lista[0], 
                    Integer.parseInt(lista[1]),Integer.parseInt(lista[2]),Integer.parseInt(lista[3]),
                    Integer.parseInt(lista[4]),Integer.parseInt(lista[5]),Integer.parseInt(lista[6]),
                    Integer.parseInt(lista[7]),Integer.parseInt(lista[8]),Integer.parseInt(lista[9]),
                    Integer.parseInt(lista[10]));
            Tela.lista.add(novo);
        }
    }
    public static void AlterDados() throws IOException{
        Path path = Paths.get("dados.txt");
        String tier="";
        for(int i:Tela.tiers){
            tier+=String.valueOf(i)+" ";
        }
        linhas.set(0, tier);
        Files.write(path, linhas);
    }
}
