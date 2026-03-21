//Check if array is sorted
public class Arrays3 {
    public static void main(String[] args) {
        int[] arr= {2,1,4,6,7};
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]<arr[i]){
                isSorted = false;
                break;
            }
        }

        if(isSorted==true){
            System.out.println("Array is sorted");
        }
        else { 
            System.out.println("array is not sorted");
        }
    }

}
