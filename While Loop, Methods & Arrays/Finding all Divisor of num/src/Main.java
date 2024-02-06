import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDivisor Calculator\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        divisor(num);
    }


    public static void divisor(int num){
        int div = 1;
        while(div <= num){
            if (num % div == 0){
                System.out.println(div);
            }
            div++;
        }
    }



}