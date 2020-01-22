import java.util.Scanner;

public class CountryName {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Letter");
        char ch = scanner.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("Australia");
            case 'b':
                System.out.println("Brazil");
            case 'c':
                System.out.println("Canada");
            case 'd':
                System.out.println("Dubai");
            case 'e':
                System.out.println("Egypt");
            case 'f':
                System.out.println("France");
            default:
                System.out.println("Invalid");
        }

    }
}
