package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_elements {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");


        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] input = takeInput();
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution1.binarySearch(input, x));

            t -= 1;
        }
    }
}


class Solution1 {

    public static int binarySearch(int[] arr, int x) {
        //Your code goes here
        int n = arr.length;
        int end = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                end = (arr[i] + n) / 2;

            } else {
                return i;
            }
        }
        return -1;
    }
}


