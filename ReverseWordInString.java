public class ReverseWordInString{

    static String reverse(String str){
        String [] words=str.split(" ");
        String result=" ";

        for(int i=words.length-1;i>=0;i--){
            result=result+words[i];

            if(i!=0){
                result=result+" ";
            }
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println(reverse("Vivek More"));
    }
}