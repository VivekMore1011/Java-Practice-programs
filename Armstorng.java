public class Armstorng {
    static void isArm(int num){
        int original=num;
        int sum=0;

        while(num!=0){
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
if(original==num){
    System.out.println("Armstrong");
}
else{
    System.out.println("Not Armstrong");
}
    }

    public static void main(String args[]){
        int num=155;
        isArm(num);
    }
}
