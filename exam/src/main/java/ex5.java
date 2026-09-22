
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int insurance = 550;
        System.out.println("how old are you?");
        int a = input.nextInt();

        System.out.println("how many accidents you had before?");
        int x = input.nextInt();
        if (a <= 25) {
            insurance = insurance + 100;
        }
        switch (x) {
            case 1:
                insurance = insurance + 50;
                System.out.println("your insurance cost is " + insurance);
                break;
            case 2:
                insurance = insurance + 125;
                System.out.println("your insurance cost is " + insurance);
                break;
            case 3:
                insurance = insurance + 225;
                System.out.println("your insurance cost is " + insurance);
                break;
            case 4:
                insurance = insurance + 375;
                System.out.println("your insurance cost is " + insurance);
                break;
            case 5:
                insurance = insurance + 575;
                System.out.println("your insurance cost is " + insurance);
                break;
            case 6:
                System.out.println("no insurance");
                break;
            default:
                System.out.println("invalid number");
        }

    }
}
