package Sorting.selectionSort;

// time complexity :- O(n^2);

//  Selection Sort
public class Main {

    private static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;

                }

            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }

    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 6, 4, 7, 8, 1, 3 };
        selectionSort(nums);
        System.out.println("Sorted Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");

        }
    }
}