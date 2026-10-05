/*public class FindMissingNumber {

    static void findMissing(int arr[],int n){
        int expected=n*(n+1)/2;
        int actual = 0;

        for(int num:arr){
            actual=actual+num;

        }
        int missing = expected-actual;
        System.out.println("Missing Number "+missing);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,7,8};
        int n=8;
        findMissing(arr,n);
    }
}
    */







class FindMissingNumber{

    static void isNumber(int arr[],int n){

        int expected=n*(n+1)/2;
        int actual=0;

        for(int num:arr){
            actual=actual+num;


        }
        int result=expected-actual;
        System.out.println(result);
    }

    public static void main(String args[]){

        int arr[]={1,3,4,5};
        int n=5;
        isNumber(arr,n);
    }
}
