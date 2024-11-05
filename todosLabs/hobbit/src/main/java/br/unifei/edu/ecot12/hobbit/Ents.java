package br.unifei.edu.ecot12.hobbit;

public class Ents extends LivingBeing{

    private String type;
    private Regions region;
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Regions getRegion() {
        return region;
    }
    public void setRegion(Regions region) {
        this.region = region;
    }
}
