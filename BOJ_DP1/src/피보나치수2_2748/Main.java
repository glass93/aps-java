package 피보나치수2_2748;

import java.util.*;

// long형으로 해야 90일 때 성공
public class Main {
    public long solution(int n) {
        long[] dy = new long[n + 1];
        dy[0] = 0;
        if(n == 0) return dy[0];
        dy[1] = 1;
        for(int i = 2; i <= n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        return dy[n];
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}