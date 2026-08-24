package filehandlingdata;

public class BinarySearch {

    public static void binarySearch(int nums[], int start, int end, int target) {

        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("The index is: " + ans);
    }

    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};

        int key = 30;

        int last = arr.length - 1;

        binarySearch(arr, 0, last, key);
    }
}