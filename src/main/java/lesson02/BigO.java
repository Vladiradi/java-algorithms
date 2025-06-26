package lesson02;
// Анализируем операции кода:
// - сравнения («больше». «меньше», кравно»і
// - присваивания;
//- выделение памяти.
public class BigO {
    public static void main(String[] args) {
        System.out.println(" sum = " + sum(10, 20));
    }
    static int sum(int one, int two) {   // 1 + 1
        return one + two; // giving memory  1
    }// O (3) ~ 0(1)

    static int sum1(int one, int two) {   // 1 + 1
        int result = one + two; // giving memory  1
        return result;
    }  // O (3) ~ 0(1)


    //n = arr.length
    static int sum2(int[] arr) {
        int sum = 0; //1
        for (int i = 0; i < arr.length; i++) { // 1 + (1+1)*n + 1*n;
            sum += arr[i]; //  i = i+1;
        }
    }
}

