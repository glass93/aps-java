package NQueen_9663;

import java.util.*;

class Main {
	static int n, ans;
	static int[] col;	// col[i] : i번 행의 퀸은 col[i]번 열에 놓았다는 기록
	
	public boolean attackable(int r1, int c1, int r2, int c2) {
		if(c1 == c2) return true;
		if(r1 - c1 == r2 - c2) return true;
		if(r1 + c1 == r2 + c2) return true;
		return false;
	}
	public boolean validity_check() {
		for(int i = 1; i <= n; i++) {
			// (i, col[i])
			for(int j = 1; j < i; j++) {
				// (j, col[j])
				if(attackable(i, col[i], j, col[j])) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void rec_func(int row) {
		if(row == n + 1) {
			ans++;
		}
		else {
			for(int c = 1; c <= n; c++) {
				boolean possible = true;
				// valid check (row, c)
				for(int i = 1; i <= row - 1; i++) {
					// (i, col[i])
					if(attackable(row, c, i, col[i])) {
						possible = false;
						break;
					}
				}
				
				if(possible) {
					col[row] = c;
					rec_func(row + 1);
					col[row] = 0;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		col = new int[n + 1];
		T.rec_func(1);
		System.out.print(ans);
	}

}
