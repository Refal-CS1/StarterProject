import java.util.Scanner;
public class na{
    public static void main(String[]args){
     System.out.println("enter a number");
     Scanner input= new Scanner(System.in);
     int a=input.nextInt();
     System.out.println("enter a number");
     int b=input.nextInt();
     if(a>b){
        System.out.println("the largest number is "+a); 
     }
     else if(b>a)
         System.out.println("the largest number is "+b);
     else
         System.out.println("the numbers are equal");
    }
}