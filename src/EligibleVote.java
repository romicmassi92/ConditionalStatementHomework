import java.util.Scanner;

public class EligibleVote {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats is your age?");
        int age = scanner.nextInt();
        if (age >=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eli20gible to vote");
        }
    }
}
