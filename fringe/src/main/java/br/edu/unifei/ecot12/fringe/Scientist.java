package br.edu.unifei.ecot12.fringe;

public class Scientist extends Person{

    public Scientist(Universe universe) {
        super(universe);
    }

    private String master;
    private String doctorate;
    private int publicacoes;
    private int frauds;
    
    public String getMaster() {
        return master;
    }
    public void setMaster(String master) {
        this.master = master;
    }
    public String getDoctorate() {
        return doctorate;
    }
    public void setDoctorate(String doctorate) {
        this.doctorate = doctorate;
    }
    public int getPublicacoes() {
        return publicacoes;
    }
    public void setPublicacoes(int publicacoes) {
        this.publicacoes = publicacoes;
    }
    public int getFrauds() {
        return frauds;
    }
    public void setFrauds(int frauds) {
        this.frauds = frauds;
    }
}
