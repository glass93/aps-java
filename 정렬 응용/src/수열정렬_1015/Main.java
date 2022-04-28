package 수열정렬_1015;

import java.util.*;

class Main {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i] == arr2[j]) {
					arr2[j] = 0;
					answer[i] = j;
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}

}
