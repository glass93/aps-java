package ╬охё;

import java.util.*;

class Main {
	public String solution(String str, int n) {
		String answer = "";
		str = str.replace("#", "1");
		str = str.replace("*", "0");
		
		for(int i = 0; i < str.length(); i+=7) {
			String tmp = str.substring(i, i+7);
			answer += (char)(Integer.parseInt(tmp, 2));
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.print(T.solution(str, n));
	}

}
