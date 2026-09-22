package com.mycompany.questions;
import java.util.Scanner;


public class question2 {
  public static void main ( String [] args ) {
 Scanner n = new Scanner ( System .in);
int [] arr = new int [5];
System.out .print(" Please Enter 5 Array Elements : ");
for (int i = 0; i < 5; i++) {
 arr [i] = n . nextInt ();
 }
 System .out . print ("The array elements are in revers are :");
 for (int i = arr . length - 1; i >= 0; i --) {
 System .out . print (arr [i] + " ");
 }
// System .out . println ();
 //n . close ();
 }
 }  

