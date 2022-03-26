package 이분검색;

import java.util.*;

class Main {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		// 오름차순 정렬
		Arrays.sort(arr);
		
		int lt = 0;
		int rt = n - 1;
		while(lt <= rt) {	// 조건 확실하게 외우기
			int mid = (lt + rt) / 2;
			if(arr[mid] == m) {
				answer = mid + 1;
				break;
			}
			if(arr[mid] > m) rt = mid - 1;
			else lt = mid + 1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.print(T.solution(n, m, arr));
	}

}
