package 괄호문자제거;

import java.util.*;

class Main {
	public Stack<Character> solution(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
			}
			else {
				stack.push(x);
			}
		}
		
		return stack;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		for(char x : T.solution(str)) System.out.print(x);
	}

}
