package lecture6;

public class arrayrecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 4, 6 };
		int si = 0;
		// System.out.println(sortedarray(arr, si));
		// System.out.println("***********************************************************");
		// System.out.println(search(arr, 6, si));
		// System.out.println("***********************************************************");
		// System.out.println(firstindex(arr, 4, si));
		// System.out.println("***********************************************************");
		// System.out.println(lastindex(arr, 4, si));
		printpattern(5, 1, 1);

	}

	public static boolean sortedarray(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;

		}

		if (arr[si] > arr[si + 1]) {
			return false;

		}
		boolean s = sortedarray(arr, si + 1);

		return s;
	}

	public static int search(int[] arr, int data, int si) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == data) {
			return si;
		}
		int s = search(arr, data, si + 1);
		return s;
	}

	public static int firstindex(int[] arr, int x, int si) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == x) {
			return si;
		}
		int s = firstindex(arr, x, si + 1);
		return s;
	}

	public static int lastindex(int[] arr, int y, int si) { // y=data, si=index

		if (arr[si] == arr.length) {
			return -1;
		}

		int s = lastindex(arr, y, si + 1);
		if (s != -1) {
			return s;
		} else {

			if (arr[si] == y) {
				return si;

			} else {
				return -1;
			}
		}
	}

	public static int allindex(int[] arr,int si,int num,int count){
    	 if(si==arr.length){
    		 return new int[count];
    	 }
    	 int[] index=null;
    	 if(arr[si]==num){
    		 index=allindex(arr, si+1, num,count+1)
    	 }
     
     }

	public static void printpattern(int n, int row, int col) {
		if (row > n) {
			return;
		}
		if (col > row) {
			System.out.println(" ");
			printpattern(n, row + 1, 1);
			return;
		}
		System.out.print("*\t");

		printpattern(n, row, col + 1);

	}

}
