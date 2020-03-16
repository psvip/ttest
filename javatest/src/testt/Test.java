package testt;

import java.util.*;
import java.util.Map.Entry;

/**
 * 测试类
 * wumaoxing
 * 2020-3-4 17:14
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, Student> map1 = new HashMap<>();
        Student st1 = new Student();
        st1.setName("张三");
        st1.setAge(18);
        st1.setScore(80);
        st1.setGrade("1班");
        map1.put(1, st1);

        Student st2 = new Student();
        st2.setName("李四");
        st2.setAge(19);
        st2.setScore(100);
        st2.setGrade("1班");
        map1.put(2, st2);

        Student st3 = new Student();
        st3.setName("王五");
        st3.setAge(17);
        st3.setScore(59);
        st3.setGrade("1班");
        map1.put(3, st3);

        Map<Integer, Student> map2 = new HashMap<>();
        Student st4 = new Student();
        st4.setName("赵六");
        st4.setAge(18);
        st4.setScore(85);
        st4.setGrade("2班");
        map2.put(4, st4);

        Student st5 = new Student();
        st5.setName("刘七");
        st5.setAge(19);
        st5.setScore(93);
        st5.setGrade("2班");
        map2.put(5, st5);

        Student st6 = new Student();
        st6.setName("孙八");
        st6.setAge(17);
        st6.setScore(55);
        st6.setGrade("2班");
        map2.put(6, st6);

        //整合两个map学生信息成一个新的map
        Map<Integer, Student> map3 = new HashMap<>();
        map3.putAll(map1);
        map3.putAll(map2);
        System.out.println("整合两个map学生信息成一个新的map");
        for (Map.Entry<Integer, Student> entry : map3.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        //按照分数给出学生信息排名
        System.out.println("按照分数给出学生信息排名");
        List<Map.Entry<Integer, Student>> list = new ArrayList<>(map3.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Student>>() {
            @Override
            public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
                return o2.getValue().getScore().compareTo(o1.getValue().getScore());
            }
        });
        for (Map.Entry<Integer, Student> entry : map3.entrySet()) {
            System.out.println(entry.getValue());
        }

        //输出不及格的学生信息
        System.out.println("输出不及格的学生信息");
        for (Map.Entry<Integer, Student> entry : map3.entrySet()) {
            if (entry.getValue().getScore() < 60) {
                System.out.println(entry.getValue());
            }
        }

        //查找张三的信息
        System.out.println("查找张三的信息");
        for (Map.Entry<Integer, Student> entry : map3.entrySet()) {
            if (entry.getValue().getName().equals("张三")) {
                System.out.println(entry.getValue());
                break;
            }
        }

        //从list剔除年龄大于18岁的学生信息
        System.out.println("从map剔除年龄大于18岁的学生信息");

        for (Map.Entry<Integer, Student> entry : map3.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}