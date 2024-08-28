package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("Add student Test")
    void testAddStudent() {
        StudentList students = new StudentList();
        students.addNewStudent("66100000000", "pangko");

        Student s = students.findStudentById("66100000000");
        assertEquals("pangko", s.getName());
    }

    @Test
    @DisplayName("Find Student Test")
    void testFindStudent() {
        StudentList students = new StudentList();
        students.addNewStudent("66100000000", "pangko");
        students.addNewStudent("66100000001", "marimo");
        students.addNewStudent("66100000002", "sushi");

        Student s = students.findStudentById("66100000000");
        assertEquals("pangko", s.getName());
    }

    @Test
    @DisplayName("Give score test")
    void testGiveScore() {
        StudentList students = new StudentList();
        students.addNewStudent("66100000000", "pangko");
        students.addNewStudent("66100000001", "marimo");
        students.addNewStudent("66100000002", "sushi");

        students.giveScoreToId("66100000000", 50.5);
        double expected = 50.5;
        double actual = students.findStudentById("66100000000").getScore();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("view grade test")
    void testViewGrade() {
        StudentList students = new StudentList();
        students.addNewStudent("66100000000", "pangko");
        students.addNewStudent("66100000001", "marimo");
        students.addNewStudent("66100000002", "sushi");

        students.giveScoreToId("66100000000", 50.5);
        String expected = "D";
        String actual = students.viewGradeOfId("66100000000");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("findStudentById test")
    void testFindStudentById() {
        StudentList students = new StudentList();
        students.addNewStudent("111111", "barbie");
        students.addNewStudent("222222", "oka");
        students.addNewStudent("333333", "mammoth");

        Student s1 = new Student("111111", "barbie");
        assertEquals(s1, students.findStudentById("111111"));
    }

    @Test
    @DisplayName("findStudentByObject test")
    void testFindStudentByObject() {
        StudentList students = new StudentList();
        students.addNewStudent("111111", "barbie");
        students.addNewStudent("222222", "oka");
        students.addNewStudent("333333", "mammoth");

        Student s1 = new Student("111111", "barbie");
        assertEquals(s1, students.findStudentByObject(s1));
    }

}