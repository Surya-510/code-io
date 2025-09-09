
import java.util.Scanner;


class q7{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("choose the operator:+, -, *, /");
        String operator=scan.nextLine();
        System.out.println("Enter the value of num1");
        int num1=scan.nextInt();
        System.out.println("Enter the value of num2");
        int num2=scan.nextInt();
        switch (operator) {
            case "+" :
                 int add=num1+num2;
                 System.out.println(add);
                 break;

            case "-":
                int sub=num1-num2;
                System.out.println(sub);
                break;

            case "*":
                int mul=num1*num2;
                System.out.println(mul);
                break;

            case "/":
                int div=num1/num2;
                System.out.println(div);
                break;


            default:
                System.out.println("Invalid operator");;
        }
    }
}