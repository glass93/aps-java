package ��ҹ��ں�ȯ;

import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "";
		
		// �ƽ�Ű �빮�� 65 ~ 90
		// �ҹ��� 97 ~ 122
		// ���� 32
		for(char x : str.toCharArray()) {
			if(97<=x && x<=122) {	// �ҹ��ڸ�
				answer += (char)(x-32);
			}
			else {
				answer += (char)(x+32);
			}
		}
		
		// Character.isLowerCase(x) : x�� �ҹ��ڸ� true�� ����
//		for(char x : str.toCharArray()) {
//			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//			else answer += Character.toLowerCase(x);
//		}
		
//		for (char x : str.toCharArray()) {
//			if ('a' <= x && x <= 'z') {
//				answer += Character.toUpperCase(x);
//			}
//			else {
//				answer += Character.toLowerCase(x);
//			}
//		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}

}
