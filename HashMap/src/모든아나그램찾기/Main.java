package 모든아나그램찾기;

import java.util.*;

class Main {
	public int solution(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> AM = new HashMap<>();
		HashMap<Character, Integer> BM = new HashMap<>();
		for(char x : t.toCharArray()) {
			AM.put(x, AM.getOrDefault(x, 0) + 1);
		}
		for(int i = 0; i < t.length() - 1; i++) {
			BM.put(s.charAt(i), BM.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		int lt = 0;
		for(int rt = t.length() - 1; rt < s.length(); rt++) {
			BM.put(s.charAt(rt), BM.getOrDefault(s.charAt(rt), 0) + 1);
			if(AM.equals(BM)) answer++;
			BM.put(s.charAt(lt), BM.get(s.charAt(lt)) - 1);
			if(BM.get(s.charAt(lt)) == 0) BM.remove(s.charAt(lt));
			lt++;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		String t = kb.next();
		System.out.print(T.solution(s, t));
	}

}
