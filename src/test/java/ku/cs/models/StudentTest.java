package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
        static Student s;
        @BeforeEach
        void init() {
            s = new Student("6710451348" , "test");
        }
        @Test
        @DisplayName("เพิ่มคะเเนนิสิต 49 และ 2 คะเเนน")
    void testAddScore() {
            s.addScore(40);
            assertEquals(40 , s.getScore()); //่ค่าที่มันต้องเป็นห้ามเปลี่ยน
            s.addScore(20);
            assertEquals(60 , s.getScore());
        }
        @Test
        void testCalculateGrade() {

            s.addScore(30);
            assertEquals("F" , s.grade());
        }

        @Test
    void testIsNameContain(){
            Student s = new Student("6710451348" , "mark");
            s.isNameContains("Mark");
                    }
        @Test
    void testChangeName(){
            Student s = new Student("6710451348" , "Mark 01");
            assertEquals("Mark 01", s.getName());
    }

        @Test
    void testIsId(){
            Student s = new Student("6710451348" , "test");
            assertEquals("6710451348" , s.getId());
            assertEquals("6710455348" , s.getId());
        }
        //เพราะว่า obj เป็น static และ เป็นฺBeforeAll เเต่ beforeeach ทำให้ obj แยกกันได้
}