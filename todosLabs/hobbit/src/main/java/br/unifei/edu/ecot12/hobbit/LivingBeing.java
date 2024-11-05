package br.unifei.edu.ecot12.hobbit;

public abstract class LivingBeing {

    private String name;
    private String sex;
    private float vitality;
    private float intelligence;
    private float height;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public float getVitality() {
        return vitality;
    }
    public void setVitality(float vitality) {
        this.vitality = vitality;
    }
    public float getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(float intelligence) {
        this.intelligence = intelligence;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    
}
