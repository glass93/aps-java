package °áÈ¥½Ä;

import java.util.*;

class Schedule implements Comparable<Schedule> {
	public int time;
	public char state;
	
	Schedule(int time, char state) {
		this.time = time;
		this.state = state;
	}
	
	@Override
	public int compareTo(Schedule o) {
		if(this.time == o.time) return this.state - o.state;
		else return this.time - o.time;
	}
}

class Main {
	public int solution(int n, ArrayList<Schedule> arr) {
		int answer = 0;
		int cnt = 0;
		
		Collections.sort(arr);
		
		// for(Schedule ob : arr) {
		// }
		
		for(int i = 0; i < n * 2; i++) {
			if(arr.get(i).state == 'e') cnt--;
			else if(arr.get(i).state == 's') cnt++;
			answer = Math.max(answer, cnt);
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Schedule> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int s = kb.nextInt();
			int e = kb.nextInt();
			arr.add(new Schedule(s, 's'));
			arr.add(new Schedule(e, 'e'));
		}
		System.out.print(T.solution(n, arr));
		
	}

}
