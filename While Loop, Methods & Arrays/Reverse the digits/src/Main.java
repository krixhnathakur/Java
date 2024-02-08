import java.util.Scanner;

public class Main {

    public static int reverse(int num){
        int remainder, newNum = 0;
        while(num > 0){
            remainder = num % 10;
            newNum = (newNum * 10) + remainder;
            num /= 10;
        }
        return newNum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nReverse the digits\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int newNum = reverse(num);
        System.out.print("Your Reverse number is: "+newNum);
    }
}