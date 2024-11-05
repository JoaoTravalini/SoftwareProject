package br.edu.unifei.ecot12.lab03.thor;

// abstract -> Nao dar new
public abstract class Territorio {
    private String area;
    private String nome;
    private Reino reino;
    
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Reino getReino() {
        return reino;
    }
    public void setReino(Reino reino) {
        this.reino = reino;
    }

    
    
}
