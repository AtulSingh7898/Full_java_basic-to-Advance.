public class zPractice {
    public static void trianglePattern2(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");

        trianglePattern2(n-1);

    }
    public static void trianglePattern(int n, int st){
        if(st>=n) return;
        trianglePattern2(n-st);
        System.out.println();

        trianglePattern(n, st+1);
    }
    public static void main(String[] args) {
        trianglePattern(5,1);
    }
    
}
