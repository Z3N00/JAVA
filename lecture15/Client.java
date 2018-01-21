package lecture15;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //  18 3 64 2 17 0 10 0 27 0 39 1 34 0
		GenericTree tree=new GenericTree();
	   tree.display();
	   System.out.println("*********************************************************");
	  // tree.size();
	  System.out.println( tree.size2());
	  System.out.println(tree.max());
	  
	}

}
