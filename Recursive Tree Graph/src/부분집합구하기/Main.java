package 부분집합구하기;

import java.util.*;

// DFS
class Main {
	static int n;
	static int[] ch;	// 체크용 배열
	public void DFS(int L) {
		if(L == n + 1) {
			String tmp = "";
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 1) tmp += (i + " ");
			}
			if(tmp.length() > 0) System.out.println(tmp); // 공집합 제외
		}
		else {
			ch[L] = 1;	// 사용
			DFS(L + 1);
			ch[L] = 0;	// 사용취소
			DFS(L + 1);
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ch = new int[n + 1];
		T.DFS(1);
		
	}

}
