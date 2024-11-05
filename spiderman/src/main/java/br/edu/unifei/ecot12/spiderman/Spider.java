package br.edu.unifei.ecot12.spiderman;

import java.util.Date;

public class Spider extends Totem{
    private Date bite;
    private Human lovedOne;
    
    public Date getBite() {
        return bite;
    }
    public void setBite(Date bite) {
        this.bite = bite;
    }
    public Human getLovedOne() {
        return lovedOne;
    }
    public void setLovedOne(Human lovedOne) {
        this.lovedOne = lovedOne;
    }
}
