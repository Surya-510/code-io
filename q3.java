
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Arjun's time");
        int time1=scan.nextInt();
        System.out.println("Enter the Varun's time");
        int time2=scan.nextInt();
        if(time1>time2){
            System.out.println("Arjun");
        } else if (time1<time2) {
            System.out.println("Varun");

        }
        else{
            System.out.println("Tie");
        }
    }
}