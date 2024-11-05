package br.edu.unifei.ecot12.lab09.salgado;

public class Esfirraria implements Confeitaria<Esfirra> {
    @Override
    public Esfirra novoSalgado() {
        return new Esfirra();
    }
}
