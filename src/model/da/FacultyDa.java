package model.da;

import utils.JdbcProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FacultyDa implements AutoCloseable {

    private final Connection connection;

    private PreparedStatement preparedStatement;

    JdbcProvider jdbcProvider = new JdbcProvider();
    public FacultyDa () throws SQLException {
        connection = jdbcProvider.getConnection();
    }

    public void
}
