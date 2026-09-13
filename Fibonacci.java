class Fibonacci {

static void fibonacci(int num){
    int a=0;
    int b=1;

    for(int i=1;i<=num;i++){
        System.out.print(a+" ");

        int c=a+b;
        a=b;
        b=c;
    }
}

    public static void main(String args[]){
        int num=10;

        fibonacci(num);
    }
}
