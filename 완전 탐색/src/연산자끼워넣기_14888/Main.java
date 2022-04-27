package 연산자끼워넣기_14888;

import java.util.*;

class Main {
	static int n, max, min;
	static int[] nums, operators, order;
	
	// 완성된 식에 맞게 계산을 해서 정답에 갱신하는 작업
	public int calculator() {
		// nums, order
		int value = nums[1];
		for(int i = 1; i <= n - 1; i++) {
			// value order[i] nums[i+1]
			if(order[i] == 1)
				value = value + nums[i+1];
			if(order[i] == 2)
				value = value - nums[i+1];
			if(order[i] == 3)
				value = value * nums[i+1];
			if(order[i] == 4)
				value = value / nums[i+1];
			
		}
		return value;
	}
	
	// order[1 ... N-1]에 연산자들이 순서대로 저장
	public void rec_func(int L) {
		if(L == n) {	// 모든 연산자들을 전부 나열하는 방법을 찾은 상태
			// 완성된 식에 맞게 계산을 해서 정답에 갱신하는 작업
			int value = calculator();
			max = Math.max(max, value);
			min = Math.min(min, value);
		}
		else {	// L 번째 연산자는 무엇을 선택할 것인가
			for(int cand = 1; cand <= 4; cand++) {
				if(operators[cand] >= 1) {
					operators[cand]--;
					order[L] = cand;
					rec_func(L+1);
					operators[cand]++;
					order[L] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		nums = new int[n + 1];
		operators = new int[5];
		order = new int[n + 1];
		for(int i = 1; i <= n; i++) nums[i] = kb.nextInt();
		for(int i = 1; i <= 4; i++) operators[i] = kb.nextInt();
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		T.rec_func(1);
		System.out.println(max);
		System.out.println(min);
		
		
		
	}

}
