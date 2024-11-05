package br.unifei.edu.ecot12.hobbit;

public class Hobbit extends LivingBeing{

    private boolean farmer;
    private Kingdons kingdon;
    public boolean isFarmer() {
        return farmer;
    }
    public void setFarmer(boolean farmer) {
        this.farmer = farmer;
    }
    public Kingdons getKingdon() {
        return kingdon;
    }
    public void setKingdon(Kingdons kingdon) {
        this.kingdon = kingdon;
    }
}

