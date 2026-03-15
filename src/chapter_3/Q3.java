package chapter_3;
/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur salary : ");
        int salary=sc.nextInt();
        System.out.println("Enter the year of experience :");
        int experience=sc.nextInt();
        if(salary>=30000){
            if(experience>=2){
                System.out.println("You are eligible for the loan");
            }else{
                System.out.println("less experience , so rejected");
            }
        }else{
            System.out.println("rejected");
        }
    }
}
