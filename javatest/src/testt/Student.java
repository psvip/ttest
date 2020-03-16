package testt;

/**
 * student实体类
 * wumaoxing
 * 2020-3-4 17:07
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
    private String grade;

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

    public String getGrade() {
        return grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }

    /**
     * 重写compareTo方法，按照成绩排序
     * wumaoxing
     * 2020-3-4 17:52
     */
    @Override
    public int compareTo(Student stu) {
        return stu.getScore() - this.score;
    }
}