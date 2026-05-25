public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int search = 30;

        int start = 0;
        int end = arr.length - 1;
        int found = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == search) {
                found = mid;
                break;
            }

            else if (arr[mid] < search) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        if (found != -1) {
            System.out.println("Element found at index: " + found);
        } else {
            System.out.println("Element not found");
        }
    }
}