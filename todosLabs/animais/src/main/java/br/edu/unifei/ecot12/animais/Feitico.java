package br.edu.unifei.ecot12.animais;

public abstract class Feitico {
    private String nome;
    private String descricao;
    private Feitico contraFeitico;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Feitico getContraFeitico() {
        return contraFeitico;
    }
    public void setContraFeitico(Feitico contraFeitico) {
        this.contraFeitico = contraFeitico;
    }   
}