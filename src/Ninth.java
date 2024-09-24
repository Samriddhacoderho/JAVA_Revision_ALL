import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of data you want to enter:");
        int user_datacount = sc.nextInt();
        double test_double;

        if (user_datacount < 0 || user_datacount > 10) {
            System.out.println("Invalid Data. Don't add more than 10 data or don't add negative values");
        } else {
            String[] arr_names = new String[user_datacount];
            double[] arr_marks = new double[user_datacount];

            for (int i = 0; i < user_datacount; i++) {
                System.out.println("Enter the name for Person" + (i + 1) + ":");
                arr_names[i] = sc.next();
                do {
                    System.out.println("Enter the marks for Person" + (i + 1) + ":");
                    test_double = sc.nextDouble();
                    if (test_double < 0 || test_double > 100) {
                        System.out.println("Enter marks between 0 and 100");
                    } else {
                        arr_marks[i] = test_double;
                    }
                }while (test_double<0 || test_double>100);
            }
            System.out.println("Data Table");
            for (int i = 0; i < user_datacount; i++) {
                System.out.println("Name:" + arr_names[i] + "*****Marks:" + arr_marks[i]);
            }
        }
    }
}
