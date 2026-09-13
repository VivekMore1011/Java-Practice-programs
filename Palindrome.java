class Palindrome{

static void isPalindrome(int num){
    int original=num;
    int reverse=0;
    while(num > 0){
        int digit=num%10;

        reverse=reverse*10+digit;

        num=num/10;
    }

    if(original==reverse){
        System.out.println("This number is the pallindrome number ");
    }
    else {
        System.out.println("This number is not an pallindrome nuber ");
    }


}

    public static void main (String args[]){
        int num=111;
        isPalindrome(num);
    }
}