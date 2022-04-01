package Tree말단노드까지의가장짧은경로DFS;

import java.util.*;

// DFS
// 최단 거리는 BFS가 맞지만 자식 노드가 이진트리로 둘 다 있을 때는 DFS도 가능
class Node {
	int data;
	Node lt, rt;
	
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}
class Main {
	Node root;
	public int DFS(int L, Node root) {	// L: 레벨
		if(root.lt == null && root.rt == null) return L;
		else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
	}
	
	public static void main(String[] args) {
		Main tree = new Main();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(0, tree.root));
	}

}
