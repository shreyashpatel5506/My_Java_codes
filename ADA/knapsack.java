
import java.util.Scanner;
public class knapsack {
    public static void inputvalue(int n,float a[]){
        Scanner sc1 = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("enter a value:-");
            a[i] = sc1.nextInt();
        }
    }
    
    public static void printArray(float a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //total number of items
       
        System.out.println("enter a number of items:-");
        int n= sc.nextInt();
       
        //take max weight
        System.out.println("Enter a max weight:-");
        int max_w = sc.nextInt();
        
        //assign the array
        float[] weight = new float[n];
        float[] profit = new float[n];
        
        //take value from the users
        System.out.println("Enter a values for weights");
        inputvalue(n , weight);
        System.out.println("Enter a values for profits");
        inputvalue(n , profit);
        
        System.out.println("weight array is :-");
        printArray(weight);
         System.out.println();
        System.out.println("Profit array is :-");
        printArray(profit);
         
        System.out.println();
        //p/w array 
        float[] p_w = new float[n];
        for(int i=0;i<n;i++){
            p_w[i] = profit[i]/weight[i];
        }
        
        //print
         printArray(p_w);
         
         float w = 0;
         float total_p=0;
         while(w <= max_w){
             int item_no=-1;
             float max=0;
             for(int i=0;i<n;i++){
                 if(p_w[i] > max){
                     max=p_w[i];
                     item_no=i;
                 }                     

             }
             if(item_no== -1){
                 break;
             }
             if(weight[item_no]+w <=  max_w){
                 w = w + weight[item_no];
                 total_p = total_p + profit[item_no];
                 p_w[item_no] = 0;
                 System.out.println("Total Weight is:-" + w + "Total Profit is:-" + total_p);
             }
             else{
                
                 float xi= (max_w - w)/weight[item_no];
                  w = w + xi*weight[item_no];
                 total_p = total_p + xi*profit[item_no];
                 p_w[item_no] = 0;
                  System.out.println("Total Weight is:-" + w + "Total Profit is:-" + total_p);
             }
         }
         System.out.println("total profit is :-" +total_p );
    }
}
