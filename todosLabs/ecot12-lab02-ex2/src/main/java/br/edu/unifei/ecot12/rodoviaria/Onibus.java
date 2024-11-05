package br.edu.unifei.ecot12.rodoviaria;

import java.util.List;
import java.util.ArrayList;

public class Onibus {

    private int assentos;
    private int ano;
    private float volumeBagageiro;
    private boolean comum;
    private String placa; 
    private Motorista m;
    private List<Linha> linhas = new ArrayList<Linha>();
    
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public float getVolumeBagageiro() {
        return volumeBagageiro;
    }
    public void setVolumeBagageiro(float volumeBagageiro) {
        this.volumeBagageiro = volumeBagageiro;
    }
    public boolean isComum() {
        return comum;
    }
    public void setComum(boolean comum) {
        this.comum = comum;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Motorista getM() {
        return m;
    }
    public void setM(Motorista m) {
        this.m = m;
    }
    public List<Linha> getLinhas() {
        return linhas;
    }
    public void setLinhas(List<Linha> linhas) {
        this.linhas = linhas;
    }

    @Override
    public String toString()
    {
        return "Onibus" + placa + "\nAno: " + ano + "\nAssentos: " + assentos + "\nCapacidade do Bagageiro: " + volumeBagageiro + 
        "\nLeito: " + !comum + "dm3"; 
    }
}
