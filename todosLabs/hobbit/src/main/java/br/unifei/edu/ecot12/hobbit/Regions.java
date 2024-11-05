package br.unifei.edu.ecot12.hobbit;

import java.util.List;
import java.util.ArrayList;

public class Regions extends Continent {
    private int numberOfKingdons;
    private List<Kingdons> kingdons = new ArrayList<Kingdons>();
    
    public int getNumberOfKingdons() {
        return numberOfKingdons;
    }
    public void setNumberOfKingdons(int numberOfKingdons) {
        this.numberOfKingdons = numberOfKingdons;
    }
    public List<Kingdons> getKingdons() {
        return kingdons;
    }
    public void setKingdons(List<Kingdons> kingdons) {
        this.kingdons = kingdons;
    }
}
