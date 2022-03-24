package 쇠막대기;

import java.util.*;

class Main {
	public int solution(String str) {
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(stack.isEmpty()) stack.push(str.charAt(i));
			else {
				if(str.charAt(i) == ')') {
					if(str.charAt(i - 1) == '(') {
						stack.pop();
						answer += stack.size();
					}
					else {
						answer += 1;	// 이걸 생각 못함
						stack.pop();
					}
				}
				else stack.push(str.charAt(i));
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
