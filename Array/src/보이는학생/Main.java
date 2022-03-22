package 보이는학생;

import java.util.*;

class Main {
	public int solution(int[] arr, int n) {
		int answer = 0;
		
		int min_height = 0;
		
		for(int x : arr) {
			if(x > min_height) {
				answer++;
				min_height = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(arr, n));
	}
}
