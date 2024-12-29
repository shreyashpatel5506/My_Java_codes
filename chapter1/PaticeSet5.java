package chapter1;
import java.util.Scanner;
public class PaticeSet5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a marks of maths out of 100: ");
        int maths= sc.nextInt();
        System.out.print("Enter a marks of science out of 100: ");
        int science= sc.nextInt();
        System.out.print("Enter a marks of Chemistry out of 100: ");
        int Chemistry= sc.nextInt();
        System.out.print("Enter a marks of English out of 100: ");
        int English= sc.nextInt();
        
        System.out.println("Cgpi of maths: "+((double)maths/10));
        System.out.println("Cgpi of science: "+((double)science/10));
        System.out.println("Cgpi of Chemistry: "+((double)Chemistry/10));
        System.out.println("Cgpi of English: "+((double)English/10));

        System.out.println("Total cgpi: "+((double)(maths+science+Chemistry+English)/40));
    }
}
