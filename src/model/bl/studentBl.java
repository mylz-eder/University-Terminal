package model.bl;
import model.da.StudentDa;
import model.entity.Student;

import java.util.Optional;


public class studentBl {
    public static void remove (String username) throws Exception {
    try (StudentDa  studentDa = new StudentDa()) {
        Optional<Student> student = studentDa.findByUsernameAndPassword (String username, String Password) throws Exception{
            if (student.isPresent()) {
                return student.get();
            } else {
                throw new StudentNotFoundException();
            }
        }
    }
    }

}
