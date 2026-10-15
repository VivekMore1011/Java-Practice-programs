import java.util.*;

class PerfectNumber{

  static void Perfect(int n){

    int sum=0;

    for(int i=1;i<=n/2;i++){
      if(n%i==0){
        sum=sum+i;
      }
    }

    if(sum == n){
      System.out.println("The given number is the perfect number ");
    }else{
      System.out.println("The given number is the not perfect number");
    }
  }

public static void main(String args[]){

  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number ");
  int n = sc.nextInt();

  //System.out.println("Your Entered Number is \n"+n);
  Perfect(n);
}

}
