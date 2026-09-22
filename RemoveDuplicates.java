class RemoveDuplicates{

    static void remove(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(result.indexOf(ch)==-1){
                result=result+ch;
            }
        }
        System.out.println(result);
    }

    public static void main(String args[]){
        String str="vivek";
        remove(str);
    }
}