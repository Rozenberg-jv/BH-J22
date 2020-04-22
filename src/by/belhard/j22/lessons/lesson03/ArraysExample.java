package by.belhard.j22.lessons.lesson03;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array0 = null;

        int[] array1 = new int[3];

        int[] array2 = new int[]{10,5,0,11};

        int[] array3 = {11, 2, -5};

        System.out.println(array1[0]);

        System.out.println(array2[1]);

        System.out.println(array3[2]);

        System.out.println(array1.length);

        //
        char[] chars = new char[26];
        char z = 'z';

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(z - i);
            /*chars[i] = z;
            z--;*/
        }

        System.out.println(chars);

        for (int i = 0; i < chars.length; i+=2) {
            System.out.print(chars[i] + ",");
        }
        System.out.println();
        for (char c : chars) {
            System.out.print(c + ",");
        }


    }
}
