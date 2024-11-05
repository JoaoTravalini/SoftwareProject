package br.edu.unifei.ecot12.rodoviaria;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    
    private int carteira;
    private String nome;
    private List<Linha> linhas = new ArrayList<Linha>();
    private Onibus onibus;
    
    public int getCarteira() {
        return carteira;
    }
    public void setCarteira(int carteira) {
        this.carteira = carteira;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Linha> getLinhas() {
        return linhas;
    }
    public void setLinhas(List<Linha> linhas) {
        this.linhas = linhas;
    }
    public Onibus getOnibus() {
        return onibus;
    }
    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    
}
