package br.edu.unifei.ecot12.animais;

import java.util.Date;

public abstract class Humanos {
    private String nome;
    private String sexo;
    private Date nascimento;
    private Date morte;
    private Ministerio ministerio;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public Date getMorte() {
        return morte;
    }
    public void setMorte(Date morte) {
        this.morte = morte;
    }
    public Ministerio getMinisterio() {
        return ministerio;
    }
    public void setMinisterio(Ministerio ministerio) {
        this.ministerio = ministerio;
    }
}
