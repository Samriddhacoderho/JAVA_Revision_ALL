import java.util.Scanner;
public class Seventh {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String word="nepal";
        int word_length=word.length();
        int attempts=6;
        int word_match=0;
        String user_word="";

        System.out.println("Today's word to be guessed has "+word_length+" letters!!");

        while (attempts>0 && word_match!=word_length)
        {
            System.out.println("Enter a letter:");
            String user_letter=sc.next();
            user_letter=user_letter.toLowerCase();
            if(user_letter.length()!=1)
            {
                System.out.println("Please only enter a letter!");
            }
            else
            {
                if(!word.contains(user_letter))
                {
                    System.out.println("This letter is not present in today's word!");
                    attempts--;
                    System.out.println("Attempts left:"+attempts);
                }
                else {
                    if (user_word.contains(user_letter))
                    {
                        System.out.println("Repeated Letter does not count!");
                    }
                    else
                    {
                        user_word=user_word+user_letter;
                        System.out.println("This letter is present in today's word at " +(word.indexOf(user_letter) + 1) + " position");
                        word_match++;
                    }
                }
            }
        }
        if(attempts==0)
        {
            System.out.println("Ran out of attempts");
            System.out.println("The correct word was:"+word);
        }
        else
        {
            System.out.println("You have guessed correctly! The word is:"+word);
        }
    }
}
