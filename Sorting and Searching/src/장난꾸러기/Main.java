package 장난꾸러기;

import java.util.*;

class Main {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[2];
		
		int tmp = 0;
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] > arr[i + 1]) tmp = i + 1;
		}
		answer[1] = tmp + 1;
		
		for(int i = 0; i < n - 1; i++) {
			if(arr[tmp] < arr[i + 1]) {
				tmp = i + 1;
				break;
			}
		}
		

		answer[0] = tmp + 1;
		
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
