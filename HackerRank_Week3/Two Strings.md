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
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
    // Write your code here
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arrCh1 = s1.toCharArray();
        char[] arrCh2 = s2.toCharArray();
        String re = null;
        
        for(char a1 : arrCh1){
            if(map.containsKey(a1)){
                int value = map.get(a1);
                value +=1;
                map.put(a1,value);
            }
            else
                map.put(a1,1);
        }
        
        for(char a2 : arrCh2){
            if(map.containsKey(a2)){
                re = "YES";
                break;
            }
            else re = "NO";
        }
        return re;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Result.twoStrings(s1, s2);

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



/* first wrong cord 
HashMap<Character,Integer> map = new HashMap<>();
        char[] arrCh1 = s1.toCharArray();
        char[] arrCh2 = s2.toCharArray();
        
        for(char a1 : arrCh1){
            if(map.containsKey(a1)){
                int value = map.get(a1);
                value +=1;
                map.put(a1,value);
            }
            else
                map.put(a1,1);
        }
        
        for(char a2 : arrCh2){
            if(map.containsKey(a2)){
                int value = map.get(a2);
                if(map.get(a2) == 1){
                    map.remove(a2);
                }
                else{
                    value -= 1;
                    map.put(a2,value);
                }
            }
        }
        if(!map.isEmpty()){
            return "YES";
        }
        else return "NO";

*/

/* second wrong cord 
ArrayList arrList1 = new ArrayList();
        ArrayList arrList2 = new ArrayList();
        for(int i = 0 ; i < s1.length(); i++){
            arrList1.add(s1.charAt(i));
        }
        for(int i = 0 ; i < s2.length(); i++){
            arrList2.add(s2.charAt(i));
        }
                
        arrList2.retainAll(arrList1);
        if(!arrList2.isEmpty()){
            return "YES";
        }
        else    
            return "NO";
*/

```
