
package com.mycompany.examfinal;

public class fdd {
   public static int formula(double h,int...numbers) {
   int sum=0;
   for(int num:numbers){
   sum+=num;}
   return (int) (h*sum);}
public static void main(String[]args){

int result1=formula(2.5,10,20,30);
    System.out.println("result 1: "+result1);
        }}