package br.edu.unifei.ecot12.spiderman;

import java.util.Date;

public class Human extends LivingBeing{
    private Date born;
    private Totem totem;
    
    public Date getBorn() {
        return born;
    }
    public void setBorn(Date born) {
        this.born = born;
    }
    public Totem getTotem() {
        return totem;
    }
    public void setTotem(Totem totem) {
        this.totem = totem;
    }
}
