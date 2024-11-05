package br.edu.unifei.ecot12.lab10.clinica;

import java.util.Stack;

public class Historico {
    private Stack<Procedimento> procedimentos = 
                                    new Stack<Procedimento>();
    private Consulta consulta;
    
    public void desfazer() {
        consulta.restaura(procedimentos.pop());
    }
    
    public Stack<Procedimento> getProcedimentos() {
        return procedimentos;
    }
    public void setProcedimentos(Stack<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
