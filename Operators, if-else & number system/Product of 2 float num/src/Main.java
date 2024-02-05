import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product of two float Numbers");
        System.out.print("Enter Number1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter Number2: ");
        float num2 = sc.nextFloat();

        float product = num1 * num2;

        System.out.println("Product is: "+product);
    }
}