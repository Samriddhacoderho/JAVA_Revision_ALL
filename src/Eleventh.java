import java.util.List;
import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        int check=0;
        int[][] thisArray = new int[2][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < thisArray.length; i++) {
            for (int j = 0; j < thisArray[i].length; j++) {
                System.out.println("Enter element for [" + i + "," + j + "]");
                thisArray[i][j] = sc.nextInt();
            }
        }
        for (int[] x : thisArray) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Enter a number which may or may not be present in an array:");
        int userNumber = sc.nextInt();

        for (int[] x : thisArray) {
            for (int y : x) {
                if(userNumber==y)
                {
                    check++;
                }
            }
        }
        if(check>0)
        {
            System.out.println("Contains");
        }
        else
        {
            System.out.println("Does not contain");
        }
    }
}
