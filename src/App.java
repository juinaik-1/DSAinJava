import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("*");

        //first half
        int i=1;
        while(i<=n){
            System.out.print("*");
            int j=1;
            while(j<=i){
                System.out.print(j);
                j=j+1;
            }
            j=j-2;
            while(j>=1){
                System.out.print(j);
                j=j-1;
            }
            System.out.print("*");
            System.out.println("");
            i=i-1;
        }
        i=1;
        while(i<=n-1){
            System.out.print("*");
            int j=1;
            while(j<=n-i){
                System.out.print(j);
                j=j+1;
            }
            j=j-2;
            while(j>=1){
                System.out.print(j);
                j=j-1;
            }
            System.out.print("*");
            System.out.println();

            i=i+1;

        }
        System.out.println("*");

    }
}