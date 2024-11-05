package br.edu.unifei.ecot12.lab03.thor;

import java.util.ArrayList;
import java.util.List;

public class Artefatos {
    
    private String material;
    private String nome;
    private String objeto;
    private boolean destruido;

    private List<Poder> poderes = new ArrayList<Poder>();
    private Seres dono;
    
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getObjeto() {
        return objeto;
    }
    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }
    public boolean isDestruido() {
        return destruido;
    }
    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }
    public List<Poder> getPoderes() {
        return poderes;
    }
    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }
    public Seres getDono() {
        return dono;
    }
    public void setDono(Seres dono) {
        this.dono = dono;
    }

    

}
