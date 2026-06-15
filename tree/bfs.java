import java.util.*
import java.util.Scanner;
public class bfs {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int edge=n-1;
ArrayList<Integer<ArrayList<Integer>> arr =new ArrayList<>();
for(int i=0;i<n;i++){
    arr.add(new ArrayList<Integer>());
}
for(int i=0;i<edges;i++) {
    u=sc.nextInt();
    v=sc.nextInt();
    arr.get(u).add(v);
    arr.get(v).add(u);
}
for(int i=0;i<n;i++) {
    System.out.println(arr.get(i));
}
System.out.println();
    }
}