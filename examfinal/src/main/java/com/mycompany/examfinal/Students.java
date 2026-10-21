\\uses files path and calculates if the student passes or fails then prints the information
package com.mycompany.examfinal;
import java.util.*;
import java.nio.file.Paths;
public class students {
    public static void main(String[] args)throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter file name");  
    String file=input.next();
    Scanner filename=new Scanner(Paths.get(file));
while(filename.hasNext()){
int ID=filename.nextInt();
String name=filename.next();
double mark=filename.nextInt();
mark+=2.00;
if(mark>=60){
String result="Passed";
System.out.printf("%-5s%-5s%-5.2f%-5s%n",ID,name,mark,result);}
else{
String result="Failed";
System.out.printf("%-5s%-5s%-5.2f%-5s%n",ID,name,mark,result);}

} 
        }
}
