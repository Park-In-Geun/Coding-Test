<a> 문제 : https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays </a>

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
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
        int sum = 0;
        int max = 0;
        int max_first = 0;
        int[][] maxarr = new int[3][3];
        
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0 ; j < arr.get(i).size(); j++){
                if(i>0 && j>0 && i<arr.size()-1 && j<arr.get(i).size()-1){
                    sum = arr.get(i-1).get(j-1) + arr.get(i-1).get(j) + arr.get(i-1).get(j+1) + arr.get(i).get(j) + arr.get(i+1).get(j-1) + arr.get(i+1).get(j) + arr.get(i+1).get(j+1);
                    if(sum>=0){
                        
                        if(max <= sum){
                        max = sum;
                        maxarr[0][0] = arr.get(i-1).get(j-1);
                        maxarr[0][1] = arr.get(i-1).get(j);
                        maxarr[0][2] = arr.get(i-1).get(j+1);
                        maxarr[1][1] = arr.get(i).get(j);
                        maxarr[2][0] = arr.get(i+1).get(j-1);
                        maxarr[2][1] = arr.get(i+1).get(j);
                        maxarr[2][2] = arr.get(i+1).get(j+1);
                        }
                    }
                    else{
                        if(max==0 && max_first == 0){
                            max=sum;
                            first = 1;
                        } 
                        if(max <= sum){
                        max = sum;
                        maxarr[0][0] = arr.get(i-1).get(j-1);
                        maxarr[0][1] = arr.get(i-1).get(j);
                        maxarr[0][2] = arr.get(i-1).get(j+1);
                        maxarr[1][1] = arr.get(i).get(j);
                        maxarr[2][0] = arr.get(i+1).get(j-1);
                        maxarr[2][1] = arr.get(i+1).get(j);
                        maxarr[2][2] = arr.get(i+1).get(j+1);
                        } 
                    }
            }
        }

    }
    for(int i=0;i<maxarr.length;i++){
        System.out.println(Arrays.toString(maxarr[i]));
    }
    
    
    return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```
