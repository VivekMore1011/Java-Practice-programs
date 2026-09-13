public class factorial {

    static void factNum(int num){

        int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }

        System.out.println("The factorial number is = "+fact);
    }

    public static void main(String args []){
        int num=3;
        factNum(num);
    }
    
}
