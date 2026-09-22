
package com.mycompany.testsubject;
import java.util.Scanner;
public class exccA {
    public static void main(String[]args){
    Scanner t=new Scanner(System.in);
        System.out.println("enter a sentence");
        String a=t.nextLine();
        System.out.println(a.toUpperCase());
         System.out.println(a.toLowerCase());
          System.out.println(a.length());
           System.out.println(a.charAt(0));
           System.out.println(a.charAt(a.length()-1));
             System.out.println(a.startsWith("Java"));
             
    }
}
