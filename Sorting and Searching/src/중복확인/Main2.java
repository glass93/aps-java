package 중복확인;

import java.util.*;

// HashMap 사용 => n
class Main2 {
	public char solution(int n, int[] arr) {
		char answer = 'U';
		
		HashMap<Integer, Integer> HM = new HashMap<>();
		for(int x : arr) {
			if(HM.getOrDefault(x, 0) == 1) {
				return 'D';
			}
			else {
				HM.put(x, HM.getOrDefault(x, 0) + 1);
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.print(T.solution(n, arr));
	}

}
