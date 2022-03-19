package �ܾ������;

import java.util.*;

class Main2 {
	public ArrayList<String> solution(String[] str, int n) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();	// StringBuilder ���ڿ� ��ü�� ����ؼ� ������ �ٽ� String���� ��ȯ
			answer.add(tmp);	// ArrayList�� �߰�
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		for(String s : T.solution(str, n)) {
			System.out.println(s);
		}
	}
}
