class FindSumOfArrayElements{

    static void isSum(int num[]){

        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }

        System.out.println("The Sum of the given array is :"+sum);
    }

    public static void main(String... args){
        int num[]={1,2,3,4};
        isSum(num);

    }
}