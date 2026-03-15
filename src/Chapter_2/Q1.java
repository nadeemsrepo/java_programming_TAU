package Chapter_2;
//Create a program that asks a user for a season of the year, then a whole number,
//then an adjective. And use the input to complete the sentence below. Output the result.
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter season of the year : ");
        String season=sc.nextLine();
        System.out.println("enter a whole number :");
        int num=sc.nextInt();
        System.out.println("Enter an adjective");
        String adj=sc.next();
        System.out.println("season: "+ season+"  number :"+num+"  adjective: "+ adj);
    }
}
