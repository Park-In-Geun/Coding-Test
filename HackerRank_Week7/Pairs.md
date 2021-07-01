<a> 문제 : https://www.hackerrank.com/challenges/pairs/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search (Difficulty : Medium) </a>

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
    // Write your code here
        int answer = 0;
        
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0 ; i < arr.size(); i++){
            hash.add(arr.get(i));
        }
        
        for(int i : hash){
            if(hash.contains(i+k)){
                answer++;
            }
        }
        
        
        
        /*
        Collections.sort(arr);
        int k1 = 0;
        int k2 = 1;
        int answer = 0;
        
        while(true){
            if((arr.get(k2) - arr.get(k1)) == k){
                answer++;
            }
            else{
                k2++;
            }
            if(k2 == arr.size()){
                k1++;
                k2 = k1 + 1;
            }
            
            if(k1 == arr.size()-1){
                break;
            }
            
        }*/
        
        return answer;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```
