public class Main {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }

        }
        return -1;

    }

    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;

        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;

        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, right, target);

        } else {
            return binarySearchRecursive(arr, left, mid - 1, target);

        }
    }

}