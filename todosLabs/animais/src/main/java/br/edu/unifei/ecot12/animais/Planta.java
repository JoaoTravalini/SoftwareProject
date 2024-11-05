package br.edu.unifei.ecot12.animais;

public abstract class Planta {
    private String specie;
    private String lookalike;
    
    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    public String getLookalike() {
        return lookalike;
    }
    public void setLookalike(String lookalike) {
        this.lookalike = lookalike;
    }
}
