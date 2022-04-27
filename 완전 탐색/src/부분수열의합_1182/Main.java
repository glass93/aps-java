package 부분수열의합_1182;

import java.util.*;

class Main {
	static int n, s, answer = 0;
	static int[] arr;
	
	// k번째 원소를 포함시킬지 정하는 함수
	// value:= k - 1 번째 원소까지 골라진 원소들의 합
	public void rec_func(int L, int value) {
		if(L == n + 1) {	// 부분 수열 하나 완성 시킨 상태
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
		if(s == 0) answer--;	// 목표하는 수가 0인 경우 공집합을 제외해야한다
		System.out.print(answer);
	}

}
