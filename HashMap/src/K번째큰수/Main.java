package K��°ū��;

import java.util.*;

// TreeSet : �������� ���ؼ�
class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		// ������������ �ڵ������� TreeSet ��ü ����
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		// 3�� for������ ����� �� TreeSet�� �ֱ�
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int l = j + 1; l < n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt = 0;
		// Tset.remove(143); 143���� ����
		// Tset.size();	������ ���� ��ȯ
		// Tset.first();	�� ���� ���� ��ȯ
		// Tset.last();	�� �� ���� ��ȯ
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
