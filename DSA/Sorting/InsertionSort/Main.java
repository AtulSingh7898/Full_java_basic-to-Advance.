package Sorting.InsertionSort;


//  Insertion Sort
public class Main {

    private static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;

            }
            nums[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 6, 4, 7, 8, 1, 3 };
        insertionSort(nums);
        System.out.println("Sorted Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");

        }
    }
}