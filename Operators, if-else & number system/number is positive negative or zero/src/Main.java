import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Check your number is positive, negative or zero\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("Your number is Positive!!");
        } else if(num < 0) {
                System.out.println("Your number is Negative!!");
        } else {
            System.out.println("You entered zero!!");
        }
    }
}