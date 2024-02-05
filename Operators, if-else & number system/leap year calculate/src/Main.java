import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to leap year calculator\n");
        System.out.print("Enter year you want to check: ");
        int year = sc.nextInt();

        /*
        Here right condition of leap year is-->
        -> if year is totally divisible by 400, then it is "leap year"
        -> also, if year is divisible by 4 but not by 100, then it is "leap year"
        -> but, if year is divisible by 4 as well as 100 then it should be divisible by 400, then it is "leap year"
        */

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year+" is Leap Year!!");
        }else {
            System.out.println(year+" is not Leap Year!!");

        }
    }
}