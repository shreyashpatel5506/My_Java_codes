package chapter5;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere a number for sum evene first number till now");
        int n = sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum of even numbers till "+n+" is "+sum);
    }
}
