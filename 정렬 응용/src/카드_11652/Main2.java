package Ä«µå_11652;

import java.util.*;

class Main2 {
	public long solution(int n, long[] arr) {
		long answer = 0;
		
		Arrays.sort(arr);
		long card = arr[0];
		int cnt = 1;
		int maxCnt = Integer.MIN_VALUE; 
		for(int i = 1; i < n; i++) {
			if(arr[i] == card) {
				cnt++;
			}
			else {
				if(maxCnt < cnt) {
					answer = card;
					maxCnt = cnt;
				}
				
				cnt = 1;
				card = arr[i];
			}
		}
		
		if(maxCnt < cnt) answer = card;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
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
