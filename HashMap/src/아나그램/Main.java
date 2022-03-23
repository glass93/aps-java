package 아나그램;

import java.util.*;

class Main {
	public String solution(String a, String b) {
		String answer = "YES";
//		if(a.length() != b.length()) {
//			answer = "NO";
//			return answer;
//		}
		
		HashMap<Character, Integer> aMap = new HashMap<>();
		HashMap<Character, Integer> bMap = new HashMap<>();
		for(char x : a.toCharArray()) {
			aMap.put(x, aMap.getOrDefault(x, 0) + 1);
		}
		for(char x : b.toCharArray()) {
			bMap.put(x, bMap.getOrDefault(x, 0) + 1);
		}
		for(char key : aMap.keySet()) {
			if(aMap.get(key) != bMap.get(key)) {
				answer = "NO";
				return answer;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.print(T.solution(a, b));
	}

}
