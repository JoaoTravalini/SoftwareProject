package br.edu.unifei.ecot12.lab03.thor;

public class Reino extends Territorio{
    
    private String nome;
    private String simbolo;
    private Divindades governante;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    public Divindades getGovernante() {
        return governante;
    }
    public void setGovernante(Divindades governante) {
        this.governante = governante;
    }
    
}
