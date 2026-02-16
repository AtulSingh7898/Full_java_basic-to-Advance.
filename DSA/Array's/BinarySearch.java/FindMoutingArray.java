interface MountainArray {
    public int get(int index);
    public int length();
}

class SolveFirst {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);
        int leftElement = binarySearchIncreasing(mountainArr, target, 0, peak);
        if (leftElement != -1) {
            return leftElement;
        }
        return binarySearchDecreasing(mountainArr, target, peak + 1, n - 1);

    }

    public int findPeak(MountainArray mountainArr, int n) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;

            } else {
                right = mid;
            }

        }
        return left;

    }

    private int binarySearchIncreasing(MountainArray mountainArr, int target, int left, int right) {
        while (left<=right) {
            int mid= left + (right - left) / 2;
            int value=mountainArr.get(mid);
            if (value==target) {
                return mid;
                
            }else if(value<target){
                right=mid-1;

            }else{
                left=mid+1;
            }
            
        }
        return -1;

    }

    private int binarySearchDecreasing(MountainArray mountainArr, int target, int left, int right) {
        while (left<=right) {
            int mid= left + (right - left) / 2;
            int value=mountainArr.get(mid);
            if (value==target) {
                return mid;
                
            }else if(value<target){
                left=mid+1;

            }else{
                right=mid-1;
            }
            
        }
        return -1;

    }
}
public class FindMoutingArray{
    public static void main(String[] args) {

        int[] arr = {0, 5, 3, 1};
        int target = 1;
        int[] arr2 = {1,2,3,4,5,3,1};
        int target2 = 3;
    //    @Override
        MountainArray mountainArray = new MountainArrayImpl(arr);
        MountainArray mountainArray2 = new MountainArrayImpl(arr2);
        
        SolveFirst solution = new SolveFirst();
        SolveFirst solution2 = new SolveFirst();
    
        int result = solution.findInMountainArray(target, mountainArray);
        int result2 = solution2.findInMountainArray(target2, mountainArray2);
    
        System.out.println("Index of target: " + result);
        System.out.println("Index of target2: " + result2);

    }
}