package 점수계산;

import java.util.*;

class Main {
	public int solution(int n, int[] arr) {
		int answer = 0;
		int tmp = 0;
		
		if(arr[0] == 1) {
			answer++;
			tmp++;
		}
		
		for(int i = 1; i < n; i++) {
			if(arr[i] == 1) {
				tmp++;
				answer += tmp;
			} else {
				tmp = 0;
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
		System.out.print(T.solution(n, arr));
	}

}
