import java.util.Scanner;

public class Welcom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Welcome, "+name+" to my World");
    }
}