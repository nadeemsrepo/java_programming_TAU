package chapter_3;
/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=10;
        System.out.println("Enter sales : ");
        int sales=sc.nextInt();
        if(sales>=target){
            System.out.println("Congratulation");
        }else{
            int rest_sales=target-sales;
            System.out.println(rest_sales+" sales has to be done");
        }
    }
}
