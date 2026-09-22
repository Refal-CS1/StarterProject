
package com.mycompany.examfinal;
import java.util.*;
public class psmv {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int[] Grades=new int[50];
        int count=0;
        int studentcount=0;
        System.out.println("Enter grade");
        for(int i=0;i<Grades.length;i++){
            int grade=t.nextInt();
        if(grade==-1)
        break;
        studentcount++;  
        Grades[i]=grade;
 }System.out.print("Grades before adjustment: ");
        for(int i=0;i<studentcount;i++){
        System.out.print(Grades[i]+"|");}
        System.out.print("\nGrades after adjustment: ");
        for(int i=0;i<studentcount;i++){
        if(Grades[i]==59||Grades[i]==69||Grades[i]==79||Grades[i]==89){
        count++;
        Grades[i]=Grades[i]+1;}
 
System.out.println(+Grades[i]+"|");}
        System.out.println(count);    }
}
