package �ߺ�Ȯ��;

import java.util.*;

// ���� => nlogn
class Main {
	public char solution(int n, int[] arr) {
		char answer = 'U';
		
		// ������������ ����
		Arrays.sort(arr);
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i + 1]) return 'D';
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		System.out.print(T.solution(n, arr));
	}

}
