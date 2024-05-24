//package ARRAY;

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

    //find largest element in array 
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //sum of all elements 
    public static int sum(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    //find whether element is present in array, where and -1 if not
    //LINEAR SEARCH
    public static int findEle(int arr[], int x){
        int result=-1;
        for (int i=0; i<arr.length;i++){
            if(arr[i] == x){result = i;}
        }
        return result;
    }

    //reverse an array 
    public static void reverse(int arr[]){
        int n = arr.length;
        int temp;
        for(int i =0; i< n/2;i++){
            temp = arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.print(arr[k] + " "); 
        } 

    }
    public static void main(String[] args) {
        int arr []=takeinput();
        print(arr);
        System.out.println("find largest element : " + findMax(arr));
        System.out.println("sum " + sum(arr));
        
        Scanner s = new Scanner(System.in);
        System.out.println("type number you want to search: ");
        int x = s.nextInt();
        System.out.println(findEle(arr,x ));
        reverse(arr);
    }
}
