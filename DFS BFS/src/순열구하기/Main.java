package 순열구하기;

import java.util.*;

class Main {
	static int n, m;
	static int[] pm, ch, arr;	// ch: 체크해야해서 n개
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) {	// 사용되지 않은 경우
					ch[i] = 1;	// 체크
					pm[L] = arr[i];	// 사용
					DFS(L + 1);
					ch[i] = 0;	//체크 해제
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
	}

}
