package 돌다리건너기;

import java.util.*;

class Main {
	static int[] dy;
	
	public int solution(int n) {
		dy[1] = 2;
		dy[2] = 3;
		for(int i = 3; i <= n; i++) {
			dy[i] = dy[i - 1] + dy[i - 2];
		}
		
		return dy[n];
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int[n + 1];
		System.out.print(T.solution(n));
	}

}
