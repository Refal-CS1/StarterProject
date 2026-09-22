
package com.mycompany.questions;
import java.util.Arrays;
public class Questions {

    public static void main(String[] args) {

    int[][] arr=new int[2][2];
    arr[0][0]=3;arr[0][1]=4;
    arr[1][0]=9;arr[1][1]=8;
    for(int row=0;row<arr.length;row++){
    for(int column=0;column<arr[row].length;column++){
        System.out.println(arr[row][column]+"");}
    }
        System.out.println();
    }
}
       