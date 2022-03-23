package 학급회장;

import java.util.*;

class Main {
	public char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();	// HashMap 객체 생성
		
		// map.put('A', 3);		'A'키에 3 벨류를 넣기
		// map.get(x) x키의 벨류를 가져옴
		// map.getOrDefault(x, 0) x키의 벨류가 없으면 0을 리턴 !중요!
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		// System.out.println(map.containsKey('A'));
		// map.containsKey('A') A라는 키가 존재하는지 확인 true false
		// System.out.println(map.size());
		// map.size(); key의 개수를 알려줌
		// System.out.println(map.remove('A'));
		// map.remove('A');	'A' 키 제거. 벨류를 반환
		
		// map.keySet() 존재하는 key를 모두 탐색
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			// System.out.println(key + " " + map.get(key));
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.print(T.solution(n, str));
	}
}
