import java.util.Scanner; 
public class ex3 {
    public static void main(String[] args){
System.out.print("Enter the orginal price: ");
Scanner input = new Scanner(System.in);
int d = input.nextInt();
System.out.print("Enter the discount percentage: ");
int f = input.nextInt();
System.out.println(d*(f/100.0));
    }
}
