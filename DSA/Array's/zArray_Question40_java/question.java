// package zArray_Question40_java;
// second largest number in array
public class question{
    public static int secondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            }
            // (num > second && num != first)
            else if(first > num && num > second){
                second = num;
            }
        }
        return second;
    }

    public static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int num : nums){
            if(num > first){
                third = second;
                second = first;
                first = num;
                
                
            }
            else if(first > num && num > second){
                third = second;
                second = num;
                
            }else if(second>num && num > third){
                third = num;
            }
        }
        return third != Integer.MIN_VALUE ? (int)third: (int)first;
    }

    public static void main(String args[]){

        int[] arr = {1,12,34,54,40,20};
        int arr1 = secondLargest(arr);
        System.out.println("The seconde larges element in arr: "+arr1);

        int thirdmax = thirdMax(arr);
        System.out.println("the third maximum number is "+thirdmax);

    }
}