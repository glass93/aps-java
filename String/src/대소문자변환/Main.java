package 대소문자변환;

import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "";
		
		// 아스키 대문자 65 ~ 90
		// 소문자 97 ~ 122
		// 차이 32
		for(char x : str.toCharArray()) {
			if(97<=x && x<=122) {	// 소문자면
				answer += (char)(x-32);
			}
			else {
				answer += (char)(x+32);
			}
		}
		
		// Character.isLowerCase(x) : x가 소문자면 true가 리턴
//		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//			else answer += Character.toLowerCase(x);
//		}
		
//		for (char x : str.toCharArray()) {
//			if ('a' <= x && x <= 'z') {
//				answer += Character.toUpperCase(x);
//			}
//			else {
//				answer += Character.toLowerCase(x);
//			}
//		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}

}
