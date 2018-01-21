package lecture4;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		
		
		int[] arr=takeinput();
	 
	 
		System.out.println(linearsearch(arr,20));
		

	}
	public static int[] takeinput(){
		System.out.println("enter the total number in array");
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] arr= new int[n];
		
		System.out.println("enter the values in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		
    return arr;
		
	}

	public static int linearsearch(int[] arr, int data) {

		
		System.out.println("enter the value to be search");
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==data){
				return i;
			}
		}
		
				return -1;
		
	}

}
