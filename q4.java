import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a= scan.nextInt();
        System.out.println("Enter value of B");
        int b=scan.nextInt();
        System.out.println("Enter  the value of C");
        int c=scan.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println(a+"is largest number");

        }
        else if(b>=a && b>=c){
            System.out.println(b+"is largest number");

        }
        else{
            System.out.println(c+"is largest number");
        }
    }
}