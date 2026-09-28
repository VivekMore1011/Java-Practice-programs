public class findDuplicatesfromArray {

    static void findDuplicate(int arr[]){

    for(int i=0;i<arr.length;i++){
        for (int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println("The Duplicate value from the array is "+arr[i]);
                break;
            }
        }
    }
    }

    public static void main(String args[]){
        int arr[]={1,1,2,2,4,8,9,7};
        findDuplicate(arr);
    }
    
}
