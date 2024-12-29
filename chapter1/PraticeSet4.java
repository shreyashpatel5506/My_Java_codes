package chapter1;
import java.util.Scanner;
public class PraticeSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  for check integer or not: ");
        String str= sc.next();
        boolean isNumeric = true;
        try {
             Integer.parseInt(str);
            isNumeric = true;
        } catch (Exception e) {
            isNumeric = false;
        }
        if (isNumeric) {
            System.out.println("The input is a number");
        } else {
            System.out.println("The input is not a number");
        }
        
    }
}
