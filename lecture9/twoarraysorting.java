package lecture9;

public class twoarraysorting {

	public static void main(String[] args) {
		int[] arr1 = { 5, 9, 13, 14 };
		int[] arr2 = { 3, 4, 5, 12 };
		int[] arr3 = new int[8];

		for (int i = 0; i < arr1.length-1; i++) {
			for (int j = 0; j < arr2.length-1; j++) {
			
					for (int k = 0; k < arr1.length + arr2.length; k++) {
						arr3[k] = arr1[i];
					
				 
					
						arr3[k] = arr1[j];
					
				
			}
			for(int s=0;s<arr3.length;s++){
			System.out.println(arr3);
		}
		}

	}

	}
}
