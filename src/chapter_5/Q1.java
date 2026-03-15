package chapter_5;
/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */
import java.util.*;
public class Q1 {
    static void greet(String name){
        System.out.println("Hello "+name+" nice to meet u");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        greet(name);
    }
}
