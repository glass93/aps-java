package �Ҽ�;

import java.util.*;

// �����佺�׳׽� ü
class Main {
	public int solution(int n) {
		int answer = 0;
		int[] num = new int[n+1];	// n�� �ε������� �ʿ�
		
		for(int i = 2; i < n + 1; i++) {
			if(num[i] == 0) {
				answer++;
				for(int j = i; j < n + 1; j+=i) {
					num[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}

}
