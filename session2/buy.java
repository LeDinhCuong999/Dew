package session2;
import java.awt.*;
import java.util.Scanner;
public class buy {
    public static void main(String[] args) {

        int QuantityS,QuantityT,PriceS=300,PriceT=700,TotalS,TotalT,Discount,NetTotal,PointsEarned;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Shirts to order:");
        QuantityS = scan.nextInt();
        System.out.println("Enter the number of Trousers to order:");
        QuantityT = scan.nextInt();
        TotalS = QuantityS * PriceS;
        TotalT = QuantityT * PriceT;

        System.out.println("Item           Quantity           Price          Total");
        System.out.println("------------------------------------------------------------------");



        System.out.println("Shirts"   +       QuantityS   +        300    +      TotalS);
        System.out.println("Trousers"  +      QuantityT    +       700     +     TotalT);

        if((TotalS+TotalT)>3000) {
            Discount = (TotalS+TotalT)/10;
        }
        System.out.println("Discount" +                                          Discount);
        System.out.println("------------------------------------------------------------------");
        NetTotal=(TotalS+TotalT)-Discount;
        System.out.println("Net Total" +                                          NetTotal);
        System.out.println("------------------------------------------------------------------");
        if(NetTotal>3000) {
            PointsEarned=NetTotal/100;
        }
        System.out.println("Points Earned" +              PointsEarned);
        System.out.println("Thankyou so much!");
    }
}
