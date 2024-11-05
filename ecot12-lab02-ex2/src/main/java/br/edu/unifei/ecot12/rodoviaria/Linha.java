package br.edu.unifei.ecot12.rodoviaria;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Linha {

    private String nome;
    private Date horario;
    private List<Passagem> passagens = new ArrayList<Passagem>();
    private List<Onibus> onibus = new ArrayList<Onibus>();
    private Rodoviaria rodoviaria;
    private List<Motorista> motoristas = new ArrayList<Motorista>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getHorario() {
        return horario;
    }
    public void setHorario(Date horario) {
        this.horario = horario;
    }
    public List<Passagem> getPassagens() {
        return passagens;
    }
    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }
    public List<Onibus> getOnibus() {
        return onibus;
    }
    public void setOnibus(List<Onibus> onibus) {
        this.onibus = onibus;
    }
    public Rodoviaria getRodoviaria() {
        return rodoviaria;
    }
    public void setRodoviaria(Rodoviaria rodoviaria) {
        this.rodoviaria = rodoviaria;
    }
    public List<Motorista> getMotoristas() {
        return motoristas;
    }
    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    

}
