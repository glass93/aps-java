package 피보나치;

import java.util.*;

// 메모이제이션
class Main2 {
	static int[] fibo;
	public int DFS(int n) {
		if(n == 1) return fibo[n] = 1;
		else if(n == 2) return fibo[n] = 1;
		else return fibo[n] = DFS(n - 2) + DFS(n - 1);
	}
	
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		fibo = new int[n + 1];
		T.DFS(n);
		for(int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
	}

}
