package ��������;

import java.util.*;

// ���� �˰���
class Main {
	public int count(int[] arr, int capacity) {
		int cnt = 1;	// cnt: dvd ��
		int sum = 0;	// sum: dvd�� ��� �� ��
		for(int x : arr) {
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			}
			else sum += x;
		}
		
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		// ū �����Ϳ��� �ִ� ���� �� stream ���
		int lt = Arrays.stream(arr).max().getAsInt();	// �迭���� �ִ� ���ϱ�
		int rt = Arrays.stream(arr).sum();	// �迭 �� ���ϱ� sum()�� int�� ��ȯ

		// �̺а˻�
		while(lt <= rt) {
			int mid = (lt + rt) / 2;	// mid: dvd �� ���� �뷮
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			}
			else lt = mid + 1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}

}
