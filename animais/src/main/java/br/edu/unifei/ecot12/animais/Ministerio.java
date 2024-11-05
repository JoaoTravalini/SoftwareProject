package br.edu.unifei.ecot12.animais;

import java.util.ArrayList;
import java.util.List;

public class Ministerio {
    private String nome;
    private String sede;    
    private Bruxo ministro;
    private List<Departamento> departamentos = 
                    new ArrayList<Departamento>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    public Bruxo getMinistro() {
        return ministro;
    }
    public void setMinistro(Bruxo ministro) {
        this.ministro = ministro;
    }
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }   
}
