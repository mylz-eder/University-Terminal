package model.da;

import model.entity.Faculty;
import utils.JdbcProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class FacultyDa implements AutoCloseable {

    private static Connection connection;

    private static PreparedStatement preparedStatement;

    public FacultyDa () throws SQLException {
        connection = JdbcProvider.getInstance().getConnection();
    }

public void save(Faculty faculty) throws Exception {

}

    public static Optional<Faculty> findByIdentifierAndPassword(String identifier, String password) throws SQLException {
        connection = JdbcProvider.getInstance().getConnection();
        preparedStatement = connection.prepareStatement("SELECT * FROM USER_TBL WHERE (USERNAME=? OR EMAIL=? OR PHONE_NUMBER=?) AND PASSWORD=? AND ROLE=1");
        preparedStatement.setString(1, identifier);
        preparedStatement.setString(2, identifier);
        preparedStatement.setString(3, identifier);
        preparedStatement.setString(4, password);
        ResultSet resultSet = preparedStatement.executeQuery();

        Optional<Faculty> optionalFaculty = Optional.empty();
        if (resultSet.next()) {
            Faculty faculty =
                    Faculty
                            .builder()
                            .firstName(resultSet.getString("FIRST_NAME"))
                            .lastName(resultSet.getString("LAST_NAME"))
                            .userName(resultSet.getString("USERNAME"))
                            .password(resultSet.getString("PASSWORD"))
                            .phoneNumber(resultSet.getString("PHONE_NUMBER"))
                            .email(resultSet.getString("EMAIL"))
                            .socialSecurity(resultSet.getString("SOCIAL_SECURITY"))
                            .address(resultSet.getString("ADDRESS"))
                            .birthDate(resultSet.getDate( "BIRTHDATE").toLocalDate())
                            .createdAt(resultSet.getDate("CREATED_AT").toLocalDate())
                            .lastAlteredAt(resultSet.getDate("LAST_UPDATED_AT").toLocalDate())
                            .access(resultSet.getInt("ROLE"))
                            .build();
            optionalFaculty = Optional.of(faculty);
        }
        return optionalFaculty;
    }


    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
