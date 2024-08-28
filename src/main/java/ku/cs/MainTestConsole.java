package ku.cs;

import ku.cs.models.Student;
import ku.cs.models.StudentList;

import java.sql.SQLOutput;

public class MainTestConsole {
    public static void main(String[] args) {
        StudentList students = new StudentList();
        students.addNewStudent("111111", "barbie");
        students.addNewStudent("222222", "oka");
        students.addNewStudent("333333", "mammoth");

        Student s1 = new Student("111111", "barbie");
        System.out.println(students.findStudentByObject(s1));
    }
}
