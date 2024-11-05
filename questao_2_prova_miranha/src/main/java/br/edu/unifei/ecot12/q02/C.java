package br.edu.unifei.ecot12.q02;

public class C extends B{
    private float c1;
    private D d;
    

    public float getC1() {
        return c1;
    }

    public void setC1(float c1) {
        this.c1 = c1;
    }
    
    public D getD() {
        return d;
    }

    @Override
    public float bbbbb()
    {   
        if (getProximoB() != null)
        {
            return c1 + bbbbb();
        }
        else
        {
            return c1;
        }
    }
}
