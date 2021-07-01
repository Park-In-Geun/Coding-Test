<a> 문제 : https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings </a>

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
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
    // Write your code here

        HashMap<Character, Integer> count_char = new HashMap<>();
        
        for(char ch_a : a.toCharArray()){
            if(count_char.containsKey(ch_a)){
                int value = count_char.get(ch_a);
                value += 1;
                count_char.put(ch_a, value);
            }
            else{
               count_char.put(ch_a,1);
            }
        }
        
        for(char ch_b : b.toCharArray()){
            if(count_char.containsKey(ch_b)){
                int value = count_char.get(ch_b);
                value -= 1;
                count_char.put(ch_b, value);
            }
            else{
                count_char.put(ch_b,-1);
            }
        }
        List<Integer> values = new ArrayList<>(count_char.values());
        int answer = 0;
        
        for(Integer i : values){
            answer += Math.abs(i);
        }
        
        return answer;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```
