package br.edu.unifei.ecot12.rodoviaria;

public class Main {
    public static void main(String[] args) {
        
        /*
         * Melhorias: 
         * 1 - Organizar a linha com o horario tambem
         * 2 - Organizar Metodos toString para as classes Onibus (ok)
         * 3 - Organizar o Output
         * 4 - Utilizar Map para otimizar a relacao Onibus - Linha e outras possibilidades
         */

        Empresa e = new Empresa();

        Motorista m1 = new Motorista();
        Motorista m2 = new Motorista();
        
        Atendente a1 = new Atendente();
        Atendente a2 = new Atendente();

        Onibus o1 = new Onibus();
        Onibus o2 = new Onibus();

        Linha l1 = new Linha();
        Linha l2 = new Linha();

        Rodoviaria r = new Rodoviaria();

        Passagem p1 = new Passagem();
        Passagem p2 = new Passagem();

        Passageiro g1 = new Passageiro();
        Passageiro g2 = new Passageiro();

        // Empresa
        e.setNome("Passaro Marron");
        e.setCnpj("1234.34");

        // Motorista 1
        m1.setNome("Lucas");
        m1.setCarteira(3);
        e.getMotoristas().add(m1); // motorista 1 adicionado na empresa

        // Motorista 2
        m2.setNome("Eduarda");
        m2.setCarteira(4);
        e.getMotoristas().add(m2); // m2 add

        // Atendente 1
        a1.setNome("Bianca");
        e.getAtendentes().add(a1);

        // Atendente 2
        a2.setNome("Carlos");
        e.getAtendentes().add(a2);

        // Onibus 1
        o1.setM(m1); // motorista
        o1.setPlaca("ABC1234");
        o1.setComum(false); // onibus leito
        o1.setVolumeBagageiro(16);
        o1.setAno(2024);
        o1.setAssentos(80);
        o1.getLinhas().add(l1);
        
        // Onibus 2
        o2.setM(m2);
        o2.setPlaca("XYZ9876");
        o2.setComum(true); // onibus comum
        o2.setVolumeBagageiro(10);
        o2.setAno(2023);
        o2.setAssentos(50);
        o2.getLinhas().add(l2);

        // Linha 1
        l1.setNome("Piranguinho - Sao Jose");
        l1.setRodoviaria(r);
        l1.getOnibus().add(o1);
        l1.getMotoristas().add(m1);
        l1.getPassagens().add(p1);
        

        // Linha 2
        l2.setNome("Piranguinho - Taubate");
        l2.setRodoviaria(r);
        l2.getOnibus().add(o2);
        l2.getMotoristas().add(m2);

        // Rodoviaria
        r.setNome("Teodomiro Sanchez");
        r.setCidade("Piranguinho");
        r.setEndereco("Avenida dos Pirangos");
        r.setEstado("MG");
        r.getPassagens().add(p1);
        r.getPassagens().add(p2);
        r.getOnibus().add(o1);
        r.getOnibus().add(o2);
        r.getLinhas().add(l1);
        r.getLinhas().add(l2);

        // Passagem 1
        p1.setPassageiro(g1);
        p1.setAtendente(a1);
        p1.setPoltrona(1);
        p1.setLinha(l1);

        // Passagem 2
        p2.setPassageiro(g2);
        p2.setAtendente(a2);
        p2.setPoltrona(23);
        p2.setLinha(l2);

        // Passageiro 1
        g1.setNome("Ricardito");
        g1.setEndereco("Rua dos Bobinhos, 32");
        g1.setRg("12.345.678-9");
        g1.setPassagem(p1);

        // Passageiro 2
        g2.setNome("Janildinha");
        g2.setEndereco("Rua dos Patitos, 41");
        g2.setRg("98.765.432-1");
        g2.setPassagem(p2); 

        // Empresa
        System.out.println("Empresa: " + e.getNome() + " | CNPJ: " + e.getCnpj());
        System.out.println("\nMotoristas:");
        for(Motorista m : e.getMotoristas())
        {
            System.out.println("- " + m.getNome() + "-> Carteira num: " + m.getCarteira());
        }

        // Atendentes
        System.out.println("\nAtendentes");
        for(Atendente a : e.getAtendentes())
        {
            System.out.println("- " + a.getNome());
        }

        System.out.println("Informacoes acerca das linhas na rodoviaria " + r.getNome() + ":");
        for(Linha l : r.getLinhas())
        {
            System.out.println("- Linha: " + l.getNome());
            for(Onibus o : l.getOnibus())
            {
                System.out.println(" " + o);
            }
        }        
        
        // Passagens
        System.out.println("\nPassagens: ");
        for(Passagem p : r.getPassagens())
        {
            System.out.println("- Passageiro: " + p.getPassageiro().getNome() + " | Poltrona: " + p.getPoltrona() + 
                                    " | Linha: " + p.getLinha().getNome());
        }

    }
}