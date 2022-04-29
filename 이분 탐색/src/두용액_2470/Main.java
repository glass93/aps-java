package µÎ¿ë¾×_2470;

import java.util.*;
import java.io.*;

class Main {
	public void solution(int n, int[] arr) {
		int answer1 = 0;
		int answer2 = 0;
		
		Arrays.sort(arr);
		int best_sum = Integer.MAX_VALUE;
		
		for(int i = 0; i < n - 1; i++) {
			int lt = i + 1;
			int rt = n - 1;
			int reverse_value = -arr[i];
			
			int tmp = n - 1;
			while(lt <= rt) {
				int m = (lt + rt) / 2;
				if(arr[m] >= reverse_value) {
					tmp = m;
					rt = m - 1;
				}
				else {
					lt = m + 1;
				}
			}
			
			if(i < tmp - 1 && Math.abs(arr[i] + arr[tmp - 1]) < best_sum) {
				best_sum = Math.abs(arr[i] + arr[tmp - 1]);
				answer1 = arr[i];
				answer2 = arr[tmp - 1];
			}
			
			if(tmp < n && Math.abs(arr[i] + arr[tmp]) < best_sum) {
				best_sum = Math.abs(arr[i] + arr[tmp]);
				answer1 = arr[i];
				answer2 = arr[tmp];
			}
		}
		
		System.out.print(answer1 + " " + answer2);
	}
	
	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(str.nextToken());
		int[] arr = new int[n];
		str = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(str.nextToken());
		
		T.solution(n, arr);
	}

}
