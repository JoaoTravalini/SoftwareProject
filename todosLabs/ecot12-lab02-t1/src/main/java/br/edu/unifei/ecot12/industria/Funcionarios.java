package br.edu.unifei.ecot12.industria;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Funcionarios {

    private String nome;
    private int matricula;
    private Date admissao;
    private float salario;
    private Departamento departamento;
    private List<Projeto> projetos = new ArrayList<Projeto>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Date getAdmissao() {
        return admissao;
    }
    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public List<Projeto> getProjetos() {
        return projetos;
    }
    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
}
