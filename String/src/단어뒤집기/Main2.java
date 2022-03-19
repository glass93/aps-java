package 단어뒤집기;

import java.util.*;

class Main2 {
	public ArrayList<String> solution(String[] str, int n) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();	// StringBuilder 문자열 객체를 사용해서 뒤집고 다시 String으로 변환
			answer.add(tmp);	// ArrayList에 추가
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
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
