package 크레인인형뽑기;

import java.util.*;

// 카카오
class Main {
	public int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[j][moves[i] - 1] != 0) {
					if(stack.isEmpty()) {
						stack.push(board[j][moves[i] - 1]);
					}
					else {
						if(stack.get(stack.size() - 1) == board[j][moves[i] - 1]) {
							stack.pop();
							answer += 2;
						}
						else {
							stack.push(board[j][moves[i] - 1]);
						}
					}
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		// 1 5 3 5 1 2 1 4
		// 4 3 1 1 3 2 - 4
		return answer;
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int[] moves = new int[m];
		for(int i = 0; i < m; i++) {
			moves[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, board, m, moves));
	}

}
