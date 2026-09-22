
package com.mycompany.testsubject;
import java.util.Scanner;
public class exa2 {
    public static void main(String[]args){
    Scanner t=new Scanner(System.in);
    String s;
        System.out.println("enter first city");
        String a=t.nextLine();
        System.out.println("enter second city");
        String p=t.nextLine();
        if(p.compareTo(a)>0){
        s=p;
        p=a;
        a=s;
        }
        String y=p+" "+a;
        System.out.println(y);    
        System.out.println(y.toUpperCase());
    
    
    
    
    
    
    }
}
