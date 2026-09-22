package com.mycompany.questions;
import java.util.Arrays;
public class temp {
public static int[] filleven(int n){
    int count=2;
int[] array=new int[n];
for(int i=0;i<array.length;i++){

array[i]=array[i]+count;
count+=2;}
return array;
}
public static int sumArray(int[]array){

    int sum=0;
for(int i=0;i<array.length;i++){
  sum+=array[i];}  
return sum;}
public static void main(String[]args){
    int n=5;
    int[] array=filleven(n);
    System.out.println(Arrays.toString(filleven(5)));
    System.out.println(sumArray(array));
}
        }
