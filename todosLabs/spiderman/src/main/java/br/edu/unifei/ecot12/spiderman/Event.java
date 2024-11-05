package br.edu.unifei.ecot12.spiderman;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private String description;
    private Date data;
    private Prophecy profecy;
    private List<LivingBeing> involved = new ArrayList<LivingBeing>();
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Prophecy getProfecy() {
        return profecy;
    }
    public void setProfecy(Prophecy profecy) {
        this.profecy = profecy;
    }
    public List<LivingBeing> getInvolved() {
        return involved;
    }
    public void setInvolved(List<LivingBeing> involved) {
        this.involved = involved;
    }
}
