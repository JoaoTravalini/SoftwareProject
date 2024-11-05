package br.edu.unifei.ecot12.animais;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fato {
    private Date data;
    private String descricao;
    private String tipo;

    private Humanos autor;
    private List<Humanos> envolvem = 
                    new ArrayList<Humanos>();

    private Ministerio ministerio;

    public Fato(Ministerio ministerio){
        this.ministerio = ministerio;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Humanos getAutor() {
        return autor;
    }

    public void setAutor(Humanos autor) {
        this.autor = autor;
    }

    public List<Humanos> getEnvolvem() {
        return envolvem;
    }

    public void setEnvolvem(List<Humanos> envolvem) {
        this.envolvem = envolvem;
    }

    public Ministerio getMinisterio() {
        return ministerio;
    }

    public void setMinisterio(Ministerio ministerio) {
        this.ministerio = ministerio;
    }
}
