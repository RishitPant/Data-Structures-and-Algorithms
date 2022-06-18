public class Linear_Search {

    static boolean found = false;

    public static void linearSearch(int arr[], int key) {

        for(int i=0; i < arr.length; i++) {
            if(arr[i] == key) {
                found = true;
                System.out.println("Found " + arr[i] + " at index " + i);
                break;
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {3, 6, 1, 8, 4};
        linearSearch(arr, 8);

        if(found == false) {
            System.out.println("Not found");
        }
    }
}