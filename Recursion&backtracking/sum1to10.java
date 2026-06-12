public class sum1to10 {
    public static void main(String[] args) {
        int n = 10;
        int result = sum(n);
        System.out.println( result);
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + sum(n - 1);
    }
}