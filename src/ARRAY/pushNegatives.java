//package ARRAY;
import java.util.*;
public class pushNegatives {
    
    public static void pushneg(int nums[]){
        int nonneg=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] < 0){
                int temp = nums[i];
                nums[i]=nums[nonneg];
                nums[nonneg]= temp;
                nonneg++;
            }
        }
    }
    public static void main(String args []){
        Scanner s  = new Scanner(System.in);
        int size = s.nextInt();
        int nums[]= new int [size];
        System.out.println("enter array elements : ");
        for (int i =0; i<size ; i++){
            nums[i]=s.nextInt();
        }
        System.out.println("after pushed negatives to left : ");
        pushneg(nums);
        for(int i=0;i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }


    }    
}
