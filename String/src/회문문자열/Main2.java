package ȸ�����ڿ�;

import java.util.*;

// StringBuilder�� ����ؼ� Ǯ��

class Main2 {
	public String solution(String str) {
		String answer = "YES";
		String tmp = new StringBuilder(str).reverse().toString();	// ���ڿ��� �����´�
		
		if(!str.equalsIgnoreCase(tmp)) answer = "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}

}
