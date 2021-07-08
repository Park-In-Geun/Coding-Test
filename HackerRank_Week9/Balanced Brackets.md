<a> 문제 : https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues (Medium)</a>

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
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
        Stack<Character> bracket = new Stack<>();
        
        char[] s_copy = new char[s.length()];
        
        for(int i = 0 ; i < s.length(); i++){
            s_copy[i] = s.charAt(i);
        }
        
        s = s.replaceAll("\\(","1");
        s = s.replaceAll("\\)","1");
        s = s.replaceAll("\\{","2");
        s = s.replaceAll("\\}","2");;
        s = s.replaceAll("\\[","3");
        s = s.replaceAll("\\]","3");
        
        for(int i = 0 ; i < s.length(); i++){
            if(s_copy[i] == '(' || s_copy[i] == '{' || s_copy[i] == '['){
                bracket.push(s.charAt(i));
            }
            else{
                if(bracket.isEmpty()){
                    return "NO";
                }
                if(bracket.pop() != s.charAt(i)){
                    return "NO";
                }
            }
        }
    
        if(!bracket.isEmpty()) return "NO";
    
        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}


```
