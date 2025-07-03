package lesson04; // пакет, в котором находится этот класс

import java.util.Arrays; // импорт утилиты для красивого вывода массивов

public class MergeSort { // объявление класса

    public static void main(String[] args) {
        // создаём массив для сортировки
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        // запускаем сортировку
        mergeSort(arr);

        // печатаем результат после сортировки
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int lengthArr = arr.length; // сохраняем длину массива

        if (lengthArr == 1) {
            // если в массиве только один элемент — он уже отсортирован
            return;
        }

        // находим середину, делим массив на две части
        int mid = (lengthArr % 2 != 0) ? lengthArr / 2 + 1 : lengthArr / 2;

        // создаём левый и правый подмассивы
        int[] leftArr = new int[mid];
        int[] rightArr = new int[lengthArr - mid];

        // заполняем левый подмассив первыми mid элементами
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        // заполняем правый подмассив оставшимися элементами
        for (int j = 0; j < rightArr.length; j++) {
            rightArr[j] = arr[mid + j];
        }

        // выводим информацию о разделении
        System.out.println("Делим: " + Arrays.toString(leftArr) + " и " + Arrays.toString(rightArr));

        // рекурсивно сортируем каждую из половин
        mergeSort(leftArr);
        mergeSort(rightArr);

        // сливаем отсортированные половины обратно в исходный массив
        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        // индексы для перебора элементов подмассивов
        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = 0;

        // сравниваем элементы в левом и правом массиве, и записываем в исходный в отсортированном виде
        while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) {
                arr[arrIndex++] = leftArr[leftIndex++];
            } else {
                arr[arrIndex++] = rightArr[rightIndex++];
            }
        }

        // если остались элементы в левом массиве — копируем их
        while (leftIndex < leftArr.length) {
            arr[arrIndex++] = leftArr[leftIndex++];
        }

        // если остались элементы в правом массиве — копируем их
        while (rightIndex < rightArr.length) {
            arr[arrIndex++] = rightArr[rightIndex++];
        }

        // выводим процесс слияния двух массивов
        System.out.println("Сливаем: " + Arrays.toString(leftArr) + " + " + Arrays.toString(rightArr) +
                " => " + Arrays.toString(arr));
    }
}