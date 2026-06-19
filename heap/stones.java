import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++) {
           p.add(stones[i]);
        }
        while(true) {
             if(p.size()==1) {
                return p.poll();
            }
            int a=p.poll();
            int b=p.poll();
            if(a==b) {
                p.add(0);
            }
            else if(a>b) {
                p.add(a-b);

            }
            else if(b>a) {
                p.add(b-a);
            }
            

        }
        
    }
}
class stones {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] stones = {2, 7, 4, 1, 8, 1};
        int result = sol.lastStoneWeight(stones);
        System.out.println("The last stone weight is: " + result);
    }
}