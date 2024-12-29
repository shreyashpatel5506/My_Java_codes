package chapter7;

public class metod3 {
    /*
     * 
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     * 
     */
    public static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Pattern 1");
        pattern1(5);
        System.out.println();
        System.out.println("Pattern 2");
        pattern2(5);
    }
}
