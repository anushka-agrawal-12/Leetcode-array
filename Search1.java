public class Search1 {

    public static int Search(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]== target){
                return i;
            }
        }
         return-1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        int result= Search(arr, target);
        System.out.println(result);
    }
}
