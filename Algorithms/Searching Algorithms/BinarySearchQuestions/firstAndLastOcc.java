package BinarySearchQuestions;

public class firstAndLastOcc {

    public static int firstOcc(int arr[], int size, int k){
        int s = 0, e = size-1;
        int mid = s + (e-s)/2;
        int ans = -1;

        while (s <= e) {
            if(arr[mid] == k) {
                ans = mid;
                e = mid-1;
            } else if(arr[mid] > k) {
                e = mid - 1;
            } else if (arr[mid] < k) {
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    public static int lastOcc(int arr[], int size, int k){
        int s = 0, e = size-1;
        int mid = s + (e-s)/2;
        int ans = -1;

        while (s <= e) {
            if(arr[mid] == k) {
                ans = mid;
                s = mid+1;
            } else if(arr[mid] > k) {
                e = mid - 1;
            } else if (arr[mid] < k) {
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 8, 10};
        System.out.println("First occurence of 2 is at index " + firstOcc(arr, arr.length, 2));
        System.out.println("Last occurrence of 2 is at index " + lastOcc(arr, arr.length, 2));
    }
}