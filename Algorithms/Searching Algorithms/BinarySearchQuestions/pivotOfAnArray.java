package BinarySearchQuestions;

public class pivotOfAnArray {

    public static int findPivot(int arr[], int k) {
        int s = 0;
        int e = arr.length-1;
        int mid = s + (e-s)/2;

        while(s<e) {
            if(arr[mid] >= arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = {7, 9, 1, 2, 3};
        System.out.println(findPivot(arr, 5));
    }
}