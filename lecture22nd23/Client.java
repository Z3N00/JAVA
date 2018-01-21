package lecture22nd23;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Graph graph=new Graph();
      graph.addvertex("A");
      graph.addvertex("B");
      graph.addvertex("C");
      graph.addvertex("D");
      graph.addvertex("E");
      graph.addvertex("F");
      graph.addvertex("G");
      graph.addEdge("A","B",10);
      graph.addEdge("A", "D", 40);
      graph.addEdge("B", "C", 10);
      graph.addEdge("C", "D", 10);
      graph.addEdge("D", "E", 2);
      graph.addEdge("E", "F", 8);
      graph.addEdge("F", "G", 3);
      graph.addEdge("E", "G", 3);
      graph.display();
	}

}
