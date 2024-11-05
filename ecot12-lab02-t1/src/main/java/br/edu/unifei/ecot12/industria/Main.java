package br.edu.unifei.ecot12.industria;

public class Main {
    public static void main(String[] args) {
       
        Departamento v = new Departamento();
        Projeto p = new Projeto();
        Funcionarios z = new Funcionarios();
        Funcionarios m = new Funcionarios();
        
        // Dpto
        v.setNome("vendas");
        v.getFuncionarios().add(z); // bidirecional
        
        // Zé
        z.setNome("Zé");
        z.setDepartamento(v);
        z.getProjetos().add(p);
        
        // Maria
        m.setNome("Maria");
        m.setDepartamento(v);
        v.getFuncionarios().add(m);
        m.getProjetos().add(p);
        
        // Projeto
        p.setNumero_p(100);
        p.getFuncionarios().add(z);
        p.setGerente(m);
        p.setDepartamento(v);

        System.out.println("No setor de vendas temos:");
        for(Funcionarios f : v.getFuncionarios())
        {
            System.out.println(f.getNome());
        }
    }
}