import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10,4,6,7,8};
        int[] newArr;
        newArr = new int[arr.length+1];
        System.out.println("Enter value: ");
        int inputValue = scanner.nextInt();

        int inputIndex;
        do {
            System.out.println("Enter index: ");
            inputIndex = scanner.nextInt();
        }while (inputIndex < 0 || inputIndex >= arr.length);

        for (int i=0,k=0;i<arr.length;i++){
            if (i==inputIndex){
                newArr[k++] = inputValue;
            }
            newArr[k++] = arr[i];
        }

        arr = newArr;

        System.out.println("New array: ");
        for (int x: arr) {
            System.out.println(x);
        }
    }
}
