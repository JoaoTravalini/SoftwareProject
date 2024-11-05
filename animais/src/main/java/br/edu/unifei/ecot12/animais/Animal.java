package br.edu.unifei.ecot12.animais;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String criatura;
    private String descricao;
    private String sexo;
    private List<Ministerio> habita = 
                    new ArrayList<Ministerio>();
    
    public String getCriatura() {
        return criatura;
    }
    public void setCriatura(String criatura) {
        this.criatura = criatura;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public List<Ministerio> getHabita() {
        return habita;
    }
    public void setHabita(List<Ministerio> habita) {
        this.habita = habita;
    }
}
