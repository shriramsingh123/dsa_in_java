import java.util.Arrays;

class Bubble_sort{
    public static void main(String[] args) {

        int[] arr = {-5,0,-2,6,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    // Bubble Sort 
    static void bubble(int arr[]){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for(int j=1; j<arr.length-i;j++){
                // swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }

            //if you did not swap for a particular value of i,it's means the array is sorted hence break the loop
            if(!swapped){
                break;
            }

        }

    }
}