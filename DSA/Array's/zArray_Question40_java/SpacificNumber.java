// Find All Pairs in an Array That Sum Up to a Specific Number
//  Input: ([1, 2, 3, 4, 5], 6)
//  Output: [(1, 5), (2,4)]

public class SpacificNumber{
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        
        int i = 0;
        int j = num.length-1;

        while(i < j){
            if(num[i]+num[j] == 6){
                System.out.println("("+num[i]+","+num[j]+")");
            }
            i++;
            j--;
        }
    }
}