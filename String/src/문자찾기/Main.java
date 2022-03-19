package 문자찾기;

import java.util.*;

class Main {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();	// 문자열을 대문자로 변경
		t = Character.toUpperCase(t);	// 문자를 대문자로 변경
		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == t) {
//				answer++;
//			}
//		}
		
		// 향상된 for문 사용
		// str.toCharArray() : String으로 문자배열객체를 생성
		for (char x : str.toCharArray()) {
			if (x == t) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();		// 문자열 입력받기
		char c = kb.next().charAt(0);		// 문자 입력받기
		System.out.print(T.solution(str, c));
	}
}
