import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
		// 
		// Scanner s=new Scanner(System.in);
		// int n=s.nextInt();
		// int row=1;
		// while(row<=n){
		// 	int col=1;
		// 	int start=1;

		// 	while(col<=n-row){
		// 		System.out.print(" ");
		// 		col++;
		// 	}

		// 	while(col<=n){
		// 		System.out.print(start);
		// 		start++;
		// 		col++;
		// 	}


		// 	System.out.println();
		// 	row++;
		// }
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		
		while(row<=n){
			int col=1;
			int counter= n-row+1;
			while(col<=n-row+1){
				System.out.print(counter);
				counter++;
			}
			System.out.println();
			row++;
		}


		
	}
}

