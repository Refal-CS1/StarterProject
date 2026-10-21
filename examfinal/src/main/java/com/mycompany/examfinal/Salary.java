\\using file paths in JAVA
package com.mycompany.examfinal;
import java.nio.file.Paths;
import java.util.*;
public class files {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
       Scanner fileScanner=new Scanner(Paths.get("file.txt"));
       Formatter add=new Formatter("temp.txt");
        System.out.println("Enter ID");
        String AddID=input.next();
        System.out.println("Enter additional salary");
        int addsalary=input.nextInt();
    while(fileScanner.hasNext()){
        String id=fileScanner.next();
        String name=fileScanner.next();
        int salary=fileScanner.nextInt();
        if(id.equals(AddID))
            salary+=addsalary;
        add.format("%s  %s  %d%n",id,name,salary);
    }
    add.close();
    input.close();
    fileScanner.close();
fileScanner=new Scanner(Paths.get("temp.txt"));
 add=new Formatter("file.txt");
 
 while(fileScanner.hasNext()){
      String id=fileScanner.next();
        String name=fileScanner.next();
        int salary=fileScanner.nextInt();
        add.format("%s  %s  %d%n",id,name,salary);
        
 }
 add.close();
       }
}
