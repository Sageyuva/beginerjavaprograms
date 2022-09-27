import java.util.Scanner;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(" after swapping the values of a and b will be "+ a+" and "+b);
    }

}
