package br.edu.unifei.ecot12.lab10.clonagem;

public interface Equality <T extends Equality<T>>{
    public boolean isEqual(T obj);
}
