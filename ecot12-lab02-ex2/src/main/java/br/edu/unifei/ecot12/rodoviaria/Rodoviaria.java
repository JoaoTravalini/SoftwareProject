package br.edu.unifei.ecot12.rodoviaria;

import java.util.ArrayList;
import java.util.List;


public class Rodoviaria {

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;

    private List<Passagem> passagens = new ArrayList<Passagem>();
    private List<Onibus> onibus = new ArrayList<Onibus>();
    private List<Linha> linhas = new ArrayList<Linha>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public List<Passagem> getPassagens() {
        return passagens;
    }
    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }
    public List<Onibus> getOnibus() {
        return onibus;
    }
    public void setOnibus(List<Onibus> onibus) {
        this.onibus = onibus;
    }
    public List<Linha> getLinhas() {
        return linhas;
    }
    public void setLinhas(List<Linha> linhas) {
        this.linhas = linhas;
    }
}
