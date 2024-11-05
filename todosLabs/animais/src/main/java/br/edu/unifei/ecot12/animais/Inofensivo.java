package br.edu.unifei.ecot12.animais;

import java.util.ArrayList;
import java.util.List;

public class Inofensivo extends Animal {
    private boolean camuflagem;
    private List<Planta> dieta = 
                                new ArrayList<Planta>();

    public boolean isCamuflagem() {
        return camuflagem;
    }

    public void setCamuflagem(boolean camuflagem) {
        this.camuflagem = camuflagem;
    }

    public List<Planta> getDieta() {
        return dieta;
    }

    public void setDieta(List<Planta> dieta) {
        this.dieta = dieta;
    }
    
}
