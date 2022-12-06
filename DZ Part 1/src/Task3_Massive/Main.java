package Task3_Massive;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {53, 78, 13, 9, 5, 17, 28, 719, 214};
        int length = array.length;
        System.out.println(length);
        int evenNums = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0)

                System.out.println("Elements: " + array[i]);

        }
        int[] array2 = new int[evenNums];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0)
                array2[index] = array[i];
            index++;
            System.out.println(Arrays.toString(array2));


        }
    }
}