// 문제 : https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.*;

public class Example2 {
	public static void main(String args[]){
		String s = "";
		long n = 0;
		
		System.out.print("\n" + repeatString(s,n));
		
		
	}
	
	public static long repeatString(String s, long n){
		
		String t = ""; //반복문자열 담을 문자열
		int c=0; //문자열이 끝났음을 알려주는 값
		long count=0; //첫번째 문자의 수
		
		Scanner key = new Scanner(System.in);
		
		for(;;){
			System.out.print("문자열 입력 : ");
			s = key.next();
			if(s.length()<1 && s.length()>100)
				continue;
			else break;
		}
		
		for(;;){
			System.out.print("문자열 반복 범위 지정 : ");
			n = key.nextLong();
			if(n<1 && n>1000000000)
				continue;
			else break;
		}
		
		
		
		for(long i=0;i<n;i++,c++){
			if(c>=s.length())
				c=0;
			t += s.charAt(c);
			
		}
		System.out.println(t);
		
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)=='a')
				count++;
		}
		
		return count;
	}
}
