public class findceilingnumber{
    public static int findceilnumber(int arr[], int target){
        int left=0;
        int right=arr.length-1 ;
        while(left<=right){
            int mid = left + ((right-left)/2);
            if(target > arr[mid]){
                left =mid+1;
            }else if(target<arr[mid]){
                right=mid-1;
            }else{
                return arr[mid];
            }
        }
        return arr[left];

    }
    public static int findfloornumber(int arr[], int target){
        int left=0;
        int right=arr.length-1 ;
        while(left<=right){
            int mid = left + ((right-left)/2);
            if(target > arr[mid]){
                left =mid+1;
            }else if(target<arr[mid]){
                right=mid-1;
            }else{
                return arr[mid];
            }
        }
        return arr[right]; 

    }
public static void main(String[] args) {
    int [] arr = {1,2,4,9,45,56,67,78,89,90};
    int target=68;
    int result = findceilnumber(arr, target);
    System.out.println("The ceiling number is: " + result);
    int floor = findfloornumber(arr, target);
    System.out.println("The floor number is: " + floor);
}
}