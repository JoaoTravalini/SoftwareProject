package br.edu.unifei.ecot12.spiderman;

import java.util.ArrayList;
import java.util.List;

public abstract class Totem {
    
    private String codename;
    private SideEnum side;
    private List<Power> powers = new ArrayList<>();
    private List<Gadget> gadgets = new ArrayList<>();
    
    public String getCodename() {
        return codename;
    }
    public void setCodename(String codename) {
        this.codename = codename;
    }
    public SideEnum getSide() {
        return side;
    }
    public void setSide(SideEnum side) {
        this.side = side;
    }
    public List<Power> getPowers() {
        return powers;
    }
    public void setPowers(List<Power> powers) {
        this.powers = powers;
    }
    public List<Gadget> getGadgets() {
        return gadgets;
    }
    public void setGadgets(List<Gadget> gadgets) {
        this.gadgets = gadgets;
    }

    
}
