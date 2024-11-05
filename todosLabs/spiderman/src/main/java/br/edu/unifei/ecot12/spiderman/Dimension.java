package br.edu.unifei.ecot12.spiderman;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Dimension {
    private String name;
    private Date time;
    private List<Totem> Totens = 
                        new ArrayList<Totem>();
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public List<Totem> getTotens() {
        return Totens;
    }
    public void setTotens(List<Totem> totens) {
        Totens = totens;
    }
    
}
