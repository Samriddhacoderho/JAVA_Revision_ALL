import java.util.Scanner;

public class Twelvth {
    public static void main(String[] args) {
        int[][] firstArray = new int[2][3];
        int[][] secondArray = new int[2][3];
        int[][] addArray = new int[2][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for first array:");

        for(int i=0;i< firstArray.length;i++)
        {
            for(int j=0;j<firstArray[i].length;j++)
            {
                firstArray[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter elements for second array:");

        for(int i=0;i< secondArray.length;i++)
        {
            for(int j=0;j<secondArray[i].length;j++)
            {
                secondArray[i][j]= sc.nextInt();
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                addArray[i][j] = firstArray[i][j] + secondArray[i][j];
            }
        }

        for (int[] x : addArray) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println("\n");
        }
    }
}
