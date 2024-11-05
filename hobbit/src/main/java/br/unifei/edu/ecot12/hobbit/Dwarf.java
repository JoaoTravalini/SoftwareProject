package br.unifei.edu.ecot12.hobbit;

public class Dwarf extends LivingBeing {
    private boolean smith;
    private boolean miner;
    private Kingdons kingdon;

    public boolean isSmith() {
        return smith;
    }
    public void setSmith(boolean smith) {
        this.smith = smith;
    }
    public boolean isMiner() {
        return miner;
    }
    public void setMiner(boolean miner) {
        this.miner = miner;
    }
    public Kingdons getKingdon() {
        return kingdon;
    }
    public void setKingdon(Kingdons kingdon) {
        this.kingdon = kingdon;
    }
}
