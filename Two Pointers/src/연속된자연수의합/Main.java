package 연속된자연수의합;

import java.util.*;

class Main {
	public int solution(int n) {
		int answer = 0;
		int sum = 1;
		int lt = 1;
		for(int rt = 2; rt <= (n / 2) + 1; rt++) {
			sum += rt;
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= lt++;
				if(sum == n) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}

}
