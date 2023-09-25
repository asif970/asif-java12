import java.util.*;
public class avg_of_3_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the first number :");
        double x=sc.nextDouble();
        System.out.print("Input the second number :");
        double y=sc.nextDouble();
        System.out.print("Input the third number :");
        double z=sc.nextDouble();
        System.out.print("Average of three number is :" + average(x+y+z, z, z)+"\n");

    }
    public static double average(double x,double y,double z){
        return (x+y+z)/3;
    }
}
 