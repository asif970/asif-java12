//find prime number from range 2 to 20
public class prime_range_func {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
               System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String aergs[]) {
       primeinRange(20);
    }
}