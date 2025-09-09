import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scan.nextInt();
        if((year%400==0) || ((year%4==0)&&(year%100!=0)))
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("Not leap year");
        }
        
        

        }
    }
