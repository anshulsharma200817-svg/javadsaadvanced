class recursivebinarysearch {
    public static void main(String[] args)
    { 
        int[] arr={-15,-6,0,7,9,23,54,82,101};
        int x=23;
        int result=recursiveBinarySearch(arr, 0, arr.length - 1, x);


    }
    static int recursiveBinarySearch(int arr[], int l, int r, int x) {
        int mid=lo+((hi-lo)/2);
        if(l<=r){
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                return recursiveBinarySearch(arr, l, mid-1, x);
            }
            else{
                return recursiveBinarySearch(arr, mid+1, r, x);
            }
        }
        return -1;
    }
