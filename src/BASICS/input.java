import java.util.Scanner;
public class input {
    public static void main(String[] args){
        //make an object scan of type scanner 
        //assign a stream to it - here it is system.in
        Scanner scan = new Scanner(System.in);
        //scanner gives multiple functionalities to scan various datatypes
        int a= scan.nextInt();
        int b=scan.nextInt();
        int sum=a+b;
        System.out.println(sum);
        long l=scan.nextLong();
        double d=scan.nextDouble();
        //float f=scan.nextFloat();
        String str=scan.nextLine();
        String str2=scan.next();
        System.out.println(l);
        System.out.println(d);
        //System.out.println(f);
        System.out.println(str);

        char c=str.charAt(0);
    }
}
