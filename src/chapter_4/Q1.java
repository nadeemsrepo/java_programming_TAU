package chapter_4;
/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hour worked ");
        double worked=sc.nextDouble();
        int rate=15;
        int maxhour=40;
        while(worked>maxhour || worked<1){
            System.out.println("Invalid , hour should ranges from 1 -40");
            worked=sc.nextDouble();
        }
        double  gross=rate*worked;
        System.out.println("Gross : "+gross);
    }
}
