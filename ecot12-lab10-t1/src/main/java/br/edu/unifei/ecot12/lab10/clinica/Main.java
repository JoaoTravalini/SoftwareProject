package br.edu.unifei.ecot12.lab10.clinica;

public class Main {
    public static void main(String[] args) {
        Historico h = new Historico();
        
        Consulta c = new Consulta();
        c.setSintomas("Cefaleia");
        c.setTratamento("repouso.");

        h.setConsulta(c);
        
        // adiciona
        h.getProcedimentos().add(c.cria()); 
        
        c.setTratamento("Dipirona 3 vezes ao dia.");
        System.out.println(c.getTratamento());
        h.desfazer();
        System.out.println(c.getTratamento());
    }
}
