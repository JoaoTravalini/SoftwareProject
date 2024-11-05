package br.edu.unifei.ecot12.fringe;

public class Agent extends Person {
    
    public Agent(Universe universe){
        super(universe);
    }

    private String capacity;

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
