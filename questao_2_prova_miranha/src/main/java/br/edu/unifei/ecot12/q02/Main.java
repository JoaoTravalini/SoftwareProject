package br.edu.unifei.ecot12.q02;

public class Main {
    public static void main(String Args[])
    {
        A a2 = new A();
        
        C c2 = new C();
        c2.setC1(10.0f);
        
        D d2 = new D();
        d2.setD1(5.0);
        
        a2.setB(c2);
        
        a2.setA1("Estou aqui");
        
        d2.getMultiA().add(a2);
        
        System.out.println("Resultado " + d2.ddddd());

    }
}