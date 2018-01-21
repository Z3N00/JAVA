package lecture15;

import java.util.ArrayList; 
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children;

		public Node(int data) {
			this.data = data;
			children = new ArrayList<>();
		}
	}

	Node root;
	int size = 0;

	public GenericTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeinput(s, null, 0);
	}

	public Node takeinput(Scanner s, Node parent, int ithchild) {
		if (parent == null) {
			System.out.println("enter the data for root");

		} else {
			System.out.println("enter the data for " + ithchild + "child for the parent" + parent.data);
		}
		int nodedata = s.nextInt();
		Node node = new Node(nodedata);

		int numchild;
		System.out.println("enter the number of children");
		numchild = s.nextInt();
		this.size++;
		for (int i = 0; i < numchild; i++) {
			Node child = this.takeinput(s, node, i);
			node.children.add(child);
		}

		return node;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		System.out.print(node.data + "=>");

		for (int i = 0; i < node.children.size(); i++) {
			System.out.print(node.children.get(i).data + ",");

		}
		System.out.println("END");
		for (int i = 0; i < node.children.size(); i++) {
			display(node.children.get(i));

		}
	}

	public void size() {
		System.out.println(size);
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		int rv = 0;
		for (int i = 0; i < node.children.size(); i++) {
			int childsize = this.size2(node.children.get(i));
			rv = rv + childsize;
		}
		rv = rv + 1;
		return rv;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		int max = node.data;
		for (int i = 0; i < node.children.size(); i++) {
			int maxinchild = max(node.children.get(i));
			if (max < maxinchild) {
				max = maxinchild;
			}
		}

		return max;
	}

	public int height() {
		return this.height(this.root);

	}

	private int height(Node node) {
		int height = -1;
		for (int i = 0; i < node.children.size(); i++) {
			int heightofchild = this.height(node.children.get(i));
			if (heightofchild > height) {
				height = heightofchild;
			}
		}
		height = height + 1;
		return height;
	}

	public boolean find(int data) {
		return this.find(data, this.root);
	}

	private boolean find(int data, Node node) {
		if (node.data == data) {
			return true;
		}
		for (int i = 0; i < node.children.size(); i++) {
			boolean isfound = this.find(data, node.children.get(i));
			if (isfound) {
				return true;
			}
		}

		return false;
	}

	public void mirror() {
		this.mirror(this.root);
	}

	private void mirror(Node node) {
		int left = 0, right = node.children.size() - 1;
		while (left <= right) {
			Node temp = node.children.get(left);
			node.children.set(left, node.children.get(right));
			node.children.set(right, temp);
			left++;
			right--;
		}

		for (int i = 0; i < node.children.size(); i++) {
			this.mirror(node.children.get(i));
		}
	}

	public void printAtlevel(int level) {
		this.printAtLevel(level, this.root);
	}

	private void printAtLevel(int level, Node node) {
		if (level == 0) {
			System.out.println(node.data);
		}

		for (int i = 0; i < node.children.size(); i++) {
			this.printAtLevel(level - 1, node.children.get(i));
		}
	}

	public void preOrder() {
		this.preOrder(this.root);
	}

	private void preOrder(Node node) {
		System.out.println(node.data);
		for (int i = 0; i < node.children.size(); i++) {
			this.preOrder(node.children.get(i));
		}
	}

	public void postOrder() {
		this.postOrder(this.root);
	}

	private void postOrder(Node node) {

		for (int i = 0; i < node.children.size(); i++) {
			this.postOrder(node.children.get(i));
		}
		System.out.println(node.data);
	}

	public void levelOrder() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.print(node.data + ",");
			for (int i = 0; i < node.children.size(); i++) {
				queue.add(node.children.get(i));
			}
		}
		System.out.println("END");
	}

}



