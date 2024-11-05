package br.edu.unifei.ecot12.animais;

import java.util.ArrayList;
import java.util.List;

public class Bruxo extends Humanos{
    private String tipoSanguineo;
    private boolean fantasma;
    private List<Feitico> feiticos = 
                        new ArrayList<Feitico>();
    private Animal parasita;
    
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    public boolean isFantasma() {
        return fantasma;
    }
    public void setFantasma(boolean fantasma) {
        this.fantasma = fantasma;
    }
    public List<Feitico> getFeiticos() {
        return feiticos;
    }
    public void setFeiticos(List<Feitico> feiticos) {
        this.feiticos = feiticos;
    }
    public Animal getParasita() {
        return parasita;
    }
    public void setParasita(Animal parasita) {
        this.parasita = parasita;
    }

    
}
