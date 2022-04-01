package 이진트리순회;

// DFS: Depth-First-Search
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
	public void DFS(Node root) {
		if(root == null) return;	// 말단 노드일 때
		else {
			System.out.print(root.data + " ");	// 전위순회
			DFS(root.lt);
//			System.out.print(root.data + " ");	// 중위순회
			DFS(root.rt);
//			System.out.print(root.data + " ");	// 후위순회

		}
	}
	
	public static void main(String[] args) {
		Main tree = new Main();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}

}

// 전위순회: 부모 - 왼쪽 자식 - 오른쪽 자식
// 중위순회: 왼쪽 자식 - 부모 - 오른쪽 자식
// 후위순회: 왼쪽 자식 - 오른쪽 자식 - 부모