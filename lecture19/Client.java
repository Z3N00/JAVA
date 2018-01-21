package lecture19;

import java.awt.DisplayMode;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Heap<Integer> heap=new Heap<>(); heap.add(45); heap.add(35);
		 * heap.add(25); heap.add(22); heap.add(20); heap.add(18); heap.add(15);
		 * heap.add(10); heap.add(5); heap.add(50); heap.display();
		 */
		Heap<Student> heap=new Heap<>();
		heap.add(new Student(900, 1, "a"));
		heap.add(new Student(800, 2, "b"));
		heap.add(new Student(700, 3, "c"));
		heap.add(new Student(600, 4, "d"));
		heap.add(new Student(500, 5, "e"));
		heap.add(new Student(400, 6, "f"));
		heap.add(new Student(300, 7, "g"));
		heap.add(new Student(200, 8, "h"));
		heap.add(new Student(100, 9, "i"));
		heap.display();


	}

	public static class Student implements Comparable<Student> {
		int marks;
		int rank;
		String name;

		Student(int marks, int rank, String name) {
			this.marks = marks;
			this.rank = rank;
			this.name = name;
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.marks - o.marks;

		}

		public String toString() {
			return "{" + this.marks + "," + this.rank + "," + this.name + "}";
		}
	}
}
