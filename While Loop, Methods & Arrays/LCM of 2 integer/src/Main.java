import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nLCM of two Integers\n");
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int factor = lcm(num1, num2);
        System.out.printf("LCM of %d and %d is: %d",num1,num2,factor);
    }


    public static int lcm(int num1, int num2){
        int i = 1;
        while(true){
            int factor = num1 * i;
            if (factor % num2 ==0){
                return factor;
            }
            i++;
        }
    }
}