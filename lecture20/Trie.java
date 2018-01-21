package lecture20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trie {
	private class Node {
		Character data;
		HashMap<Character, Node> Children;
		boolean isTerminal;

		Node(char data, boolean isTerminal) {
			this.data = data;
			this.isTerminal = isTerminal;
			Children = new HashMap<>();
		}
	}

	private Node root;
	private int NumWord;

	Trie() {
		this.root = new Node('\0', false);
		this.NumWord = 0;
	}

	public int getNumWord() {
		return this.NumWord;
	}

	public boolean isEmpty() {
		return this.NumWord == 0;
	}

	public void addWord(String word) {
		this.addWord(this.root, word);
	}

	private void addWord(Node parent, String Word) {
		if ((Word.length() == 0)) {
			if (parent.isTerminal) {

			} else {
				parent.isTerminal = true;
				this.NumWord++;
			}
			return;
		}
		char cc = Word.charAt(0);
		String ros = Word.substring(1);
		Node child = parent.Children.get(cc);
		if (child == null) {
			child = new Node(cc, false);
			parent.Children.put(cc, child);
		}
		this.addWord(child, ros);
	}

	public void display() {
		this.display(this.root, "");
	}

	private void display(Node node, String osf) { // osf=output so far
		if (node.isTerminal) {
			String toPrint = osf.substring(1) + node.data;
			System.out.println(toPrint);
		}
		Set<Map.Entry<Character, Node>> entries = node.Children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			this.display(entry.getValue(), osf + node.data);
		}
	}

	public boolean search(String word) {
		return this.search(this.root, word);

	}

	private boolean search(Node parent, String word) {
		if (word.length() == 0) {
			if (parent.isTerminal) {
				return true;
			} else {
				return false;
			}
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.Children.get(cc);
		if (child == null) {
			return false;
		} else {
			return this.search(child, ros);
		}
	}

	public void remove(String word) {
		this.remove(this.root, word);
	}

	private void remove(Node parent, String word) {
		if (word.length() == 0) {
			if (parent.isTerminal) {
				parent.isTerminal = false;
				this.NumWord--;
			} else {

			}
			return;
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.Children.get(cc);
		if (child == null) {
			return;
		}
		this.remove(child, ros);
		if (!child.isTerminal && child.Children.size() == 0) {
			parent.Children.remove(cc);
		}
	}
	public void displayAstree(){
		this.displayAstree(this.root);
	}
	private void displayAstree(Node node){
		String str="";
		str+=node.data+"=>";
		Set<Map.Entry<Character, Node>>entries=node.Children.entrySet();
		for(Map.Entry<Character, Node>entry:entries){
			str+=entry.getkey()+",";
		}
		
	}
}
