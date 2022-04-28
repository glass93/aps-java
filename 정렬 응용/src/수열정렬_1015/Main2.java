package 수열정렬_1015;

import java.util.*;

class Elem implements Comparable<Elem> {
	// idx A 배열의 idx 위치를 기억하는 변수
	// num A[idx]의 원래 값
	public int num, idx;
	
	public Elem(int num, int idx) {
		this.num = num;
		this.idx = idx;
	}
	
	@Override
	public int compareTo(Elem o) {
		// 정렬 조건에 맞게 정렬하기
		// 1. num의 비내림차순
		// 2. num이 값으면 idx 오름차순
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
