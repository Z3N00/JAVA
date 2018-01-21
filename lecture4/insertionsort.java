package lecture4;

public class insertionsort {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10,60 };
		for (int j = 1; j < arr.length; j++)
		{
			for (int i = j; i >0&&arr[i]<arr[i-1]; i++) 
			{
				if (arr[i] < arr[i - 1]) 
				{
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;

				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

}
