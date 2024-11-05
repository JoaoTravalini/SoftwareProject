package br.edu.unifei.ecot12.industria;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private int numero_p;
    private float orcamento;
    private Funcionarios gerente;
    private Departamento departamento;
    private List<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
    private List<Componentes> componentes = new ArrayList<Componentes>();
    
    public int getNumero_p() {
        return numero_p;
    }
    public void setNumero_p(int numero_p) {
        this.numero_p = numero_p;
    }
    public float getOrcamento() {
        return orcamento;
    }
    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
    public Funcionarios getGerente() {
        return gerente;
    }
    public void setGerente(Funcionarios gerente) {
        this.gerente = gerente;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public List<Componentes> getComponentes() {
        return componentes;
    }
    public void setComponentes(List<Componentes> componentes) {
        this.componentes = componentes;
    }

    

}
