package br.edu.unifei.ecot12.lab08.gourmet;

public class Outro extends Passo {
    private String acao;
    
    public Outro(float qtd, String unid, String ing, String act) {
        super(qtd, unid, ing);
        this.acao = act;
    }
    
    public String getAcao() {
        return acao;
    }
    
    public void setAcao(String acao) {
        this.acao = acao;
    }
}
