import java.util.*;

public class even_method_check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the Integers :" );
        num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static boolean isEven(int numbers) {
        if (numbers % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
