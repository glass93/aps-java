package 씨름선수;

import java.util.*;

// 좌표 정렬을 더 연습하고 푸는 게 좋음
class Body implements Comparable<Body> {
	public int h, w;
	
	Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	
	@Override
	public int compareTo(Body o) {
		return o.h - this.h;	// 키를 내림차순 되도록
	}
}
class Main2 {
	public int solution(ArrayList<Body> arr, int n) {
		int cnt = 0;
		
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for(Body ob : arr) {
			if(ob.w > max) {
				max = ob.w;
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr.add(new Body(h, w));
		}
		System.out.print(T.solution(arr, n));
	}

}


 

// 키를 기준으로 정렬하고
// 몸무게를 기준으로 for문을 돌리면 o(n)으로 해결 가능
// greedy 현재 최선의 선택을 하는 것