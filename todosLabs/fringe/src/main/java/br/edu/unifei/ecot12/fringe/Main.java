package br.edu.unifei.ecot12.fringe;

public class Main {
    public static void main(String[] args) {
        Agent a = new Agent(new Real());
        a.setName("Astrid");
        a.setAge(22);
        System.out.println(a.incapacitation());
    }
}