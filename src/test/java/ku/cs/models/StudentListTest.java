package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList s1;
    @BeforeEach
    void init()
    {
        s1 = new StudentList();
    }

    @Test
    @DisplayName("เช็คid")
    void testId()
    {
        s1.addNewStudent("John", "Doe" ,23.0);
        s1.addNewStudent("John", "Dash" , 20.0);
        assertEquals("John" , s1.findStudentById("John").getId());
    }

    @Test
    @DisplayName("เช็คName")
    void testName(){
        s1.addNewStudent("John", "Doe" ,23.0);
        s1.addNewStudent("John", "Dap" , 20.0);
        s1.addNewStudent("John2", "Cap" , 20.0);
        assertEquals(1 ,  s1.filterByName("D").getStudents().size());

    }

    @Test
    @DisplayName("give Score")
    void testScore(){
        s1.addNewStudent("1062", "Doe" ,23.0);
        s1.giveScoreToId("1062" , 42.0);
        assertEquals(65.0 , s1.findStudentById("1062").getScore());
    }

    @Test
    @DisplayName("view grade")
    void testGrade(){
        s1.addNewStudent("Aspas", "Doe" ,60.0);
        s1.addNewStudent("John", "Dap" , 75.0);
        assertEquals("B" ,s1.findStudentById("John").getGrade() );
    }

    @Test
    @DisplayName("check how many student")
    void testHowManyStudent(){
        s1.addNewStudent("John", "Doe" ,60.0);
        s1.addNewStudent("John2", "Dap" ,75.0);
        s1.addNewStudent("John3", "Dddd" ,60.0);
        assertEquals(3 , s1.getStudents().size());
    }
}
