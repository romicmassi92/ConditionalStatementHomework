import java.util.Scanner;

public class Percentage {
    public static void main (String[] args) {
    String name;
    int rollNo, maths, science, english, total;
    double percentage;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name");
    name = sc.nextLine();
    System.out.println("enter 3 subject marks");
    maths = sc.nextInt();
    science = sc.nextInt();
    english = sc.nextInt();
    total= maths + science + english;
    System.out.println(total);
    percentage =(total/300.0)*100;
    System.out.println(percentage);
    if (percentage>=35){
        System.out.println("is Passed");}
    else System.out.println ("is Failed");
    if (percentage>=80){
        System.out.println("Grade is A+");}
    else if (percentage>=60){
        System.out.println("Grade is A");}
    else if(percentage>=50){
        System.out.println("Grade is B");}
    else if (percentage>=35){
        System.out.println("Grade is C");}
    else System.out.println("Failed");
    }
    }
