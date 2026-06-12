/*ou are given a string 
S consisting of lowercase English letters. Remove all occurrences of the most frequent character(s) in 
S, then output the remaining characters concatenated in their original order.*/
import java.util.*;
public class mostfreqchar {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          String s=sc.next();
        char[] arr=s.toCharArray();
         int n=arr.length;
         HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                char c=arr[i];
                map.put(c,map.getOrDefault(c,0)+1);
            }       
            int maxFreq=0;
            for(char c:map.keySet()){
                maxFreq=Math.max(maxFreq,map.get(c));
                           }   
             StringBuilder result = new StringBuilder();
            for(int i=0;i<n;i++){
                if(map.get(arr[i]) != maxFreq){
                    result.append(arr[i]);
                    }
                   }
            System.out.println(result.toString());
          }
   }