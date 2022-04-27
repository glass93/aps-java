package ¼³ÅÁ¹è´Ş_2839;

import java.util.*;

public class Main {
	public int solution(int n) {
		int answer = 0;
		int[] dy = new int[n + 1];
		Arrays.fill(dy, 9999999);
		int[] sugar = {3, 5};
		dy[0] = 0;
		
		
		for(int i = 0; i < 2; i++) {
			for(int j = sugar[i]; j <= n; j++) {
				dy[j] = Math.min(dy[j], dy[j - sugar[i]] + 1);
			}
		}
		
		if(dy[n] == 9999999) return -1;
		else return dy[n];
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}

}
