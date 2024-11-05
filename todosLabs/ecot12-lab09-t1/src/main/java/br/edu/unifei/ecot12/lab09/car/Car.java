package br.edu.unifei.ecot12.lab09.car;

public class Car {
    private String model;
    private String serie;
    private String manufacturer;
    private String color;
    private Engine engine = new Engine(); // Diamante Negro -> new
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
