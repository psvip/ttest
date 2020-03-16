package test;

import java.util.*;
import java.util.Map.Entry;
/**
 * @author psvip
 * 2020/3/4 19:50
 */
public class HomeworkThreeTwo {

    public static void main(String[] args) {
        Map<Integer,Student> map1=new HashMap<>();

        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);
        student1.setClassNum("1班");
        student1.setScore(80);
        map1.put(1,student1);
        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(19);
        student2.setClassNum("1班");
        student2.setScore(100);

        map1.put(2,student2);
        Student student3 = new Student();
        student3.setName("王五");
        student3.setAge(17);
        student3.setClassNum("1班");
        student3.setScore(59);
        map1.put(3,student3);

        Map<Integer,Student> map2=new HashMap<>();
        Student student4 = new Student();
        student4.setName("赵六");
        student4.setAge(18);
        student4.setClassNum("2班");
        student4.setScore(85);
        map2.put(4,student4);

        Student student5 = new Student();
        student5.setName("刘七");
        student5.setAge(19);
        student5.setClassNum("2班");
        student5.setScore(93);
        map2.put(5,student5);

        Student student6 = new Student();
        student6.setName("孙八");
        student6.setAge(17);
        student6.setClassNum("2班");
        student6.setScore(55);
        map1.put(6,student6);

      Map<Integer,Student> newmap=new HashMap<>();
        newmap.putAll(map1);
        newmap.putAll(map2);
        //合并两个map生成新的map
        for (Map.Entry<Integer, Student> entry : newmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("------------------------------");

        //map按照成绩从大到小排序输出信息
        List<Map.Entry<Integer, Student>> list = new ArrayList<>(newmap.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().getScore().compareTo(o1.getValue().getScore()));
        for (Map.Entry<Integer, Student> entry : list) {
            System.out.println(entry.getValue());
        }
        System.out.println("------------------------------");
        //输出map成绩小于60分的学生信息
        for (Map.Entry<Integer, Student> entry : newmap.entrySet()) {
            if (entry.getValue().getScore() < 60) {
                System.out.println(entry.getValue());
            }
        }
        System.out.println("------------------------------");
        //map中查找张三的信息
        for (Map.Entry<Integer, Student> entry : newmap.entrySet()) {
            if (entry.getValue().getName().equals("张三")) {
                System.out.println(entry.getValue());
            }
        }
        System.out.println("------------------------------");
        //从map剔除年龄大于18岁的学生信息

        for (Iterator<Map.Entry<Integer, Student>> it = newmap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, Student> entry = it.next();
            if (entry.getValue().getAge()>18) {
                it.remove();
            }
        }
        for (Map.Entry<Integer, Student> entry : newmap.entrySet()) {
            System.out.println(entry.getValue());
        }


    }

}
