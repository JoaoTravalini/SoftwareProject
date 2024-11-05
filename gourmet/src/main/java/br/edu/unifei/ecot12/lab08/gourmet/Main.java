package br.edu.unifei.ecot12.lab08.gourmet;

public class Main {
    public static void main(String[] args) {
        Receita r = new Receita();
        r.setNome("Angu");
        r.setPrimeiroPasso(new Cozinhar(1, "litro", "agua", "panela")).
          setEmSeguida(new Mexer(0.5f, "kg", "fuba", 10)).
          setEmSeguida(new Mexer(1, "litro", "agua", 15)).
          setEmSeguida(new Outro(1, "colher de sopa", "sal", "colocar"));
        System.out.println("Receita = " + r.getPrimeiroPasso().qtdPassos());
    }   
}