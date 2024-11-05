package br.edu.unifei.ecot12.spiderman;

public class Main {
    public static void main(String Args[]){
        
        Human h1 = new Human();
        h1.setName("Peter Parker");
        h1.setRace("Human");
        h1.setColor("White");
        
        Spider s1 = new Spider();
        s1.setCodename("Original Spider-Man");
        
        Physique physique1 = new Physique();
        physique1.setName("Super Strength");
        physique1.setWeight(19000);
        
        Psychic psychic1 = new Psychic();
        psychic1.setName("Spider Sense");
        psychic1.setTime(1);

        s1.getPowers().add(physique1);
        s1.getPowers().add(psychic1);

        System.out.println(h1);
        System.out.println(s1);
        
        System.out.println(s1.getCodename());
        System.out.println(h1.getName());
        System.out.println(physique1.getName());
        System.out.println(physique1.getWeight() + " kgs ");
        System.out.println(psychic1.getName());
        System.out.println(psychic1.getTime() + " seconds");
        /* Preciso mudar a forma como eu implementaria a lista de poderes */
        

        
    
    }
}