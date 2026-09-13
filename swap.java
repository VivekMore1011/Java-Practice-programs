class swap {
    
static void swapNumbers(int a ,int b){
int temp=a;
a=b;
b=temp;

System.out.println("the a is "+a);
System.out.println("the b is "+b);



}

    public static void main(String args[]){

        int a =10;
        int b=20;
        swapNumbers(a,b);
    }
}
