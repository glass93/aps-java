package 최대수입스케쥴;

import java.util.*;

// PriorityQueue 응용문제
class Lecture implements Comparable<Lecture> {
	public int money;
	public int date;
	
	Lecture(int money, int date) {
		this.money = money;
		this.date = date;
	}
	
	@Override
	public int compareTo(Lecture ob) {
		//
		return ob.date - this.date;	// 날짜로 내림차순
	}
}
class Main {
	static int n;
	static int max = Integer.MIN_VALUE;

	public int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		// 큰 값을 우선순위 큐로 만들기
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		
		Collections.sort(arr);	// 날짜로 내림차순
		
		int j = 0;
		for(int i = max; i >= 1; i--) {
			for( ; j < n; j++) {
				if(arr.get(j).date < i) break;
				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int m = kb.nextInt();
			int d = kb.nextInt();
			arr.add(new Lecture(m, d));
			if(d > max) max = d;
		}
		System.out.print(T.solution(arr));
		
	}

}
