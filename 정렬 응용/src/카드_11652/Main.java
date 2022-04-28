package ī��_11652;

import java.util.*;

class Main {
	public long solution(int n, long[] arr) {
		// arr �����ϱ�
		Arrays.sort(arr);
		
		// mode: �ֺ�
		// modeCnt: �ֺ��� ���� Ƚ��
		// curCnt: ���� ���� ���� Ƚ��
		long mode = arr[0];
		int modeCnt = 1, curCnt = 1;
		
		for(int i = 1; i < n; i++) {
			if(arr[i] == arr[i - 1]) {
				curCnt++;
			}
			else {
				curCnt = 1;
			}
			if(modeCnt < curCnt) {
				mode = arr[i];
				modeCnt = curCnt;
			}
		}
		
		return mode;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		long[] arr = new long[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextLong();

		if(n == 1) System.out.print(arr[0]);
		else {
			System.out.print(T.solution(n, arr));			
		}
	}

}
