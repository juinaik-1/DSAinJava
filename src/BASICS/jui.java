package BASICS;

import java.util.Scanner;
//random chutiyap
public class jui {
    private int age;
    private String pet;
    private static double CGPA;

    public jui(){
        age=20;
        pet="oreo";
        CGPA=8.63;
    }

    public static int ageAt(int year){
        int thatage=0;
        if(year<=2023) thatage= 2023 - year;
        else thatage = year-2023;
        return thatage;
    }

    public static void getmark(){
        System.out.println(CGPA);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.println(ageAt(year));
        getmark();
    }
}

    
    
