package BinarySearch.java;

class versionControll{
    public static boolean isBadVersion(int n){
        if(n == 1) return true;
        return false;
    }
}

public class BadVersion extends versionControll {
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left <= right){
            int mid = left+(right-left)/2;
            boolean result = isBadVersion(mid);
            if(result == true){
                right =  mid-1;
            }else {
                left = mid+1;
            }
        }
       return left;
    }

    public static void main(String[] args){
        int n = 5;
        int result = firstBadVersion(n);
        System.out.println(result);
    }
}
