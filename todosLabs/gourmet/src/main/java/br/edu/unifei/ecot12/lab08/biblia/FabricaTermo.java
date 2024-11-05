package br.edu.unifei.ecot12.lab08.biblia;

import java.util.HashMap;

public class FabricaTermo {
    
    private HashMap<String, Palavra> palavras = new HashMap<>();

    public Termo getTermo(String s) {
        try {
            
            double d = Double.parseDouble(s);
            Numero n = new Numero();
            n.setValor(d);

            return n;

        } catch (Exception ex) {
            Palavra p = palavras.get(s);
            if(p == null) {
                p = new Palavra();
                p.setCaracteres(s);
                palavras.put(s, p);
            }
            return p;
        }
    }
}
