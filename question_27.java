package hackathon;

public class question_27 {

	public static void main(String[] args) {
		//WJP for QuickSort:
		
		int[] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Original array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        printArray(array);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

	}

}
