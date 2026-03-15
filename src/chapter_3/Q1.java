package chapter_3;
/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salary=1000;
        int target=10;
        int bonus=250;
        System.out.println("Enter the sales : ");
        int sales=sc.nextInt();
        if(sales>target){
            salary+=bonus;
        }
        System.out.println("Total salary after sales : "+ salary);
    }
}
