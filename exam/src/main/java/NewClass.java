import java.util.*;
public class NewClass {
    public static void displaySeats(boolean arr[][]){
        for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        if(arr[i][j]==true){
            System.out.print("[X]");
        }
        else{
            System.out.print("[O]");}}
            System.out.println("");
    }
    }
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        boolean[][] arr=new boolean[4][4];
        System.out.println("Train Seat Reservation System");
        for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
    arr[i][j]=false;}}
        while(true){
        displaySeats(arr);
            System.out.println("Enter row number to reserve (0-3), or -1 to exit: ");
            int row=t.nextInt();
            if(row==-1){
                break;}
            System.out.println("Enter seat number to reserve (0-3): ");
            int col=t.nextInt();
            if(arr[row][col]==false)
                arr[row][col]=true;
                System.out.println("Seat (row" +row+ " ,seat "+col+") reserved successfully!");
        }
    }


    }

