<a> 문제 :https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting (Difficulty : Medium) </a>

```java

/*
참고 사이트 : https://manorgass.tistory.com/60

비교기(Comparator)

--규칙 3가지-- 
1. 기준이 되는 데이터가 비교하는 데이터보다 클 경우 양수를 리턴
2. 기준이 되는 데이터가 비교하는 데이터보다 작을 경우 음수를 리턴
3. 기준이 되는 데이터가 비교하는 데이터와 같을 경우 0을 리턴

*/

import java.util.*;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}




class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
        
        if(a.score == b.score) return a.name.compareTo(b.name);
        else if(a.score < b.score) return 1;
        else return -1;
        
    }
}


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

```
