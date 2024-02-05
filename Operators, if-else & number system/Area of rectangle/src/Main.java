import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("To Find Perimeter of Rectangle");
        System.out.print("Enter Lenght of Rectangle: ");
        a = sc.nextInt();
        System.out.print("Enter Width of Rectangle: ");
        b = sc.nextInt();

        int perimeter = 2*(a+b);

        System.out.println("Perimeter of Rectangle is: "+perimeter);
    }
}