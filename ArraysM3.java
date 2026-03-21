public class ArraysM3 {
    public static int Majorityelement(int[] arr){
        // int n= arr.length;
        for(int i=0; i<arr.length; i++){
            int count = 1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    count++;
                }
                if(count>arr.length/2){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {3,2,3};
        int result = Majorityelement(arr);
        System.out.println(result);
    }
}
