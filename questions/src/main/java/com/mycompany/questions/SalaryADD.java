package com.mycompany.questions;
import java.io.*;
import java.util.*;
public class duestion4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("file.txt");
        List<String> lines = new ArrayList<>();

        System.out.print("Enter ID: ");
        String searchId = input.next();
        System.out.print("Enter additional salary: ");
        double extraSalary = input.nextDouble();

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(" ");               
                if (parts[0].equals(searchId)) {
                    double newSalary = Double.parseDouble(parts[2]) + extraSalary;
                    line = parts[0] + " " + parts[1] + " " + (int)newSalary;
                }
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: file.txt not found.");
            return;
        }
        try (PrintWriter writer = new PrintWriter(file)) {
            for (String updatedLine : lines) {
                writer.println(updatedLine);
            }
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
