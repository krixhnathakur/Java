import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number2: ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Numbers after swapping are:\n"+"Number1: "+num1+"\nNumber2: "+num2);

    }
}