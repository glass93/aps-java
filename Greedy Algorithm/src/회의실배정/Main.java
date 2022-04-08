package 회의실배정;

import java.util.*;

// 빨리 끝나는 순으로 정렬
class Time implements Comparable<Time> {
	public int s, e;
	
	Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
}

class Main {
	public int solution(int n, ArrayList<Time> arr) {
		int cnt = 0;
		Collections.sort(arr);
		int et = 0;
		for(Time ob : arr) {
			if(ob.s >= et) {
				cnt++;
				et = ob.e;
			}
		}
		return cnt;


// 시간초과나는 코드
//		int answer = 0;
//		
//		Collections.sort(arr);
//		
//		for(int i = 0; i < n; i++) {
//			int e = arr.get(i).e;
//			int cnt = 1;
//			for(int j = i + 1; j < n; j++) {
//				if(arr.get(j).s >= e) {
//					cnt++;
//					e = arr.get(j).e;
//				}
//			}
//			answer = Math.max(answer, cnt);
//		}
//		
//		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			arr.add(new Time(s, e));
		}
		System.out.print(T.solution(n, arr));
	}

}
