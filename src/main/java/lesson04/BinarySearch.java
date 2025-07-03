package lesson04;


public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int valueToFind = 10;

        int indexIterative = binarySearchIterative(sortedArray, valueToFind, 0, sortedArray.length - 1);
        System.out.println("Iterative: value found at index " + indexIterative);

        int indexRecursive = binarySearchRecursive(sortedArray, valueToFind, 0, sortedArray.length - 1);
        System.out.println("Recursive: value found at index " + indexRecursive);
    }

    // 🔁 Итеративный метод бинарного поиска
    public static int binarySearchIterative(int[] sortedArray, int valueToFind, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else {
                return mid; // Значение найдено
            }
        }
        return -1; // Значение не найдено
    }

    // 🔁 Рекурсивный метод бинарного поиска
    public static int binarySearchRecursive(int[] values, int valueToFind, int low, int high) {
        if (low > high) {
            return -1; // базовый случай: не найден
        }

        int mid = low + (high - low) / 2;

        if (values[mid] < valueToFind) {
            return binarySearchRecursive(values, valueToFind, mid + 1, high);
        } else if (values[mid] > valueToFind) {
            return binarySearchRecursive(values, valueToFind, low, mid - 1);
        } else {
            return mid; // найден
        }
    }
}