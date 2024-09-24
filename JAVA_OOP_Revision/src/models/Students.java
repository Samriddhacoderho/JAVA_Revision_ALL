package models;
public class Students {
    String name;
    int age;
    double gpa;

    public Students(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    Students()
    {
        greet();
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void greet(){
        System.out.println("Greetings!");
    }
}