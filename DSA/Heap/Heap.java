package Heap;
//Heap(Implementing Max Heap)

public class Heap {
    private int[] arr;
    private int size;

    public Heap() {
        arr = new int[100];
        arr[0] = -1;
        size = 0;
    }

    public void insert(int val) {
        size = size + 1;
        int index = size;
        arr[index] = val;
        while (index > 1) {
            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                swap(arr, parent, index);
                index = parent;
            } else {
                return;

            }

        }

    }

    public void delete() {
        if (size == 0) {
            System.out.println("Heap is Empty");
            return;
        }
        int deleteValue = arr[1];
        arr[1] = arr[size];
        size--;
        heapify(arr, size, 1);
        System.out.println("Deleted Element is : " + deleteValue);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;

        if (left <= n && arr[largest] < arr[left]) {
            largest = left;

        }
        if (right <= n && arr[largest] < arr[right]) {
            largest = right;

        }
        if (largest != i) {
            swap(arr, largest, i);
            heapify(arr, n, largest);

        }

    }

    public static void heapSort(int[] arr, int n) {
        int size = n;
        while (size > 1) {
            swap(arr, size, 1);
            size--;
            heapify(arr, size, 1);

        }

    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);
        h.insert(51);
        h.print();

        System.out.println();

        int[] arr = { -1, 65, 43, 23, 78, 68, 90, 24, 6, 34 };
        int n = 9;
        for (int i = n / 2; i > 0; i--) {
            heapify(arr, n, i);

        }
        System.out.println("Array is :");
        for (int i = 1; i <=n; i++) {
            System.out.print(arr[i]+" ");
            
        }

        System.out.println();
        heapSort(arr, n);

        System.out.println("Sorted Array is :");
        for (int i = 1; i <=n; i++) {
            System.out.print(arr[i]+" ");
            
        }

        System.out.println();
        
        h.delete();
        h.print();

        

    }

}