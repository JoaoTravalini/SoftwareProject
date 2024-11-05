package br.edu.unifei.ecot12.lab03.thor;

public class Cidade extends Territorio {

    private boolean geraEnergia;
    private boolean abandonada;

    public boolean isGeraEnergia() {
        return geraEnergia;
    }
    public void setGeraEnergia(boolean geraEnergia) {
        this.geraEnergia = geraEnergia;
    }
    public boolean isAbandonada() {
        return abandonada;
    }
    public void setAbandonada(boolean abandonada) {
        this.abandonada = abandonada;
    }
}
