package lecture17;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree= new BinarySearchTree();
		tree.add(50);
		tree.add(25);
		tree.add(75);
		tree.add(12);
		tree.add(37);
		tree.add(62);
		tree.add(87);
		tree.add(10);
		tree.add(20);
        tree.add(20);
        tree.add(30);
        tree.add(70);
        tree.add(85);
        tree.add(100);
        tree.display(); 
        System.out.println(tree.max());
        System.out.println(tree.min());
	}

}
