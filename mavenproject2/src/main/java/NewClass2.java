import java.util.Scanner;
public class NewClass2 {
public void main(String[]args){ 
  System.out.print("enter the amount you want to withdraw:");
  Scanner input =new Scanner(System.in);
    int n=input.nextInt();
    boolean isMultipleHun=(n%100==0);
    boolean isSuff=(n<=5000);
if(isMultipleHun&&isSuff){
 System.out.println("please collect your cash");
 System.out.println("Remaining balance is:"+(5000.0-n));}
else if (isSuff){
 System.out.println("Error: The amount should be a multiple of 100");}
else{
 System.out.println("Error: Insufficient balance");}
  }
}
