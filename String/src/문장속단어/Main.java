package ����Ӵܾ�;

import java.util.*;

class Main {
	public String solution(String str) {
		String answer = "";
		
		int m = Integer.MIN_VALUE;	// ���� ���� ������ �ʱ�ȭ
		
		String[] s = str.split(" ");	// ����� �����ؼ� String�迭 ����

		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();	// ���ڸ� �Է¹ޱ� ���� nextLine()
		System.out.print(T.solution(str));
	}

}
