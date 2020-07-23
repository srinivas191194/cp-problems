
class Node {
	public int value;
	public Node left, right;
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {
	public Node root;
	
	public BinaryTree(int value) {
		// Your code goes here
		 root = new Node(value);
	}

	public boolean search(int value) {
		// Your code goes here
		if(search_Node(root,value))
			  return true;
		else  
		      return false;	  
	}

	private boolean search_Node(Node node, int value) {
		// Your code goes here
		if(node == null)
			return false;
		if(node.value == value)
            return true;
		return (search_Node(node.left,value) || search_Node(node.right,value));

	}
	public static void main(String[] args){
		BinaryTree s = new BinaryTree(1);
     	s.root.left = new Node(2);
    	s.root.right = new Node(3);
   	    s.root.left.left = new Node(4);
   	    s.root.left.right = new Node(5);
   	System.out.println(s.search(4));
   	System.out.println(s.search(6));
	}
}