import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your balance");
        int balance=scan.nextInt();
        if(balance>0)
        {
            System.out.println("Positive balance");
        } else if (balance<0) {
            System.out.println("overdraft");

        }
        else {
            System.out.println("Zero balance");
        }
    }
}