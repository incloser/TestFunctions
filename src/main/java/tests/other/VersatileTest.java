package tests.other;

import java.util.Arrays;

public class VersatileTest {
    //Bubble sorting
    private static int[] arr = {5, 3, 9, 1};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        while (!isArrSorted(arr)) {
            for(int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    interchange(arr, i, i + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static boolean isArrSorted(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void interchange(int[] arr, int curr, int next) {
        int temp =  arr[curr];
        arr[curr] = arr[next];
        arr[next] = temp;
    }
}
