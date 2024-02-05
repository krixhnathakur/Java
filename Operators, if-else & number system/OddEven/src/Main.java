import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check your number is Even or Odd\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Your number is Even !!");
        }else{
            System.out.println("Your number is Odd !!");
        }
    }
}