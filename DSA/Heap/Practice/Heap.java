package Heap.Practice;

// Heap(Implementation of max heap)

public class Heap {
    public int arr[];
    public int size;

    public Heap(){
        arr = new int[100];
        arr[0] =-1;
        size = 0;
    }

    public void insertAtHeap(int val){
        size = size+1;
        int index = size;
        arr[index] = val;

        while(index>1){
            int parant = index/2;
            if(arr[parant]<arr[index]){
                swap(arr, parant, index);
                index = parant;
            }else{
                return;
            }
        }
    }
    public void delete(){
        if(size ==0){
            System.out.println("Heap Is Empty");
            return;
        }
        int deletValue=arr[1];
        arr[1] = arr[size];
        size--;
        heapify(arr,size,1);
        System.out.println("arr Delete value is a "+deletValue);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =  temp;
    }

    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i;
        int right = 2*i+1;

        if(left<=n && arr[largest]<arr[left]){
            swap(arr, largest, left);
        }
        if(right<=n && arr[largest]<arr[right]){
            swap(arr, largest, right);
        }
        if(largest!=i){
            swap(arr, i, largest);
            heapify(arr, largest, n);
        }
    }

    public static void heapSort(int[] arr, int n){
        int size=n;
        if(size>1){
            swap(arr, size, 1);
            size--;
            heapSort(arr, n);
        }
    }

    public void print(){
        for(int i = 1; i <= size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Heap h = new Heap();
        h.insertAtHeap(40);
        h.insertAtHeap(50);
        h.insertAtHeap(55);
        h.insertAtHeap(30);
        h.insertAtHeap(24);
        h.insertAtHeap(28);
        h.insertAtHeap(20);
        h.print();

        int[] arr = {-1,40,80,20,78,44,21,52,54,6};
        int n = 9;
        for(int i = n/2; i>0; i--){
            heapify(arr, n, i);
        }

        for(int i=0; i<=n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        heapSort(arr, n);
        System.out.println("the sorted arr is ");
        for(int i = 0; i <= n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        h.delete();
        h.print();
    }
}


