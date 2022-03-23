package 최대매출;

import java.util.*;

// sliding window
class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		
		int maxSum = 0;
		
		for(int i = 0; i < k; i++) {
			maxSum += arr[i];
		}
		int tmp = maxSum;
		for(int i = k; i < n; i++) {
			tmp = tmp + arr[i] - arr[i - k];
			if(tmp > maxSum) {
				maxSum = tmp;
			}
		}
		
		answer = maxSum;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}
