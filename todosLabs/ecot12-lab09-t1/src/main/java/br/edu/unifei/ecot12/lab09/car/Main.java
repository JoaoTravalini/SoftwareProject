package br.edu.unifei.ecot12.lab09.car;

public class Main {
    public static void main(String[] args) {
        Manufacturer m = new Manufacturer();
        m.setSegment(new Luxury());
        Car c1 = m.build();
        System.err.println("Carro de Luxo:");
        System.out.println(c1.getEngine().getFuel());
        
        m.setSegment(new Popular());
        Car c2 = m.build();
        System.out.println("Carro Popular:");
        System.out.println(c2.getEngine().getFuel());
        System.out.println();

    }
}