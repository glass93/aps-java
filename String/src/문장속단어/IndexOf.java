package ����Ӵܾ�;

import java.util.*;

class IndexOf {
	public String solution(String str) {
		String answer = "";
		
		int m = Integer.MIN_VALUE, pos;	// ����ȿ��� �ܾ�� �ܾ���̿� �����ϴ� ���鹮���� �ε��� ��ġ�� �����ϱ� ���� ����
		
		while((pos = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);
		}
		if(str.length() > m) answer = str;
		
		return answer;
	}
	
	public static void main(String[] args) {
		IndexOf T = new IndexOf();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();	// ���ڸ� �Է¹ޱ� ���� nextLine()
		System.out.print(T.solution(str));
	}

}
