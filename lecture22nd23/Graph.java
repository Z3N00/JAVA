package lecture22nd23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph {
	public class vertex {
		String name;
		HashMap<vertex, Integer> neighbor;

		vertex(String name) {
			this.name = name;
			this.neighbor = new HashMap<>();
		}

		public boolean equals(Object other) {
			vertex ov = (vertex) other; // other vertex
			return this.name.equals(ov.name);
		}

		public int hashcode() {
			return this.hashcode();
		}

		public void display() {
			String rv = "";
			rv = rv + this.name + "=>";
			Set<vertex> nbrs = this.neighbor.keySet();
			for (vertex nbr : nbrs) {
				rv = rv + nbr.name + "(" + this.neighbor.get(nbr) + ")";
			}
			rv = rv + "END";
			System.out.println(rv);
		}
	}

	private HashMap<String, vertex> vertices;

	Graph() {
		this.vertices = new HashMap<>();
	}

	public int numVertex() {
		return this.vertices.size();
	}

	public void addvertex(String name) {
		if (this.vertices.containsKey(name)) {
			return;
		}
		vertex vtx = new vertex(name);
		this.vertices.put(name, vtx);
	}

	public void removevertex(String name) {
		if (!this.vertices.containsKey(name)) {
			return;
		}
		vertex vtx = this.vertices.get(name);
		Set<vertex> nbrs = vtx.neighbor.keySet();
		for (vertex nbr : nbrs) {
			nbr.neighbor.remove(vtx);
		}
		this.vertices.remove(name);
	}

	public int numEdge() {
		int rv = 0;
		Collection<vertex> vtces = this.vertices.values();
		for (vertex vtx : vtces) {
			rv = rv + vtx.neighbor.size();
		}
		rv = rv / 2;
		return rv;

	}

	public void addEdge(String v1, String v2, int weight) {
		vertex vtx1 = this.vertices.get(v1);
		vertex vtx2 = this.vertices.get(v2);
		if (vtx1 == null || vtx2 == null || vtx1.neighbor.containsKey(vtx2)) {
			return;
		}
		vtx1.neighbor.put(vtx2, weight);
		vtx2.neighbor.put(vtx1, weight);
	}

	public void display() {
		Set<String> vtces = this.vertices.keySet();
		for (String vtxname : vtces) {
			vertex vtx = this.vertices.get(vtxname);
			vtx.display();
		}
		System.out.println("*****************************************");
	}

	public boolean haspathDFS(vertex vtx1, vertex vtx2, HashMap<vertex, Boolean> explored) {
		if (!explored.containsKey(vtx1)) {
			explored.put(vtx1, true);
		} else {
			return false;
		}
		if (vtx1.neighbor.containsKey(vtx2)) {
			return true;
		}
		Set<vertex> nbrs = vtx2.neighbor.keySet();
		for (vertex nbr : nbrs) {
			if (haspathDFS(nbr, vtx2, explored)) {
				return true;
			}
		}
		return false;

	}

	public boolean hashpathDFSII(vertex vtx1, vertex vtx2, HashMap<vertex, Boolean> explored) {
		if (!explored.containsKey(vtx1)) {
			explored.put(vtx1, true);
		} else {
			return false;
		}
		if (vtx1.neighbor.containsKey(vtx2)) {
			return true;
		}
		Set<vertex> nbrs = vtx2.neighbor.keySet();
		for (vertex nbr : nbrs) {
			if (hashpathDFSII(nbr, vtx2, explored)) {
				return true;
			}
		}
		return false;

	}

	public void bft() {  
		HashMap<vertex, Boolean> explored = new HashMap();
		LinkedList<vertex> queue = new LinkedList<>();
		Collection<vertex> vtces = this.vertices.values();
		for (vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				queue.add(vtx);

			}
			while (!queue.isEmpty()) {
				vertex rvtx = queue.remove();
				if (!explored.containsKey(rvtx)) {
                      explored.put(rvtx, true);
                      Set<vertex> nbrs=rvtx.neighbor.keySet();
                      for(vertex nbr : nbrs){
                    	  if(!explored.containsKey(nbr)){
                    		  queue.add(nbr);
                    	  }
                    	  
                      }
				}
			}
		}
	}

	public boolean isconnected() {
		return true;

		
	}

	public ArrayList<ArrayList<String>> getCC() { 
         
	}
	
    public 
}
