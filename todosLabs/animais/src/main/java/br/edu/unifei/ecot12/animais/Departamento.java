package br.edu.unifei.ecot12.animais;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String sigla;
    private Bruxo chefe;
    private List<Bruxo> trabalhadores = 
                        new ArrayList<Bruxo>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public Bruxo getChefe() {
        return chefe;
    }
    public void setChefe(Bruxo chefe) {
        this.chefe = chefe;
    }
    public List<Bruxo> getTrabalhadores() {
        return trabalhadores;
    }
    public void setTrabalhadores(List<Bruxo> trabalhadores) {
        this.trabalhadores = trabalhadores;
    }
}
