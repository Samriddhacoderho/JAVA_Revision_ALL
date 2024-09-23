import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) {
        String word="Nepal";
        String pattern="";
        for(int i=0;i<5;i++)
        {
            pattern=pattern+word.charAt(i);
            System.out.println(pattern);
        }
    }
}
