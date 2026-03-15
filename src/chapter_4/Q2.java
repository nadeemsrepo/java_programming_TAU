package chapter_4;
/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Ente 1st number :");
            int n1=sc.nextInt();
            System.out.println("Enter 2nd number :");
            int n2=sc.nextInt();
            int sum=n1+n2;
            System.out.println("SUM : "+sum);

            System.out.println("Do u want to add more (True or false)");
            again=sc.nextBoolean();
        }while(again);
    }
}
