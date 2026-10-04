class removeWhite{

    static void removeSpace(String str){
        String result=" ";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                result=result+str.charAt(i);
            }
        }
        System.out.println("String After removing "+result);
    }

    public static void main(String args[]){


        
        removeSpace("Vivek Tanaji More");
    }
}