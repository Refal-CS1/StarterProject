
package com.mycompany.examfinal;
import java.util.Scanner;
public class Examfinal {
    public static double[] applyDiscount(double prices[]){
    double[] discount=new double[prices.length];
    for(int i=0;i<prices.length;i++){
    if(prices[i]>4000)
        discount[i]=prices[i]-(prices[i]*0.15);
    else
        discount[i]=prices[i]-(prices[i]*0.05);
    }
    return discount;}
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
    String[] products=new String[4];
    double[] prices=new double[4];
    for(int i=0;i<4;i++){
        System.out.println("Enter product name #"+(i+1)+": ");
    products[i]=t.next();
        System.out.println("Enter price for "+products[i]+": ");
    prices[i]=t.nextDouble();
    }
    double[] discount=applyDiscount(prices);
        System.out.printf("\nProduct details");
        System.out.printf("\n%-12s%-12s%s\n","Title","Orginal","Discounted Price");
        for(int i=0;i<prices.length;i++){
        System.out.printf("%-12s%-12.2f%-12.2f\n",products[i],prices[i],discount[i]);
        }
}
}