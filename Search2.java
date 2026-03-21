public class Search2 {
    public static int LowerBound(int[] nums, int x){
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i]>=x){
                return i;            }
        }
        return nums.length;
    } 
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        int x= 9;
        int result = LowerBound(arr, x);
        System.out.println(result);
    }
}
