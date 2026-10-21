\\checks if an ID is VALID
package com.mycompany.testsubject;
import java.util.Scanner;
public class holls {
    public static String email(String h) {
        int i = 2;
        boolean di = true;
        int sum =0;
        boolean leng = h.length() == 8;
        boolean upper = Character.isUpperCase(h.charAt(0));
        boolean up = Character.isUpperCase(h.charAt(1));
       // while (i < h.length()) {
       char cp=0;
            if (Character.isDigit(h.indexOf(i))) {
                for(i=2;i<h.length();i++)
                cp=h.charAt(i);
                sum+=cp-'0';
                di = true;
               
            }/* else {
                di = false;
            }*/
       // }
        boolean o = leng && upper;
        boolean r = di && up;
        if (o && r) {
            System.out.println("Valid ID");
            System.out.println("sum of digits= " + sum);
        } else {
            System.out.println("invald Id");
        }
        return h;
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("enter your ID");
        String h = t.nextLine();
        System.out.println(email(h));
        System.out.println("Do you want to check another ID?(Y/N)");
        char fa = t.nextLine().charAt(0);
        //char Y;
        //char N;
        switch (fa) {
            case 'Y':
                System.out.println("enter ID");
                h=t.nextLine();
                System.out.println(email(h));
                break;
            case 'N':
                System.out.println("GoodBye!");
                
            default:
                System.out.println("invaid choice");
        }
    }
}
