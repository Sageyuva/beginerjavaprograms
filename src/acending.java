import java.util.Scanner;

public class acending {
    public static void main(String[] args) {
        int temp;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= SC.nextInt();
        int[] array= new int[size];
        for (int i=0;i<size;i++){
            array[i]= SC.nextInt();
        }
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if (array[i]>array[j]){
                    temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}