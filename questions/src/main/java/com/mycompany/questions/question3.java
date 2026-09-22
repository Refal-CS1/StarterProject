
package com.mycompany.questions;
import java.util.Scanner;
public class question3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] timetable = new String[5][4];

        System.out.println("Enter subjects for each slot (Type 'OFF' for empty slots):");
        for (int i = 0; i < timetable.length; i++) {
            System.out.println("Day " + (i + 1) + ":");
            for (int j = 0; j < timetable[i].length; j++) {
                System.out.print("  Slot " + (j + 1) + ": ");
                timetable[i][j] = input.next();
            }
        }
        int offHours = countOFF(timetable);
        System.out.println("\nTotal number of off-hours: " + offHours);
    }

    public static int countOFF(String[][] timetable) {
        int count = 0;
        for (int i = 0; i < timetable.length; i++) {
            for (int j = 0; j < timetable[i].length; j++) {
                if (timetable[i][j].equalsIgnoreCase("OFF")) {
                    count++;
                }
            }
        }
        return count;
    }}
