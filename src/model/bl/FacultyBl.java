package model.bl;

import controller.exception.UserNotFoundException;
import model.da.FacultyDa;
import model.entity.Faculty;

import java.util.Optional;

public class FacultyBl {

    public static Faculty findByIdentifierAndPassword(String identifier , String password)throws Exception{
        try(FacultyDa facultyDa = new FacultyDa()){
            Optional<Faculty> faculty = facultyDa.findByIdentifierAndPassword(identifier,password);

            if(faculty.isPresent()){
                return faculty.get();
            }else{
                throw new UserNotFoundException();
            }
        }
    }
}
