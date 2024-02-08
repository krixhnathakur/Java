import java.util.Scanner;

public class Main {
    public static int min(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static int gcd(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int min = min(num1,num2);
        while(i <= min){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nGCD of two numbers\n");
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = gcd(num1,num2);
        System.out.println("Your gcd is: "+gcd);
    }
}