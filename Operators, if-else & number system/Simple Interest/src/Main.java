import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Calculate Simple Interest");
        System.out.print("Enter Principle Amount: ");
        int p = sc.nextInt();
        System.out.print("Enter Time: ");
        int t = sc.nextInt();
        System.out.print("Enter Interest Rate: ");
        int r = sc.nextInt();

        int si = (p * t * r) / 100;

        System.out.println("Simple Interest is: "+si);
    }
}