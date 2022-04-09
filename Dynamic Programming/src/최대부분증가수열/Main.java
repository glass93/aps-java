package 최대부분증가수열;

import java.util.*;

// LIS
class Main {
	static int[] dy;
	
	public int solution(int n, int[] arr) {
		int answer = 0;
		
		dy[1] = 1;
		for(int i = 2; i <= n; i++) {
			int tmp = 1;
			for(int j = 1; j < i; j++) {
				if(arr[i] > arr[j]) {
					tmp = Math.max(tmp, dy[j] + 1);
				}
			}
			dy[i] = tmp;
		}
		
		for(int i = 1; i <= n; i++) {
			answer = Math.max(answer, dy[i]);
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = kb.nextInt();
		}
		dy = new int[n + 1];
		System.out.print(T.solution(n, arr));
	}
}
