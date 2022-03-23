package K번째큰수;

import java.util.*;

// TreeSet : 증복제거 위해서
class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		// 내림차순으로 자동정렬한 TreeSet 객체 생성
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		// 3중 for문으로 경우의 수 TreeSet에 넣기
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt = 0;
		// Tset.remove(143); 143값을 제거
		// Tset.size();	원소의 개수 반환
		// Tset.first();	맨 앞의 원소 반환
		// Tset.last();	맨 뒤 원소 반환
		for(int x : Tset) {
			cnt++;
			if(cnt == k) return x;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}

}
