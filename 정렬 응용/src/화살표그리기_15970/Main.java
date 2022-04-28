package 화살표그리기_15970;

import java.util.*;

class Point implements Comparable<Point> {
	public int point, color;
	
	public Point(int point, int color) {
		this.point = point;
		this.color = color;
	}
	
	public int compareTo(Point o) {
		if(this.color != o.color) return this.color - o.color;
		return this.point - o.point;
	}
}

class Main {
	static ArrayList<Point> arr = new ArrayList<>();
	
	public int solution(int n) {
		int answer = 0;
		
		Collections.sort(arr);
		
		answer += arr.get(1).point - arr.get(0).point;
		answer += arr.get(arr.size() - 1).point - arr.get(arr.size() - 2).point;
		
		for(int i = 1; i < arr.size() - 1; i++) {
			if(arr.get(i).color != arr.get(i + 1).color) {
				answer += arr.get(i).point - arr.get(i - 1).point;
			}
			else if(arr.get(i).color != arr.get(i - 1).color) {
				answer += arr.get(i + 1).point - arr.get(i).point;
			}
			else {
				int before = arr.get(i).point - arr.get(i - 1).point;
				int next = arr.get(i + 1).point - arr.get(i).point;
				answer += Math.min(before, next);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int i = 0; i < n; i++) {
			int point = kb.nextInt();
			int color = kb.nextInt();
			arr.add(new Point(point, color));
		}
		if(n == 2) {
			int answer = (arr.get(1).point - arr.get(0).point) * 2;
		}
		System.out.print(T.solution(n));
	}
}
