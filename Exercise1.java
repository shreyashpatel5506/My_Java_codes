import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a marks of maths out of 100: ");
        int maths= sc.nextInt();
        System.out.print("Enter a marks of science out of 100: ");
        int science= sc.nextInt();
        System.out.print("Enter a marks of Chemistry out of 100: ");
        int Chemistry= sc.nextInt();
        System.out.print("Enter a marks of English out of 100: ");
        int English= sc.nextInt();
        System.out.print("Enter a marks of Hindi out of 100: ");
        int Hindi= sc.nextInt();

        System.out.print("Perccentage of all subjects: " + ((double)(maths+science+Chemistry+English+Hindi)/5)+ "%");
    }
}
