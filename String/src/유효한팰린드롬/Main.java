package ��ȿ���Ӹ����;

import java.util.*;

// replaceAll ���Խ��̿�

class Main {
	public String solution(String str) {
		String answer= "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); // ^A-Z: A���� Z������ �ƴϸ�
		
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) answer = "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}
