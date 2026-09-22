import java.util.Scanner; 
public class ex4 {
    public static void main(String[] args){
System.out.print("Enter your big brothers name: ");
 Scanner input = new Scanner(System.in);
  String s = input.next();
System.out.print("Enter his age: ");
  int a = input.nextInt();
System.out.print("Enter your small brothers name: ");
  String f = input.next();
System.out.print("Enter his age: ");
  int l = input.nextInt();
System.out.println("your big brother " +s+ "(" +a+ ")"+"is " + (a-l)+ "years older than your small brother " +f+ "(" +l+ ")");

    }
}