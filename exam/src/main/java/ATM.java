\\ATM that offers three choices 1-show case amount 2-deposit 3-withdraw
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int amount=5000;
        System.out.println("Choose an operation:\n" +
"1) Amount\n" +
"2) Deposit\n" +
"3) Withdraw");
        System.out.println("Please choose 1, 2 or 3: ");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                System.out.println("the amount is "+amount);  
                break;
            case 2:
                System.out.println("enter the amount to deposit: ");
                int deposit=input.nextInt();
                System.out.println("the new amount is "+(amount+deposit));
                break;
            case 3:
               System.out.println("enter the amount to withdraw: ");
                int withdraw=input.nextInt();
                System.out.println("the new amount is "+(amount-withdraw));
                break; 
            default:
                System.out.println("invalid choice");
        }
    }
}
