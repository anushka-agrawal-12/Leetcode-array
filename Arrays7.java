public class Arrays7 {
    public static int[] MoveZeroes(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[j]==0){
                int temp= nums[j+1];
                nums[j+1]= nums[j];
                nums[j]= temp;
            }
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] arr= {0,1,4,0,5,2};
        int[] result = MoveZeroes(arr);
        for(int num : result){
            System.out.println(num);
        }
    }

}
