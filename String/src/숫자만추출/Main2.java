package ���ڸ�����;

import java.util.*;

// �ƽ�Ű �ڵ� ���. int ���� �� �س�����
class Main2 {
	public int solution(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(48 <= x && x <= 57) {
				answer = answer * 10 + (x - 48);
			}
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
