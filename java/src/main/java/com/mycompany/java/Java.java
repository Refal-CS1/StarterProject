package com.mycompany.java;
import java.util.Scanner;

public class Java {

 public static void main(String[] args) {
    System.out.println("Enter the first number:");
    Scanner input = new Scanner(System.in);
     int f = input.nextInt();
    System.out.println("Enter the second number:");
     int s = input.nextInt();
    System.out.println("Enter the number to check:");
    int n = input.nextInt();
    if (f<s){
    int te=f;
    f=s;
    s=te;
    }
    if (f>=n&&s<=n)
    System.out.println(n+" is inside the range ["+s+","+f+"]");
    else
    System.out.println(n+" isnt in the range");
 }
}
