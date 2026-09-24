import java.util.*;



public class Anagram{

    static void isAnagram(String str1,String str2){

    char[]a=str1.toLowerCase().toCharArray();
    char[]b=str2.toLowerCase().toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    if(Arrays.equals(a,b)){
        System.out.println("Anagram");
    }
    else{
        System.out.println("Not an Anagram ");
    }
}

    public static void main(String args[]){
        isAnagram("listen","silent");
    }
}