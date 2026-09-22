
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        System.out.println("enter the first number");
        double f = input.nextDouble();
        System.out.println("enter operation(+,-,*,/,%)");
        char o = input.next().charAt(0);
        System.out.println("enter the second number");
        double s = input.nextDouble();
        switch (o) {
            case '+':
                result = f + s;
                System.out.println("the result is" + result);
                break;
            case '-':
                result = f - s;
                System.out.println("the result is" + result);
                break;
            case '*':
                result = f * s;
                System.out.println("the result is" + result);
                break;
            case '/':
                if (s != 0) {
                    result = f / s;
                    System.out.println("the result is" + result);
                } else {
                    System.out.println("cant be divided by zero");
                }
                return;

            case '%':
                result = f % s;
                System.out.println("the result is" + result);
                break;
            default:
                System.out.println("invalid operation");
                return;

        }

    }
}
