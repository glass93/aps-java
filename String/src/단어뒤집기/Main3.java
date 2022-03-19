package �ܾ������;

import java.util.*;

class Main3 {
	public ArrayList<String> solution(String[] str, int n) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();	// String�� char �迭�� ����
			
			int lt = 0;
			int rt = x.length() - 1;
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			
			String tmp = String.valueOf(s);	// valueOf�� static �޼���
			
			answer.add(tmp);
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
		for(String x : T.solution(str, n)) {
			System.out.println(x);
		}
	}

}
