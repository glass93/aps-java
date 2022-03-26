package 좌표정렬;

import java.util.*;

// compareTo
// 좌표를 저장하는 클래스를 만듬
// Point라는 객체를 정렬하는 클래스
class Point implements Comparable<Point> {
	public int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// compareTo 오버라이딩
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y - o.y;	// 음수 값이 return 되어야 this o 순서로 정렬됨
		else return this.x - o.x;
	}
}

class Main2 {
	
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Point(x, y));
		}
		// 오버라이드 한 정렬 기준으로 정렬해줌
		Collections.sort(arr);
		for(Point o : arr) System.out.println(o.x + " " + o.y);
	}

}
