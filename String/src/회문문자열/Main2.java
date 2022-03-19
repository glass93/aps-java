package 회문문자열;

import java.util.*;

// StringBuilder를 사용해서 풀이

class Main2 {
	public String solution(String str) {
		String answer = "YES";
		String tmp = new StringBuilder(str).reverse().toString();	// 문자열을 뒤집는다
		
		if(!str.equalsIgnoreCase(tmp)) answer = "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}

}
