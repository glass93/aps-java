package 이곱하기엔타일링_11726;

import java.util.*;

public class Main {
	public int solution(int n) {
		int[] dy = new int[n + 1];
		if(n < 3) return n;
		
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3; i <= n; i++) {
			dy[i] = (dy[i - 1] + dy[i - 2]) % 10007;
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
