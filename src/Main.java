import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        if (a>b){
            System.out.println("a ia larger ");
        }else {
            System.out.println("b is larger");
        }
    }
}