package br.edu.unifei.ecot12.rodoviaria;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Atendente {

    private Date horario;
    private String nome;
    private List<Passagem> passagens = new ArrayList<Passagem>();
    
    public Date getHorario() {
        return horario;
    }
    public void setHorario(Date horario) {
        this.horario = horario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Passagem> getPassagens() {
        return passagens;
    }
    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }
    
    
}
