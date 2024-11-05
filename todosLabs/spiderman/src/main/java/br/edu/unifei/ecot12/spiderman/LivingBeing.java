package br.edu.unifei.ecot12.spiderman;

public abstract class LivingBeing {
    private String name;
    private String color;
    private String race;
    private LivingBeing original;
    private Group group;
    private Dimension dimension;
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public LivingBeing getOriginal() {
        return original;
    }
    public void setOriginal(LivingBeing original) {
        this.original = original;
    }
    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }
    public Dimension getDimension() {
        return dimension;
    }
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
