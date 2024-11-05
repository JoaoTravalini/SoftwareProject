package br.edu.unifei.ecot12.lab08.gourmet;

// Dá pau, pois eu modifiquei o construtor da mãe, preciso passar os 3 param 
public class Mexer extends Passo {    
    private int minutos;
    
    // Construtor da filha com o super da mãe e seu atributo individual
    public Mexer(float qtd, String unid, String ing, int min) {
        super(qtd, unid, ing);
        this.minutos = min;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
