public class FindSmallestElementinArray{

    static void Array(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimum number is ="+min);
    }

    public static void main(String args[]){
        int arr[]={10,20,30,40,1,2,-5};
        Array(arr);
    }
}