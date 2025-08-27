package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest{
    private StudentHardCodeDatasource s ;
    @BeforeEach
    void init() {
        s = new StudentHardCodeDatasource();
    }
    @Test
    void getAllStudents() {
      assertEquals(4 , s.readData().getStudents().size());
    }
}
