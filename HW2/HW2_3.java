import java.util.Scanner;

public class HW2_3 {

    public static void main(String[] args) {
        System.out.print("Please enter a size of new array: ");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        scan.close();

        int lowerBound = 10;
        int upperBound = 50;
        int minElement = upperBound;
        int maxElement = lowerBound;
        int minElementIndex = 0;
        int maxElementIndex = 0;
        int sum = 0;
        int evenElements = 0;
        int oddElements = 0;
        int[] myArray = new int[arraySize];

        System.out.println("Original array:");
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
            if (myArray[i] > maxElement) {
                maxElement = myArray[i];
                maxElementIndex = i;
            }
            if (myArray[i] < minElement) {
                minElement = myArray[i];
                minElementIndex = i;
            }
            if (myArray[i] % 2 == 0) {
                evenElements++;
            } else {
                oddElements++;
            }
            System.out.printf("%d ", myArray[i]);
        }

        for (int i = arraySize / 2; i < arraySize; i++) {
            sum += myArray[i];
        }

        int tempElement = 0;
        for (int i = 0; i < arraySize / 4; i++) {
            tempElement = myArray[i];
            myArray[i] = myArray[arraySize / 2 + i];
            myArray[arraySize / 2 + i] = tempElement;
        }

        int[] evenArray = new int[evenElements];
        int[] oddArray = new int[oddElements];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenIndex] = myArray[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = myArray[i];
                oddIndex++;
            }
        }

        System.out.printf("\nMin element: %d", minElement);
        System.out.printf("\nIndex of Min element: %d", minElementIndex);
        System.out.printf("\nMax element: %d", maxElement);
        System.out.printf("\nIndex of Max element: %d", maxElementIndex);
        System.out.printf("\nAvg of the array's second part: %f", (float) sum / (arraySize / 2));
        System.out.println("\nModified array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("%d ", myArray[i]);
        }
        System.out.println("\nArray with even elements:");
        for (int i = 0; i < evenElements; i++) {
            System.out.printf("%d ", evenArray[i]);
        }
        System.out.println("\nArray with odd elements:");
        for (int i = 0; i < oddElements; i++) {
            System.out.printf("%d ", oddArray[i]);
        }
    }
}
