import java.util.Scanner;
public class NewClass {
public static void main(String[] args) {
 System.out.print("Enter a number that is multiple of 11 and smaller than 100:");
  Scanner input = new Scanner(System.in);
   int n = input.nextInt();
   boolean isMultiple=(n%11==0);
   boolean isSmaller=(n<100);
if (isMultiple&&isSmaller)
 System.out.print(n+"is multiple of 11 and smaller than 100");
else if(isMultiple)
 System.out.print(n+"is multiple of 11 but not smaller than 100");
else if(isSmaller)
 System.out.print(n+"is not a multiple of 11 but is smaller than 100");
else
 System.out.print(n+"is not a multiple of 11 and not smaller than 100");
   
  }
}
