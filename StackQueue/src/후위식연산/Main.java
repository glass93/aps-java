package 후위식연산;

import java.util.*;

// postfix
class Main {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(stack.isEmpty()) stack.push((int)x - 48);
			else {
				if(x < 48 || x > 57) {
					int rt = stack.pop();
					int lt = stack.pop();
					if(x == '+') stack.push(lt + rt);
					else if(x == '-') stack.push(lt - rt);
					else if(x == '*') stack.push(lt * rt);
					else {
						stack.push(lt / rt);
					}
				}
				else stack.push((int)x - 48);
			}
		}
		

		
		answer = stack.peek();

		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}

}
