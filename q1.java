import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any Number");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("ON");
        }
        else {
            System.out.println("off");
        }
    }
}