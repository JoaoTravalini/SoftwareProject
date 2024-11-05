package br.edu.unifei.ecot12.rodoviaria;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    private String nome;
    private String cnpj;
    private List<Motorista> motoristas = new ArrayList<Motorista>();
    private List<Atendente> atendentes = new ArrayList<Atendente>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public List<Motorista> getMotoristas() {
        return motoristas;
    }
    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }
    public List<Atendente> getAtendentes() {
        return atendentes;
    }
    public void setAtendentes(List<Atendente> atendentes) {
        this.atendentes = atendentes;
    }
}
