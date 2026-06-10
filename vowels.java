public class vowels{
    public static void main(String args[]){
        String ch="helloword";
       for(int i=0;i<ch.length();i++){
        char s=ch.charAt(i);
       
      if(s!='a'&& s!='e' && s!='i' && s!='o' && s!='u'){
        System.out.println(s);
      }
    }
    }
}