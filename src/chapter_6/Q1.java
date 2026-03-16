package chapter_6;
import java.util.*;
public class Q1{
    private static int grades[];
    private static Scanner sc=new Scanner(System.in);

///    getting grades
    public static void getGrades(int grades[]){
        for(int i=0;i<grades.length;i++){
            System.out.println("Enter the grades :");
            grades[i]=sc.nextInt();
        }
    }

///    calculate sum
    public static int calculateSum(int grades[]){
        int sum=0;
        for(int n:grades){
            sum+=n;
        }
        return sum;
    }

///    calculate average
    public static double  avg(int grades[]){
        return (double)calculateSum(grades)/grades.length;
    }

///    get highest
    public static int highest(int grades[]){
        int highest=grades[0];
        for(int n:grades){
            if(n>highest){
                highest=n;
            }
        }
        return highest;
    }

///    get lowest
    public static int lowest(int grades[]){
        int lowest=grades[0];
        for(int n:grades){
            if(n<lowest){
                lowest=n;
            }
        }
        return lowest;
    }
    public static void main(String[] args) {
        int grades[]=new int[sc.nextInt()];
        getGrades(grades);
        System.out.println("Sum : "+calculateSum(grades));
        System.out.println("Average : "+avg(grades));
        System.out.println("Highest : "+highest(grades));
        System.out.println("Lowset : "+lowest(grades));
    }
}
