
import java.util.Scanner;
public class computing
{
   public static void main(String[] args)
   {
       Scanner obj = new Scanner(System.in);
       System.out.println("What is the total cost of the bill");
       double billcost = obj.nextDouble();
       System.out.println("Enter the number of people ");
       int numppl = obj.nextInt();
       double tip = billcost*.2;
       double totalcost = tip+billcost;
       double perperson = totalcost/numppl;
       double personbill = billcost/numppl;
       double persontip = tip/numppl;
       
       System.out.println("Amount of the bill:" + billcost);
       System.out.println("Amount of Tip: " + tip);
       System.out.println("Total cost : " + totalcost);
       System.out.println("Each person has to pay: " + perperson);
       System.out.println("Of which " + personbill + " Is the cost of the bill");
       System.out.println("Of which " + persontip + " Is for the cost of tip");
       
   }
}
