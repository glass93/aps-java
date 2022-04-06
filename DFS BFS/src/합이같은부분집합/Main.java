package 합이같은부분집합;

import java.util.*;

// DFS : 아마존 인터뷰
class Main {
	static int n;
	static int[] ch;
	static int[] arr;
	static String answer = "NO";

	public void DFS(int L) {
		if(L == n) {
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 0; i < n; i++) {
				if(ch[i] == 1) sum1 += arr[i];
				else sum2 += arr[i];
			}
			if(sum1 == sum2) {
				answer = "YES";
			}
			
		}
		else {
			ch[L] = 1;
			DFS(L + 1);
			ch[L] = 0;
			DFS(L + 1);
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ch = new int[n];
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0);
		System.out.println(answer);
	}
}
