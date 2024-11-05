package br.edu.unifei.ecot12.spiderman;

import java.util.ArrayList;
import java.util.List;

public class Battle extends Event {
    private SideEnum winnerSide;
    private List<LivingBeing> deaths = new ArrayList<LivingBeing>();
    
    public SideEnum getWinnerSide() {
        return winnerSide;
    }
    public void setWinnerSide(SideEnum winnerSide) {
        this.winnerSide = winnerSide;
    }
    public List<LivingBeing> getDeaths() {
        return deaths;
    }
    public void setDeaths(List<LivingBeing> deaths) {
        this.deaths = deaths;
    }
}
