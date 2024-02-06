import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("\nWelcome To Table Calculator\n");
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();

        int i = 1, ans;
        while(i<=10){
            ans = num * i;
            System.out.println(num +" * "+ i +" = "+ ans);
            i++;
        }
    }
}