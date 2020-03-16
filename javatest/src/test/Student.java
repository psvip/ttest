package test;

/**
 * 学生类
 * psvip
 * 2020/3/4 19:00
 */
public class Student implements Comparable<Student> {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 成绩
     */
    private int score;
    /**
     * 班级
     */
    private String classNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", grade='" + classNum + '\'' +
                '}';
    }

    /**
     * 重写compareTo方法，成绩按照从大到小排序
     */
    @Override
    public int compareTo(Student stu) {
        return stu.getScore() - this.score;
    }
}
