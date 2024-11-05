package br.edu.unifei.ecot12.animais;

import java.util.ArrayList;
import java.util.List;

public class Perigoso extends Animal{
    private char classe;
    private List<Animal> presas = 
                            new ArrayList<Animal>();

    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public List<Animal> getPresas() {
        return presas;
    }

    public void setPresas(List<Animal> presas) {
        this.presas = presas;
    }

}
