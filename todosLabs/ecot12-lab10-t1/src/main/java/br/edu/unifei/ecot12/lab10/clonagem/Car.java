package br.edu.unifei.ecot12.lab10.clonagem;

public class Car implements Prototype<Car>, Equality<Car>{

    private String brand;
    private String model;
    private String plate;
    private int hp;

    @Override
    public boolean isEqual(Car obj){
        return this.brand.equals(obj.brand) && 
            this.model.equals(obj.model) &&
            this.plate.equals(obj.plate) &&
            this.hp == obj.hp;
    }

    @Override
    public Car clone() {
        Car c = new Car();

        c.brand = this.brand;
        c.model = this.model;
        c.plate = this.plate;

        return c;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
