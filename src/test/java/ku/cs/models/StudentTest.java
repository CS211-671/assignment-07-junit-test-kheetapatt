package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("66104500XX", "Kheeta");
    }

    @Test
    @DisplayName("Calculate Score")
    void testAddScore() {
//        Student s1 = new Student("6610450064", "Kheeta");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    @DisplayName("Calculate Grade")
    void testCalculateGrade() {
//        Student s1 = new Student("6610450064", "Kheeta");
        s1.addScore(85);
        assertEquals("A", s1.grade());
    }

    @Test
    @DisplayName("Change name")
    void testChangeName() {
        s1.changeName("Moji");
        assertEquals("Moji", s1.getName());
    }

    @Test
    @DisplayName("isId test")
    void testIsId() {
        assertTrue(s1.isId("66104500XX"));
    }

    @Test
    @DisplayName("Check Student Info")
    void testCheckStudentInfo() {
        assertEquals("66104500XX", s1.getId());
        assertEquals("Kheeta", s1.getName());
    }
}