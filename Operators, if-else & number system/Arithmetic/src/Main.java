import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Operations Calculator");
        System.out.print("Enter Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number2: ");
        int num2 = sc.nextInt();

        int a,b,c,d,e;
        a = num1 + num2;
        b = num1 - num2;
        c = num1 * num2;
        d = num1 / num2;
        e = num1 % num2;

        System.out.println("Addition is: "+a);
        System.out.println("Subtraction is: "+b);
        System.out.println("Multiplication is: "+c);
        System.out.println("Division is: "+d);
        System.out.println("Remainder is: "+e);

    }
}