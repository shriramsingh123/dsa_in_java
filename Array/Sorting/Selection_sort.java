import java.util.Arrays;

public class Selection_sort {
    
    public static void main(String[] args) {
        
        int[] arr ={-7,-20,4,5,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Terminated successfully");
    }

    static void selection(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaning array and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);

            // swapping 
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[last];
            arr[last]=temp;
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

}
