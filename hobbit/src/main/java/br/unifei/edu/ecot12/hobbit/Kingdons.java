package br.unifei.edu.ecot12.hobbit;

public class Kingdons extends Regions {

    private String name;
    private LivingBeing ruler;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LivingBeing getRuler() {
        return ruler;
    }
    public void setRuler(LivingBeing ruler) {
        this.ruler = ruler;
    }
}
