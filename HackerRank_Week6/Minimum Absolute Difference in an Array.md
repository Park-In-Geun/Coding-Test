<a> 문제 : https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms </a>

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
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) {
    // Write your code here
        
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        int temp_min = 0;
        
        for(int i = 0 ; i < arr.size()-1; i++){
            temp_min = Math.abs(arr.get(i) - arr.get(i+1));
            if(min >= temp_min){
                min = temp_min;
            }
        }
        return min;
        
        /*
        int min = Math.abs(arr.get(0) - arr.get(1));
        int temp_min = 0;
        int k = 1;
        int i = 0;
        
        while(true){
            temp_min = Math.abs(arr.get(i) - arr.get(k));
            if(min >= temp_min){
                min = temp_min;
            }
            k++;
            if(k == arr.size()){
                i++;
                k = i+1;
            }
            if(i == arr.size()-1){
                break;
            }
        }
        
        return min;*/
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


```
