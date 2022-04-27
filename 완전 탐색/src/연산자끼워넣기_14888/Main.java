package �����ڳ����ֱ�_14888;

import java.util.*;

class Main {
	static int n, max, min;
	static int[] nums, operators, order;
	
	// �ϼ��� �Ŀ� �°� ����� �ؼ� ���信 �����ϴ� �۾�
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
	
	// order[1 ... N-1]�� �����ڵ��� ������� ����
	public void rec_func(int L) {
		if(L == n) {	// ��� �����ڵ��� ���� �����ϴ� ����� ã�� ����
			// �ϼ��� �Ŀ� �°� ����� �ؼ� ���信 �����ϴ� �۾�
			int value = calculator();
			max = Math.max(max, value);
			min = Math.min(min, value);
		}
		else {	// L ��° �����ڴ� ������ ������ ���ΰ�
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
