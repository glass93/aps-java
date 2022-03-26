package 뮤직비디오;

import java.util.*;

// 결정 알고리즘
class Main {
	public int count(int[] arr, int capacity) {
		int cnt = 1;	// cnt: dvd 수
		int sum = 0;	// sum: dvd에 담는 곡 수
		for(int x : arr) {
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			}
			else sum += x;
		}
		
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		// 큰 데이터에서 최댓값 구할 때 stream 사용
		int lt = Arrays.stream(arr).max().getAsInt();	// 배열에서 최댓값 구하기
		int rt = Arrays.stream(arr).sum();	// 배열 값 구하기 sum()은 int로 반환

		// 이분검색
		while(lt <= rt) {
			int mid = (lt + rt) / 2;	// mid: dvd 한 장의 용량
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			}
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
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}

}
