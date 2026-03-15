package chapter_4;
/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter quantity :");
        int quantity=sc.nextInt();

        double total=0;
        for(int i=1;i<=quantity;i++){
            System.out.println("Enter the cost of "+i+ " item :");
            double cost=sc.nextDouble();
            total+=cost;
        }
        System.out.println("Total cost : "+total);
    }
}
