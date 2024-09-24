import models.Students;

public class Main {
    public static void main(String[] args) {
        Students std1=new Students();
        System.out.println(std1.getName());

        std1.setName("Samriddha");
        std1.setAge(18);
        std1.setGpa(3.88f);

        System.out.println(std1.getName());
        System.out.println(std1.getAge());
        System.out.println(std1.getGpa());
    }
}