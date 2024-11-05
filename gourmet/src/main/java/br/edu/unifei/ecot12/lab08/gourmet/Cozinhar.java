package br.edu.unifei.ecot12.lab08.gourmet;

public class Cozinhar extends Passo {
    private String utensilio;
    
    public Cozinhar(float qtd, String unid, String ing, String uten) {
        super(qtd, unid, ing);
        this.utensilio = uten;
        
    }

    public String getUtensilio() {
        return utensilio;
    }

    public void setUtensilio(String utensilio) {
        this.utensilio = utensilio;
    }
    

}
