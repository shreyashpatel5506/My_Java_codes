public class InvertedRotatedHalfPyramid{
    public static void main(String[] args){
        int n=5;
        for (int i = 0; i < 5; i++) {
            //Space
            for(int j = 0;j < n - i -1;j++){
                System.out.print("  ");
            }
            //Star
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}