package test;


public class Test {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    void dog() {
        int age = 7;
        System.out.println(age);
    }

    void one() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    void two() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int ans = i * j;
                System.out.print(j + "x" + i + "=" + ans + " ");
            }
            System.out.println();
        }
    }

    void three() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    void four() {
        int sum = 0;
        int cnt = 0;
        for (int i = 101; i <= 200; i++) {
            int flag = 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                cnt++;
                System.out.print(i + " ");
                if (cnt == 5) {
                    System.out.println();
                    cnt = 0;
                }
                sum += i;
            }

        }
        System.out.println("素数和为" + sum);

    }


    public static void main(String[] args) {

        Test test = new Test();
      test.one();
        System.out.println("---------------");
        test.two();
        System.out.println("---------------");
       test.three();
       System.out.println("---------------");
        test.four();


    }

}
