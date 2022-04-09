package 가장높은탑쌓기;

import java.util.*;

class Brick implements Comparable<Brick> {
	int underside, height, weight;
	
	public Brick(int underside, int height, int weight) {
		this.underside = underside;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Brick ob) {
		return ob.underside - this.underside;
	}
	
	
}

class Main {
	static int n;
	static ArrayList<Brick> arr = new ArrayList<>();
	static int[] dy;
	
	public int solution(int n, ArrayList<Brick> arr) {	
		Collections.sort(arr);
		
		int answer = arr.get(0).height;
		
		dy[0] = arr.get(0).height;
		for(int i = 1; i < n; i++) {
			int tmp = arr.get(i).height;
			dy[i] = arr.get(i).height;
			for(int j = 0; j < i; j++) {
				if(arr.get(j).weight > arr.get(i).weight) {
					tmp = Math.max(tmp, dy[j] + arr.get(i).height);
				}
			}
			dy[i] = tmp;
			answer = Math.max(answer, dy[i]);
		}
		
		for(Brick ob : arr) {
			System.out.println(ob.underside + " " + ob.height + " " + ob.weight);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		for(int i = 0; i < n; i++) {
			int u = kb.nextInt();
			int h = kb.nextInt();
			int w = kb.nextInt();
			arr.add(new Brick(u, h, w));
		}
		dy = new int[n];
		System.out.print(T.solution(n, arr));
		
	}

}
