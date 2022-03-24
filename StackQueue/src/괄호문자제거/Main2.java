package 괄호문자제거;

import java.util.*;

class Main2 {
	public String solution(String str) {
		String answer = "";
		
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
			}
			else stack.push(x);
		}
		for(int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
