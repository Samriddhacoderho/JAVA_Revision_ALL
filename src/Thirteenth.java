import java.util.Scanner;

public class Thirteenth {
    public static int greatestCommonDivisor(int num1, int num2)
    {
        int swap;
        int greatest=0;
        if(num2>num1)
        {
            swap=num1;
            num1=num2;
            num2=swap;
        }
        for(int i=1;i<=num1;i++)
        {
            if((num1 % i==0) && (num2 % i==0))
            {
                greatest=i;
            }
        }
        return  greatest;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int c=greatestCommonDivisor(num1,num2);
        System.out.println("The greatest common divisor between "+num1+" and "+num2+" is:"+c);
    }
}
