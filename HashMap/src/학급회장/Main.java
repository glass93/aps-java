package �б�ȸ��;

import java.util.*;

class Main {
	public char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();	// HashMap ��ü ����
		
		// map.put('A', 3);		'A'Ű�� 3 ������ �ֱ�
		// map.get(x) xŰ�� ������ ������
		// map.getOrDefault(x, 0) xŰ�� ������ ������ 0�� ���� !�߿�!
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		// System.out.println(map.containsKey('A'));
		// map.containsKey('A') A��� Ű�� �����ϴ��� Ȯ�� true false
		// System.out.println(map.size());
		// map.size(); key�� ������ �˷���
		// System.out.println(map.remove('A'));
		// map.remove('A');	'A' Ű ����. ������ ��ȯ
		
		// map.keySet() �����ϴ� key�� ��� Ž��
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
