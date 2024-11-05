package br.edu.unifei.ecot12.lab08.gourmet;

public abstract class Passo {
    private float quantidade;
    private String unidade;
    private String ingrediente;
    private Passo emSeguida;

    public Passo(float qtd, String unid, String ing) {
        this.quantidade = qtd;
        this.unidade = unid;
        this.ingrediente = ing;
    }

    public int qtdPassos() {
        if(emSeguida != null) {
            return 1 + emSeguida.qtdPassos();
        } else {
            return 1;
        }
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Passo getEmSeguida() {
        return emSeguida;
    }

    public Passo setEmSeguida(Passo emSeguida) {
        this.emSeguida = emSeguida;
        return emSeguida;
    }
}
