class Solution {
    public int maxArea(int[] height) {
    // think wrt that if between any two lines the one which is shorter will decide how area of water will be distributed so starting from leftmost and rightmost ponter if we get the small one it is sure that its ditance from largest one and ater betwenn them will me max area for that smalll one and hence we move pointer from the small one that is the idea for this question and for any case this approach works finely  *
    int r=height.length-1;
    int l=0;
    int ans=0;
    while(l<r) {
        int t=Math.min(height[l],height[r])*(r-l);
        ans=Math.max(ans,t);
        if(height[l]<height[r]) {
            l++;
        }
        else {
            r--;
        }
    } 
     

   return ans; }
}
class containerwithmostwater {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(s.maxArea(height));
    }
}