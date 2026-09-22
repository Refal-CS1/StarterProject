import java.util.Scanner;
public class NewClass3 {
  public void main(String[]args){
   System.out.println("Enter total shopping amount:");
   Scanner input=new Scanner(System.in);
    int n=input.nextInt();
   if (n>1000){
    System.out.println("-----BILL SUMMARY-----");
    System.out.println("Total Amount: $"+n);
    System.out.println("Discount Applied: $"+(n*0.2));
    System.out.println("Amount To Pay: $"+(n-(n*0.2)));}
   else if (n>=500&&n<=999){
    System.out.println("-----BILL SUMMARY-----");
    System.out.println("Total Amount: $"+n);
    System.out.println("Discount Applied: $"+(n*0.1));
    System.out.println("Amount To Pay: $"+(n-(n*0.1)));
   }
  }
}
