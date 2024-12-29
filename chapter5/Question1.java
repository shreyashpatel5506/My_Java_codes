package chapter5;


public class Question1 {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
