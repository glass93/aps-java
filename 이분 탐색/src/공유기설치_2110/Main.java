package 공유기설치_2110;

import java.util.*;
import java.io.*;

class Main {
	public int count(int[] arr, int dist) {
		int cnt = 1;
		int ep = arr[0];	// end point
		for(int i = 1; i < arr.length; i++) {
			if((arr[i] - ep) >= dist) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr);
		
		int lt = 0;
		int rt = arr[n - 1];
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(arr, mid) >= m) {
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
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.print(T.solution(n, m, arr));
	}
}
