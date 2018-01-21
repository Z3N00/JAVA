package lecture17;

import java.lang.reflect.Array;

public class BinarySearchTree {

	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	 Node root;
	 int size;

	public BinarySearchTree() {
		this.root = null;
		this.size = 0;
	}
	BinarySearchTree(int... sortedArray){
	this.root=	this.construct(sortedArray,0,sortedArray.length);
	}
	private Node construct(int[] sortedArray,int si,int li){
		int mid=(si+li)/2;
		Node node=new Node(sortedArray[mid],si,li);
		
		
		
		
		
		
	}

	private void add( Node node, int data) {
		if(node.data>data){
			if(node.left==null){
				node.left= new Node(data,null,null);
				this.size++;
			}else{
				add(node.left,data);
			}
		}if(node.data<data){
			if(node.right==null){
				node.right=new Node(data,null,null);
				this.size++;
			}else{
				add( node.right, data);
			}
			
		}

	}
	public void  add(int data){
		if(this.root==null){
			this.root= new Node(data,null,null);
			
		}else{
			add(root, data);
		}
	}
	public void display(){
		this.display(root);
	}
	
	private void display(Node node){
		if(node.left!=null){
			System.out.print(node.left.data+"=>");
		}else{
			System.out.print("END=>");
		}
		System.out.print(node.data);
		if(node.right!=null){
			System.out.print("<="+node.right.data);
		}else{
			System.out.print("<=END");
		}
		System.out.println();
		if(node.left!=null){
			this.display(node.left);
		}
		if(node.right!=null){
			this.display(node.right);
		}
	}
	public int max(){
	return	this.max(root);
	}
	private int max(Node node){
		int rv=node.data;
		if(node.right!=null){
			rv=this.max(node.right);
		}
		return rv;
	}
	public int min(){
return this.min(root);
	}
	private int min(Node node){
		int rv=node.data;
		if(node.left!=null){
			rv=this.min(node.left);
		}
		return rv;
	}
	public void remove(int data){
		this.remove(data);
	}
	private Node remove(int data,Node node){
		if(data<node.data){
			if(node.left!=null){
				if(data==node.data){
					
				}
			}
		}
	}
	
}
