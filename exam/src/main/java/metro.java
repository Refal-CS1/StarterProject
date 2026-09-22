import java.util.*;
public class metro {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        String[] names=new String[20];
        double total=0;
        double[] price=new double[20];
        int[] age=new int[20];
        for(int i=0;i<names.length;i++){
            System.out.println("Enter passenger "+(i+1)+" name:");
        names[i]=t.next();
            System.out.println("Enter passenger "+(i+1)+" age:");
        age[i]=t.nextInt();
        if(age[i]<=12){
        price[i]=5;}
        else
            price[i]=10;}
        process(names,age,price);
        printreciept(total,names);
    }
    public static void process(String[] names,int[] age,double[]price){
        System.out.println("--- Riyadh Metro Billing Summary ---");
        calculate(age,price);
        double total=0;
        for(int i=0;i<names.length;i++){
            System.out.printf("Processing passenger "+(i+1)+" : %s(Age: %d) Price:%.2f SAR%n",names[i],age[i],price[i]);
        total+=price[i];}
    }
    public static double[] calculate(int[]age,double[] price){
    for(int i=0;i<age.length;i++){
    if(age[i]>=60){
    price[i]*=0.5;}}
    return price;}
    public static void printreciept(double total,String[]names) {
        System.out.println("----------------------------------");
        System.out.println("Total Passengers Processed:"+names.length);
        System.out.println("----------------------------------");
        System.out.println("Total Fare Due:"+total+"SAR");
    }
}
