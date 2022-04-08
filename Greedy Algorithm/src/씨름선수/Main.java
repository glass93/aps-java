package ¾¾¸§¼±¼ö;

import java.util.*;

class Person {
	public int height, weight;
	
	Person(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
}
class Main {
	public int solution(int n, ArrayList<Person> arr) {
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			int h = arr.get(i).height;
			int w = arr.get(i).weight;
			boolean flag = true;
			for(int j = 0; j < n; j++) {
				if(arr.get(j).height > h && arr.get(j).weight > w) flag = false;
			}
			if(flag) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		ArrayList<Person> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int height = kb.nextInt();
			int weight = kb.nextInt();
			arr.add(new Person(height, weight));
		}
		System.out.print(T.solution(n, arr));
	}

}
