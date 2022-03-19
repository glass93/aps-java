package 숫자만추출;

import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(!Character.isAlphabetic(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		
		while(answer.charAt(0) == '0') {
			answer = answer.substring(1);
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
