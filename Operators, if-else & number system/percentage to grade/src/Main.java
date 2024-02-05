import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to Percentage to grade converter\n");
        System.out.print("Enter Your Marks in Percentage: ");
        float marks = sc.nextFloat();

        if (marks<=100f && marks>=90f){
            System.out.println("You scored \"A\" Grade");
        } else if (marks<=100f && marks>=75f) {
            System.out.println("You scored \"B\" Grade");
        } else if (marks<=100f && marks>=60f) {
            System.out.println("You scored \"C\" Grade");
        } else if (marks<=100f && marks>=30f) {
            System.out.println("You scored \"D\" Grade");
        }else if (marks>=0f && marks<30f){
            System.out.println("You are Failed");
        }else{
            System.out.println("Invalid");
        }
    }
}