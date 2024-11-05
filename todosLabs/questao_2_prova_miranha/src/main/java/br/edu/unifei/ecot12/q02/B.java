package br.edu.unifei.ecot12.q02;

public abstract class B {
    private int b1;
    private B proximoB;
    
    public int getB1() {
        return b1;
    }
    public void setB1(int b1) {
        this.b1 = b1;
    }
    public B getProximoB() {
        return proximoB;
    }
    public void setProximoB(B proximoB) {
        this.proximoB = proximoB;
    }

    // metodo a ser implementado na subclasse 
    public abstract float bbbbb();

}
