package br.edu.unifei.ecot12.lab09.car;

public class Luxury implements Segment{
    public void buildEngine(Car c){
        c.getEngine().setCilinders(8);
        c.getEngine().setHp(2.0f);
        c.getEngine().setFuel("Gasoline");
    }
}
