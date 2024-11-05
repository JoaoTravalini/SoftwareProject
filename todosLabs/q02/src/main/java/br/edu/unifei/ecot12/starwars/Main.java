package br.edu.unifei.ecot12.starwars;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // Inserindo um objeto de B na lista de D
        D d = new D();
        d.setD1(10.0);

        B b = new B();

        List<B> listaB = new ArrayList<>();
        listaB.add(b);

        d.setVariosB(listaB);

        System.out.println("Resultado do metodo aaaaa() da classe D: " + d.aaaaa());
    }
}