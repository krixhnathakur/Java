import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCheck your category by AGE\n");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age>=1 && age<13){
            System.out.println("You are Child!!");
        } else if (age>=13 && age<=20) {
            System.out.println("You are Teen!!");
        } else if (age>20 && age<=60) {
            System.out.println("You are Adult!!");
        } else if (age>60 && age<=110) {
            System.out.println("You are Senior!!");
        }else{
            System.out.println("IMPOSSIBLE!!");
        }
    }
}