import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any one number:");
        int userNumber=sc.nextInt();
        func_this(userNumber);
    }

    public static void func_this(int userNumber)
    {
        for(int i=10;i>=1;i--)
        {
            System.out.println(userNumber+" X "+i+" = "+(userNumber*i));
        }
    }
}
