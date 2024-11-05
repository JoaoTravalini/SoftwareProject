package br.edu.unifei.ecot12.lab10.clonagem;

public class Motorcycle implements Prototype<Motorcycle>, Equality<Motorcycle> {
    private String brand;
    private float cilinders;


    @Override
    public boolean isEqual(Motorcycle obj){
        return this.brand.equals(obj.brand) &&
            this.cilinders == obj.cilinders;    
    }

    @Override
    public Motorcycle clone() {
        Motorcycle m = new Motorcycle();

        m.brand = this.brand;
        m.cilinders = this.cilinders;

        return m;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getCilinders() {
        return cilinders;
    }

    public void setCilinders(float cilinders) {
        this.cilinders = cilinders;
    }
}
