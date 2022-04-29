package 나무자르기_2805;

import java.util.*;
import java.io.*;

class Main {
	public boolean determination(int n, int m, int[] arr, int h) {
		long sum = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] > h) {
				sum += arr[i] - h;
			}
		}
		return sum >= m;
	}
	
	public long solution(int n, int m, int[] arr) {
		long answer = 0;
		
		Arrays.sort(arr);
		
		int lt = 0;
		int rt = 2000000000;
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(determination(n, m, arr, mid)) {
				answer = mid;
				lt = mid + 1;
			}
			else {
				rt = mid - 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		int[] arr = new int[n];
		str = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(str.nextToken());
		
		System.out.print(T.solution(n, m, arr));
	}

}
