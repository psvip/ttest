package test;

import java.math.BigDecimal;

public class Cat {
    private  int aaa;
    private  String aqw;
    void xixi(){

    }
    public static void main(String[] args) {
       float a=21;
       float b=10;
       double c=a/b;

        BigDecimal bigDecimal=new BigDecimal(c).setScale(2,BigDecimal.ROUND_UP);
        System.out.println(bigDecimal);
        //public叫修饰符
    }
}
