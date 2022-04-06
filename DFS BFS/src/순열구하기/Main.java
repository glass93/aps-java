package �������ϱ�;

import java.util.*;

class Main {
	static int n, m;
	static int[] pm, ch, arr;	// ch: üũ�ؾ��ؼ� n��
	
	public void DFS(int L) {
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) {	// ������ ���� ���
					ch[i] = 1;	// üũ
					pm[L] = arr[i];	// ���
					DFS(L + 1);
					ch[i] = 0;	//üũ ����
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
	}

}
