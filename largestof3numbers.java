public class largestof3numbers {

    static void largestNumber(int a ,int b,int c){
        
        if (a>b && a>c){
            System.out.println("A is the largest number");}

           else if(b>a && b>c){
            System.out.println("B is the largest number ");
           } 
           else {
            System.out.println("C is the largest number ");
           }
        
    }
    

    public static void main(String args[]){
        int a=10;
        int b=8;
        int c=5;

        largestNumber( a,b,c);
    }
}
