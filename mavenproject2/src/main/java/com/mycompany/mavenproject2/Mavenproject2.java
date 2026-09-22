
package com.mycompany.mavenproject2;
import java.util.Scanner;
public class Mavenproject2 {

public static void main(String[] args) {
  System.out.print("Enter mass in grams:");
  Scanner input = new Scanner(System.in);
    int g = input.nextInt();
  System.out.println(g/1000.0+"kg");
if(g/1000.0<1)
  System.out.println("light");
    }
}
