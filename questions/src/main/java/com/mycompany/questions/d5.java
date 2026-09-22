
package com.mycompany.questions;
   import java.util.Scanner;
public class d5 {
public class MaxInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] numbers = new int[3][4];
        System.out.println("Enter the elements of a 3x4 array (row by row):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = input.nextInt();
            }
        }
        int max = maxNumber(numbers);
        System.out.println("The largest number in the array is: " + max);
    }
    public static int maxNumber(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }}}
