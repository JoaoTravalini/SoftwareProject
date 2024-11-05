package br.edu.unifei.ecot12.lab08.biblia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String nomeArq = Main.class.getClassLoader().getResource("ecot12-biblia.txt").getFile();
        BufferedReader br = new BufferedReader(new FileReader(nomeArq));
        FabricaTermo ft = new FabricaTermo();
        int contador = 0;
        while (br.ready()) {
            String linha = br.readLine();
            String vet[] = linha.split(" ");
            for (String str : vet) {
                Termo t = ft.getTermo(str);
                contador++;
            }
        }

        System.out.println("contador: " +contador);
        System.out.println("hash: " +ft.getPalavras().size());
        
    }
}
