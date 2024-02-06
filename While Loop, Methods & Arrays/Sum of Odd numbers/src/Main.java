import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSum of all numbers from 1 to N\n");
        System.out.print("Enter your N'th number: ");
        int n = sc.nextInt();
        int sum = oddSum(n);  //function calling
        System.out.println("Sum is: "+sum);
    }



    /*
    --> adding 2 in "i" for making it odd number (i=i+2)
    --> and store this odd number in "sum" by adding it (sum=sum+i)
     */

    public static int oddSum(int n){
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            i += 2;
        }
        return sum;
    }
}