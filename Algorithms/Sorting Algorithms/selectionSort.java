import java.util.Arrays;
public class selectionSort {

    public static void sort(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            int minIdx = i;
            
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 9, 1, 4, 2};
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}