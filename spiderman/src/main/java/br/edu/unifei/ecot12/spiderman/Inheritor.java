package br.edu.unifei.ecot12.spiderman;

import java.util.ArrayList;
import java.util.List;

public class Inheritor extends LivingBeing{
    private int lifespan;
    private List<Power> powers = new ArrayList<Power>();
    
    public int getLifespan() {
        return lifespan;
    }
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
    public List<Power> getPowers() {
        return powers;
    }
    public void setPowers(List<Power> powers) {
        this.powers = powers;
    }
}
