public class largestElementInArray {

    static void findlargest(int []arr){
       int max=arr[0];

       for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       System.out.println("the largest element is "+max);
    }


    public static void main(String args[]){
        int [] arr={10,20,30,40,50};
        findlargest(arr);
    }
}
