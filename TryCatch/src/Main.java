import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an index between 0 and 9 ");
        int index = scan.nextInt();

        try {
            printIndex(arr, index);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array Bound Exception!!!!");
        }
    }

    public static void printIndex(int[] arr, int index) {
        System.out.println("Index element: " + arr[index]);
    }
}

