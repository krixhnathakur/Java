import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Calculate Simple Interest");
        System.out.print("Enter Principle Amount: ");
        int p = sc.nextInt();
        System.out.print("Enter Time: ");
        float t = sc.nextFloat();
        System.out.print("Enter Interest Rate: ");
        float r = sc.nextFloat();

        double ci = p * Math.pow((1 + r / 100) , t);

        System.out.println("Compound Interest is: "+ci);
    }
}