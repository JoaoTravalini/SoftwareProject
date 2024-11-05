package br.edu.unifei.ecot12.lab10.clonagem;

public class Main {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle();
        m1.setBrand("BMW");
        m1.setCilinders(1000);

        Motorcycle m2 = m1.clone();
        System.out.println(m1 == m2); // vai devolver como falso pois são objetos diferentes
        System.out.println(m1.isEqual(m2)); // vai devolver true pois possuem os mesmo valores
        
    }
}