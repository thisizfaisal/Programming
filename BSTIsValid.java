
public class BSTIsValid {
	public static void main(String[] args) {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        Node i = new Node('I');
        Node z = new Node('Z');
        f.left = b;
        f.right = g;
        b.left = a;
        b.right = d;
        d.left = c;
        d.right = e;
        g.right = i;
        i.left = h;
        System.out.println(checkBST(f, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	
	
	static Boolean checkBST (Node root, int min, int max) {
		if(root == null)
			return true;
		if(min < root.data && root.data < max) 
			return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
		else
			return false;
	}
	
}


class Node {
    Node left;
    Node right;
    int data;
    public Node(char c) {
        this.data = c;
    }
}