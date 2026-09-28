
import java.util.Arrays;
public class InbuildFunctionArraySort {

    static void sort(int arr[]){
System.out.println("The sorted array is =");
        Arrays.sort(arr);
        for(int num:arr){
            System.out.print(" "+num);
        }


    }

    public static void main(String args[]){
        int arr[]={10,4,4342,5,2};
        sort(arr);
    }
}
