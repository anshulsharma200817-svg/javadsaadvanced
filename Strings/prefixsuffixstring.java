import java.util.Scanner;

public class prefixsuffixstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        boolean prefix = true;
        boolean suffix = true;
        for (int i = 0; i < n; i++) {
            if (s[i] != t[i]) {
                prefix = false;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (s[i] != t[m - n + i]) {
                suffix = false;
                break;               
              
            }        }
        if (prefix && suffix) {
            System.out.println(0);
         }  else if (prefix) {
            System.out.println(1);
           } 
           else if (suffix) {
            System.out.println(2);
           } else
           {
            System.out.println(3);
        }
    }
}