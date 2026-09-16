public class LinerSearchFindtheelementinArray {
    
static void isTarget(int arr[],int target){
    boolean found=false;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            found=true;
            break;
        }
    }
    if(found){
        System.out.println("target got successfully");
    }
    else{
        System.out.println("Target Not get ");
    }
}

    public static void main(String args[]){
        int arr[]={10,20,30,40,49};
        int target=30;

        isTarget(arr,target);
    }
}
