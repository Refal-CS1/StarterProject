
package com.mycompany.testsubject;
import java.util.Scanner;
public class fina {
    public static String extractInfo(String a){
     String[] parts=a.split("-");
     if(parts.length==3){
     String country=parts[0];
     String code=parts[1];
     String serial=parts[2];
     
        System.out.println("country: "+country+"code: "+code+"serial: "+serial);}
     else{
         System.out.println("invalid number");}
return a;
    }
  
    
   public static void main(String[]args)  {
   Scanner t=new Scanner(System.in);
       System.out.println("enter the extract number");
       String a=t.nextLine();
       System.out.println(extractInfo(a));
   } 
}
