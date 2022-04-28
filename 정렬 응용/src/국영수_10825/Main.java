package 국영수_10825;

import java.util.*;

class Person implements Comparable<Person> {
	public String name;
	public int t1, t2, t3;
	
	Person(String name, int t1, int t2, int t3) {
		this.name = name;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	
	@Override
	public int compareTo(Person o) {
		// 국어 점수 내림차순
		if(this.t1 != o.t1) return o.t1 - this.t1;
		// 영어 점수 내림차순
		if(this.t2 != o.t2) return this.t2 - o.t2;
		// 수학 점수 내림차순
		if(this.t3 != o.t3) return o.t3 - this.t3;
		return this.name.compareTo(o.name);
	}
}
class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Person> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String name = kb.next();
			int t1 = kb.nextInt();
			int t2 = kb.nextInt();
			int t3 = kb.nextInt();
			arr.add(new Person(name, t1, t2, t3));
		}
		Collections.sort(arr);
		for(Person x : arr) {
			System.out.println(x.name);
		}
	}

}
