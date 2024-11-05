package br.edu.unifei.ecot12.lab09.salgado;

public class Coxinharia implements Confeitaria<Coxinha> {
    
    @Override
    public Coxinha novoSalgado() {
        return new Coxinha();
    }
}
