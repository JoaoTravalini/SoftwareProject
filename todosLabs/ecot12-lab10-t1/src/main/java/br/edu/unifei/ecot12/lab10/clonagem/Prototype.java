package br.edu.unifei.ecot12.lab10.clonagem;

public interface Prototype <T extends Prototype<T>> {
    public T clone();
}
