public class firstNonRepeatedChar {

    static char find(String str){

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=0;

            for (int j=0;j<str.length();j++){

                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                return ch;
            }
        }
        return '\0';
    }
    
    public static void main(String args[]){
        System.out.println(find("swiss"));
    }
}
