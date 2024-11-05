package br.edu.unifei.ecot12.lab03.thor;

import java.util.Date;

public abstract class Mortal extends Seres {
    
    private Date nascimento;

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

}
