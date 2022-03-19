package 숫자만추출;

import java.util.*;

// 아스키 코드 사용. int 형에 더 해나가기
class Main2 {
	public int solution(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(48 <= x && x <= 57) {
				answer = answer * 10 + (x - 48);
			}
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
