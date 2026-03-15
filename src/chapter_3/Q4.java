package chapter_3;
/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks :");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Grade : A");
        } else if (marks>=75 && marks<90) {
            System.out.println("Grade : B");
        }else if(marks>=60 && marks<75){
            System.out.println("Grade : C");
        }else if(marks>=45 && marks<60){
            System.out.println("Grade : D");
        }
    }
}
