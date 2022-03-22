package 뒤집는소수;

import java.util.*;

class Main {
	public ArrayList<Integer> solution(int[] num, int n) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int tmp = num[i];
			int reverseNum = 0;
			while(tmp != 0) {
				reverseNum = (reverseNum * 10) + (tmp % 10);
				tmp /= 10;
			}
			num[i] = reverseNum;
		}
		
		int max = num[0];
		
		for(int i = 1; i < n; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		
		int[] count = new int[max + 1];
		count[0] = 1;
		count[1] = 1;
		
		for(int i = 2; i < max + 1; i++) {
			if(count[i] == 0) {
				for(int j = i + i; j < max + 1; j += i) {
					count[j] = 1;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(count[num[i]] == 0) {
				answer.add(num[i]);
			}
		}
	
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = kb.nextInt();
		}
		for(int x : T.solution(num, n)) {
			System.out.print(x + " ");
		}
	}

}
