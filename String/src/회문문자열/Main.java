package ȸ�����ڿ�;

import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "YES";
		
		int len = str.length();
		
		str = str.toLowerCase();
		
		for(int i = 0; i < len / 2; i++) {
			if(str.charAt(i) != str.charAt(len - 1 - i)) {
				answer = "NO";
			}
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
