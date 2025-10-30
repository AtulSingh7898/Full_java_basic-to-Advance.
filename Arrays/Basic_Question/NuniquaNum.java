package Basic_Question;
import java.util.Arrays;

public class NuniquaNum{

    static int[] uniqueNumber(int n){
        int[] result = new int[n];
        int i = 0;
        int j = n-1;
        int start = 1;
        while (i < j) {
            result[i] = +start;
            result[j] = -start;
            start++;
            i++;
            j--;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] result = uniqueNumber(n);
        System.out.println(Arrays.toString(result));
    }
}