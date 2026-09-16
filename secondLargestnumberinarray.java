public class secondLargestnumberinarray {
    
static void isArray(int arr[]){
    int larger=Integer.MIN_VALUE;
    int second=Integer.MIN_VALUE;

for(int i=0;i<arr.length;i++){
    if(arr[i]>larger){
        second =larger;
        larger=arr[i];
        
    }else if(arr[i]>second && arr[i]!=larger){
        second=arr[i];
    }
}
System.out.println("second largest element is :"+second);
}

    public static void main(String args[]){
        int arr[]={-1,-2,-3,-10,-20,-30};
        isArray(arr);
    }
}
