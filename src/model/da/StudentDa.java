package model.da;

import model.entity.Student;
import utils.JdbcProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class StudentDa implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public void remove(String username) throws SQLException {
        connection = JdbcProvider.getInstance().getConnection();
        preparedStatement = connection.prepareStatement("UPDATE USER_TBL SET ROLE = 1 WHERE USERNAME =?");
        preparedStatement.setString(1, username);
        preparedStatement.executeUpdate();
    }

    public Optional<Student> findByUsernameAndPassword(String username, String password) throws SQLException {
        connection = JdbcProvider.getInstance().getConnection();
        preparedStatement = connection.prepareStatement("SELECT * FROM USER_TBL WHERE USERNAME=? AND PASSWORD=? AND ROLE=1");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultset = preparedStatement.executeQuery();
/*
        Optional<Student> optionalProfile = Optional.empty();
        if (resultset.next()) {
            Student student =
                    Student
                            .builder()
                            .userName(String.valueOf(resultset))
                            .build;
        }
        return optionalProfile;
    }

        public void close () throws Exception {
            preparedStatement.close();
            connection.close();
        }



 */
        return Optional.empty();
    }

    @Override
    public void close() throws Exception {

    }
}
