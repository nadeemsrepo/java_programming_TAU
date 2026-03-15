package chapter_3;
/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade : ");
        String grade=sc.next();
        String msg;
        switch(grade){
            case "A" :
               msg="Excellent !";break;
            case "B" :
                msg="Good job ";break;
            case "C" :
                msg="Need to work more ";break;
            case "D" :
                msg="work hard";break;
            default:
                msg="invalid grade";
        }
        System.out.println(msg);
    }
}
