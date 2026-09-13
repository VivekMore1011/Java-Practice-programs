/*class sumofNnumbers {
    static void sumNumbers(int n){
        int sum=0;
for (int i=1;i<=n;i++){
sum=sum+i;

}
System.out.println("Sum= "+ sum);

    }

    public static void main(String [] args){
        int n=5;
        sumNumbers(n);
    }
}
*/

class Main{

static void sumNumbers(int n){

    int sum=0;

    for(int i=1;i<=n;i++){
        sum=sum+i;
        
    }
    System.out.println("sum = "+sum);
}

    public static void main(String args[]){

        int n=10;

        sumNumbers(n);
    }
}