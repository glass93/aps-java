package 가위바위보;

import java.util.*;

class Main {
	public char[] solution(int[] a, int[] b, int n) {
		char[] answer = new char[n];
		
		for(int i = 0; i < n; i++) {
			if(a[i] == 1) {
				if(b[i] == 2) {
					answer[i] = 'B';
				} else if(b[i] == 3) {
					answer[i] = 'A';
				} else {
					answer[i] = 'D';
				}
			} else if(a[i] == 2) {
				if(b[i] == 1) {
					answer[i] = 'A';
				} else if(b[i] == 2) {
					answer[i] = 'D';
				} else {
					answer[i] = 'B';
				}
			} else if(a[i] == 3) {
				if(b[i] == 1) {
					answer[i] = 'B';
				} else if(b[i] == 3) {
					answer[i] = 'D';
				} else {
					answer[i] = 'A';
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = kb.nextInt();
		}
		for(char c : T.solution(a, b, n)) {
			System.out.println(c);
		}
		
	}

}
