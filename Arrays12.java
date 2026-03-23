public class Arrays12 {
    public static int SingleNo(int[] arr){
        int XOR = 0;
        for(int i : arr){
            XOR = XOR ^ i;
        }
        return XOR;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,2,3,4,4};
        int result= SingleNo(arr);
        System.out.println(result);
    }
}
