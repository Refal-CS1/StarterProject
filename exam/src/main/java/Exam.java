
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        System.out.println("enter the first number");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("enter the second number");
        int y = input.nextInt();
        boolean ypositive = (y > 0);
        boolean xpositive = (x > 0);
        if (ypositive && xpositive) {
            System.out.println(x * y);
        } else if (x * y > 0) {
            System.out.println(x * y);
        } else {
            System.out.println(x * y * -1);
        }
    }
}
