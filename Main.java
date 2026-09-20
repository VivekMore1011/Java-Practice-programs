public class Main{

  static void CountString(String str){

    int constants=0;
    int vowels=0;

    str=str.toLowerCase();

for(int i=0;i<str.length();i++){

  char ch=str.charAt(i);

  if(ch>'a'&&ch<'z'){
    if(ch>'a'&&ch<'z'){

      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

vowels++;
      }
constants++;
    }
  }
}
System.out.println("vowels = "+vowels);
System.out.println("constants"+constants);
  }

  public static void main(String args[]){

    String str="java programming ";
    CountString(str);
  }
} 
