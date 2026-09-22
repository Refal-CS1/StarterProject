package com.mycompany.testsubject;

import java.util.Scanner;

public class in {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("enter first character");
        char i = t.next().charAt(0);
        int a = i;
        System.out.println("enter second character");
        char s = t.next().charAt(0);
        int p = s;
        System.out.println(a);
        System.out.println(p);
        if(a-p<0)
        System.out.println((a - p)*-1);
        else
        System.out.println((a - p)); 
    }
}
