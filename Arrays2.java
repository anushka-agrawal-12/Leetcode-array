//SECOND LARGEST ELEMENT OF AN ARRAY
public class Arrays2 {
    public static void main(String[] args){
        int[] arr={2,4,1,3,-1};
        int largest= Integer.MIN_VALUE;
        int secLargest= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest=arr[i];
            }
            else if(arr[i]>secLargest && arr[i]!=largest){
                secLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secLargest);

    }
}
