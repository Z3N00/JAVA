package lecture2;

import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {

		int size;
		int noofspaces;
		
		int odd = 1;
		 System.out.println("enter the number");
		 Scanner scan = new Scanner(System.in);
		 size = scan.nextInt();
		 noofspaces=size-1;
		for (int i = 1; i <= size; i++) {
			int k=0;
			for(int j=1;j<=noofspaces;j++){
				System.out.print(" ");
			}
			
			for (int j = 1; j <= odd; j++) {
				if(j<=i){
					k=k+1;
				}
				else{
					k=k-1;
				}

				System.out.print(k);

			}
			System.out.println();
			odd = odd + 2;
			noofspaces=noofspaces-1;
		}

	}
}