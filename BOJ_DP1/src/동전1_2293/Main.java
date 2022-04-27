package µ¿Àü1_2293;

import java.util.*;

public class Main {
	public int solution(int n, int k, int[] arr) {
		int[] dy = new int[k + 1];
		
//		for(int i = 0; i < n; i++) {
//			dy[arr[i]] += 1;
//			for(int j = arr[i] + 1; j <= k; j++) {
//				dy[j] = dy[j] + dy[j - arr[i]];
//			}
//		}

		for(int i = 0; i < n; i++) {
//			dy[arr[i]] += 1;
			for(int j = arr[i]; j <= k; j++) {
				if(arr[i] == j) dy[arr[i]] += 1;
				dy[j] = dy[j] + dy[j - arr[i]];
			}
		}
		
		return dy[k];
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.print(T.solution(n, k, arr));
	}

}
