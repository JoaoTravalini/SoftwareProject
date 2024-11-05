package br.edu.unifei.ecot12.starwars;

import java.util.List;

public class D extends A{
    
    private double d1;
    private List<B> variosB;
    
    public double getD1() {
        return d1;
    }
    public void setD1(double d1) {
        this.d1 = d1;
    }
    public List<B> getVariosB() {
        return variosB;
    }
    public void setVariosB(List<B> variosB) {
        this.variosB = variosB;
    }

    @Override
    public double aaaaa() {
        double res = d1;
        for(B b : variosB) {
            res += b.aaaaa();
        }

        return res;
    }
}
