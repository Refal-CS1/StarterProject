\\designs a schedule for students and show cases the OFF days and each subject added
import java.util.*;
public class off {
    public static int countOff(String arr[][]){
        int count=0;
        String g="OFF";
    for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
    if(arr[i][j].equals("OFF")){
        count++;;
    }
    }}
    return count;}
    public static void main(String[] args) {
        
        Scanner t=new Scanner(System.in);
        
        String[][] arr=new String[5][6];
        System.out.println("Enter the subjects in the timetable (day by day). For any empty slot, type OFF:");
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
        arr[i][j]=t.next();}}
        System.out.println("Total OFF hours in your timetable:"+countOff(arr));
    }
  
}
