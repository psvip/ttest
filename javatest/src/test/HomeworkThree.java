package test;



import  java.util.*;
import java.util.ArrayList;
import java.util.List;


public class HomeworkThree {
    public static void main(String[] args) {

        List<Student> list1 = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);
        student1.setClassNum("1班");
        student1.setScore(80);
        list1.add(student1);

        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(19);
        student2.setClassNum("1班");
        student2.setScore(100);
        list1.add(student2);

        Student student3 = new Student();
        student3.setName("王五");
        student3.setAge(17);
        student3.setClassNum("1班");
        student3.setScore(59);
        list1.add(student3);

        List<Student> list2 = new ArrayList<>();

        Student student4 = new Student();
        student4.setName("赵六");
        student4.setAge(18);
        student4.setClassNum("2班");
        student4.setScore(85);

        list2.add(student4);

        Student student5 = new Student();
        student5.setName("刘七");
        student5.setAge(19);
        student5.setClassNum("2班");
        student5.setScore(93);
        list2.add(student5);

        Student student6 = new Student();
        student6.setName("孙八");
        student6.setAge(17);
        student6.setClassNum("2班");
        student6.setScore(55);
        list2.add(student6);

        List<Student> newlist=new ArrayList<>();
        newlist.addAll(list1);
        newlist.addAll(list2);
        //整合两个list
        for(Student ls:newlist){
            System.out.println(ls);
        }
        System.out.println("------------------------------");
        //排序，按照成绩从大到小
        Collections.sort(newlist);
        for(int i=0;i<newlist.size();i++){
            System.out.println(newlist.get(i));
        }
        System.out.println("------------------------------");
        //输出成绩低于60分同学的信息
        for(Student st :newlist){
            if(st.getScore()<60){
                System.out.println(st);
            }
        }
        System.out.println("------------------------------");
        //查找张三的信息
       for(Student st:newlist){
           if("张三".equals(st.getName())){
               System.out.println(st);
           }
       }
        System.out.println("------------------------------");
       List<Student> deleteList=new ArrayList<>();
        for(int i=0;i<newlist.size();i++){
            if(newlist.get(i).getAge()<=18){
               deleteList.add(newlist.get(i));
            }
        }
        //剔除年龄大于18岁的信息
       for(Student list:deleteList){
           System.out.println(list);
       }
        System.out.println("------------------------------");

    }



}
