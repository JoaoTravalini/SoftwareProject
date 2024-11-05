package br.unifei.edu.ecot12.hobbit;

public class Nazgul extends Human {
    private boolean invisibility;
    private boolean lightSensible;
    public boolean isInvisibility() {
        return invisibility;
    }
    public void setInvisibility(boolean invisibility) {
        this.invisibility = invisibility;
    }
    public boolean isLightSensible() {
        return lightSensible;
    }
    public void setLightSensible(boolean lightSensible) {
        this.lightSensible = lightSensible;
    }
}
