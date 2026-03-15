package chapter_5;
//So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
//And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.
//I want you to create separate methods to
// calculate the tax,
// to calculate the overage fees,
//and to calculate and print the final total.
//Please print this as an itemized bill. I have an example of the output expected down below.
import java.sql.SQLOutput;
import java.util.*;
public class PhoneBilCalculator {
    ///    CALCULATE OVERAGE FEES
    public static  double overageFee(double minute){
        return minute*0.25;
    }
///    METHOD TO CALCULATE TAX
    public static double tax(double minute,double plan_fee){
        double r=overageFee(minute)+plan_fee;
        double total_fee=r/100;
        double taxx=total_fee*15;
        return taxx;
    }
///    CALCULATE FINAL TOTAL
    public static double total(double plan_fee,double minute){
        double re=tax(minute,plan_fee);
        double ovre=overageFee(minute);
        double res=re+ovre+plan_fee;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter plan fees:");
        double plan_fee=sc.nextDouble();
        System.out.println("Enter overage minute : ");
        double minute=sc.nextDouble();

        System.out.println("-------------PHONE BILL-------------");
        System.out.println("Plan : "+plan_fee);
        System.out.println("Overage minute : "+minute);
        System.out.println("Tax : "+tax(minute,plan_fee));
        System.out.println("Total : "+total(plan_fee,minute));
    }
}
