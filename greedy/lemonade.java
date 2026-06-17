class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count10=0;
        int count5=0;
        int count20=0;
        for(int i=0;i<bills.length;i++) {
            if(bills[i]==5) count5++;
            else if(bills[i]==10) {
            count10++;
            if(count5>0) {
            count5--;
            }
            else {
                return false;
            }
            }
            else if(bills[i]==20) {
                if(count5>0&&count10>0) {
                count5--;
                count10--;
                }
                else if(count5>=3) {
                    count5=count5-3;
                }
                else {
                    return false;
                }
            }

        }
        
  return true;  }
}
public class lemonade {
    public static void main(String[] args) {
        int[] bills={5,5,5,5,10.10,20};
        boolean z=lemonadechange(bills);
        System.out.println(z);
    }
}