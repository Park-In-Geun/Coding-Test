<a> 문제 : https://www.hackerrank.com/challenges/candies/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dynamic-programming </a>

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
     * Complete the 'candies' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static long candies(int n, List<Integer> arr) {
    // Write your code here
        long answer = 0;
        int[] candylist = new int[arr.size()];
        
        candylist[0] = 1;
        
        for(int i = 1 ; i < arr.size(); i++){
            candylist[i] = 1;
            if(arr.get(i) > arr.get(i-1)){
                candylist[i] = candylist[i-1] + 1;
            }
        }
 
        for(int i = arr.size() - 1; i > 0; i--){
            if(arr.get(i) < arr.get(i-1)){
                candylist[i - 1] = Math.max(candylist[i - 1], candylist[i] + 1);
            }
        }
        
        for(int i = 0 ; i < candylist.length;i++){
            System.out.print(candylist[i] + " ");
            answer += candylist[i];
        }
        
        
        /*
        int temp = 0;
        int candy = 0;
        
        ArrayList<Integer> candylist = new ArrayList<>();
        
        temp = Math.max(arr.get(0), arr.get(1));
        if(temp <= arr.get(0)){
            candylist.add(2);
        }
        else{
            candylist.add(1);
        }
        
        
        for(int i = 1 ; i < arr.size(); i++){
            temp = Math.min(arr.get(i), arr.get(i-1));
            if(temp >= arr.get(i)){
                if(i == arr.size() - 1 || candylist.get(i-1) == 1){
                    candylist.add(1);
                }
                else if(candylist.get(i-1) != 2){
                    if(arr.get(i) <= arr.get(i+1)){
                        candylist.add(1);
                    }
                    else{
                        candylist.add(2);
                    }
                }
                else{
                    candylist.add(candylist.get(i-1) - 1);
                }
                
            }
            else{
                candylist.add(candylist.get(i-1) + 1);
            }
            
        }
        */
        
        return answer;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


```
