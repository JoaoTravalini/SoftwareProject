package br.edu.unifei.ecot12.lab09.salgado.app;

import br.edu.unifei.ecot12.lab09.salgado.Coxinha;
import br.edu.unifei.ecot12.lab09.salgado.Coxinharia;
import br.edu.unifei.ecot12.lab09.salgado.RecheioEnum;

public class Main {
    public static void main (String []args)
    {
        Coxinharia c = new Coxinharia();
        Coxinha cx1 = c.novoSalgado();
        Coxinha cx2 = c.novoSalgado();
        cx1.setRecheio(RecheioEnum.CALABRESA);
        cx2.setRecheio(RecheioEnum.CARNE_SECA);
        System.out.println(cx1.getRecheio());
        System.out.println(cx2.getRecheio());
    }
}
