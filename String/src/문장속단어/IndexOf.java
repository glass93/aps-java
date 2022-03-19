package 문장속단어;

import java.util.*;

class IndexOf {
	public String solution(String str) {
		String answer = "";
		
		int m = Integer.MIN_VALUE, pos;	// 문장안에서 단어와 단어사이에 존재하는 공백문자의 인덱스 위치를 저장하기 위한 변수
		
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
		String str = kb.nextLine();	// 문자를 입력받기 위해 nextLine()
		System.out.print(T.solution(str));
	}

}
