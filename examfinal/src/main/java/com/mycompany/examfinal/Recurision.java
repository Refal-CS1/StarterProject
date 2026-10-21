\\usuage of recurision in JAVA
package com.mycompany.examfinal;

import java.util.Scanner;

public class final2 {

    public static int GetSum(int n) {
        if (n <= 1) {
            return n;
        } 
        return n+GetSum(n-1);
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("enter a number");
        int n = t.nextInt();
        int sum = GetSum(n);
        System.out.println(sum);
    }

}
