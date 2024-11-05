package br.edu.unifei.ecot12.starwars;

public class B extends A{
    private A a;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public C getC() {
        return new E();
    }

    public double aaaaa() {
        return getC().ccccc();
    }

}
