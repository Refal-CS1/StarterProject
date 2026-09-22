import java.util.Scanner;
public class NewClass1 {
    public void main(String[]args){
System.out.print("Enter an odd or even number:");
  Scanner input= new Scanner(System.in);
  int n=input.nextInt();
if(n%2==0)
  System.out.print(n+" is an even number");
else
  System.out.print(n+" is an odd number");
    }
}
