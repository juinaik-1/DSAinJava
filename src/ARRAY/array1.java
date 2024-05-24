package ARRAY;

import java.util.*;
class array1 {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr [] = new int [20];
        arr[1] =20;
        arr[0] =32;
        System.out.println(arr[0]);
        
        // if array length is 5, array index starts from 0,1,2,3,4 hence if size is n, it goes from 0 to (n-1) and also index cannot be negative 
        
        //System.out.println(arr[20]); // index out of bound error 
        //System.out.println(arr[-2]); //Index -2 out of bounds for length 20
        
        //when array is assigned the default value for each cell is 0 for int, 0.0 for float and null for string 
        System.out.println(arr[19]);  //0
        float arr2[] = new float [10];
        System.out.println(arr2[0]);  //0.0
        String arr3 []=new String [10];
        System.out.println(arr3[0]); //null word
        char arr4 []=new char [10];
        System.out.println(arr4[0]); // null
        boolean arr5[] = new boolean[5];
        System.out.println(arr5[0]); //false
        
        
        //taking input and printing array 
        
        
        
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int inputArray [] = new int [size];
        for(int i= 0; i<size; i++){
            inputArray[i] = s.nextInt();
        }
        
        //printing array 
        for(int i=0; i< inputArray.length; i++){
            System.out.print(inputArray[i]);
        }
    }
}