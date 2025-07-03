package lesson04;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int lengthArr = arr.length;

        if (lengthArr == 1) {
            return;
        }

        int mid = (lengthArr % 2 != 0) ? lengthArr / 2 + 1 : lengthArr / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[lengthArr - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];package lesson04;

import java.util.Arrays;

            public class MergeSort {

                public static void main(String[] args) {
                    int[] arr = {38, 27, 43, 3, 9, 82, 10};
                    System.out.println("Исходный массив: " + Arrays.toString(arr));
                    mergeSort(arr);
                    System.out.println("Отсортированный массив: " + Arrays.toString(arr));
                }

                private static void mergeSort(int[] arr) {
                    int lengthArr = arr.length;

                    if (lengthArr == 1) {
                        return;
                    }

                    int mid = (lengthArr % 2 != 0) ? lengthArr / 2 + 1 : lengthArr / 2;
                    int[] leftArr = new int[mid];
                    int[] rightArr = new int[lengthArr - mid];

                    for (int i = 0; i < mid; i++) {
                        leftArr[i] = arr[i];
                    }

                    for (int j = 0; j < rightArr.length; j++) {
                        rightArr[j] = arr[mid + j];
                    }

                    System.out.println("Делим: " + Arrays.toString(leftArr) + " и " + Arrays.toString(rightArr));

                    mergeSort(leftArr);
                    mergeSort(rightArr);

                    merge(arr, leftArr, rightArr);
                }

                private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
                    int leftIndex = 0;
                    int rightIndex = 0;
                    int arrIndex = 0;

                    while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
                        if (leftArr[leftIndex] < rightArr[rightIndex]) {
                            arr[arrIndex++] = leftArr[leftIndex++];
                        } else {
                            arr[arrIndex++] = rightArr[rightIndex++];
                        }
                    }

                    while (leftIndex < leftArr.length) {
                        arr[arrIndex++] = leftArr[leftIndex++];
                    }

                    while (rightIndex < rightArr.length) {
                        arr[arrIndex++] = rightArr[rightIndex++];
                    }

                    System.out.println("Сливаем: " + Arrays.toString(leftArr) + " + " + Arrays.toString(rightArr) +
                            " => " + Arrays.toString(arr));
                }
            }
        }

        for (int j = 0; j < rightArr.length; j++) {
            rightArr[j] = arr[mid + j];
        }

        System.out.println("Делим: " + Arrays.toString(leftArr) + " и " + Arrays.toString(rightArr));

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = 0;

        while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) {
                arr[arrIndex++] = leftArr[leftIndex++];
            } else {
                arr[arrIndex++] = rightArr[rightIndex++];
            }
        }

        while (leftIndex < leftArr.length) {
            arr[arrIndex++] = leftArr[leftIndex++];
        }

        while (rightIndex < rightArr.length) {
            arr[arrIndex++] = rightArr[rightIndex++];
        }

        System.out.println("Сливаем: " + Arrays.toString(leftArr) + " + " + Arrays.toString(rightArr) +
                " => " + Arrays.toString(arr));
    }
}