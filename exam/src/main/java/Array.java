\\fills an array then finds largest number
import java.util.*;
public class ex11 {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the elements of a 3x4 array (row by row):");
        
        
        int[][] arr=new int[3][4];
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
        arr[i][j]=t.nextInt();}}
        System.out.println("The largest number in the array is: "+maxnumber( arr));           
    }
    public static int maxnumber(int arr[][]){
        int largest=arr[0][0];
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>largest){
            largest=arr[i][j];}
            
        }
            
        }
      return largest;
    }
 
}
