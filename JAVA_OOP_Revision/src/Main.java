import models.Students;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        Students std2=new Students();
        System.out.println("Enter name:");
        String user_name=sc.next();
        System.out.println("Enter age:");
        int user_age=sc.nextInt();
        System.out.println("Enter gpa:");
        double user_gpa=sc.nextDouble();
        Students std1=new Students(user_name,user_age,user_gpa);

        System.out.println(std1.getName());


    }
}
