public class HollowRectangle {
    public static void main(String[] args) {
        int toCol=4;
        int toRow=4;
        for (int i = 0; i <=toRow; i++) {
            for (int j = 0; j <=toCol; j++) {
                if(
                    i == 0 || i== toRow || j==0 || j==toCol
                ){
                    System.out.print("*");
                }else{
                System.out.print(" ");
                }
        }
        System.out.println();
    }
}
}