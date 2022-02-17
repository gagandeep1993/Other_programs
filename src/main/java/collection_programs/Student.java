package collection_programs;

import java.util.HashSet;
import java.util.Set;
class Student
{
    int rollNo;
    String name;
    String className;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public Student(int rollNo, String name, String className) {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
    }
}
class HashSetExample
{
    public static void main(String[] args) {
        Set<Student> studentData = new HashSet<Student>();
        studentData.add(new Student(1, "A", "MCA"));
        studentData.add(new Student(2, "B", "BCA"));
        studentData.add(new Student(8, "C", "MCA"));
        studentData.add(new Student(10, "D", "BSC"));

        for (Student student : studentData)
            System.out.println("RollNo: " + student.getRollNo() + ", Name: " + student.getName());

    }
}