import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSum of Digits Calculator\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of Digits is: "+sum);
    }

    /*
     --> Declared a variable (sum) to store the sum of numbers
     --> Find the remainder by using the modulo (%) operator. It gives the last digit of the number (N).
     --> Add the last digit to the variable sum.
     --> Divide the number (num) by 10. It removes the last digit of the number.
     --> Repeat until the number (num) becomes 0.
     */

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}