package 일이삼더하기_9095;

import java.util.*;

public class Main {
	public int solution(int n) {
		int[] dy = new int[n + 1];
		
		if(n < 4) {
			if(n == 3) return 4;
			else return n;
		}
		
		dy[1] = 1;
		dy[2] = 2;
		dy[3] = 4;
		
		for(int i = 4; i <= n; i++) {
			dy[i] = dy[i - 1] + dy[i - 2] + dy[i - 3];
		}
		
		return dy[n];
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int tc = kb.nextInt();
		int[] arr = new int[tc];
		for(int i = 0; i < tc; i++) arr[i] = kb.nextInt();
		for(int i = 0; i < tc; i++) {
			System.out.println(T.solution(arr[i]));
		}
	}
}
