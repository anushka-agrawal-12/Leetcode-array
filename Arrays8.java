public class Arrays8 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int target= 30;
        boolean found= false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println(i); 
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    }
}
