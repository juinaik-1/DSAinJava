//package ARRAY;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]

 

Constraints:

    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1 */


import java.util.*;
public class pushzeros {

    public static void pushzero(int nums[]){
        int nonzero=0; 
        for(int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i]=nums[nonzero];
                nums[nonzero]= temp;
                nonzero++;
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
        System.out.println("after pushed zeros to right : ");
        pushzero(nums);
        for(int i=0;i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }


    }    
}
