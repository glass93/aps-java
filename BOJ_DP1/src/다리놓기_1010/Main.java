package 다리놓기_1010;

import java.util.*;

class Bridge {
	int n, m;
	
	public Bridge(int n, int m) {
		this.n = n;
		this.m = m;
	}
}

public class Main {
	public int solution(int n, int m) {
		int[] dy = new int[m + 1];
		
		dy[n] = 1;
		
		if(n == m) return dy[n];
		
		for(int i = n + 1; i <= m; i++) {
			dy[i] = dy[i - 1] * (i) / (i - n);
		}
		
		return dy[m];
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int tc = kb.nextInt();
		ArrayList<Bridge> arr = new ArrayList<>();
		for(int i = 0; i < tc; i++) {
			int n = kb.nextInt();
			int m = kb.nextInt();
			arr.add(new Bridge(n, m));
		}
		for(Bridge ob : arr) {
			System.out.println(T.solution(ob.n, ob.m));
		}
	}

}
