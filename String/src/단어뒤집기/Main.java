package 단어뒤집기;

import java.util.*;

class Main {
	public String[] solution(String[] str, int n) {
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			String tmp = "";
			for(int j = str[i].length() - 1; j > -1; j--) {
				tmp += str[i].charAt(j);
			}
			answer[i] = tmp;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for(String s : T.solution(str, n)) {
			System.out.println(s);
		}
	}
}
