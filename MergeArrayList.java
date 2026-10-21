import java.util.*;


public class MergeArrayList{

    public static void main(String args []){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(200);

        ArrayList<String >list1=new ArrayList<>();
        list1.add("Vivek ");
        list1.add("Vidya");
     

        ArrayList<Object>merge=new ArrayList<>();

        merge.addAll(list1);
        merge.addAll(list);
        System.out.println(merge);
    }

}