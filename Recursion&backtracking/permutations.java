class Solution {
    List<List<Integer>> list=new ArrayList<>();
    int[] nums;
    boolean vis[];

    public void backtrack(int ind,List<Integer> current){
        if(current.size()==nums.length){
            list.add(new ArrayList<>(current));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(vis[i]) continue;

            vis[i]=true;
            current.add(nums[i]);

            backtrack((i+1)%nums.length,current);

            current.remove(current.size()-1);
            vis[i]=false;
        }
    }

    public List<List<Integer>> permute(int[] nums){
        this.nums=nums;
        vis=new boolean[nums.length];
        backtrack(0,new ArrayList<>());
        return list;
    }
}