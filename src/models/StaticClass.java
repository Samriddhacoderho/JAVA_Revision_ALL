package models;

public class StaticClass {
    static int population;
    String name;

    public StaticClass(String name) {
        this.name = name;
        StaticClass.population+=1;
    }

    public void customFunc()
    {
        System.out.println(StaticClass.population);
        System.out.println(this.name);
    }
}
