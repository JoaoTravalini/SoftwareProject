package br.edu.unifei.ecot12.lab08.biblia;

public class Palavra implements Termo {
    private String caracteres;

    protected Palavra() {
    }

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }
}
