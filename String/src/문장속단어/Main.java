package 문장속단어;

import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "";
		
		int m = Integer.MIN_VALUE;	// 가장 작은 값으로 초기화
		
		String[] s = str.split(" ");	// 띄어쓰기로 구분해서 String배열 생성

		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();	// 문자를 입력받기 위해 nextLine()
		System.out.print(T.solution(str));
	}

}
