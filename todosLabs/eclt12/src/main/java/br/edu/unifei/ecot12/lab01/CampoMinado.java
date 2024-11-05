package br.edu.unifei.ecot12.lab01;

import java.util.Random;


public class CampoMinado {
    private char gabarito[][] = new char[10][10];
    private char visual[][] = new char[10][10];
    public static final int TOTAL_BOMBAS = 10;
    private int totalDesarme;
    private boolean endGame;

    public CampoMinado() {
        
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                gabarito[i][j] = ' ';
                visual[i][j] = '?';
            }
        }
        
        Random r = new Random();

        for(int i = 0; i < TOTAL_BOMBAS; i++) {
            
            int l = r.nextInt(10); // Limita de 0 a 9 (método nextInt)
            int c = r.nextInt(10); 
            

            if(gabarito[l][c] == '*'){
                i--;
            }
            else{
                gabarito[l][c] = '*';
            }
        }

    }

    public void disarmed(int l, int c)
    {
        if(endGame != true && visual[l][c] == '?'){
            
            visual[l][c] = gabarito[l][c];
            totalDesarme++;

            if(visual[l][c] == '*') {
                endGame = true;
            }
        }
    }

    public void imprime(){
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print("["+visual[i][j]+"]");
            }
            System.out.println();
        }
    }
    
    public int getTotalDesarm(){
        return totalDesarme;
    }
    public boolean getEndGame(){
        return endGame;
    }

}