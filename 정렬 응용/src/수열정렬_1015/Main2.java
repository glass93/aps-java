package ��������_1015;

import java.util.*;

class Elem implements Comparable<Elem> {
	// idx A �迭�� idx ��ġ�� ����ϴ� ����
	// num A[idx]�� ���� ��
	public int num, idx;
	
	public Elem(int num, int idx) {
		this.num = num;
		this.idx = idx;
	}
	
	@Override
	public int compareTo(Elem o) {
		// ���� ���ǿ� �°� �����ϱ�
		// 1. num�� �񳻸�����
		// 2. num�� ������ idx ��������
		if(this.num != o.num) return this.num - o.num;
		return this.idx - o.idx;
	}
 
}

class Main2 {
	static ArrayList<Elem> arr = new ArrayList<>();
	
	public int[] solution(int n) {
		int[] answer = new int[n];
		
		Collections.sort(arr);
		for(int i = 0; i < n; i++) {
			answer[arr.get(i).idx] = i;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int i = 0; i < n; i++) {
			int tmp = kb.nextInt();
			arr.add(new Elem(tmp, i));
		}
		for(int x : T.solution(n)) System.out.print(x + " ");
	}

}
