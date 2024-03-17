// Omer Ahmer ID 2014063

package module3;
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size and elements of the first list: ");
        int size1 = scanner.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size and elements of the second list: ");
        int size2 = scanner.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = scanner.nextInt();
        }

        int[] mergedList = merge(list1, list2);
     

        System.out.print("The merged list of length " + mergedList.length + ": ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int size1 = list1.length;
        int size2 = list2.length;
        int[] mergedList = new int[size1 + size2];

        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (list1[i] < list2[j]) {
                mergedList[k++] = list1[i++];
            } else {
                mergedList[k++] = list2[j++];
            }
        }

        while (i < size1) {
            mergedList[k++] = list1[i++];
        }

        while (j < size2) {
            mergedList[k++] = list2[j++];
        }

        return mergedList;
    }
}
