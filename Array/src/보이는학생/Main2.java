package 보이는학생;

import java.util.*;

class Main2 {
	public int solution(int[] arr, int n) {
		int answer = 1;
		int max = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(arr, n));
	}
}
