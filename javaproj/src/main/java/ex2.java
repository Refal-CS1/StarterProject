
import java.util.Scanner; 
public class ex2 {
    public static void main(String[] args){
System.out.print("Enter a integer value: ");
Scanner input = new Scanner(System.in);
int d = input.nextInt();
System.out.print("Enter another integer value: ");
int f = input.nextInt();
System.out.println(d+f);
System.out.println(d-f);
System.out.println(d*f);
System.out.println((d+f)/2.0);
    }
}
