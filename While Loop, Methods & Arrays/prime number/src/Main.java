import java.util.Scanner;

public class Main {

    public static boolean prime(int num){
        int i = 2;
        while(i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCheck Your Number is Prime\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean prime = prime(num);
        if (prime){
            System.out.printf("%d is prime number",num);
        } else {
            System.out.printf("%d is not prime number",num);
        }
    }
}