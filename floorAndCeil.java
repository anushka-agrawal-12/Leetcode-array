public class floorAndCeil {
    public static int[] floorAndCeils(int[] arr, double target){
        int low = 0;
        int high= arr.length-1;
        int floor = -1;
        int ceil= -1;
       while(low<=high){
         int mid = low + (high-low)/2;
        if(arr[mid]==target){
            floor = arr[mid];
            ceil = arr[mid];
            break;
        }
        else if(arr[mid]>target){
            high= mid-1;
            ceil= arr[mid];
        }
        else{
            low= mid+1;
            floor = arr[mid];
        }
       }
        return new int[]{floor, ceil};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double target = 4.5;
        int[] result = floorAndCeils(arr, target);
System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);    }
}
