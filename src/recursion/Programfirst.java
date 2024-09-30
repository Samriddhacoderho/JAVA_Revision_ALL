package recursion;

import java.util.Scanner;

public class Programfirst {
    public static int methRecur(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        return n*(methRecur((n-1)));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber=sc.nextInt();

        int c=methRecur(userNumber);
        System.out.println(c);
    }
}
