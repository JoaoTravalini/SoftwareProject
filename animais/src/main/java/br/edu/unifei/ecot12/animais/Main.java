package br.edu.unifei.ecot12.animais;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       Perigoso p = new Perigoso();
       p.setCriatura("obscurial");
       p.setClasse('A');
       p.setDescricao("Formato de nuvem.");
    
       Bruxo b = new Bruxo();
       b.setNome("Ariana Dumbledore");
       b.setMorte(new Date());

       b.setParasita(p);
       
       System.out.println(b.getParasita().getDescricao());
    }
}