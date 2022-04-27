package µπ∞‘¿”_9655;

import java.util.*;

public class Main {
	public String solution(int n) {
		if(n % 2 == 0) return "CY";
		else return "SK";
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}

}
