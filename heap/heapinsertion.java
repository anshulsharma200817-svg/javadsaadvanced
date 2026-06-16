 class maxheap {
    int arr[];
    int size;
    int capacity;
    maxheap(int c) {
        arr=new int[c];
        size=0;
        capacity=c;
    }
    int left(int i) {
        return 2*i+1;

    }
    int right(int i) {
        return 2*i+2;

    }
    int parent(int i) {
        return (i-1)/2;

    }
    public void insertion(int val) {
        arr[size++]=val;
        heapify(size-1);

    }
    public void heapify(int i) {

    while(i > 0 && arr[i] > arr[parent(i)]) {

        int temp = arr[i];
        arr[i] = arr[parent(i)];
        arr[parent(i)] = temp;

        i = parent(i);
    }
}
    public void print() {

    for(int i = 0; i < size; i++) {
        System.out.println(arr[i]);
    }
}

}
public class heapinsertion {
    public static void main(String[] args) {
        maxheap max=new maxheap(10);
        max.insertion(2);
        max.insertion(4);
        max.insertion(6);
        max.print();
    }
}