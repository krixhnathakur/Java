import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find Area of Triangle");
        System.out.print("Enter BASE: ");
        int base = sc.nextInt();
        System.out.print("Enter HEIGHT: ");
        int height = sc.nextInt();

        int area = (base * height) / 2;

        System.out.println("Area of Triangle is: "+area);
    }
}