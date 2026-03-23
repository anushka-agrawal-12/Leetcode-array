public class Arrays11 {
    public static int ConsecutiveOnes(int[] arr){
        int count=0;
        int max=0;
        for(int num: arr){
            if(num==1){
                count++;
                max= Math.max(count,max);
            }
            else{
                count--;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,1,1,0,1,1,1};
        System.out.println(ConsecutiveOnes(arr));
    }
}
