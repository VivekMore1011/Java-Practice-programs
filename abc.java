public class abc {

    public static void main(String args[]){
        int []nums={1,2,3,4,5,6};
        int max=nums[0];//1
    
//
        for(int i=1;i<nums.length;i++){//1=1
            if (nums[i]>max){
                max=nums[i];
            }
        }
       System.out.println(max);
    }
}
