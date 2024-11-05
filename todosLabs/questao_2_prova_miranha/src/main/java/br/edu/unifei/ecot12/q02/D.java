package br.edu.unifei.ecot12.q02;

import java.util.ArrayList;
import java.util.List;

public class D {
    private double d1;
    private List<A> multiA = new ArrayList<>();
    
    public double getD1() {
        return d1;
    }
    
    public void setD1(double d1) {
        this.d1 = d1;
    }

    public List<A> getMultiA() {
        return multiA;
    }
    
    public void setMultiA(List<A> multiA) {
        this.multiA = multiA;
    }
    
        public float ddddd() {
            double s = d1;
    
            for(A a : multiA)
            {
                s += a.getB().bbbbb();
            }
    
            return (float) s;
        }    
}
