import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether greatest number from the following 3 numbers");
        int num1, num2, num3;
        System.out.println("Enter any three numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        //method 1
        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1+" is the Greatest");
        }else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2+" is the Greatest");
        } else{
            System.out.println(num3+" is the Greatest");
        }

        //method 2
        //if (num1 >= num2 && num1 >= num3)
        //else if (num2 >= num3)
        //else{}
    }
}