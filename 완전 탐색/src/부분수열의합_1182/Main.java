package �κм�������_1182;

import java.util.*;

class Main {
	static int n, s, answer = 0;
	static int[] arr;
	
	// k��° ���Ҹ� ���Խ�ų�� ���ϴ� �Լ�
	// value:= k - 1 ��° ���ұ��� ����� ���ҵ��� ��
	public void rec_func(int L, int value) {
		if(L == n + 1) {	// �κ� ���� �ϳ� �ϼ� ��Ų ����
			if(value == s) answer++;
		}
		else {
			rec_func(L + 1, value + arr[L]);
			rec_func(L + 1, value);
			
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		s = kb.nextInt();
		arr = new int[n + 1];
		for(int i = 1; i <= n; i++) arr[i] = kb.nextInt();
		T.rec_func(1, 0);
		if(s == 0) answer--;	// ��ǥ�ϴ� ���� 0�� ��� �������� �����ؾ��Ѵ�
		System.out.print(answer);
	}

}
