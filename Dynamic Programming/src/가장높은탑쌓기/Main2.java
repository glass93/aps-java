package 가장높은탑쌓기;

import java.util.*;

class B implements Comparable<B> {
	public int s, h, w;
	
	B(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}
	
	@Override
	public int compareTo(B o) {
		return o.s - this.s;	// 내림차순
	}
}

class Main2 {
	static int[] dy;
	
	public int solution(ArrayList<B> arr) {
		int answer = 0;
		
		Collections.sort(arr);
		
		dy[0] = arr.get(0).h;
		answer = dy[0];
		
		for(int i = 1; i < arr.size(); i++) {
			int max_h = 0;
			for(int j = i - 1; j >= 0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
					max_h = dy[j];
				}
			}
			dy[i] = max_h + arr.get(i).h;
			answer = Math.max(answer, dy[i]);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<B> arr = new ArrayList<>();
		dy = new int[n];
		for(int i = 0; i < n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new B(a, b, c));
		}
		System.out.print(T.solution(arr));
	}
}
