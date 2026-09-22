
package com.mycompany.testsubject;
import java.util.Scanner;
public class ex5 {
    public static String reverse(String p){
    StringBuilder sb=new StringBuilder(p);
    return sb.reverse().toString();
    }
    public static void main(String[]args){
    Scanner t=new Scanner(System.in);
        System.out.println("enter a string");
        String p=t.nextLine();
        System.out.println(reverse(p));
   
    
    
    }
}
