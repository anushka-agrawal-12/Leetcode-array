public class Arrays10 {
    public static int MissingNumber(int[] arr, int N){
        int XOR1= 0;
        int XOR2= 0;
        for(int i=0; i<arr.length; i++){
            XOR1= XOR1 ^ (i+1);
            XOR2= XOR2 ^ arr[i];
        }
        XOR1 = XOR1 ^ N;
        return XOR1 ^ XOR2;
    }
    public static void main(String[] args){
        int[] arr= {1,2,4,5}; 
        int N = arr.length+1;
        int result = MissingNumber(arr, N);
        System.out.println(result);
    }
}
