package br.edu.unifei.ecot12.lab10.clinica;

public class Procedimento {
    private String sintomas;
    private String tratamento;
    
    public Procedimento(String s, String t){
        this.sintomas = s;
        this.tratamento = t;
    }

    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public String getTratamento() {
        return tratamento;
    }
    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
    
}
