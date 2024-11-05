package br.edu.unifei.ecot12.lab01;

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        CampoMinado c = new CampoMinado();
        Scanner s = new Scanner(System.in);
        
        while(c.getEndGame() == false){
            c.imprime();
            System.out.println("linha: ");
            int lin = s.nextInt();
            System.out.println("coluna: ");
            int col = s.nextInt();
            
            c.disarmed(lin, col);
        }
        if (c.getEndGame() == true)
        {   
            c.imprime();
            System.out.println("Fim de jogo.");
        }
        s.close();
    }
}