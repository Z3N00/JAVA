package lecture4;

public class reverse {

	public static void main(String[] args) {

		int[] arr = { 20, 40, 10, 60, 27 };
		int left = 0;
		int right = arr.length-1;
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+"=>");
		}
		System.out.println("END");
		while (left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;

		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"=>");
		}
		System.out.println("END");
	}

}
