public class Sumofdigit {
    
static void Digit(int num){

    int sum=0;

    while(num>0){
        int digit=num%10;

        sum=sum+digit;

        num=num/10;
    }

    System.out.println(sum);
}


    public static void main(String args[]){

        int num=90;

        Digit(num);
    }
}
