package 유효한팰린드롬;

import java.util.*;

// replaceAll 정규식이용

class Main {
	public String solution(String str) {
		String answer= "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); // ^A-Z: A부터 Z까지가 아니면
		
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) answer = "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}
