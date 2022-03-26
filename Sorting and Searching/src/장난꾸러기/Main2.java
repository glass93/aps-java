package 장난꾸러기;

import java.util.*;

// 정렬, 깊은 복사를 통한 풀이
class Main2 {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 깊은 복사 => tmp를 정렬해도 arr은 그대로
		int[] tmp = arr.clone();
		Arrays.sort(tmp);	// tmp를 정렬
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != tmp[i]) answer.add(i + 1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}

}
