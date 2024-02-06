import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nFactorial Calculator\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.print("Factorial is: "+fact);
    }


    /*
    taking "long" datatype caz output will be bigger
    store this factorial in "fact" by multiplying it by "i" (fact=fact*i)
     */

    public static long factorial(int num){
        int i = 1;
        long fact = 1;
        while(i<=num){
            fact *= i;
            i++;
        }
        return fact;
    }
}