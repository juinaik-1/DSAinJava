import java.math.BigInteger;
import java.util.*;
public class sol150 {
    public static void main(String [] args){

        // 1. Write a Java program to print 'Hello' on screen and your name on a separate line. 
        
        /*Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("hello java");
        System.out.println(name);*/

        //*****************************************************************************************************************************

        //2. Write a Java program to print the sum of two numbers
        /*Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a+b);*/

        //*****************************************************************************************************************************
        //3. Write a Java program to divide two numbers and print them on the screen. 
        /*Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(a/b);*/

        //*****************************************************************************************************************************

        //4. Write a Java program to print the results of the following operations.
                //Test Data:
                //a. -5 + 8 * 6
                //b. (55+9) % 9
                //c. 20 + -3*5 / 8
                //d. 5 + 15 / 3 * 2 - 8 % 3 
        /*System.out.print("-5 + 8 * 6 = "); 
        System.out.print(-5 + 8 * 6); 
        System.out.println(); 
        System.out.print("(55+9) % 9 = "); 
        System.out.print( (55+9) % 9); 
        System.out.println(); 
        System.out.print("20 + -3*5 / 8 = "); 
        System.out.print( 20 + -3*5 / 8); 
        System.out.println(); 
        System.out.print("5 + 15 / 3 * 2 - 8 % 3 = "); 
        System.out.print( 5 + 15 / 3 * 2 - 8 % 3); 
        System.out.println(); */

        //*****************************************************************************************************************************

        //5. Write a Java program that takes two numbers as input and displays the product of two numbers.

        /*Scanner s = new Scanner(System.in);
        int a  = s.nextInt();
        int b = s.nextInt();
        System.out.println(a*b); */

        //*****************************************************************************************************************************

        //6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 

        /*Scanner s  = new Scanner(System.in);
        int a = s.nextInt();
        int b  = s.nextInt();
        System.out.printf(a+b + "\n" + a*b +"\n" + (a-b) +" \n"+ a/b +"\n" + a%b );*/

        //*****************************************************************************************************************************

        //7. Write a Java program that takes a number as input and prints its multiplication table up to 10

        /*Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i = 1; i<= 10; i++){
            System . out.println(num +" X " + i + " = " + num*i);
        }*/

        //*****************************************************************************************************************************

        //8. Write a Java program to display the following pattern.
                //Sample Pattern :

            //    J    a   v     v  a                                                  
            //    J   a a   v   v  a a                                                 
            // J  J  aaaaa   V V  aaaaa                                                
            //  JJ  a     a   V  a     a

            //solving by dumbest method
            /*System.out.println("    J    a   v     v  a");
            System.out.println("    J   a a   v   v  a a");
            System.out.println(" J  J  aaaaa   V V  aaaaa");
            System.out.println("  JJ  a     a   V  a     a");*/
            
        //*****************************************************************************************************************************

        //9. Write a Java program to compute the specified expressions and print the output.
            //Test Data:
            //((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
            //Expected Output 2.138888888888889
        
        //System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

        //*****************************************************************************************************************************

        //10. Write a Java program to compute a specified formula.
            //Specified Formula :
            //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
            //Expected Output 2.9760461760461765

        //System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

        //*****************************************************************************************************************************

        //11. Write a Java program to print the area and perimeter of a circle.

        /*Scanner s  = new Scanner(System.in);
        double radius = s.nextDouble();

        System.out.println( " Area = " + Math.PI* radius*radius );
        System.out.println(" Perimeter = " + Math.PI *radius*2);*/

        //*****************************************************************************************************************************

        //12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        /*Scanner s  = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c  = s.nextInt();
        System.out.println((a+b+c)/3);*/

        //*****************************************************************************************************************************

        //13. Write a Java program to print the area and perimeter of a rectangle.
        /*Scanner s  = new Scanner(System.in);
        System.out.println("Enter height= ");
        double height = s.nextDouble();
        System.out.println("Enter width= ");
        double width = s.nextDouble();

        System.out.println("Area = " + height*width );
        System.out.println("Perimeter = " + 2*(height+width) );*/

        //*****************************************************************************************************************************

        //14. Write a Java program to print an American flag on the screen.
            // Expected Output
            // * * * * * * ==================================                          
            //  * * * * *  ==================================                          
            // * * * * * * ==================================                          
            //  * * * * *  ==================================                          
            // * * * * * * ==================================                          
            //  * * * * *  ==================================                          
            // * * * * * * ==================================                          
            //  * * * * *  ==================================                          
            // * * * * * * ==================================                          
            // ==============================================                          
            // ==============================================                          
            // ==============================================                          
            // ==============================================                          
            // ==============================================                          
            // ==============================================

            /*int r = 15; //row
            int c = 46; //col
    
            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= c; j++) {
                    if (i <= 9) {   //9 rows have stars
                        if (j <= 13) // 13 * in a row
                        {
                            if ((i + j) % 2 == 0) {  // even stars have 2 less spaces
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        } else {
                            System.out.print("=");
                        }
                    } else {
                        System.out.print("=");
                    }
                }
                System.out.println();
            }*/

        //*****************************************************************************************************************************

        //15. Write a Java program to swap two variables. 

        /*Scanner s = new Scanner(System.in);
        System.out.print("enter integer a : ");
        int a = s.nextInt();
        System.out.print("enter integer b : ");
        int b = s.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" swapped a is : " + a);
        System.out.println(" swapped b is : " + b);*/

        //*****************************************************************************************************************************

        //16. Write a Java program to print a face.
            // +"""""+                                                 
            //[| o o |]                                                
            // |  ^  |                                                 
            // | '-' |                                                 
            // +-----+
        //cute solution..  loop will make me mad in this case
        /*System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+");*/

        //*****************************************************************************************************************************

        //17. Write a Java program to add two binary numbers. 
        // Scanner s = new Scanner(System.in);
        // int decimal = s.nextInt();
        // int[] binary = new int[40];    
        // int index = 0;    
        // while(decimal > 0)
        // {    
        //     binary[index++] = decimal%2;    
        //     decimal = decimal/2;    
        // }    
        // for(int i = index-1;i >= 0;i--){    
        //     System.out.print(binary[i]);    
        // }    
        // System.out.println();

        //*****************************************************************************************************************************

        // Write a Java program to compare two numbers.
        // Scanner s = new Scanner (System.in);
        // int n1 = s.nextInt();
        // int n2 = s.nextInt();
        // if(n1 == n2) System.out.println("n1 = n2");
        // else if (n1 < n2) System.out.println("n1 < n2");
        // else if (n1>n2) System.out.println("n1 > n2");
        
        //*****************************************************************************************************************************

        //Write a Java program and compute the sum of an integer's digits. 
        // Scanner  s = new Scanner(System.in);
        // int n = s.nextInt();
        // int sum = 0;
        // while(n != 0){
        //     int last = n%10;
        //     n /=10;
        //     sum += last;
        // }
        // System.out.println(sum);
        
        //*****************************************************************************************************************************

        //Write a Java program to reverse a string. 
        // Scanner s = new Scanner(System.in);
        // String str = s.nextLine();
        // System.out.println(str);
        // char arr[] = str.toCharArray();
        // System.out.println("reverse string:");
        // for(int i = arr.length-1; i>=0; i--){
        //     System.out.print(arr[i]);
        // }
        
        //*****************************************************************************************************************************

        //Write a Java program to count letters, spaces, numbers and other characters in an input string.
        // Scanner s  = new Scanner(System.in);
        // String str = s.nextLine();
        // char[] arr = str.toCharArray();
        // int letters=0;
        // int spaces = 0;
        // int numbers=0;
        // int chars= 0;
        // for (int i =0; i<str.length(); i++){
        //     if(Character.isLetter(arr[i]) ) letters++;
        //     else if (Character.isWhitespace(arr[i])) spaces++;
        //     else if(Character.isDigit(arr[i])) numbers++;
        //     else chars++;
        // }
        // System.out.println(letters);
        // System.out.println(spaces);
        // System.out.println(numbers);
        // System.out.println(chars);
        
        //*****************************************************************************************************************************

        
        //Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
        
        // int count =0;
        // for (int i =1; i<=4; i++){
        //     for(int j =1; j<=4; j++){
        //         for (int k =1 ; k<=4; k++){
        //             if(i!=j && j!=k && i!=k) count++;
        //             System.out.print(i + "" + j + "" + k + " ");
        //         }
        //     }
        // }
        // System.out.println("count= " + count);

        //*****************************************************************************************************************************

        //Write a Java program to print the ASCII value of a given character. 
        // Scanner s = new Scanner(System.in);
        // char c = s.next().charAt(0);
        // int ascii = c;
        // System.out.println(ascii);

        //*****************************************************************************************************************************

        //Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // System.out.println("n + nn + nnn = " + n+n*n+n*n*n);

        //*****************************************************************************************************************************
        
        // Write a Java program to print odd numbers from 1 to 99 n count
        // int count =0; 
        // for(int i =1; i<100; i++){
        //     if(i%2!= 0) {
        //         count++;
        //         System.out.print(i + " ");
        //     }
        // }
        // System.out.println();
        // System.out.println(count);

        //*****************************************************************************************************************************












    }
}
