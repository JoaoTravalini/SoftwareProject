package br.edu.unifei.ecot12.spiderman;

import java.util.Date;

public class GreenGoblin extends Totem {
    
    private Date serumIngestion;
    private boolean modified;
    
    public Date getSerumIngestion() {
        return serumIngestion;
    }
    public void setSerumIngestion(Date serumIngestion) {
        this.serumIngestion = serumIngestion;
    }
    public boolean isModified() {
        return modified;
    }
    public void setModified(boolean modified) {
        this.modified = modified;
    }
    
}
