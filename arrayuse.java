import java.util.*;

public class arrayuse {
    //take input of an array 
    public static int[] takeinput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr [] = new int [size];
        for(int i =0; i<size; i++){
            arr [i] = s.nextInt();
        }  
        return arr;
    }

    //print array 
    public static void print(int arr[]){
        int size = arr.length;

        for (int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
    }
}
