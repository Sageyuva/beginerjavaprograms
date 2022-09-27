import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int sum=0;
        int size = sc.nextInt();
        System.out.println("enter the "+size+" values");
         int[] a = new int[size];
         for (int i =0 ; i < size; i++){
             a[i]=sc.nextInt();
        }
         for (int i =0 ; i <size; i++){
             sum= sum+a[i];
             System.out.println(sum);
         }
    }
}
