public class Binary_Search {

    public static int binarySearch(int arr[], int size, int key) {

        int start = 0, end = size - 1;

        int mid = start + (end - start)/2;

        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            mid = start + (end - start)/2;
        }
        return -1;
    }

    public static void main(String[] args) {

        int oddArr[] = { 1, 5, 6, 7, 9 };

        System.out.println("Key found at index " + binarySearch(oddArr, oddArr.length, 9));
    }
}
