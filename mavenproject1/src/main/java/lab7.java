import java.util.Scanner;
public class lab7 {
  public static void main(String[] args)  {
      System.out.println("enter \"x1");
      Scanner in=new Scanner(System.in);
      double x1;
       x1=in.nextInt();
      System.out.println("enter x2");
      double x2;
       x2=in.nextInt();
      System.out.println("enter y1");
      double y1;
       y1=in.nextInt();
      System.out.println("enter y2");
      double y2;
       y2=in.nextInt();
      double result=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
      System.out.println("distance= "+result);
  }
}
