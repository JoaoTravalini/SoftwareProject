package br.edu.unifei.ecot12.spiderman;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private String goal;
    private Dimension dimension;
    private List<LivingBeing> members = 
                                new ArrayList<LivingBeing>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGoal() {
        return goal;
    }
    public void setGoal(String goal) {
        this.goal = goal;
    }
    public Dimension getDimension() {
        return dimension;
    }
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    public List<LivingBeing> getMembers() {
        return members;
    }
    public void setMembers(List<LivingBeing> members) {
        this.members = members;
    }
}
