import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Fourteenth {
    public static String[] allFactors(int num1, int num2) {
        int swap;
        String fact="";
        if (num2 > num1) {
            swap = num1;
            num1 = num2;
            num2 = swap;
        }

        for (int i = 1; i <= num1; i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                fact=fact+i+",";
            }
        }
        return fact.split(",");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String[] c = allFactors(num1, num2);
        System.out.println("The common factors are: "+ Arrays.toString(c));
    }
}