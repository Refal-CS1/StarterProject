package com.mycompany.questions;
import java.util.Arrays;
import java.util.Scanner;
public class boo {
public static void main(String[]args){
    Scanner t=new Scanner(System.in);
    int[] grades=new int[50];
    int[] adjustment=new int[50];
    System.out.println("enter the grades");
    for(int i=0;i<grades.length;i++){
        int gra=t.nextInt();
        if(gra!=-1){
        grades[i]+=gra;}
        else{
        break;}
        if(gra==59||gra==69||gra==79||gra==89){
            gra+=1;
        }
        if(gra!=-1){
        adjustment[i]+=gra;}
        else{
        break;}
      
    }
    System.out.println(Arrays.toString(grades)); 
   System.out.println(Arrays.toString(adjustment)); 
    
}}
