package Basic;

public class square {
     static int sum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=(i*i);
        }
        return sum;
     }
    public static void main(String args[]){
        int n = 2;
        System.out.print(sum(n));

    }
    
}
