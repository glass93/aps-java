package ¹ÙµÏÀÌ½ÂÂ÷;

import java.util.*;

// DFS
class Main {
	static int answer = 0;
	static int n;
	static int[] ch;
	static int[] arr;
	static int c;
	
	public void DFS(int L) {
		if(L == n) {
			int sum = 0;
			for(int i = 0; i < n; i++) {
				if(ch[i] == 1) sum += arr[i]; 
			}
			if(answer < sum && sum < c) answer = sum;
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
		c = kb.nextInt();
		n = kb.nextInt();
		ch = new int[n];
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		T.DFS(0);
		System.out.println(answer);
	}
}
