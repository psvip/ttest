package test;

/**
 * @author
 */
public class ArrayTest {
    void one() {
        int temp;
        int[] a = {1, 23, 6, 74, 8, 19, 104};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    void two() {
        int[] a = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9};
        int len = a.length;
        int[] b = new int[20];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] != 5) {
                b[j++] = a[i];
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    void three() {
        int a[] = {1, 3, 5, 7, 9};
        int b[] = {2, 4, 6, 8, 10};
        int c[] = new int[10];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            c[j++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[j++] = b[i];
        }
        int temp;
        for (int i = 0; i < j; i++) {
            for (int k = 0; k < j - 1; k++) {
                if (c[k] > c[k + 1]) {
                    temp = c[k];
                    c[k] = c[k + 1];
                    c[k + 1] = temp;
                }
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(c[i] + " ");
        }

    }

    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        test.one();
        System.out.println("----------------------------------------------");
        test.two();
        System.out.println("----------------------------------------------");
        test.three();
    }
}
