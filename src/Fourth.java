import java.util.Scanner;
import java.util.Random;
public class Fourth{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int computer_choice=rd.nextInt(3)+1;
        System.out.println("Choose any one:\n1)Rock\n2)Scissors\n3)Paper");
        int user_choice=sc.nextInt();
        String computer_answer;

        if(user_choice<1 || user_choice>3)
        {
            System.out.println("Invalid Choice");
        }
        else
        {
            if(computer_choice==1)
            {
                computer_answer="Rock";
            }
            else if(computer_choice==2)
            {
                computer_answer="Scissors";
            }
            else
            {
                computer_answer="Paper";
            }
            switch (user_choice)
            {
                case 1:
                    System.out.println("Computer Choice:"+computer_answer);
                    if(computer_choice==1)
                    {
                        System.out.println("Tie");
                    }
                    else if(computer_choice==2)
                    {
                        System.out.println("Won!Rock smashes scissors");
                    }
                    else
                    {
                        System.out.println("Lost!Paper Covers Rock");
                    }
                    break;

                case 2:
                    System.out.println("Computer Choice:"+computer_answer);
                    if(computer_choice==1)
                    {
                        System.out.println("Lost!Rock Cuts Scissors");
                    }
                    else if(computer_choice==2)
                    {
                        System.out.println("Tie");
                    }
                    else
                    {
                        System.out.println("Won!Scissors tears paper");
                    }
                    break;

                case 3:
                    System.out.println("Computer Choice:"+computer_answer);
                    if(computer_choice==1)
                    {
                        System.out.println("Won! Paper Covers Rock");
                    }
                    else if(computer_choice==2)
                    {
                        System.out.println("Lost! Scissors cuts paper");
                    }
                    else
                    {
                        System.out.println("Tie");
                    }
            }
        }
    }
}
