class removeWhite{

    static void removeSpaces(String str){
        String result=" ";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                result=result+str.charAt(i);
            }
        }
        System.out.println("String After removing "+result);
    }

    public static void main(String args[]){


        
        removeSpaces("Vivek More");
    }
}