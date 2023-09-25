import java.util.*;
public class sum_of_digit_int {
    public static void main(String args[]){
        System.out.println("Input an Integer :");
        Scanner sc=new Scanner(System.in);
        int digits=sc.nextInt();
        System.out.println("The sum is :" + sumDigits(digits));
    }
    public static int sumDigits(int n){
        int sumofDigits=0;
        while(n>0){
            int lastDigit=n%10;
            sumofDigits += lastDigit;
            n /=10;


        }
        return sumofDigits;
    }
}
