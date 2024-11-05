package br.unifei.edu.ecot12.hobbit;

import java.util.ArrayList;
import java.util.List;


// Continente não pode ser abstrato porque eu vou instanciar o nome dele
public class Continent {
    private String name;
    private List<Regions> regions = new ArrayList<Regions>();
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Regions> getRegions() {
        return regions;
    }
    public void setRegions(List<Regions> regions) {
        this.regions = regions;
    }
}
