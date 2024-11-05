package br.edu.unifei.ecot12.lab08.gourmet;

public class Receita {
    private String nome;
    private Passo primeiroPasso;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Passo getPrimeiroPasso() {
        return primeiroPasso;
    }
    
    public Passo setPrimeiroPasso(Passo primeiroPasso) {
        this.primeiroPasso = primeiroPasso;
        return primeiroPasso;
    }
}
