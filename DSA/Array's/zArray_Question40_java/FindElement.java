package zArray_Question40_java;

public class FindElement {
    static int findElement(int[] arr, int st,int find,int index){
        // int index = 0;
        if(st >arr.length-1) return index;
        if(arr[st] == find){
            index = st;
        }
        return findElement(arr, st+1, find,index);
    }

    public static void main(String args[]){
        int[] nums = {1, 2, 3, 4, 5};
        int x = 3;
        int found = findElement(nums, 0,x,0);
        System.out.println(x+" is found recursively in index num "+found);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x){
                System.out.print(x+" is found in indice number "+i);
            }
        }
    }
    
}
