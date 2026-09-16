
class Vivek{

static void isReverse(String a){

    String reverse="";
    for(int i=a.length()-1;i>=0;i--){
        reverse=reverse+a.charAt(i);

    }
    System.out.println("reverse string is :"+reverse);
}

    public static void main(String[] args) {
        String a="Vidya ";
        isReverse(a);
    }
}