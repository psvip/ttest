package test;

/**
 * @author
 */
public class StringTest {

    void one() {
        String str1 = "Hello World!";
        String str2 = "彭桂斌";
        String str = str2.concat(str1);
        System.out.println(str);

    }

    void two() {
        String str = "1,2,3,4,5,6,7";
        String[] list = str.split(",");
        for (int i = 0; i < 7; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    void three() {
        String str = "Hello World!";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i)) == 'l') {
                sum++;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        StringTest test = new StringTest();
        test.one();
        System.out.println("---------------");
        test.two();
        System.out.println("---------------");
        test.three();
       /* String str1="hello world";
        String str2="Java";
        //连接两个字符串
        String str3=str1.concat(str2);
        //判断是否相等
        if(str1.equals(str2)){
            System.out.println("true");
        }
        //判断字符串里是否有e
        if(str1.contains("he")){
            System.out.println("e 存在");
        }
        System.out.println(str3);
        String str=str1.replace("e","o");
        System.out.println(str);
        String [] list=str1.split(" ");
        System.out.println(list[0]);
        System.out.println(list[1]);
        String jiequ=str1.substring(5,9);
        System.out.println(jiequ);*/
    }
}
