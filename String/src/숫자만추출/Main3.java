package 숫자만추출;

import java.util.*;

// parseInt를 사용해서 계산
class Main3 {
	public int solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		
		return Integer.parseInt(answer);
	}
	

	public static void main(String[] args) {
		Main3 T = new Main3();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
