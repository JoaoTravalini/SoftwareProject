package br.edu.unifei.ecot12.lab09.car;

public class Popular implements Segment{

    @Override
    public void buildEngine(Car c)
    {
        c.getEngine().setCilinders(3);
        c.getEngine().setHp(1.0f);
        c.getEngine().setFuel("Flex");
    }
}

