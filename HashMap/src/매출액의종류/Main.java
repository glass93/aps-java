package 매출액의종류;

import java.util.*;

class Main {
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		answer.add(map.size());
		
		int lt = 0, rt = k;
		while(rt < n) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			map.put(arr[lt], map.get(arr[lt]) - 1);
			if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
			answer.add(map.size());
//			System.out.println(map.size());
			rt++;
			lt++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
	}
	
}
