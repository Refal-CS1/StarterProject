
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number (1-7)");
        int daynumber = input.nextInt();
        String dayname;
        switch (daynumber) {
            case 1:
                dayname = "friday";
                break;
            case 2:
                dayname = "saturday";
                break;
            case 3:
                dayname = "sunday";
                break;
            case 4:
                dayname = "monday";
                break;
            case 5:
                dayname = "tuesday";
                break;
            case 6:
                dayname = "wednesday";
                break;
            case 7:
                dayname = "thursday";
                break;
            default:
                dayname = null;
                break;
        }
        if (dayname != null) {
            System.out.println("day is" + dayname);
        } else {
            System.out.println("invalid number");
        }
    }

}
