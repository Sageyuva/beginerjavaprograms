import java.util.Scanner;

public class greatest_of_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of a");
        int a= sc.nextInt();
        System.out.println(" enter the value of b");
        int b= sc.nextInt();
        System.out.println(" enter the value of c");
        int c= sc.nextInt();
        if (a>b&a>c){
            System.out.println("a is larger");
        }else if (b>a & b>c){
            System.out.println("b is larger");
        }else {
            System.out.println("c is larger");
        }


    }
}
