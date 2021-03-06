package lecture4;
 import java.util.Scanner;
	public class arrayoops {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			// 5 50 40 30 20 10
			int[] arr = takeInput();
			System.out.println(max(arr));
			//System.out.println(linearSearch(arr, 40));
			//reverse(arr);
			//display(arr);
			
			//System.out.println(BinarySearch(arr, 100));
			System.out.println("Sorting Algos");
			//bubbleSort(arr);
			//selectionSort(arr);
			insertionSort(arr);
			display(arr);

		}

		public static int[] takeInput() {
			Scanner s = new Scanner(System.in);
			int[] arr;
			System.out.println("Please Enter the size of the array");
			int N = s.nextInt();
			arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Please enter the value at " + i + "th index");
				arr[i] = s.nextInt();
			}
			return arr;

		}

		public static void display(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}

		public static int max(int[] arr) {
			int max = Integer.MIN_VALUE;
			

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}

		public static int linearSearch(int[] arr, int data) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == data) {
					return i;
				}
			}
			return -1;
		}

		public static void reverse(int[] arr) {
			int left = 0;
			int right = arr.length - 1;

			while (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
		public static int BinarySearch(int[] arr,int data){
			int left=0;
			int right=arr.length-1;
			while(left<=right){
				int mid=(left+right)/2;
				if(arr[mid]==data){
					return mid;
				}else if(arr[mid]<data){
					left=mid+1;
				}else{
					right=mid-1;
				}
			}
			return -1;
		}

		public static void bubbleSort(int[] arr){
			
			for(int i=1;i<arr.length;i++){
				for(int j=0;j<arr.length-i;j++){
					if(arr[j]>arr[j+1]){
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
		
		public static void selectionSort(int[] arr){
			for(int i=0;i<arr.length-1;i++){
				int min_index=i;
				for(int j=i+1;j<arr.length;j++){
					if(arr[j]<arr[min_index]){
						min_index=j;
					}
				}
				int temp=arr[min_index];
				arr[min_index]=arr[i];
				arr[i]=temp;
			}
		}
		
		public static void insertionSort(int[] arr){
			for(int i=1;i<arr.length;i++){
				for(int j=i;j>0&&arr[j]<arr[j-1];j--){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		

	}


