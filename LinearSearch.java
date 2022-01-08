import java.util.Arrays;

import javax.lang.model.element.Element;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 550, 60, -40, 5, 0, 60 };

        int[][] twod = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, -9 }
        };

        System.out.println(maxIn(twod));
    }

    public static int giveIndex(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static boolean isAvailable(int[] arr, int target) {
        if (giveIndex(arr, target) == -1) {
            return false;
        }
        return true;
    }

    public static int giveIndex(String word, char target) {
        if (word.length() == 0) {
            return -1;
        }
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == target) {
                return index;
            }
        }
        return -1;
    }

    public static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        if (start == end) {
            if (arr[start] == target) {
                return start;
            }
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // for searching in two-d arrays
    public static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // max element in a two-d array
    public static int maxIn(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = 0;

        for (int[] outer : arr) {
            for (int element : outer) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
