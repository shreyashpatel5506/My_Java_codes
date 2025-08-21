public class numberPyramid {
public static void main(String[] args) {
        int n=6;
        for (int i = 1; i < n; i++) {
            //Space
            for (int j = 1; j < n-i+1; j++) {
                System.err.print("  ");
            }
            //print numbers into decreasing order
            for (int j = i; j > 1; j--) {
                System.out.print(j+ " ");
            }
            //print numbers into increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

}
