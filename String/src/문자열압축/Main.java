package 문자열압축;

import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "";
		answer += str.charAt(0);
		int count = 1;
		
		for(int i = 1; i < str.length(); i++) {
			if(answer.charAt(answer.length() - 1) != str.charAt(i)) {
				if(count != 1) {
					answer += count;
					answer += str.charAt(i);
					count = 1;
				} else {
					answer += str.charAt(i);
				}
				
			} else {
				count += 1;
			}
		}
		
		answer += count;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
