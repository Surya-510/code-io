
import java.util.Scanner;


class q6{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the mark");
        int mark=scan.nextInt();
        if(mark>=90){
            System.out.println("Grade A");
        }
        else if(mark>=75 && mark<90){
            System.out.println("Grade B");
        }
        else if(mark>=50 && mark<75){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}