package lecture18;

public class HashTable<K, V> {
	private class HTpair {
		K key;
		V val;

		HTpair() {
			this.key = key;
			this.val =val;
		}

		public boolean equals(Object other) {
			HTpair op = (HTpair) other; // op=other pair
			return this.key.equals(op.key);
		}

		public String tostring() {
			return "{" + this.key + ";" + this.val + "}";
		}

	}

	private int size;
	private LinkedList<HTpair>[] bucketArray;
	public static final int DEFAULT_CAPACITY;

	public HashTable(int capacity) {
		this.bucketArray = (LinkedList < HTpair >[]) new LinkedList[capacity];
	this.size=0;
	}
	public void put(K key,V val){
		
	}
}}
