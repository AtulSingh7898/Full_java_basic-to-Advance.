// package zArray_Question40_java;

public class FindDuplicate {
    public static void main(String[] main){
        int num[] = {1,2,2};
        int duplicate = 0;
        

        for(int i = num.length-1; i >= 0;i--){
            for(int j = 0; j < i; j++){
                if(num[i] == num[j]){
                    duplicate = num[i];
                    break;
                }
            }
        }

        // int i = 0;
        // int j = num.length-1;
        // while(i < j){
        //     if(num[i] == num[j]){
        //         duplicate = num[i];
        //         j--;
        //     }
        //     i++;
            
        // }
        System.out.println("The duplicate is "+duplicate);
    }
    
}
