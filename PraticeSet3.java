import java.util.Scanner;
public class PraticeSet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Distance in Kilometers: ");
        float km = sc.nextFloat();
        float miles = km * 0.621371f;
        System.out.println(km + " km is equal to " + miles + " miles.");
    }
}
