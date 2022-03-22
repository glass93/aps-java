package 등수구하기;

import java.util.*;

class Main {
	public int[] solution(int n, int[] scores) {
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) {
			int count = 1;
			for(int j = 0; j < n; j++) {
				if(scores[j] > scores[i]) {
					count++;
				}
				answer[i] = count;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] scores = new int[n];
		for(int i = 0; i < n; i++) {
			scores[i] = kb.nextInt();
		}
		for(int x : T.solution(n, scores)) {
			System.out.print(x + " ");
		}
	}

}
