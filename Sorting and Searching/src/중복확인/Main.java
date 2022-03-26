package 중복확인;

import java.util.*;

// 정렬 => nlogn
class Main {
	public char solution(int n, int[] arr) {
		char answer = 'U';
		
		// 오름차순으로 정렬
		Arrays.sort(arr);
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i + 1]) return 'D';
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.print(T.solution(n, arr));
	}

}
