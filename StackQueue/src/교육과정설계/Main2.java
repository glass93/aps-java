package ������������;

import java.util.*;

class Main2 {
	public String solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		for(char x : need.toCharArray()) Q.offer(x);
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) {
				if(x != Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.print(T.solution(a, b));
	}

}
