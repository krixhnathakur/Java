import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nFibonacci Series up to N\n");
        System.out.print("Enter your N: ");
        int num = sc.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int num){
        if (num < 0){
            System.out.println("Invalid");
        }

        int firstNum = 0, secondNum = 1, sum = 0;
        while(sum <= num){
            System.out.println(sum);
            firstNum = secondNum;
            secondNum = sum;
            sum = firstNum + secondNum;
        }
    }
}