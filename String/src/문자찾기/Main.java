package ����ã��;

import java.util.*;

class Main {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();	// ���ڿ��� �빮�ڷ� ����
		t = Character.toUpperCase(t);	// ���ڸ� �빮�ڷ� ����
		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == t) {
//				answer++;
//			}
//		}
		
		// ���� for�� ���
		// str.toCharArray() : String���� ���ڹ迭��ü�� ����
		for (char x : str.toCharArray()) {
			if (x == t) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();		// ���ڿ� �Է¹ޱ�
		char c = kb.next().charAt(0);		// ���� �Է¹ޱ�
		System.out.print(T.solution(str, c));
	}
}
