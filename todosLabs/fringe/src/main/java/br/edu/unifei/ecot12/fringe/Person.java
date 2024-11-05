package br.edu.unifei.ecot12.fringe;

public class Person  {
    private String name;
    private String graduation;
    private int age;
    private int iq;
    
    private Universe universe;

    public Person(Universe universe) {
        this.universe = universe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Universe getUniverse() {
        return universe;
    }

    public void setUniverse(Universe universe) {
        this.universe = universe;
    }

    public int incapacitation() {return universe.vph(age);}
    
}
