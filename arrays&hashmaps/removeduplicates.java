Class removeduplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,4,5,6,7,7,8};
        int n=arr.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[count]=arr[i];
                count++;
            }

        }
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*Google-Level Mental Model

When you see an array question ask:

1. Can brute force be optimized?

2. Is order important?
→ Sorting?

3. Continuous segment?
→ Sliding window / prefix sum

4. Pair problem?
→ Two pointers / hashmap

5. Range query?
→ Prefix sum

6. Optimization max/min?
→ Kadane / greedy

7. Sorted array?
→ Binary search

8. O(1) space possible?
→ In-place tricks*/