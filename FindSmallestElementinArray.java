public class FindSmallestElementinArray{

    static void Array(int arr[]){
        int minimum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimum number is ="+minimum);
    }

    public static void main(String args[]){
        int arr[]={10,20,30,40,1,2,-5};
        Array(arr);
    }
}