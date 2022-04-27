package 숫자1로만들기_1463;

import java.util.*;

public class Main {
	public int solution(int n) {
		int[] dy = new int[n + 1];
		
		if(n == 1) return 0;
		if(n < 4) return 1;
		
		dy[2] = 1;
		dy[3] = 1;
		
		for(int i = 4; i <= n; i++) {
			int tmp = Integer.MAX_VALUE;
			if(i % 3 == 0) tmp = Math.min(dy[i / 3], tmp);
			if(i % 2 == 0) tmp = Math.min(dy[i / 2], tmp);
			tmp = Math.min(dy[i - 1], tmp);
			dy[i] = tmp + 1;
			
		}
		
		return dy[n];
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}

}
