public class PallindromeString {

    static void isPallindrome(String str){

        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);

        }
        if(str.equals(reverse)){
            System.out.println("String is Pallindrome");
        }else{
            System.out.println("String is not pallindrome");
        }
    }
    
    public static void main(String args[]){

        String str="dsbd";
        isPallindrome(str);
    }
}
