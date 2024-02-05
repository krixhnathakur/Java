import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fahrenheit To Celsius");
        System.out.print("Enter Fahrenheit: ");
        float fah = sc.nextFloat();

        float cel = ((fah - 32) * 5) / 9;
        System.out.println("Celsius is: "+cel);
    }
}