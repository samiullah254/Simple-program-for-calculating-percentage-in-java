/* Write a program to calculate percentage of a given student in Baluchistan board exam. His marks
 from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)*/

import java.util.Scanner;
public class Exercise_1_1 {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);


     System.out.print("enter obtained marks of s1 out of 100 are: ");
     int s1m = sc.nextInt();
     System.out.print("enter obtained marks of s2 out of 100 are: ");
     int s2m = sc.nextInt();
     System.out.print("enter obtained marks of s3 out of 100 are: ");
     int s3m = sc.nextInt();
     System.out.print("enter obtained marks of s4 out of 100 are: ");
     int s4m = sc.nextInt();
     System.out.print(" enter obtained marks of s5 out of 100 are: ");
     int s5m = sc.nextInt();

     // for calculating percentage\
        double obtainedMarks=s1m+s2m+s3m+s4m+s5m;
        System.out.println("your obtained marks out of 500 are = "+ obtainedMarks );
        double totalMarks=500;

        double division= obtainedMarks/totalMarks;
        double percentage=division*100;
        System.out.println("your percentage is = "+percentage +"%");
    }
}