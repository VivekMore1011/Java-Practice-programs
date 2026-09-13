public class reverseNumber {

    static void revNumber(int num){
        int reverse=0;
        while(num>0){
            int digit=num%10;

            reverse=reverse*10+digit;
            num=num/10;
        }

        System.out.println("reverse = "+reverse);
    }

    public static void main(String args[]){

        int num=123456789;

        revNumber(num);
    }
    
}
