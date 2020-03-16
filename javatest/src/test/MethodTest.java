package test;

/**
 * @author
 */
public class MethodTest {
    /**
     * 找最大值
     * @param num1
     * @param num2
     * @return 最大值
     * psvip
     * 2020.3.4 10:40
     */

    public  static int max(int num1,int num2){
        int ans;
        if(num1>num2){
            ans=num1;
        }
        else {
            ans=num2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int i=10;
        int j=3;
        System.out.println(max(i,j));
    }
}
