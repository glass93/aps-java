package 교육과정설계;

import java.util.*;

class Main {
	public String solution(String a, String b) {
		String answer = "YES";
		
		Queue<Character> Qa = new LinkedList<>();
		Queue<Character> Qb = new LinkedList<>();
		for(char x : a.toCharArray()) Qa.offer(x);
		for(char x : b.toCharArray()) Qb.offer(x);
		
		while(!Qa.isEmpty()) {
			if(Qa.peek() != Qb.peek()) {
				if(Qa.contains(Qb.peek())) {
					return "NO";
				}
				else {
					if(Qa.size() == 1 && Qb.size() == 1) return "NO";
					Qb.poll();
				}
			}
			else {
				Qa.poll();
				Qb.poll();
			}
		}


		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.print(T.solution(a, b));
	}

}