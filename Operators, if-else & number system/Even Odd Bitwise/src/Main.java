import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to ODD EVEN checker\n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();


        /*
        --> decimal to binary examples:
           1 = 0001
           2 = 0010
           3 = 0011
           4 = 0100
           5 = 0101
        --> here we can see that the right most bit of numbers is 0 or 1
        --> so, if right most bit of number is 0 then it is EVEN
        --> and if right most bit if number is 1 then it is ODD
             ex. 1 in binary = 0001
                 3 in binary = 0011
            -->  "1 & 3" which is "0001 & 0011" then output is "0001" it is 1 in decimal
            --> it means if we do AND(&) operation on any integer with 1 and when we get output 1
                then it is ODD number otherwise number is EVEN.
         */



        if((num & 1) == 1){
            System.out.println("Your number is ODD!!");
        }else{
            System.out.println("Your number is EVEN!!");
        }
    }
}