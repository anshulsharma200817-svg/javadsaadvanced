class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int assigned=0;
            Arrays.sort(g);
            Arrays.sort(s);
            int i=0;
            int j=0;
            while(i<g.length&&j<s.length) {
                if(s[j] >= g[i]) {
                    assigned++;
                    i++;
                    j++;
                }
              else if(g[i]>s[j]) {
                j++;
              }
            }
        
    return assigned;}
}
public class assigncookies {
    public static void main(String[] args) {
        int[] g={1,2,3,5,6,7};
        int[] s={2,3,4,5,6};

        int  z=findContentChildren(int[] g, int[] s) 
         System.out.println(z);
    }
}