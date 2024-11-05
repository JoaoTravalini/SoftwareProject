package br.edu.unifei.ecot12.industria;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String sigla;
    private String nome;
    private String localizacao;
    private float orcamento;
    private Funcionarios gerente;
    private List<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
    private List<Projeto> projetos = new ArrayList<Projeto>();
    
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
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
    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public List<Projeto> getProjetos() {
        return projetos;
    }
    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    
}
