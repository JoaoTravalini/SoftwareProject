package br.edu.unifei.ecot12.lab03.thor;

import java.util.ArrayList;
import java.util.List;


public abstract class Seres {
    
    private boolean vivo;
    private String nome;
    private String sexo;
    
    private List<Seres> filhos = new ArrayList<Seres>();
    private List<Artefatos> artefato = new ArrayList<Artefatos>();

    private Territorio mora;

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

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

    public List<Seres> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<Seres> filhos) {
        this.filhos = filhos;
    }

    public List<Artefatos> getArtefato() {
        return artefato;
    }

    public void setArtefato(List<Artefatos> artefato) {
        this.artefato = artefato;
    }

    public Territorio getMora() {
        return mora;
    }

    public void setMora(Territorio mora) {
        this.mora = mora;
    }
    
}
